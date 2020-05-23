package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Color extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var delay: js.UndefOr[String] = js.undefined
  var diameter: js.UndefOr[String] = js.undefined
  var duration: js.UndefOr[String] = js.undefined
  var endOpacity: js.UndefOr[Double] = js.undefined
  var offsetX: js.UndefOr[String] = js.undefined
  var offsetY: js.UndefOr[String] = js.undefined
  var startOpacity: js.UndefOr[Double] = js.undefined
  var timingFunction: js.UndefOr[String] = js.undefined
}

object Color {
  @scala.inline
  def apply(
    color: String = null,
    delay: String = null,
    diameter: String = null,
    duration: String = null,
    endOpacity: js.UndefOr[Double] = js.undefined,
    offsetX: String = null,
    offsetY: String = null,
    startOpacity: js.UndefOr[Double] = js.undefined,
    timingFunction: String = null
  ): Color = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (diameter != null) __obj.updateDynamic("diameter")(diameter.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (!js.isUndefined(endOpacity)) __obj.updateDynamic("endOpacity")(endOpacity.get.asInstanceOf[js.Any])
    if (offsetX != null) __obj.updateDynamic("offsetX")(offsetX.asInstanceOf[js.Any])
    if (offsetY != null) __obj.updateDynamic("offsetY")(offsetY.asInstanceOf[js.Any])
    if (!js.isUndefined(startOpacity)) __obj.updateDynamic("startOpacity")(startOpacity.get.asInstanceOf[js.Any])
    if (timingFunction != null) __obj.updateDynamic("timingFunction")(timingFunction.asInstanceOf[js.Any])
    __obj.asInstanceOf[Color]
  }
}

