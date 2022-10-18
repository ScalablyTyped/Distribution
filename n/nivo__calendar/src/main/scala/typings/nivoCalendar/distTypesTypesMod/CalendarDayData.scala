package typings.nivoCalendar.distTypesTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CalendarDayData extends StObject {
  
  var color: String
  
  var date: js.Date
  
  var day: String
  
  var size: Double
  
  var value: js.UndefOr[Double] = js.undefined
  
  var x: Double
  
  var y: Double
}
object CalendarDayData {
  
  inline def apply(color: String, date: js.Date, day: String, size: Double, x: Double, y: Double): CalendarDayData = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], day = day.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarDayData]
  }
  
  extension [Self <: CalendarDayData](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDay(value: String): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
