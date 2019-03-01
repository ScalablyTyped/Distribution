package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Color extends js.Object {
  var color: js.UndefOr[java.lang.String] = js.undefined
  var delay: js.UndefOr[java.lang.String] = js.undefined
  var diameter: js.UndefOr[java.lang.String] = js.undefined
  var duration: js.UndefOr[java.lang.String] = js.undefined
  var endOpacity: js.UndefOr[scala.Double] = js.undefined
  var offsetX: js.UndefOr[java.lang.String] = js.undefined
  var offsetY: js.UndefOr[java.lang.String] = js.undefined
  var startOpacity: js.UndefOr[scala.Double] = js.undefined
  var timingFunction: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Color {
  @scala.inline
  def apply(
    color: java.lang.String = null,
    delay: java.lang.String = null,
    diameter: java.lang.String = null,
    duration: java.lang.String = null,
    endOpacity: scala.Int | scala.Double = null,
    offsetX: java.lang.String = null,
    offsetY: java.lang.String = null,
    startOpacity: scala.Int | scala.Double = null,
    timingFunction: java.lang.String = null
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

