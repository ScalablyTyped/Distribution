package typings.openlayers.openlayersMod.olxNs.interactionNs

import typings.openlayers.openlayersMod.DragBoxEndConditionType
import typings.openlayers.openlayersMod.EventsConditionType
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
    boxEndCondition: DragBoxEndConditionType = null,
    className: String = null,
    condition: EventsConditionType = null,
    minArea: Int | Double = null
  ): DragBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (boxEndCondition != null) __obj.updateDynamic("boxEndCondition")(boxEndCondition)
    if (className != null) __obj.updateDynamic("className")(className)
    if (condition != null) __obj.updateDynamic("condition")(condition)
    if (minArea != null) __obj.updateDynamic("minArea")(minArea.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragBoxOptions]
  }
}

