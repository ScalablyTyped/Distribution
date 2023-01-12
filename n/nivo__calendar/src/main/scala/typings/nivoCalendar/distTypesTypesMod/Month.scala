package typings.nivoCalendar.distTypesTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Month extends StObject {
  
  var bbox: BBox
  
  var date: js.Date
  
  var month: Double
  
  var path: String
  
  var year: Double
}
object Month {
  
  inline def apply(bbox: BBox, date: js.Date, month: Double, path: String, year: Double): Month = {
    val __obj = js.Dynamic.literal(bbox = bbox.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
    __obj.asInstanceOf[Month]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Month] (val x: Self) extends AnyVal {
    
    inline def setBbox(value: BBox): Self = StObject.set(x, "bbox", value.asInstanceOf[js.Any])
    
    inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setMonth(value: Double): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setYear(value: Double): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
  }
}
