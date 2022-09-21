package typings.openseadragon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResizeEvent
  extends StObject
     with OSDEvent[Viewer] {
  
  var maintain: Boolean
  
  var newContainerSize: Point
}
object ResizeEvent {
  
  inline def apply(eventSource: Viewer, maintain: Boolean, newContainerSize: Point, userData: Any): ResizeEvent = {
    val __obj = js.Dynamic.literal(eventSource = eventSource.asInstanceOf[js.Any], maintain = maintain.asInstanceOf[js.Any], newContainerSize = newContainerSize.asInstanceOf[js.Any], userData = userData.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResizeEvent]
  }
  
  extension [Self <: ResizeEvent](x: Self) {
    
    inline def setMaintain(value: Boolean): Self = StObject.set(x, "maintain", value.asInstanceOf[js.Any])
    
    inline def setNewContainerSize(value: Point): Self = StObject.set(x, "newContainerSize", value.asInstanceOf[js.Any])
  }
}
