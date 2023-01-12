package typings.nivoCalendar.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Day extends StObject {
  
  var color: String
  
  var coordinates: Y
  
  var date: js.Date
  
  var day: String
  
  var firstWeek: Double
  
  var height: Double
  
  var month: Double
  
  var value: Double
  
  var width: Double
  
  var year: Double
}
object Day {
  
  inline def apply(
    color: String,
    coordinates: Y,
    date: js.Date,
    day: String,
    firstWeek: Double,
    height: Double,
    month: Double,
    value: Double,
    width: Double,
    year: Double
  ): Day = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], coordinates = coordinates.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], day = day.asInstanceOf[js.Any], firstWeek = firstWeek.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
    __obj.asInstanceOf[Day]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Day] (val x: Self) extends AnyVal {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setCoordinates(value: Y): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
    
    inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDay(value: String): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
    
    inline def setFirstWeek(value: Double): Self = StObject.set(x, "firstWeek", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setMonth(value: Double): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setYear(value: Double): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
  }
}
