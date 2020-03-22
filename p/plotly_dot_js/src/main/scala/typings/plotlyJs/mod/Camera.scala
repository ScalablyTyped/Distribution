package typings.plotlyJs.mod

import typings.plotlyJs.PartialPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Camera extends js.Object {
  var center: PartialPoint
  var eye: PartialPoint
  var up: PartialPoint
}

object Camera {
  @scala.inline
  def apply(center: PartialPoint, eye: PartialPoint, up: PartialPoint): Camera = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], eye = eye.asInstanceOf[js.Any], up = up.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Camera]
  }
}

