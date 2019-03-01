package typings
package multipartyLib.multipartyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait File extends js.Object {
  /**
    * same as name - the field name for this file
    */
  var fieldName: java.lang.String
  /**
    * the HTTP headers that were sent along with this file
    */
  var headers: js.Any
  /**
    * the filename that the user reports for the file
    */
  var originalFilename: java.lang.String
  /**
    * the absolute path of the uploaded file on disk
    */
  var path: java.lang.String
  /**
    * size of the file in bytes
    */
  var size: scala.Double
}

object File {
  @scala.inline
  def apply(
    fieldName: java.lang.String,
    headers: js.Any,
    originalFilename: java.lang.String,
    path: java.lang.String,
    size: scala.Double
  ): File = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fieldName")(fieldName)
    __obj.updateDynamic("headers")(headers)
    __obj.updateDynamic("originalFilename")(originalFilename)
    __obj.updateDynamic("path")(path)
    __obj.updateDynamic("size")(size)
    __obj.asInstanceOf[File]
  }
}

