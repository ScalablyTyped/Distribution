package typings.nivoCalendar.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Date extends StObject {
  
  var bbox: Height
  
  var date: js.Date
  
  var month: Double
  
  var path: String
  
  var year: Double
}
object Date {
  
  inline def apply(bbox: Height, date: js.Date, month: Double, path: String, year: Double): Date = {
    val __obj = js.Dynamic.literal(bbox = bbox.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
    __obj.asInstanceOf[Date]
  }
  
  extension [Self <: Date](x: Self) {
    
    inline def setBbox(value: Height): Self = StObject.set(x, "bbox", value.asInstanceOf[js.Any])
    
    inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setMonth(value: Double): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setYear(value: Double): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
  }
}
