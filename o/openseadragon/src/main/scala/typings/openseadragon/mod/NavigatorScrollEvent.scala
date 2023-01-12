package typings.openseadragon.mod

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigatorScrollEvent
  extends StObject
     with NavigatorEvent {
  
  var preventDefault: Boolean
  
  var scroll: Double
}
object NavigatorScrollEvent {
  
  inline def apply(
    eventSource: Viewer,
    originalEvent: Event,
    position: Point,
    preventDefault: Boolean,
    scroll: Double,
    shift: Boolean,
    tracker: MouseTracker,
    userData: Any
  ): NavigatorScrollEvent = {
    val __obj = js.Dynamic.literal(eventSource = eventSource.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], preventDefault = preventDefault.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], shift = shift.asInstanceOf[js.Any], tracker = tracker.asInstanceOf[js.Any], userData = userData.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigatorScrollEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NavigatorScrollEvent] (val x: Self) extends AnyVal {
    
    inline def setPreventDefault(value: Boolean): Self = StObject.set(x, "preventDefault", value.asInstanceOf[js.Any])
    
    inline def setScroll(value: Double): Self = StObject.set(x, "scroll", value.asInstanceOf[js.Any])
  }
}
