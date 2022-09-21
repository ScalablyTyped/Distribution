package typings.nivoCalendar.typesMod

import typings.nivoCore.mod.CompleteTheme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CalendarYearLegendsProps extends StObject {
  
  def legend(year: Double): String | Double
  
  var theme: CompleteTheme
  
  var years: js.Array[YearLegend]
}
object CalendarYearLegendsProps {
  
  inline def apply(legend: Double => String | Double, theme: CompleteTheme, years: js.Array[YearLegend]): CalendarYearLegendsProps = {
    val __obj = js.Dynamic.literal(legend = js.Any.fromFunction1(legend), theme = theme.asInstanceOf[js.Any], years = years.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarYearLegendsProps]
  }
  
  extension [Self <: CalendarYearLegendsProps](x: Self) {
    
    inline def setLegend(value: Double => String | Double): Self = StObject.set(x, "legend", js.Any.fromFunction1(value))
    
    inline def setTheme(value: CompleteTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setYears(value: js.Array[YearLegend]): Self = StObject.set(x, "years", value.asInstanceOf[js.Any])
    
    inline def setYearsVarargs(value: YearLegend*): Self = StObject.set(x, "years", js.Array(value*))
  }
}
