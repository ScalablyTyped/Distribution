package typings.officeUiFabricReact.calendarYearMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICalendarYear extends js.Object {
  def focus(): Unit
}

object ICalendarYear {
  @scala.inline
  def apply(focus: () => Unit): ICalendarYear = {
    val __obj = js.Dynamic.literal(focus = js.Any.fromFunction0(focus))
  
    __obj.asInstanceOf[ICalendarYear]
  }
}

