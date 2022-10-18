package typings.nivoCalendar.distTypesTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Year extends StObject {
  
  var bbox: BBox
  
  var year: Double
}
object Year {
  
  inline def apply(bbox: BBox, year: Double): Year = {
    val __obj = js.Dynamic.literal(bbox = bbox.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
    __obj.asInstanceOf[Year]
  }
  
  extension [Self <: Year](x: Self) {
    
    inline def setBbox(value: BBox): Self = StObject.set(x, "bbox", value.asInstanceOf[js.Any])
    
    inline def setYear(value: Double): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
  }
}
