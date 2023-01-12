package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeSlot extends StObject {
  
  // The date, time, and time zone that a period ends.
  var end: js.UndefOr[DateTimeTimeZone] = js.undefined
  
  // The date, time, and time zone that a period begins.
  var start: js.UndefOr[DateTimeTimeZone] = js.undefined
}
object TimeSlot {
  
  inline def apply(): TimeSlot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeSlot]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TimeSlot] (val x: Self) extends AnyVal {
    
    inline def setEnd(value: DateTimeTimeZone): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    inline def setStart(value: DateTimeTimeZone): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
