package typings
package phonegapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CameraEncodingTypeObject extends js.Object {
  var JPEG: scala.Double
  var PNG: scala.Double
}

object CameraEncodingTypeObject {
  @scala.inline
  def apply(JPEG: scala.Double, PNG: scala.Double): CameraEncodingTypeObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("JPEG")(JPEG)
    __obj.updateDynamic("PNG")(PNG)
    __obj.asInstanceOf[CameraEncodingTypeObject]
  }
}

