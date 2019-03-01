package typings
package openlayersLib.openlayersMod.olxNs.controlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZoomSliderOptions extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var duration: js.UndefOr[scala.Double] = js.undefined
  var maxResolution: js.UndefOr[scala.Double] = js.undefined
  var minResolution: js.UndefOr[scala.Double] = js.undefined
  var render: js.UndefOr[js.Function1[/* event */ openlayersLib.openlayersMod.MapEvent, _]] = js.undefined
}

object ZoomSliderOptions {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    duration: scala.Int | scala.Double = null,
    maxResolution: scala.Int | scala.Double = null,
    minResolution: scala.Int | scala.Double = null,
    render: js.Function1[/* event */ openlayersLib.openlayersMod.MapEvent, _] = null
  ): ZoomSliderOptions = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (maxResolution != null) __obj.updateDynamic("maxResolution")(maxResolution.asInstanceOf[js.Any])
    if (minResolution != null) __obj.updateDynamic("minResolution")(minResolution.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(render)
    __obj.asInstanceOf[ZoomSliderOptions]
  }
}

