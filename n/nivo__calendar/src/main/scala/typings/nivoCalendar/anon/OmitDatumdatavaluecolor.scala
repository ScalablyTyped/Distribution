package typings.nivoCalendar.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<@nivo/calendar.@nivo/calendar/dist/types/types.Datum, 'data' | 'value' | 'color'> */
trait OmitDatumdatavaluecolor extends StObject {
  
  var date: js.Date
  
  var day: String
  
  var size: Double
  
  var x: Double
  
  var y: Double
}
object OmitDatumdatavaluecolor {
  
  inline def apply(date: js.Date, day: String, size: Double, x: Double, y: Double): OmitDatumdatavaluecolor = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], day = day.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitDatumdatavaluecolor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OmitDatumdatavaluecolor] (val x: Self) extends AnyVal {
    
    inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDay(value: String): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
