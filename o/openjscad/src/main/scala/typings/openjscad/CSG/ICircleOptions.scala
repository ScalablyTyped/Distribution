package typings.openjscad.CSG

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICircleOptions extends IRadiusOptions {
  var center: js.UndefOr[Vector2D | js.Array[Double]] = js.undefined
}

object ICircleOptions {
  @scala.inline
  def apply(
    center: Vector2D | js.Array[Double] = null,
    radius: Int | Double = null,
    resolution: Int | Double = null
  ): ICircleOptions = {
    val __obj = js.Dynamic.literal()
    if (center != null) __obj.updateDynamic("center")(center.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (resolution != null) __obj.updateDynamic("resolution")(resolution.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICircleOptions]
  }
}

