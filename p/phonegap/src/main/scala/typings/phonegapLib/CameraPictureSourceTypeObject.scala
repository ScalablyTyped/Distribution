package typings
package phonegapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CameraPictureSourceTypeObject extends js.Object {
  var CAMERA: scala.Double
  var PHOTOLIBRARY: scala.Double
  var SAVEDPHOTOALBUM: scala.Double
}

object CameraPictureSourceTypeObject {
  @scala.inline
  def apply(CAMERA: scala.Double, PHOTOLIBRARY: scala.Double, SAVEDPHOTOALBUM: scala.Double): CameraPictureSourceTypeObject = {
    val __obj = js.Dynamic.literal(CAMERA = CAMERA, PHOTOLIBRARY = PHOTOLIBRARY, SAVEDPHOTOALBUM = SAVEDPHOTOALBUM)
  
    __obj.asInstanceOf[CameraPictureSourceTypeObject]
  }
}

