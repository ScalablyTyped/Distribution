package typings.openseadragon.mod

import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContextMenuMouseTrackerEvent
  extends StObject
     with MouseTrackerEvent[MouseEvent] {
  
  var position: Point
  
  var preventDefault: Boolean
}
object ContextMenuMouseTrackerEvent {
  
  inline def apply(
    eventSource: MouseTracker,
    originalEvent: MouseEvent,
    position: Point,
    preventDefault: Boolean,
    userData: Any
  ): ContextMenuMouseTrackerEvent = {
    val __obj = js.Dynamic.literal(eventSource = eventSource.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], preventDefault = preventDefault.asInstanceOf[js.Any], userData = userData.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextMenuMouseTrackerEvent]
  }
  
  extension [Self <: ContextMenuMouseTrackerEvent](x: Self) {
    
    inline def setPosition(value: Point): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPreventDefault(value: Boolean): Self = StObject.set(x, "preventDefault", value.asInstanceOf[js.Any])
  }
}
