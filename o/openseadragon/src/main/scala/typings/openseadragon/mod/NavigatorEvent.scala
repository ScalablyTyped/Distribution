package typings.openseadragon.mod

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigatorEvent
  extends StObject
     with OSDEvent[Viewer] {
  
  var originalEvent: Event
  
  var position: Point
  
  var shift: Boolean
  
  var tracker: MouseTracker
}
object NavigatorEvent {
  
  inline def apply(
    eventSource: Viewer,
    originalEvent: Event,
    position: Point,
    shift: Boolean,
    tracker: MouseTracker,
    userData: Any
  ): NavigatorEvent = {
    val __obj = js.Dynamic.literal(eventSource = eventSource.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], shift = shift.asInstanceOf[js.Any], tracker = tracker.asInstanceOf[js.Any], userData = userData.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigatorEvent]
  }
  
  extension [Self <: NavigatorEvent](x: Self) {
    
    inline def setOriginalEvent(value: Event): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: Point): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setShift(value: Boolean): Self = StObject.set(x, "shift", value.asInstanceOf[js.Any])
    
    inline def setTracker(value: MouseTracker): Self = StObject.set(x, "tracker", value.asInstanceOf[js.Any])
  }
}
