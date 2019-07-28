package typings.phonegap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CameraMediaTypeObject extends js.Object {
  var ALLMEDIA: Double
  var PICTURE: Double
  var VIDEO: Double
}

object CameraMediaTypeObject {
  @scala.inline
  def apply(ALLMEDIA: Double, PICTURE: Double, VIDEO: Double): CameraMediaTypeObject = {
    val __obj = js.Dynamic.literal(ALLMEDIA = ALLMEDIA, PICTURE = PICTURE, VIDEO = VIDEO)
  
    __obj.asInstanceOf[CameraMediaTypeObject]
  }
}

