package typings.nivoCalendar.distTypesTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @nivo/calendar.@nivo/calendar/dist/types/types.Year & @nivo/calendar.@nivo/calendar/dist/types/types.Legend */
trait YearLegend extends StObject {
  
  var bbox: BBox
  
  var rotation: Double
  
  var x: Double
  
  var y: Double
  
  var year: Double
}
object YearLegend {
  
  inline def apply(bbox: BBox, rotation: Double, x: Double, y: Double, year: Double): YearLegend = {
    val __obj = js.Dynamic.literal(bbox = bbox.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
    __obj.asInstanceOf[YearLegend]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: YearLegend] (val x: Self) extends AnyVal {
    
    inline def setBbox(value: BBox): Self = StObject.set(x, "bbox", value.asInstanceOf[js.Any])
    
    inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYear(value: Double): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
  }
}
