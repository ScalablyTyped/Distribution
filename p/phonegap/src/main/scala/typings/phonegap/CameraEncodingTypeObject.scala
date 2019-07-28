package typings.phonegap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CameraEncodingTypeObject extends js.Object {
  var JPEG: Double
  var PNG: Double
}

object CameraEncodingTypeObject {
  @scala.inline
  def apply(JPEG: Double, PNG: Double): CameraEncodingTypeObject = {
    val __obj = js.Dynamic.literal(JPEG = JPEG, PNG = PNG)
  
    __obj.asInstanceOf[CameraEncodingTypeObject]
  }
}

