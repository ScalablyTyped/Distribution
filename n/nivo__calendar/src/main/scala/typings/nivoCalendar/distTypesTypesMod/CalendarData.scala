package typings.nivoCalendar.distTypesTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CalendarData extends StObject {
  
  var data: js.Array[CalendarDatum]
  
  var from: DateOrString
  
  var to: DateOrString
}
object CalendarData {
  
  inline def apply(data: js.Array[CalendarDatum], from: DateOrString, to: DateOrString): CalendarData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarData]
  }
  
  extension [Self <: CalendarData](x: Self) {
    
    inline def setData(value: js.Array[CalendarDatum]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: CalendarDatum*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setFrom(value: DateOrString): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setTo(value: DateOrString): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
  }
}
