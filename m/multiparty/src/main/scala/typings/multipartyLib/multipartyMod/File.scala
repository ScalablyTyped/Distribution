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
  var originalFileName: java.lang.String
  /**
    * the absolute path of the uploaded file on disk
    */
  var path: java.lang.String
  /**
    * size of the file in bytes
    */
  var size: scala.Double
}

