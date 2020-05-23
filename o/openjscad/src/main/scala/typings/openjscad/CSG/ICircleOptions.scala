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
    radius: js.UndefOr[Double] = js.undefined,
    resolution: js.UndefOr[Double] = js.undefined
  ): ICircleOptions = {
    val __obj = js.Dynamic.literal()
    if (center != null) __obj.updateDynamic("center")(center.asInstanceOf[js.Any])
    if (!js.isUndefined(radius)) __obj.updateDynamic("radius")(radius.get.asInstanceOf[js.Any])
    if (!js.isUndefined(resolution)) __obj.updateDynamic("resolution")(resolution.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICircleOptions]
  }
}

