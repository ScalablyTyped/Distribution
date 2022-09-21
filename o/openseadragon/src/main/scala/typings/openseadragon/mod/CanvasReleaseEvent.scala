package typings.openseadragon.mod

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanvasReleaseEvent
  extends StObject
     with CanvasEvent {
  
  var insideElementPressed: Boolean
  
  var insideElementReleased: Boolean
  
  var pointerType: PointerType
}
object CanvasReleaseEvent {
  
  inline def apply(
    eventSource: Viewer,
    insideElementPressed: Boolean,
    insideElementReleased: Boolean,
    originalEvent: Event,
    pointerType: PointerType,
    position: Point,
    tracker: MouseTracker,
    userData: Any
  ): CanvasReleaseEvent = {
    val __obj = js.Dynamic.literal(eventSource = eventSource.asInstanceOf[js.Any], insideElementPressed = insideElementPressed.asInstanceOf[js.Any], insideElementReleased = insideElementReleased.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any], pointerType = pointerType.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], tracker = tracker.asInstanceOf[js.Any], userData = userData.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasReleaseEvent]
  }
  
  extension [Self <: CanvasReleaseEvent](x: Self) {
    
    inline def setInsideElementPressed(value: Boolean): Self = StObject.set(x, "insideElementPressed", value.asInstanceOf[js.Any])
    
    inline def setInsideElementReleased(value: Boolean): Self = StObject.set(x, "insideElementReleased", value.asInstanceOf[js.Any])
    
    inline def setPointerType(value: PointerType): Self = StObject.set(x, "pointerType", value.asInstanceOf[js.Any])
  }
}
