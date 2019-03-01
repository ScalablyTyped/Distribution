package typings
package openlayersLib.openlayersMod.olxNs.interactionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DragBoxOptions extends js.Object {
  var boxEndCondition: js.UndefOr[openlayersLib.openlayersMod.DragBoxEndConditionType] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var condition: js.UndefOr[openlayersLib.openlayersMod.EventsConditionType] = js.undefined
  var minArea: js.UndefOr[scala.Double] = js.undefined
}

object DragBoxOptions {
  @scala.inline
  def apply(
    boxEndCondition: openlayersLib.openlayersMod.DragBoxEndConditionType = null,
    className: java.lang.String = null,
    condition: openlayersLib.openlayersMod.EventsConditionType = null,
    minArea: scala.Int | scala.Double = null
  ): DragBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (boxEndCondition != null) __obj.updateDynamic("boxEndCondition")(boxEndCondition)
    if (className != null) __obj.updateDynamic("className")(className)
    if (condition != null) __obj.updateDynamic("condition")(condition)
    if (minArea != null) __obj.updateDynamic("minArea")(minArea.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragBoxOptions]
  }
}

