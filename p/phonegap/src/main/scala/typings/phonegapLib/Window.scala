package typings
package phonegapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Window extends js.Object {
  var requestFileSystem: js.Any
  def openDatabase(
    database_name: java.lang.String,
    database_version: java.lang.String,
    database_displayname: java.lang.String,
    database_size: scala.Double
  ): Database
}

