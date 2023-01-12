package typings.openseadragon.mod

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// -- MOUSE TRACKER EVENTS --
trait MouseTrackerEvent[T /* <: Event */]
  extends StObject
     with OSDEvent[MouseTracker] {
  
  var originalEvent: T
}
object MouseTrackerEvent {
  
  inline def apply[T /* <: Event */](eventSource: MouseTracker, originalEvent: T, userData: Any): MouseTrackerEvent[T] = {
    val __obj = js.Dynamic.literal(eventSource = eventSource.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any], userData = userData.asInstanceOf[js.Any])
    __obj.asInstanceOf[MouseTrackerEvent[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MouseTrackerEvent[?], T /* <: Event */] (val x: Self & MouseTrackerEvent[T]) extends AnyVal {
    
    inline def setOriginalEvent(value: T): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
  }
}
