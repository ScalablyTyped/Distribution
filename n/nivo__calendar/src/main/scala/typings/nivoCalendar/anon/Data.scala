package typings.nivoCalendar.anon

import typings.nivoCalendar.distTypesTypesMod.CalendarDatum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Data extends StObject {
  
  var color: String
  
  var data: CalendarDatum
  
  var date: js.Date
  
  var day: String
  
  var size: Double
  
  var value: Double
  
  var x: Double
  
  var y: Double
}
object Data {
  
  inline def apply(
    color: String,
    data: CalendarDatum,
    date: js.Date,
    day: String,
    size: Double,
    value: Double,
    x: Double,
    y: Double
  ): Data = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], day = day.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
  
  extension [Self <: Data](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setData(value: CalendarDatum): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDay(value: String): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
