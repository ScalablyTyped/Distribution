package typings.nivoCalendar.anon

import typings.nivoCalendar.nivoCalendarStrings.horizontal
import typings.nivoCalendar.nivoCalendarStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<std.Required<@nivo/calendar.@nivo/calendar/dist/types/types.CalendarSvgProps>, 'direction'> */
trait PickRequiredCalendarSvgPr0 extends StObject {
  
  var direction: horizontal | vertical
}
object PickRequiredCalendarSvgPr0 {
  
  inline def apply(direction: horizontal | vertical): PickRequiredCalendarSvgPr0 = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickRequiredCalendarSvgPr0]
  }
  
  extension [Self <: PickRequiredCalendarSvgPr0](x: Self) {
    
    inline def setDirection(value: horizontal | vertical): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
  }
}
