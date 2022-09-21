package typings.openseadragon.mod

import typings.std.PointerEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PressMouseTrackerEvent
  extends StObject
     with PointerMouseTrackerEvent {
  
  var buttons: Double
}
object PressMouseTrackerEvent {
  
  inline def apply(
    buttons: Double,
    eventSource: MouseTracker,
    isTouchEvent: Boolean,
    originalEvent: PointerEvent,
    pointerType: PointerType,
    position: Point,
    userData: Any
  ): PressMouseTrackerEvent = {
    val __obj = js.Dynamic.literal(buttons = buttons.asInstanceOf[js.Any], eventSource = eventSource.asInstanceOf[js.Any], isTouchEvent = isTouchEvent.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any], pointerType = pointerType.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], userData = userData.asInstanceOf[js.Any])
    __obj.asInstanceOf[PressMouseTrackerEvent]
  }
  
  extension [Self <: PressMouseTrackerEvent](x: Self) {
    
    inline def setButtons(value: Double): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
  }
}
