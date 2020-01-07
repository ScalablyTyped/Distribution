package typings.ol.interactionDragBoxMod

import typings.ol.eventsConditionMod.Condition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var boxEndCondition: js.UndefOr[EndCondition] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var condition: js.UndefOr[Condition] = js.undefined
  var minArea: js.UndefOr[Double] = js.undefined
  var onBoxEnd: js.UndefOr[
    js.ThisFunction1[/* this */ DragBox, /* p0 */ typings.ol.mapBrowserEventMod.default, Unit]
  ] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    boxEndCondition: EndCondition = null,
    className: String = null,
    condition: Condition = null,
    minArea: Int | Double = null,
    onBoxEnd: js.ThisFunction1[/* this */ DragBox, /* p0 */ typings.ol.mapBrowserEventMod.default, Unit] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (boxEndCondition != null) __obj.updateDynamic("boxEndCondition")(boxEndCondition.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (condition != null) __obj.updateDynamic("condition")(condition.asInstanceOf[js.Any])
    if (minArea != null) __obj.updateDynamic("minArea")(minArea.asInstanceOf[js.Any])
    if (onBoxEnd != null) __obj.updateDynamic("onBoxEnd")(onBoxEnd.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

