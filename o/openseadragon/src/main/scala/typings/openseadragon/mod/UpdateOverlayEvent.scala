package typings.openseadragon.mod

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateOverlayEvent
  extends StObject
     with OSDEvent[Viewer] {
  
  var element: Element
  
  var location: Point | Rect
  
  var placement: Placement
}
object UpdateOverlayEvent {
  
  inline def apply(element: Element, eventSource: Viewer, location: Point | Rect, placement: Placement, userData: Any): UpdateOverlayEvent = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], eventSource = eventSource.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any], userData = userData.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateOverlayEvent]
  }
  
  extension [Self <: UpdateOverlayEvent](x: Self) {
    
    inline def setElement(value: Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setLocation(value: Point | Rect): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setPlacement(value: Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
  }
}
