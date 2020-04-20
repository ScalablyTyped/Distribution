package typings.phonegap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Window extends js.Object {
  var requestFileSystem: js.Any
  def openDatabase(
    database_name: String,
    database_version: String,
    database_displayname: String,
    database_size: Double
  ): Database
}

object Window {
  @scala.inline
  def apply(openDatabase: (String, String, String, Double) => Database, requestFileSystem: js.Any): Window = {
    val __obj = js.Dynamic.literal(openDatabase = js.Any.fromFunction4(openDatabase), requestFileSystem = requestFileSystem.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
}

