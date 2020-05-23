package typings.openjscad.CSG

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IArcOptions extends ICircleOptions {
  var endangle: js.UndefOr[Double] = js.undefined
  var maketangent: js.UndefOr[Boolean] = js.undefined
  var startangle: js.UndefOr[Double] = js.undefined
}

object IArcOptions {
  @scala.inline
  def apply(
    center: Vector2D | js.Array[Double] = null,
    endangle: js.UndefOr[Double] = js.undefined,
    maketangent: js.UndefOr[Boolean] = js.undefined,
    radius: js.UndefOr[Double] = js.undefined,
    resolution: js.UndefOr[Double] = js.undefined,
    startangle: js.UndefOr[Double] = js.undefined
  ): IArcOptions = {
    val __obj = js.Dynamic.literal()
    if (center != null) __obj.updateDynamic("center")(center.asInstanceOf[js.Any])
    if (!js.isUndefined(endangle)) __obj.updateDynamic("endangle")(endangle.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maketangent)) __obj.updateDynamic("maketangent")(maketangent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(radius)) __obj.updateDynamic("radius")(radius.get.asInstanceOf[js.Any])
    if (!js.isUndefined(resolution)) __obj.updateDynamic("resolution")(resolution.get.asInstanceOf[js.Any])
    if (!js.isUndefined(startangle)) __obj.updateDynamic("startangle")(startangle.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IArcOptions]
  }
}

