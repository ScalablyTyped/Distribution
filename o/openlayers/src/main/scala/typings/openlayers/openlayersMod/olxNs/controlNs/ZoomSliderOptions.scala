package typings.openlayers.openlayersMod.olxNs.controlNs

import typings.openlayers.openlayersMod.MapEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZoomSliderOptions extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var maxResolution: js.UndefOr[Double] = js.undefined
  var minResolution: js.UndefOr[Double] = js.undefined
  var render: js.UndefOr[js.Function1[/* event */ MapEvent, _]] = js.undefined
}

object ZoomSliderOptions {
  @scala.inline
  def apply(
    className: String = null,
    duration: Int | Double = null,
    maxResolution: Int | Double = null,
    minResolution: Int | Double = null,
    render: /* event */ MapEvent => _ = null
  ): ZoomSliderOptions = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (maxResolution != null) __obj.updateDynamic("maxResolution")(maxResolution.asInstanceOf[js.Any])
    if (minResolution != null) __obj.updateDynamic("minResolution")(minResolution.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1(render))
    __obj.asInstanceOf[ZoomSliderOptions]
  }
}

