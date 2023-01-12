package typings.openseadragon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ZoomEvent
  extends StObject
     with OSDEvent[Viewer] {
  
  var immediately: Boolean
  
  var refPoint: Point
  
  var zoom: Double
}
object ZoomEvent {
  
  inline def apply(eventSource: Viewer, immediately: Boolean, refPoint: Point, userData: Any, zoom: Double): ZoomEvent = {
    val __obj = js.Dynamic.literal(eventSource = eventSource.asInstanceOf[js.Any], immediately = immediately.asInstanceOf[js.Any], refPoint = refPoint.asInstanceOf[js.Any], userData = userData.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZoomEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ZoomEvent] (val x: Self) extends AnyVal {
    
    inline def setImmediately(value: Boolean): Self = StObject.set(x, "immediately", value.asInstanceOf[js.Any])
    
    inline def setRefPoint(value: Point): Self = StObject.set(x, "refPoint", value.asInstanceOf[js.Any])
    
    inline def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
  }
}
