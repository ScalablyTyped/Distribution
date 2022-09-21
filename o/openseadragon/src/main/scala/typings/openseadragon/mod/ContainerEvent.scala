package typings.openseadragon.mod

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContainerEvent
  extends StObject
     with OSDEvent[Viewer] {
  
  /**
    * @deprecated Use `buttons` instead
    */
  var buttonDownAny: Boolean
  
  var buttons: Double
  
  var insideElementPressed: Boolean
  
  var originalEvent: Event
  
  var pointerType: PointerType
  
  var pointers: Double
  
  var position: Point
  
  var tracker: MouseTracker
}
object ContainerEvent {
  
  inline def apply(
    buttonDownAny: Boolean,
    buttons: Double,
    eventSource: Viewer,
    insideElementPressed: Boolean,
    originalEvent: Event,
    pointerType: PointerType,
    pointers: Double,
    position: Point,
    tracker: MouseTracker,
    userData: Any
  ): ContainerEvent = {
    val __obj = js.Dynamic.literal(buttonDownAny = buttonDownAny.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any], eventSource = eventSource.asInstanceOf[js.Any], insideElementPressed = insideElementPressed.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any], pointerType = pointerType.asInstanceOf[js.Any], pointers = pointers.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], tracker = tracker.asInstanceOf[js.Any], userData = userData.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerEvent]
  }
  
  extension [Self <: ContainerEvent](x: Self) {
    
    inline def setButtonDownAny(value: Boolean): Self = StObject.set(x, "buttonDownAny", value.asInstanceOf[js.Any])
    
    inline def setButtons(value: Double): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    inline def setInsideElementPressed(value: Boolean): Self = StObject.set(x, "insideElementPressed", value.asInstanceOf[js.Any])
    
    inline def setOriginalEvent(value: Event): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
    
    inline def setPointerType(value: PointerType): Self = StObject.set(x, "pointerType", value.asInstanceOf[js.Any])
    
    inline def setPointers(value: Double): Self = StObject.set(x, "pointers", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: Point): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setTracker(value: MouseTracker): Self = StObject.set(x, "tracker", value.asInstanceOf[js.Any])
  }
}
