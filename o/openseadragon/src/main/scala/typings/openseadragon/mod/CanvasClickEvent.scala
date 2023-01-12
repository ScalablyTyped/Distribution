package typings.openseadragon.mod

import typings.std.Element
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanvasClickEvent
  extends StObject
     with CanvasEvent {
  
  var originalTarget: Element
  
  var preventDefaultAction: Boolean
  
  var quick: Boolean
  
  var shift: Boolean
}
object CanvasClickEvent {
  
  inline def apply(
    eventSource: Viewer,
    originalEvent: Event,
    originalTarget: Element,
    position: Point,
    preventDefaultAction: Boolean,
    quick: Boolean,
    shift: Boolean,
    tracker: MouseTracker,
    userData: Any
  ): CanvasClickEvent = {
    val __obj = js.Dynamic.literal(eventSource = eventSource.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any], originalTarget = originalTarget.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], preventDefaultAction = preventDefaultAction.asInstanceOf[js.Any], quick = quick.asInstanceOf[js.Any], shift = shift.asInstanceOf[js.Any], tracker = tracker.asInstanceOf[js.Any], userData = userData.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasClickEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CanvasClickEvent] (val x: Self) extends AnyVal {
    
    inline def setOriginalTarget(value: Element): Self = StObject.set(x, "originalTarget", value.asInstanceOf[js.Any])
    
    inline def setPreventDefaultAction(value: Boolean): Self = StObject.set(x, "preventDefaultAction", value.asInstanceOf[js.Any])
    
    inline def setQuick(value: Boolean): Self = StObject.set(x, "quick", value.asInstanceOf[js.Any])
    
    inline def setShift(value: Boolean): Self = StObject.set(x, "shift", value.asInstanceOf[js.Any])
  }
}
