package typings.openseadragon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PanEvent
  extends StObject
     with OSDEvent[Viewer] {
  
  var center: Point
  
  var immediately: Boolean
}
object PanEvent {
  
  inline def apply(center: Point, eventSource: Viewer, immediately: Boolean, userData: Any): PanEvent = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], eventSource = eventSource.asInstanceOf[js.Any], immediately = immediately.asInstanceOf[js.Any], userData = userData.asInstanceOf[js.Any])
    __obj.asInstanceOf[PanEvent]
  }
  
  extension [Self <: PanEvent](x: Self) {
    
    inline def setCenter(value: Point): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    inline def setImmediately(value: Boolean): Self = StObject.set(x, "immediately", value.asInstanceOf[js.Any])
  }
}
