package typings.openlayers.mod.olx.interaction

import typings.openlayers.mod.DragBoxEndConditionType
import typings.openlayers.mod.EventsConditionType
import typings.openlayers.mod.MapBrowserEvent
import typings.openlayers.mod.Pixel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DragBoxOptions extends js.Object {
  var boxEndCondition: js.UndefOr[DragBoxEndConditionType] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var condition: js.UndefOr[EventsConditionType] = js.undefined
  var minArea: js.UndefOr[Double] = js.undefined
}

object DragBoxOptions {
  @scala.inline
  def apply(
    boxEndCondition: (/* event */ MapBrowserEvent, /* pixel1 */ Pixel, /* pixel2 */ Pixel) => Boolean = null,
    className: String = null,
    condition: /* event */ MapBrowserEvent => Boolean = null,
    minArea: js.UndefOr[Double] = js.undefined
  ): DragBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (boxEndCondition != null) __obj.updateDynamic("boxEndCondition")(js.Any.fromFunction3(boxEndCondition))
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (condition != null) __obj.updateDynamic("condition")(js.Any.fromFunction1(condition))
    if (!js.isUndefined(minArea)) __obj.updateDynamic("minArea")(minArea.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragBoxOptions]
  }
}

