package typings.moment.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CalendarSpec
  extends // any additional properties might be used with moment.calendarFormat
/* x */ StringDictionary[CalendarSpecVal | Unit] {
  
  var lastDay: js.UndefOr[CalendarSpecVal] = js.native
  
  var lastWeek: js.UndefOr[CalendarSpecVal] = js.native
  
  var nextDay: js.UndefOr[CalendarSpecVal] = js.native
  
  var nextWeek: js.UndefOr[CalendarSpecVal] = js.native
  
  var sameDay: js.UndefOr[CalendarSpecVal] = js.native
  
  var sameElse: js.UndefOr[CalendarSpecVal] = js.native
}
object CalendarSpec {
  
  @scala.inline
  def apply(): CalendarSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CalendarSpec]
  }
  
  @scala.inline
  implicit class CalendarSpecOps[Self <: CalendarSpec] (val x: Self) extends AnyVal {
    
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
    def setLastDayFunction2(value: (/* m */ js.UndefOr[MomentInput], /* now */ js.UndefOr[Moment]) => String): Self = this.set("lastDay", js.Any.fromFunction2(value))
    
    @scala.inline
    def setLastDay(value: CalendarSpecVal): Self = this.set("lastDay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastDay: Self = this.set("lastDay", js.undefined)
    
    @scala.inline
    def setLastWeekFunction2(value: (/* m */ js.UndefOr[MomentInput], /* now */ js.UndefOr[Moment]) => String): Self = this.set("lastWeek", js.Any.fromFunction2(value))
    
    @scala.inline
    def setLastWeek(value: CalendarSpecVal): Self = this.set("lastWeek", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastWeek: Self = this.set("lastWeek", js.undefined)
    
    @scala.inline
    def setNextDayFunction2(value: (/* m */ js.UndefOr[MomentInput], /* now */ js.UndefOr[Moment]) => String): Self = this.set("nextDay", js.Any.fromFunction2(value))
    
    @scala.inline
    def setNextDay(value: CalendarSpecVal): Self = this.set("nextDay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextDay: Self = this.set("nextDay", js.undefined)
    
    @scala.inline
    def setNextWeekFunction2(value: (/* m */ js.UndefOr[MomentInput], /* now */ js.UndefOr[Moment]) => String): Self = this.set("nextWeek", js.Any.fromFunction2(value))
    
    @scala.inline
    def setNextWeek(value: CalendarSpecVal): Self = this.set("nextWeek", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextWeek: Self = this.set("nextWeek", js.undefined)
    
    @scala.inline
    def setSameDayFunction2(value: (/* m */ js.UndefOr[MomentInput], /* now */ js.UndefOr[Moment]) => String): Self = this.set("sameDay", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSameDay(value: CalendarSpecVal): Self = this.set("sameDay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSameDay: Self = this.set("sameDay", js.undefined)
    
    @scala.inline
    def setSameElseFunction2(value: (/* m */ js.UndefOr[MomentInput], /* now */ js.UndefOr[Moment]) => String): Self = this.set("sameElse", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSameElse(value: CalendarSpecVal): Self = this.set("sameElse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSameElse: Self = this.set("sameElse", js.undefined)
  }
}
