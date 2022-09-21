package typings.nivoCalendar.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CalendarDatum extends StObject {
  
  var day: String
  
  var value: Double
}
object CalendarDatum {
  
  inline def apply(day: String, value: Double): CalendarDatum = {
    val __obj = js.Dynamic.literal(day = day.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarDatum]
  }
  
  extension [Self <: CalendarDatum](x: Self) {
    
    inline def setDay(value: String): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
