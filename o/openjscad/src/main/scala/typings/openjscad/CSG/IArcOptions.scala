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
    endangle: Int | Double = null,
    maketangent: js.UndefOr[Boolean] = js.undefined,
    radius: Int | Double = null,
    resolution: Int | Double = null,
    startangle: Int | Double = null
  ): IArcOptions = {
    val __obj = js.Dynamic.literal()
    if (center != null) __obj.updateDynamic("center")(center.asInstanceOf[js.Any])
    if (endangle != null) __obj.updateDynamic("endangle")(endangle.asInstanceOf[js.Any])
    if (!js.isUndefined(maketangent)) __obj.updateDynamic("maketangent")(maketangent)
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (resolution != null) __obj.updateDynamic("resolution")(resolution.asInstanceOf[js.Any])
    if (startangle != null) __obj.updateDynamic("startangle")(startangle.asInstanceOf[js.Any])
    __obj.asInstanceOf[IArcOptions]
  }
}

