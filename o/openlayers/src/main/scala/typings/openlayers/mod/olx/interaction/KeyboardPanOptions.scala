package typings.openlayers.mod.olx.interaction

import typings.openlayers.mod.EventsConditionType
import typings.openlayers.mod.MapBrowserEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyboardPanOptions extends js.Object {
  var condition: js.UndefOr[EventsConditionType] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var pixelDelta: js.UndefOr[Double] = js.undefined
}

object KeyboardPanOptions {
  @scala.inline
  def apply(
    condition: /* event */ MapBrowserEvent => Boolean = null,
    duration: js.UndefOr[Double] = js.undefined,
    pixelDelta: js.UndefOr[Double] = js.undefined
  ): KeyboardPanOptions = {
    val __obj = js.Dynamic.literal()
    if (condition != null) __obj.updateDynamic("condition")(js.Any.fromFunction1(condition))
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pixelDelta)) __obj.updateDynamic("pixelDelta")(pixelDelta.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyboardPanOptions]
  }
}

