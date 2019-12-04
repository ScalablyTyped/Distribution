package typings.officeDashUiDashFabricDashReact.libComponentsCalendarCalendarDayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICalendarDayState extends js.Object {
  var activeDescendantId: js.UndefOr[String] = js.undefined
  var weeks: js.UndefOr[js.Array[js.Array[IDayInfo]]] = js.undefined
}

object ICalendarDayState {
  @scala.inline
  def apply(activeDescendantId: String = null, weeks: js.Array[js.Array[IDayInfo]] = null): ICalendarDayState = {
    val __obj = js.Dynamic.literal()
    if (activeDescendantId != null) __obj.updateDynamic("activeDescendantId")(activeDescendantId.asInstanceOf[js.Any])
    if (weeks != null) __obj.updateDynamic("weeks")(weeks.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICalendarDayState]
  }
}

