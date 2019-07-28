package typings.atOracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Color extends js.Object {
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

object Anon_Color {
  @scala.inline
  def apply(
    color: String = null,
    delay: String = null,
    diameter: String = null,
    duration: String = null,
    endOpacity: Int | Double = null,
    offsetX: String = null,
    offsetY: String = null,
    startOpacity: Int | Double = null,
    timingFunction: String = null
  ): Anon_Color = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (delay != null) __obj.updateDynamic("delay")(delay)
    if (diameter != null) __obj.updateDynamic("diameter")(diameter)
    if (duration != null) __obj.updateDynamic("duration")(duration)
    if (endOpacity != null) __obj.updateDynamic("endOpacity")(endOpacity.asInstanceOf[js.Any])
    if (offsetX != null) __obj.updateDynamic("offsetX")(offsetX)
    if (offsetY != null) __obj.updateDynamic("offsetY")(offsetY)
    if (startOpacity != null) __obj.updateDynamic("startOpacity")(startOpacity.asInstanceOf[js.Any])
    if (timingFunction != null) __obj.updateDynamic("timingFunction")(timingFunction)
    __obj.asInstanceOf[Anon_Color]
  }
}

