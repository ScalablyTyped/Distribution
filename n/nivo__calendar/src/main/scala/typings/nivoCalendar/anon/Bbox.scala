package typings.nivoCalendar.anon

import typings.nivoCalendar.distTypesTypesMod.BBox
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bbox extends StObject {
  
  var bbox: BBox
  
  var year: Double
}
object Bbox {
  
  inline def apply(bbox: BBox, year: Double): Bbox = {
    val __obj = js.Dynamic.literal(bbox = bbox.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bbox]
  }
  
  extension [Self <: Bbox](x: Self) {
    
    inline def setBbox(value: BBox): Self = StObject.set(x, "bbox", value.asInstanceOf[js.Any])
    
    inline def setYear(value: Double): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
  }
}
