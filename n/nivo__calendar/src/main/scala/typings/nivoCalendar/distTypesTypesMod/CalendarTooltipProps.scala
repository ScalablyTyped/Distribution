package typings.nivoCalendar.distTypesTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CalendarTooltipProps extends StObject {
  
  var color: String
  
  var day: String
  
  var value: String
}
object CalendarTooltipProps {
  
  inline def apply(color: String, day: String, value: String): CalendarTooltipProps = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], day = day.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarTooltipProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CalendarTooltipProps] (val x: Self) extends AnyVal {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setDay(value: String): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
