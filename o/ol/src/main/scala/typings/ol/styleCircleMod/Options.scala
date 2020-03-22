package typings.ol.styleCircleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var displacement: js.UndefOr[js.Array[Double]] = js.undefined
  var fill: js.UndefOr[typings.ol.fillMod.default] = js.undefined
  var radius: Double
  var stroke: js.UndefOr[typings.ol.strokeMod.default] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    radius: Double,
    displacement: js.Array[Double] = null,
    fill: typings.ol.fillMod.default = null,
    stroke: typings.ol.strokeMod.default = null
  ): Options = {
    val __obj = js.Dynamic.literal(radius = radius.asInstanceOf[js.Any])
    if (displacement != null) __obj.updateDynamic("displacement")(displacement.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

