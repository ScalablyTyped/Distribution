package typings.nivoCalendar.anon

import typings.nivoCalendar.distTypesTypesMod.DateOrString
import typings.nivoCalendar.nivoCalendarStrings.horizontal
import typings.nivoCalendar.nivoCalendarStrings.vertical
import typings.nivoCore.mod.BoxAlign
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<std.Required<@nivo/calendar.@nivo/calendar/dist/types/types.CalendarSvgProps>, 'width' | 'height' | 'from' | 'to' | 'direction' | 'yearSpacing' | 'monthSpacing' | 'daySpacing' | 'align'> */
trait PickRequiredCalendarSvgPrAlign extends StObject {
  
  var align: BoxAlign
  
  var daySpacing: Double
  
  var direction: horizontal | vertical
  
  var from: DateOrString
  
  var height: Double
  
  var monthSpacing: Double
  
  var to: DateOrString
  
  var width: Double
  
  var yearSpacing: Double
}
object PickRequiredCalendarSvgPrAlign {
  
  inline def apply(
    align: BoxAlign,
    daySpacing: Double,
    direction: horizontal | vertical,
    from: DateOrString,
    height: Double,
    monthSpacing: Double,
    to: DateOrString,
    width: Double,
    yearSpacing: Double
  ): PickRequiredCalendarSvgPrAlign = {
    val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], daySpacing = daySpacing.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], monthSpacing = monthSpacing.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], yearSpacing = yearSpacing.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickRequiredCalendarSvgPrAlign]
  }
  
  extension [Self <: PickRequiredCalendarSvgPrAlign](x: Self) {
    
    inline def setAlign(value: BoxAlign): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setDaySpacing(value: Double): Self = StObject.set(x, "daySpacing", value.asInstanceOf[js.Any])
    
    inline def setDirection(value: horizontal | vertical): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setFrom(value: DateOrString): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setMonthSpacing(value: Double): Self = StObject.set(x, "monthSpacing", value.asInstanceOf[js.Any])
    
    inline def setTo(value: DateOrString): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setYearSpacing(value: Double): Self = StObject.set(x, "yearSpacing", value.asInstanceOf[js.Any])
  }
}
