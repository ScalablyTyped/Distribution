package typings.officeUiFabricReact.calendarDayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICalendarDay extends js.Object {
  def focus(): Unit
}

object ICalendarDay {
  @scala.inline
  def apply(focus: () => Unit): ICalendarDay = {
    val __obj = js.Dynamic.literal(focus = js.Any.fromFunction0(focus))
  
    __obj.asInstanceOf[ICalendarDay]
  }
}

