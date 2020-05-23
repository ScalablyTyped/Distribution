package typings.plottable.canvasDrawerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStrokeStyle extends js.Object {
  var opacity: js.UndefOr[Double] = js.undefined
  var stroke: js.UndefOr[String] = js.undefined
  var `stroke-dasharray`: js.UndefOr[String] = js.undefined
  var `stroke-opacity`: js.UndefOr[Double] = js.undefined
  var `stroke-width`: js.UndefOr[Double] = js.undefined
}

object IStrokeStyle {
  @scala.inline
  def apply(
    opacity: js.UndefOr[Double] = js.undefined,
    stroke: String = null,
    `stroke-dasharray`: String = null,
    `stroke-opacity`: js.UndefOr[Double] = js.undefined,
    `stroke-width`: js.UndefOr[Double] = js.undefined
  ): IStrokeStyle = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (`stroke-dasharray` != null) __obj.updateDynamic("stroke-dasharray")(`stroke-dasharray`.asInstanceOf[js.Any])
    if (!js.isUndefined(`stroke-opacity`)) __obj.updateDynamic("stroke-opacity")(`stroke-opacity`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`stroke-width`)) __obj.updateDynamic("stroke-width")(`stroke-width`.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStrokeStyle]
  }
}

