package typings.officeUiFabricReact.calendarTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICalendar extends js.Object {
  /** Sets focus to the selected date. */
  def focus(): Unit
}

object ICalendar {
  @scala.inline
  def apply(focus: () => Unit): ICalendar = {
    val __obj = js.Dynamic.literal(focus = js.Any.fromFunction0(focus))
  
    __obj.asInstanceOf[ICalendar]
  }
}

