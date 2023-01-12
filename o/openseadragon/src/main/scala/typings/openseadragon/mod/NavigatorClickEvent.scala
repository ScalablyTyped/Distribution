package typings.openseadragon.mod

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigatorClickEvent
  extends StObject
     with NavigatorEvent {
  
  var preventDefaultAction: Boolean
  
  var quick: Boolean
}
object NavigatorClickEvent {
  
  inline def apply(
    eventSource: Viewer,
    originalEvent: Event,
    position: Point,
    preventDefaultAction: Boolean,
    quick: Boolean,
    shift: Boolean,
    tracker: MouseTracker,
    userData: Any
  ): NavigatorClickEvent = {
    val __obj = js.Dynamic.literal(eventSource = eventSource.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], preventDefaultAction = preventDefaultAction.asInstanceOf[js.Any], quick = quick.asInstanceOf[js.Any], shift = shift.asInstanceOf[js.Any], tracker = tracker.asInstanceOf[js.Any], userData = userData.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigatorClickEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NavigatorClickEvent] (val x: Self) extends AnyVal {
    
    inline def setPreventDefaultAction(value: Boolean): Self = StObject.set(x, "preventDefaultAction", value.asInstanceOf[js.Any])
    
    inline def setQuick(value: Boolean): Self = StObject.set(x, "quick", value.asInstanceOf[js.Any])
  }
}
