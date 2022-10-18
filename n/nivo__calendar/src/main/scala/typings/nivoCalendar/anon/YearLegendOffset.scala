package typings.nivoCalendar.anon

import typings.nivoCalendar.distTypesTypesMod.Year
import typings.nivoCalendar.nivoCalendarStrings.after
import typings.nivoCalendar.nivoCalendarStrings.before
import typings.nivoCalendar.nivoCalendarStrings.horizontal
import typings.nivoCalendar.nivoCalendarStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait YearLegendOffset extends StObject {
  
  var direction: horizontal | vertical
  
  var yearLegendOffset: Double
  
  var yearLegendPosition: before | after
  
  var years: js.Array[Year]
}
object YearLegendOffset {
  
  inline def apply(
    direction: horizontal | vertical,
    yearLegendOffset: Double,
    yearLegendPosition: before | after,
    years: js.Array[Year]
  ): YearLegendOffset = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], yearLegendOffset = yearLegendOffset.asInstanceOf[js.Any], yearLegendPosition = yearLegendPosition.asInstanceOf[js.Any], years = years.asInstanceOf[js.Any])
    __obj.asInstanceOf[YearLegendOffset]
  }
  
  extension [Self <: YearLegendOffset](x: Self) {
    
    inline def setDirection(value: horizontal | vertical): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setYearLegendOffset(value: Double): Self = StObject.set(x, "yearLegendOffset", value.asInstanceOf[js.Any])
    
    inline def setYearLegendPosition(value: before | after): Self = StObject.set(x, "yearLegendPosition", value.asInstanceOf[js.Any])
    
    inline def setYears(value: js.Array[Year]): Self = StObject.set(x, "years", value.asInstanceOf[js.Any])
    
    inline def setYearsVarargs(value: Year*): Self = StObject.set(x, "years", js.Array(value*))
  }
}
