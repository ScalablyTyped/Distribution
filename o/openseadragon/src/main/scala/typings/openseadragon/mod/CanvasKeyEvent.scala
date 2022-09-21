package typings.openseadragon.mod

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanvasKeyEvent
  extends StObject
     with CanvasEvent {
  
  var preventDefaultAction: Boolean
  
  var preventHorizontalPan: Boolean
  
  var preventVerticalPan: Boolean
}
object CanvasKeyEvent {
  
  inline def apply(
    eventSource: Viewer,
    originalEvent: Event,
    position: Point,
    preventDefaultAction: Boolean,
    preventHorizontalPan: Boolean,
    preventVerticalPan: Boolean,
    tracker: MouseTracker,
    userData: Any
  ): CanvasKeyEvent = {
    val __obj = js.Dynamic.literal(eventSource = eventSource.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], preventDefaultAction = preventDefaultAction.asInstanceOf[js.Any], preventHorizontalPan = preventHorizontalPan.asInstanceOf[js.Any], preventVerticalPan = preventVerticalPan.asInstanceOf[js.Any], tracker = tracker.asInstanceOf[js.Any], userData = userData.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasKeyEvent]
  }
  
  extension [Self <: CanvasKeyEvent](x: Self) {
    
    inline def setPreventDefaultAction(value: Boolean): Self = StObject.set(x, "preventDefaultAction", value.asInstanceOf[js.Any])
    
    inline def setPreventHorizontalPan(value: Boolean): Self = StObject.set(x, "preventHorizontalPan", value.asInstanceOf[js.Any])
    
    inline def setPreventVerticalPan(value: Boolean): Self = StObject.set(x, "preventVerticalPan", value.asInstanceOf[js.Any])
  }
}
