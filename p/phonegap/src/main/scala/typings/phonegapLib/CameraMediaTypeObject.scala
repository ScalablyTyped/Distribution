package typings
package phonegapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CameraMediaTypeObject extends js.Object {
  var ALLMEDIA: scala.Double
  var PICTURE: scala.Double
  var VIDEO: scala.Double
}

object CameraMediaTypeObject {
  @scala.inline
  def apply(ALLMEDIA: scala.Double, PICTURE: scala.Double, VIDEO: scala.Double): CameraMediaTypeObject = {
    val __obj = js.Dynamic.literal(ALLMEDIA = ALLMEDIA, PICTURE = PICTURE, VIDEO = VIDEO)
  
    __obj.asInstanceOf[CameraMediaTypeObject]
  }
}

