package typings.moment.momentMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CalendarSpec
  extends // any additional properties might be used with moment.calendarFormat
/* x */ StringDictionary[js.UndefOr[CalendarSpecVal]] {
  
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
  implicit class CalendarSpecMutableBuilder[Self <: CalendarSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLastDay(value: CalendarSpecVal): Self = StObject.set(x, "lastDay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastDayFunction2(value: (/* m */ js.UndefOr[MomentInput], /* now */ js.UndefOr[Moment]) => String): Self = StObject.set(x, "lastDay", js.Any.fromFunction2(value))
    
    @scala.inline
    def setLastDayUndefined: Self = StObject.set(x, "lastDay", js.undefined)
    
    @scala.inline
    def setLastWeek(value: CalendarSpecVal): Self = StObject.set(x, "lastWeek", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastWeekFunction2(value: (/* m */ js.UndefOr[MomentInput], /* now */ js.UndefOr[Moment]) => String): Self = StObject.set(x, "lastWeek", js.Any.fromFunction2(value))
    
    @scala.inline
    def setLastWeekUndefined: Self = StObject.set(x, "lastWeek", js.undefined)
    
    @scala.inline
    def setNextDay(value: CalendarSpecVal): Self = StObject.set(x, "nextDay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextDayFunction2(value: (/* m */ js.UndefOr[MomentInput], /* now */ js.UndefOr[Moment]) => String): Self = StObject.set(x, "nextDay", js.Any.fromFunction2(value))
    
    @scala.inline
    def setNextDayUndefined: Self = StObject.set(x, "nextDay", js.undefined)
    
    @scala.inline
    def setNextWeek(value: CalendarSpecVal): Self = StObject.set(x, "nextWeek", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextWeekFunction2(value: (/* m */ js.UndefOr[MomentInput], /* now */ js.UndefOr[Moment]) => String): Self = StObject.set(x, "nextWeek", js.Any.fromFunction2(value))
    
    @scala.inline
    def setNextWeekUndefined: Self = StObject.set(x, "nextWeek", js.undefined)
    
    @scala.inline
    def setSameDay(value: CalendarSpecVal): Self = StObject.set(x, "sameDay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSameDayFunction2(value: (/* m */ js.UndefOr[MomentInput], /* now */ js.UndefOr[Moment]) => String): Self = StObject.set(x, "sameDay", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSameDayUndefined: Self = StObject.set(x, "sameDay", js.undefined)
    
    @scala.inline
    def setSameElse(value: CalendarSpecVal): Self = StObject.set(x, "sameElse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSameElseFunction2(value: (/* m */ js.UndefOr[MomentInput], /* now */ js.UndefOr[Moment]) => String): Self = StObject.set(x, "sameElse", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSameElseUndefined: Self = StObject.set(x, "sameElse", js.undefined)
  }
}
