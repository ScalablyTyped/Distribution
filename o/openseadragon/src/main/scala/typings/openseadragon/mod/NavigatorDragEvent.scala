package typings.openseadragon.mod

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigatorDragEvent
  extends StObject
     with NavigatorEvent {
  
  var delta: Point
  
  var direction: Double
  
  var preventDefaultAction: Boolean
  
  var speed: Double
}
object NavigatorDragEvent {
  
  inline def apply(
    delta: Point,
    direction: Double,
    eventSource: Viewer,
    originalEvent: Event,
    position: Point,
    preventDefaultAction: Boolean,
    shift: Boolean,
    speed: Double,
    tracker: MouseTracker,
    userData: Any
  ): NavigatorDragEvent = {
    val __obj = js.Dynamic.literal(delta = delta.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], eventSource = eventSource.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], preventDefaultAction = preventDefaultAction.asInstanceOf[js.Any], shift = shift.asInstanceOf[js.Any], speed = speed.asInstanceOf[js.Any], tracker = tracker.asInstanceOf[js.Any], userData = userData.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigatorDragEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NavigatorDragEvent] (val x: Self) extends AnyVal {
    
    inline def setDelta(value: Point): Self = StObject.set(x, "delta", value.asInstanceOf[js.Any])
    
    inline def setDirection(value: Double): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setPreventDefaultAction(value: Boolean): Self = StObject.set(x, "preventDefaultAction", value.asInstanceOf[js.Any])
    
    inline def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
  }
}
