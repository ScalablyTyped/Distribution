package typings.openlayers.mod.olx.interaction

import typings.openlayers.mod.EventsConditionType
import typings.openlayers.mod.MapBrowserEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyboardZoomOptions extends js.Object {
  var condition: js.UndefOr[EventsConditionType] = js.undefined
  var delta: js.UndefOr[Double] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
}

object KeyboardZoomOptions {
  @scala.inline
  def apply(
    condition: /* event */ MapBrowserEvent => Boolean = null,
    delta: js.UndefOr[Double] = js.undefined,
    duration: js.UndefOr[Double] = js.undefined
  ): KeyboardZoomOptions = {
    val __obj = js.Dynamic.literal()
    if (condition != null) __obj.updateDynamic("condition")(js.Any.fromFunction1(condition))
    if (!js.isUndefined(delta)) __obj.updateDynamic("delta")(delta.get.asInstanceOf[js.Any])
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyboardZoomOptions]
  }
}

