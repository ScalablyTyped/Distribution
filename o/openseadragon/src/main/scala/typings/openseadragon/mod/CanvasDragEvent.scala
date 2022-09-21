package typings.openseadragon.mod

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanvasDragEvent
  extends StObject
     with CanvasEvent {
  
  var delta: Point
  
  var direction: Double
  
  var pointerType: PointerType
  
  var preventDefaultAction: Boolean
  
  var shift: Boolean
  
  var speed: Double
}
object CanvasDragEvent {
  
  inline def apply(
    delta: Point,
    direction: Double,
    eventSource: Viewer,
    originalEvent: Event,
    pointerType: PointerType,
    position: Point,
    preventDefaultAction: Boolean,
    shift: Boolean,
    speed: Double,
    tracker: MouseTracker,
    userData: Any
  ): CanvasDragEvent = {
    val __obj = js.Dynamic.literal(delta = delta.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], eventSource = eventSource.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any], pointerType = pointerType.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], preventDefaultAction = preventDefaultAction.asInstanceOf[js.Any], shift = shift.asInstanceOf[js.Any], speed = speed.asInstanceOf[js.Any], tracker = tracker.asInstanceOf[js.Any], userData = userData.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasDragEvent]
  }
  
  extension [Self <: CanvasDragEvent](x: Self) {
    
    inline def setDelta(value: Point): Self = StObject.set(x, "delta", value.asInstanceOf[js.Any])
    
    inline def setDirection(value: Double): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setPointerType(value: PointerType): Self = StObject.set(x, "pointerType", value.asInstanceOf[js.Any])
    
    inline def setPreventDefaultAction(value: Boolean): Self = StObject.set(x, "preventDefaultAction", value.asInstanceOf[js.Any])
    
    inline def setShift(value: Boolean): Self = StObject.set(x, "shift", value.asInstanceOf[js.Any])
    
    inline def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
  }
}
