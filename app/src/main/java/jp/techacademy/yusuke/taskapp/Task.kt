package jp.techacademy.yusuke.taskapp

import io.realm.RealmObject
import java.io.Serializable
import java.util.Date
import io.realm.annotations.PrimaryKey

open class Task : RealmObject(), Serializable {
    var title: String = ""
    var contents: String = ""
    var category: String = ""
    var date: Date = Date()

    @PrimaryKey
    var id: Int = 0
}