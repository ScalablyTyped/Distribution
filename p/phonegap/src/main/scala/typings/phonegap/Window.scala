package typings.phonegap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Window extends js.Object {
  var requestFileSystem: js.Any = js.native
  def openDatabase(
    database_name: String,
    database_version: String,
    database_displayname: String,
    database_size: Double
  ): Database = js.native
}

object Window {
  @scala.inline
  def apply(openDatabase: (String, String, String, Double) => Database, requestFileSystem: js.Any): Window = {
    val __obj = js.Dynamic.literal(openDatabase = js.Any.fromFunction4(openDatabase), requestFileSystem = requestFileSystem.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
  @scala.inline
  implicit class WindowOps[Self <: Window] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOpenDatabase(value: (String, String, String, Double) => Database): Self = this.set("openDatabase", js.Any.fromFunction4(value))
    @scala.inline
    def setRequestFileSystem(value: js.Any): Self = this.set("requestFileSystem", value.asInstanceOf[js.Any])
  }
  
}

