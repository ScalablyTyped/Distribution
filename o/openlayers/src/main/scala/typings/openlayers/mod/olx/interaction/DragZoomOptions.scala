package typings.openlayers.mod.olx.interaction

import typings.openlayers.mod.EventsConditionType
import typings.openlayers.mod.MapBrowserEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DragZoomOptions extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var condition: js.UndefOr[EventsConditionType] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var out: js.UndefOr[Boolean] = js.undefined
}

object DragZoomOptions {
  @scala.inline
  def apply(
    className: String = null,
    condition: /* event */ MapBrowserEvent => Boolean = null,
    duration: js.UndefOr[Double] = js.undefined,
    out: js.UndefOr[Boolean] = js.undefined
  ): DragZoomOptions = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (condition != null) __obj.updateDynamic("condition")(js.Any.fromFunction1(condition))
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(out)) __obj.updateDynamic("out")(out.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragZoomOptions]
  }
}

