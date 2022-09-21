package typings.openseadragon.mod

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanvasDoubleClickEvent
  extends StObject
     with CanvasEvent {
  
  var preventDefaultAction: Boolean
  
  var shift: Boolean
}
object CanvasDoubleClickEvent {
  
  inline def apply(
    eventSource: Viewer,
    originalEvent: Event,
    position: Point,
    preventDefaultAction: Boolean,
    shift: Boolean,
    tracker: MouseTracker,
    userData: Any
  ): CanvasDoubleClickEvent = {
    val __obj = js.Dynamic.literal(eventSource = eventSource.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], preventDefaultAction = preventDefaultAction.asInstanceOf[js.Any], shift = shift.asInstanceOf[js.Any], tracker = tracker.asInstanceOf[js.Any], userData = userData.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasDoubleClickEvent]
  }
  
  extension [Self <: CanvasDoubleClickEvent](x: Self) {
    
    inline def setPreventDefaultAction(value: Boolean): Self = StObject.set(x, "preventDefaultAction", value.asInstanceOf[js.Any])
    
    inline def setShift(value: Boolean): Self = StObject.set(x, "shift", value.asInstanceOf[js.Any])
  }
}
