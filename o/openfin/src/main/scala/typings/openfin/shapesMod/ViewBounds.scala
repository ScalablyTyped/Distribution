package typings.openfin.shapesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<openfin.openfin/_v2/shapes.Bounds, std.Exclude<keyof openfin.openfin/_v2/shapes.Bounds, 'right' | 'bottom'>> */
trait ViewBounds extends js.Object {
  var height: Double
  var left: Double
  var top: Double
  var width: Double
}

object ViewBounds {
  @scala.inline
  def apply(height: Double, left: Double, top: Double, width: Double): ViewBounds = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewBounds]
  }
}

