package typings.officeUiFabricReact.calendarButtonExampleMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICalendarButtonExampleState extends js.Object {
  var selectedDate: Date | Null
  var showCalendar: Boolean
}

object ICalendarButtonExampleState {
  @scala.inline
  def apply(showCalendar: Boolean, selectedDate: Date = null): ICalendarButtonExampleState = {
    val __obj = js.Dynamic.literal(showCalendar = showCalendar.asInstanceOf[js.Any])
    if (selectedDate != null) __obj.updateDynamic("selectedDate")(selectedDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICalendarButtonExampleState]
  }
}

