package typings.moment.ts3Dot1TypingsMomentMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CalendarSpec
  extends StObject
     with // any additional properties might be used with moment.calendarFormat
/* x */ StringDictionary[js.UndefOr[CalendarSpecVal]] {
  
  var lastDay: js.UndefOr[CalendarSpecVal] = js.undefined
  
  var lastWeek: js.UndefOr[CalendarSpecVal] = js.undefined
  
  var nextDay: js.UndefOr[CalendarSpecVal] = js.undefined
  
  var nextWeek: js.UndefOr[CalendarSpecVal] = js.undefined
  
  var sameDay: js.UndefOr[CalendarSpecVal] = js.undefined
  
  var sameElse: js.UndefOr[CalendarSpecVal] = js.undefined
}
object CalendarSpec {
  
  inline def apply(): CalendarSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CalendarSpec]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CalendarSpec] (val x: Self) extends AnyVal {
    
    inline def setLastDay(value: CalendarSpecVal): Self = StObject.set(x, "lastDay", value.asInstanceOf[js.Any])
    
    inline def setLastDayFunction2(value: (/* m */ js.UndefOr[MomentInput], /* now */ js.UndefOr[Moment]) => String): Self = StObject.set(x, "lastDay", js.Any.fromFunction2(value))
    
    inline def setLastDayUndefined: Self = StObject.set(x, "lastDay", js.undefined)
    
    inline def setLastWeek(value: CalendarSpecVal): Self = StObject.set(x, "lastWeek", value.asInstanceOf[js.Any])
    
    inline def setLastWeekFunction2(value: (/* m */ js.UndefOr[MomentInput], /* now */ js.UndefOr[Moment]) => String): Self = StObject.set(x, "lastWeek", js.Any.fromFunction2(value))
    
    inline def setLastWeekUndefined: Self = StObject.set(x, "lastWeek", js.undefined)
    
    inline def setNextDay(value: CalendarSpecVal): Self = StObject.set(x, "nextDay", value.asInstanceOf[js.Any])
    
    inline def setNextDayFunction2(value: (/* m */ js.UndefOr[MomentInput], /* now */ js.UndefOr[Moment]) => String): Self = StObject.set(x, "nextDay", js.Any.fromFunction2(value))
    
    inline def setNextDayUndefined: Self = StObject.set(x, "nextDay", js.undefined)
    
    inline def setNextWeek(value: CalendarSpecVal): Self = StObject.set(x, "nextWeek", value.asInstanceOf[js.Any])
    
    inline def setNextWeekFunction2(value: (/* m */ js.UndefOr[MomentInput], /* now */ js.UndefOr[Moment]) => String): Self = StObject.set(x, "nextWeek", js.Any.fromFunction2(value))
    
    inline def setNextWeekUndefined: Self = StObject.set(x, "nextWeek", js.undefined)
    
    inline def setSameDay(value: CalendarSpecVal): Self = StObject.set(x, "sameDay", value.asInstanceOf[js.Any])
    
    inline def setSameDayFunction2(value: (/* m */ js.UndefOr[MomentInput], /* now */ js.UndefOr[Moment]) => String): Self = StObject.set(x, "sameDay", js.Any.fromFunction2(value))
    
    inline def setSameDayUndefined: Self = StObject.set(x, "sameDay", js.undefined)
    
    inline def setSameElse(value: CalendarSpecVal): Self = StObject.set(x, "sameElse", value.asInstanceOf[js.Any])
    
    inline def setSameElseFunction2(value: (/* m */ js.UndefOr[MomentInput], /* now */ js.UndefOr[Moment]) => String): Self = StObject.set(x, "sameElse", js.Any.fromFunction2(value))
    
    inline def setSameElseUndefined: Self = StObject.set(x, "sameElse", js.undefined)
  }
}
