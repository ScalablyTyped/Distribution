package typings.openseadragon.mod

import typings.std.PointerEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PointerMouseTrackerEvent
  extends StObject
     with MouseTrackerEvent[PointerEvent] {
  
  /**
    * @deprecated Use `pointerType` and/or `originalEvent` instead
    */
  var isTouchEvent: Boolean
  
  var pointerType: PointerType
  
  var position: Point
}
object PointerMouseTrackerEvent {
  
  inline def apply(
    eventSource: MouseTracker,
    isTouchEvent: Boolean,
    originalEvent: PointerEvent,
    pointerType: PointerType,
    position: Point,
    userData: Any
  ): PointerMouseTrackerEvent = {
    val __obj = js.Dynamic.literal(eventSource = eventSource.asInstanceOf[js.Any], isTouchEvent = isTouchEvent.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any], pointerType = pointerType.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], userData = userData.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointerMouseTrackerEvent]
  }
  
  extension [Self <: PointerMouseTrackerEvent](x: Self) {
    
    inline def setIsTouchEvent(value: Boolean): Self = StObject.set(x, "isTouchEvent", value.asInstanceOf[js.Any])
    
    inline def setPointerType(value: PointerType): Self = StObject.set(x, "pointerType", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: Point): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
