package typings.openseadragon.mod

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanvasExitEvent
  extends StObject
     with CanvasEvent {
  
  /**
    * @deprecated Use `buttons` instead
    */
  var buttonDownAny: Boolean
  
  var buttons: Double
  
  var insideElementPressed: Boolean
  
  var pointerType: PointerType
  
  var pointers: Double
}
object CanvasExitEvent {
  
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
  ): CanvasExitEvent = {
    val __obj = js.Dynamic.literal(buttonDownAny = buttonDownAny.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any], eventSource = eventSource.asInstanceOf[js.Any], insideElementPressed = insideElementPressed.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any], pointerType = pointerType.asInstanceOf[js.Any], pointers = pointers.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], tracker = tracker.asInstanceOf[js.Any], userData = userData.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasExitEvent]
  }
  
  extension [Self <: CanvasExitEvent](x: Self) {
    
    inline def setButtonDownAny(value: Boolean): Self = StObject.set(x, "buttonDownAny", value.asInstanceOf[js.Any])
    
    inline def setButtons(value: Double): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    inline def setInsideElementPressed(value: Boolean): Self = StObject.set(x, "insideElementPressed", value.asInstanceOf[js.Any])
    
    inline def setPointerType(value: PointerType): Self = StObject.set(x, "pointerType", value.asInstanceOf[js.Any])
    
    inline def setPointers(value: Double): Self = StObject.set(x, "pointers", value.asInstanceOf[js.Any])
  }
}
