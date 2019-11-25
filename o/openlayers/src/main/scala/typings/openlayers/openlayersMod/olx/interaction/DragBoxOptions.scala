package typings.openlayers.openlayersMod.olx.interaction

import typings.openlayers.openlayersMod.DragBoxEndConditionType
import typings.openlayers.openlayersMod.EventsConditionType
import typings.openlayers.openlayersMod.MapBrowserEvent
import typings.openlayers.openlayersMod.Pixel
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
    minArea: Int | Double = null
  ): DragBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (boxEndCondition != null) __obj.updateDynamic("boxEndCondition")(js.Any.fromFunction3(boxEndCondition))
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (condition != null) __obj.updateDynamic("condition")(js.Any.fromFunction1(condition))
    if (minArea != null) __obj.updateDynamic("minArea")(minArea.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragBoxOptions]
  }
}

