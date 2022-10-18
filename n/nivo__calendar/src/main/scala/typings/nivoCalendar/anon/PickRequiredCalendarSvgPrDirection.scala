package typings.nivoCalendar.anon

import typings.nivoCalendar.nivoCalendarStrings.horizontal
import typings.nivoCalendar.nivoCalendarStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<std.Required<@nivo/calendar.@nivo/calendar/dist/types/types.CalendarSvgProps>, 'direction'> */
trait PickRequiredCalendarSvgPrDirection extends StObject {
  
  var direction: horizontal | vertical
}
object PickRequiredCalendarSvgPrDirection {
  
  inline def apply(direction: horizontal | vertical): PickRequiredCalendarSvgPrDirection = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickRequiredCalendarSvgPrDirection]
  }
  
  extension [Self <: PickRequiredCalendarSvgPrDirection](x: Self) {
    
    inline def setDirection(value: horizontal | vertical): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
  }
}
