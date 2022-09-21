package typings.openseadragon.mod

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanvasEvent
  extends StObject
     with OSDEvent[Viewer] {
  
  var originalEvent: Event
  
  var position: Point
  
  var tracker: MouseTracker
}
object CanvasEvent {
  
  inline def apply(eventSource: Viewer, originalEvent: Event, position: Point, tracker: MouseTracker, userData: Any): CanvasEvent = {
    val __obj = js.Dynamic.literal(eventSource = eventSource.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], tracker = tracker.asInstanceOf[js.Any], userData = userData.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasEvent]
  }
  
  extension [Self <: CanvasEvent](x: Self) {
    
    inline def setOriginalEvent(value: Event): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: Point): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setTracker(value: MouseTracker): Self = StObject.set(x, "tracker", value.asInstanceOf[js.Any])
  }
}
