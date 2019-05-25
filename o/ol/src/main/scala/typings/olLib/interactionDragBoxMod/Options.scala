package typings
package olLib.interactionDragBoxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var boxEndCondition: js.UndefOr[EndCondition] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var condition: js.UndefOr[olLib.eventsConditionMod.Condition] = js.undefined
  var minArea: js.UndefOr[scala.Double] = js.undefined
  def onBoxEnd(`this`: DragBox, param1: olLib.mapBrowserEventMod.default): scala.Unit
}

object Options {
  @scala.inline
  def apply(
    onBoxEnd: (DragBox, olLib.mapBrowserEventMod.default) => scala.Unit,
    boxEndCondition: EndCondition = null,
    className: java.lang.String = null,
    condition: olLib.eventsConditionMod.Condition = null,
    minArea: scala.Int | scala.Double = null
  ): Options = {
    val __obj = js.Dynamic.literal(onBoxEnd = js.Any.fromFunction2(onBoxEnd))
    if (boxEndCondition != null) __obj.updateDynamic("boxEndCondition")(boxEndCondition)
    if (className != null) __obj.updateDynamic("className")(className)
    if (condition != null) __obj.updateDynamic("condition")(condition)
    if (minArea != null) __obj.updateDynamic("minArea")(minArea.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

