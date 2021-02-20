package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimeSlot extends StObject {
  
  // The date, time, and time zone that a period begins.
  var end: js.UndefOr[DateTimeTimeZone] = js.native
  
  // The date, time, and time zone that a period ends.
  var start: js.UndefOr[DateTimeTimeZone] = js.native
}
object TimeSlot {
  
  @scala.inline
  def apply(): TimeSlot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeSlot]
  }
  
  @scala.inline
  implicit class TimeSlotMutableBuilder[Self <: TimeSlot] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnd(value: DateTimeTimeZone): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    @scala.inline
    def setStart(value: DateTimeTimeZone): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
