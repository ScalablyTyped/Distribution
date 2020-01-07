package typings.ol.styleCircleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var fill: js.UndefOr[typings.ol.styleFillMod.default] = js.undefined
  var radius: Double
  var stroke: js.UndefOr[typings.ol.styleStrokeMod.default] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    radius: Double,
    fill: typings.ol.styleFillMod.default = null,
    stroke: typings.ol.styleStrokeMod.default = null
  ): Options = {
    val __obj = js.Dynamic.literal(radius = radius.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

