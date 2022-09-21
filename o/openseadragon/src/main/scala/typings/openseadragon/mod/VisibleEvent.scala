package typings.openseadragon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VisibleEvent
  extends StObject
     with OSDEvent[Viewer] {
  
  var visible: Boolean
}
object VisibleEvent {
  
  inline def apply(eventSource: Viewer, userData: Any, visible: Boolean): VisibleEvent = {
    val __obj = js.Dynamic.literal(eventSource = eventSource.asInstanceOf[js.Any], userData = userData.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisibleEvent]
  }
  
  extension [Self <: VisibleEvent](x: Self) {
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
  }
}
