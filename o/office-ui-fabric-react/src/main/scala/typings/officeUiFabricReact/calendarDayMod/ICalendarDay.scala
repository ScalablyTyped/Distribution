package typings.officeUiFabricReact.calendarDayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICalendarDay extends js.Object {
  def focus(): Unit = js.native
}

object ICalendarDay {
  @scala.inline
  def apply(focus: () => Unit): ICalendarDay = {
    val __obj = js.Dynamic.literal(focus = js.Any.fromFunction0(focus))
    __obj.asInstanceOf[ICalendarDay]
  }
  @scala.inline
  implicit class ICalendarDayOps[Self <: ICalendarDay] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFocus(value: () => Unit): Self = this.set("focus", js.Any.fromFunction0(value))
  }
  
}

