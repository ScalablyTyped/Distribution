package typings.openlayers.openlayersMod.olx.interaction

import typings.openlayers.openlayersMod.EventsConditionType
import typings.openlayers.openlayersMod.MapBrowserEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DragRotateAndZoomOptions extends js.Object {
  var condition: js.UndefOr[EventsConditionType] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
}

object DragRotateAndZoomOptions {
  @scala.inline
  def apply(condition: /* event */ MapBrowserEvent => Boolean = null, duration: Int | Double = null): DragRotateAndZoomOptions = {
    val __obj = js.Dynamic.literal()
    if (condition != null) __obj.updateDynamic("condition")(js.Any.fromFunction1(condition))
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragRotateAndZoomOptions]
  }
}

