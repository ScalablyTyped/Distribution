package typings.openjscad.CSG

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRectangleOptions extends js.Object {
  var center: js.UndefOr[Vector2D] = js.undefined
  var corner1: js.UndefOr[Vector2D] = js.undefined
  var corner2: js.UndefOr[Vector2D] = js.undefined
  var radius: js.UndefOr[Vector2D] = js.undefined
}

object IRectangleOptions {
  @scala.inline
  def apply(
    center: Vector2D = null,
    corner1: Vector2D = null,
    corner2: Vector2D = null,
    radius: Vector2D = null
  ): IRectangleOptions = {
    val __obj = js.Dynamic.literal()
    if (center != null) __obj.updateDynamic("center")(center.asInstanceOf[js.Any])
    if (corner1 != null) __obj.updateDynamic("corner1")(corner1.asInstanceOf[js.Any])
    if (corner2 != null) __obj.updateDynamic("corner2")(corner2.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRectangleOptions]
  }
}

