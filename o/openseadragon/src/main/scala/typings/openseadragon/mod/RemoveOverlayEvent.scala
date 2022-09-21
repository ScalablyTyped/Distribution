package typings.openseadragon.mod

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveOverlayEvent
  extends StObject
     with OSDEvent[Viewer] {
  
  var element: Element
}
object RemoveOverlayEvent {
  
  inline def apply(element: Element, eventSource: Viewer, userData: Any): RemoveOverlayEvent = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], eventSource = eventSource.asInstanceOf[js.Any], userData = userData.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveOverlayEvent]
  }
  
  extension [Self <: RemoveOverlayEvent](x: Self) {
    
    inline def setElement(value: Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
  }
}
