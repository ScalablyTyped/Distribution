package typings.nivoCalendar.distTypesTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<@nivo/calendar.@nivo/calendar/dist/types/types.Month, 'path'> & @nivo/calendar.@nivo/calendar/dist/types/types.Legend */
trait MonthLegend extends StObject {
  
  var bbox: BBox
  
  var date: js.Date
  
  var month: Double
  
  var rotation: Double
  
  var x: Double
  
  var y: Double
  
  var year: Double
}
object MonthLegend {
  
  inline def apply(bbox: BBox, date: js.Date, month: Double, rotation: Double, x: Double, y: Double, year: Double): MonthLegend = {
    val __obj = js.Dynamic.literal(bbox = bbox.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
    __obj.asInstanceOf[MonthLegend]
  }
  
  extension [Self <: MonthLegend](x: Self) {
    
    inline def setBbox(value: BBox): Self = StObject.set(x, "bbox", value.asInstanceOf[js.Any])
    
    inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setMonth(value: Double): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
    
    inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYear(value: Double): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
  }
}
