package typings.plottable.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bounds extends js.Object {
  var bottomRight: Point
  var topLeft: Point
}

object Bounds {
  @scala.inline
  def apply(bottomRight: Point, topLeft: Point): Bounds = {
    val __obj = js.Dynamic.literal(bottomRight = bottomRight.asInstanceOf[js.Any], topLeft = topLeft.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bounds]
  }
}

