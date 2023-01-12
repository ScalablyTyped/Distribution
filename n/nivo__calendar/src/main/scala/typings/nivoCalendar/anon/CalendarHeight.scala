package typings.nivoCalendar.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CalendarHeight extends StObject {
  
  var calendarHeight: Double
  
  var calendarWidth: Double
  
  var cellSize: Double
  
  var days: js.Array[OmitDatumdatavaluecolor]
  
  var months: js.Array[Date]
  
  var originX: Double
  
  var originY: Double
  
  var years: js.Array[Bbox]
}
object CalendarHeight {
  
  inline def apply(
    calendarHeight: Double,
    calendarWidth: Double,
    cellSize: Double,
    days: js.Array[OmitDatumdatavaluecolor],
    months: js.Array[Date],
    originX: Double,
    originY: Double,
    years: js.Array[Bbox]
  ): CalendarHeight = {
    val __obj = js.Dynamic.literal(calendarHeight = calendarHeight.asInstanceOf[js.Any], calendarWidth = calendarWidth.asInstanceOf[js.Any], cellSize = cellSize.asInstanceOf[js.Any], days = days.asInstanceOf[js.Any], months = months.asInstanceOf[js.Any], originX = originX.asInstanceOf[js.Any], originY = originY.asInstanceOf[js.Any], years = years.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarHeight]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CalendarHeight] (val x: Self) extends AnyVal {
    
    inline def setCalendarHeight(value: Double): Self = StObject.set(x, "calendarHeight", value.asInstanceOf[js.Any])
    
    inline def setCalendarWidth(value: Double): Self = StObject.set(x, "calendarWidth", value.asInstanceOf[js.Any])
    
    inline def setCellSize(value: Double): Self = StObject.set(x, "cellSize", value.asInstanceOf[js.Any])
    
    inline def setDays(value: js.Array[OmitDatumdatavaluecolor]): Self = StObject.set(x, "days", value.asInstanceOf[js.Any])
    
    inline def setDaysVarargs(value: OmitDatumdatavaluecolor*): Self = StObject.set(x, "days", js.Array(value*))
    
    inline def setMonths(value: js.Array[Date]): Self = StObject.set(x, "months", value.asInstanceOf[js.Any])
    
    inline def setMonthsVarargs(value: Date*): Self = StObject.set(x, "months", js.Array(value*))
    
    inline def setOriginX(value: Double): Self = StObject.set(x, "originX", value.asInstanceOf[js.Any])
    
    inline def setOriginY(value: Double): Self = StObject.set(x, "originY", value.asInstanceOf[js.Any])
    
    inline def setYears(value: js.Array[Bbox]): Self = StObject.set(x, "years", value.asInstanceOf[js.Any])
    
    inline def setYearsVarargs(value: Bbox*): Self = StObject.set(x, "years", js.Array(value*))
  }
}
