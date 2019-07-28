package typings.multiparty.multipartyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait File extends js.Object {
  /**
    * same as name - the field name for this file
    */
  var fieldName: String
  /**
    * the HTTP headers that were sent along with this file
    */
  var headers: js.Any
  /**
    * the filename that the user reports for the file
    */
  var originalFilename: String
  /**
    * the absolute path of the uploaded file on disk
    */
  var path: String
  /**
    * size of the file in bytes
    */
  var size: Double
}

object File {
  @scala.inline
  def apply(fieldName: String, headers: js.Any, originalFilename: String, path: String, size: Double): File = {
    val __obj = js.Dynamic.literal(fieldName = fieldName, headers = headers, originalFilename = originalFilename, path = path, size = size)
  
    __obj.asInstanceOf[File]
  }
}

