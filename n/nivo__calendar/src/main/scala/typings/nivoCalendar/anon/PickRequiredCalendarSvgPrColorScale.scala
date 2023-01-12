package typings.nivoCalendar.anon

import typings.d3Scale.mod.ScaleQuantize_
import typings.nivoCalendar.distTypesTypesMod.CalendarDatum
import typings.nivoCalendar.distTypesTypesMod.ColorScale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<std.Required<@nivo/calendar.@nivo/calendar/dist/types/types.CalendarSvgProps>, 'data' | 'emptyColor'> & {  colorScale :d3-scale.d3-scale.ScaleQuantize<string, never> | @nivo/calendar.@nivo/calendar/dist/types/types.ColorScale,   days :std.Array<std.Omit<@nivo/calendar.@nivo/calendar/dist/types/types.Datum, 'color' | 'data' | 'value'>>} */
trait PickRequiredCalendarSvgPrColorScale extends StObject {
  
  var colorScale: (ScaleQuantize_[String, scala.Nothing]) | ColorScale
  
  var data: js.Array[CalendarDatum]
  
  var days: js.Array[OmitDatumcolordatavalue]
  
  var emptyColor: String
}
object PickRequiredCalendarSvgPrColorScale {
  
  inline def apply(
    colorScale: (ScaleQuantize_[String, scala.Nothing]) | ColorScale,
    data: js.Array[CalendarDatum],
    days: js.Array[OmitDatumcolordatavalue],
    emptyColor: String
  ): PickRequiredCalendarSvgPrColorScale = {
    val __obj = js.Dynamic.literal(colorScale = colorScale.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], days = days.asInstanceOf[js.Any], emptyColor = emptyColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickRequiredCalendarSvgPrColorScale]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PickRequiredCalendarSvgPrColorScale] (val x: Self) extends AnyVal {
    
    inline def setColorScale(value: (ScaleQuantize_[String, scala.Nothing]) | ColorScale): Self = StObject.set(x, "colorScale", value.asInstanceOf[js.Any])
    
    inline def setData(value: js.Array[CalendarDatum]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: CalendarDatum*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setDays(value: js.Array[OmitDatumcolordatavalue]): Self = StObject.set(x, "days", value.asInstanceOf[js.Any])
    
    inline def setDaysVarargs(value: OmitDatumcolordatavalue*): Self = StObject.set(x, "days", js.Array(value*))
    
    inline def setEmptyColor(value: String): Self = StObject.set(x, "emptyColor", value.asInstanceOf[js.Any])
  }
}
