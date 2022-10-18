package typings.nivoCalendar.anon

import typings.d3Scale.mod.ScaleQuantize_
import typings.nivoCalendar.distTypesTypesMod.CalendarDatum
import typings.nivoCalendar.distTypesTypesMod.ColorScale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<std.Required<@nivo/calendar.@nivo/calendar/dist/types/types.CalendarSvgProps>, 'data' | 'emptyColor'> & std.Pick<std.Pick<std.Required<@nivo/calendar.@nivo/calendar/dist/types/types.CalendarSvgProps>, 'data' | 'emptyColor'> & {  colorScale :@nivo/calendar.@nivo/calendar/dist/types/types.ColorScale | d3-scale.d3-scale.ScaleQuantize<string, never>,   days :std.Array<std.Omit<@nivo/calendar.@nivo/calendar/dist/types/types.Datum, 'data' | 'value' | 'color'>>}, 'days'> & {  colorScale :d3-scale.d3-scale.ScaleQuantize<string, never> | @nivo/calendar.@nivo/calendar/dist/types/types.ColorScale} */
trait PickRequiredCalendarSvgPrData extends StObject {
  
  var colorScale: (ScaleQuantize_[String, scala.Nothing]) | ColorScale
  
  var data: js.Array[CalendarDatum]
  
  var days: js.Array[OmitDatumdatavaluecolor]
  
  var emptyColor: String
}
object PickRequiredCalendarSvgPrData {
  
  inline def apply(
    colorScale: (ScaleQuantize_[String, scala.Nothing]) | ColorScale,
    data: js.Array[CalendarDatum],
    days: js.Array[OmitDatumdatavaluecolor],
    emptyColor: String
  ): PickRequiredCalendarSvgPrData = {
    val __obj = js.Dynamic.literal(colorScale = colorScale.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], days = days.asInstanceOf[js.Any], emptyColor = emptyColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickRequiredCalendarSvgPrData]
  }
  
  extension [Self <: PickRequiredCalendarSvgPrData](x: Self) {
    
    inline def setColorScale(value: (ScaleQuantize_[String, scala.Nothing]) | ColorScale): Self = StObject.set(x, "colorScale", value.asInstanceOf[js.Any])
    
    inline def setData(value: js.Array[CalendarDatum]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: CalendarDatum*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setDays(value: js.Array[OmitDatumdatavaluecolor]): Self = StObject.set(x, "days", value.asInstanceOf[js.Any])
    
    inline def setDaysVarargs(value: OmitDatumdatavaluecolor*): Self = StObject.set(x, "days", js.Array(value*))
    
    inline def setEmptyColor(value: String): Self = StObject.set(x, "emptyColor", value.asInstanceOf[js.Any])
  }
}
