package typings.nivoCalendar.anon

import typings.nivoCalendar.nivoCalendarStrings.auto
import typings.nivoCalendar.typesMod.CalendarDatum
import typings.nivoCalendar.typesMod.ColorScale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<std.Required<@nivo/calendar.@nivo/calendar/dist/types/types.CalendarSvgProps>, 'data' | 'minValue' | 'maxValue' | 'colors'> & std.Pick<@nivo/calendar.@nivo/calendar/dist/types/types.CalendarSvgProps, 'colorScale'> */
trait PickRequiredCalendarSvgPrColors extends StObject {
  
  var colorScale: js.UndefOr[ColorScale] = js.undefined
  
  var colors: js.Array[String]
  
  var data: js.Array[CalendarDatum]
  
  var maxValue: auto | Double
  
  var minValue: auto | Double
}
object PickRequiredCalendarSvgPrColors {
  
  inline def apply(
    colors: js.Array[String],
    data: js.Array[CalendarDatum],
    maxValue: auto | Double,
    minValue: auto | Double
  ): PickRequiredCalendarSvgPrColors = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], maxValue = maxValue.asInstanceOf[js.Any], minValue = minValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickRequiredCalendarSvgPrColors]
  }
  
  extension [Self <: PickRequiredCalendarSvgPrColors](x: Self) {
    
    inline def setColorScale(value: ColorScale): Self = StObject.set(x, "colorScale", value.asInstanceOf[js.Any])
    
    inline def setColorScaleUndefined: Self = StObject.set(x, "colorScale", js.undefined)
    
    inline def setColors(value: js.Array[String]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setColorsVarargs(value: String*): Self = StObject.set(x, "colors", js.Array(value*))
    
    inline def setData(value: js.Array[CalendarDatum]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: CalendarDatum*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setMaxValue(value: auto | Double): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
    
    inline def setMinValue(value: auto | Double): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
  }
}
