package typings.openseadragon.mod

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanvasNonPrimaryButtonEvent
  extends StObject
     with CanvasEvent {
  
  var button: Double
  
  var buttons: Double
  
  var pointerType: PointerType
}
object CanvasNonPrimaryButtonEvent {
  
  inline def apply(
    button: Double,
    buttons: Double,
    eventSource: Viewer,
    originalEvent: Event,
    pointerType: PointerType,
    position: Point,
    tracker: MouseTracker,
    userData: Any
  ): CanvasNonPrimaryButtonEvent = {
    val __obj = js.Dynamic.literal(button = button.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any], eventSource = eventSource.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any], pointerType = pointerType.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], tracker = tracker.asInstanceOf[js.Any], userData = userData.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasNonPrimaryButtonEvent]
  }
  
  extension [Self <: CanvasNonPrimaryButtonEvent](x: Self) {
    
    inline def setButton(value: Double): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
    
    inline def setButtons(value: Double): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    inline def setPointerType(value: PointerType): Self = StObject.set(x, "pointerType", value.asInstanceOf[js.Any])
  }
}
