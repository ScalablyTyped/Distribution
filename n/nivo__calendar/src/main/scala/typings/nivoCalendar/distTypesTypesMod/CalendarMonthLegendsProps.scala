package typings.nivoCalendar.distTypesTypesMod

import typings.nivoCore.mod.CompleteTheme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CalendarMonthLegendsProps extends StObject {
  
  def legend(year: Double, month: Double, date: js.Date): String | Double
  
  var months: js.Array[MonthLegend]
  
  var theme: CompleteTheme
}
object CalendarMonthLegendsProps {
  
  inline def apply(
    legend: (Double, Double, js.Date) => String | Double,
    months: js.Array[MonthLegend],
    theme: CompleteTheme
  ): CalendarMonthLegendsProps = {
    val __obj = js.Dynamic.literal(legend = js.Any.fromFunction3(legend), months = months.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarMonthLegendsProps]
  }
  
  extension [Self <: CalendarMonthLegendsProps](x: Self) {
    
    inline def setLegend(value: (Double, Double, js.Date) => String | Double): Self = StObject.set(x, "legend", js.Any.fromFunction3(value))
    
    inline def setMonths(value: js.Array[MonthLegend]): Self = StObject.set(x, "months", value.asInstanceOf[js.Any])
    
    inline def setMonthsVarargs(value: MonthLegend*): Self = StObject.set(x, "months", js.Array(value*))
    
    inline def setTheme(value: CompleteTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
  }
}
