package typings.officeUiFabricReact.calendarMonthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICalendarMonth extends js.Object {
  def focus(): Unit
}

object ICalendarMonth {
  @scala.inline
  def apply(focus: () => Unit): ICalendarMonth = {
    val __obj = js.Dynamic.literal(focus = js.Any.fromFunction0(focus))
    __obj.asInstanceOf[ICalendarMonth]
  }
}

