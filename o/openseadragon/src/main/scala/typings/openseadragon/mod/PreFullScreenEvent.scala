package typings.openseadragon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PreFullScreenEvent
  extends StObject
     with OSDEvent[Viewer] {
  
  var fullScreen: Boolean
  
  var preventDefaultAction: Boolean
}
object PreFullScreenEvent {
  
  inline def apply(eventSource: Viewer, fullScreen: Boolean, preventDefaultAction: Boolean, userData: Any): PreFullScreenEvent = {
    val __obj = js.Dynamic.literal(eventSource = eventSource.asInstanceOf[js.Any], fullScreen = fullScreen.asInstanceOf[js.Any], preventDefaultAction = preventDefaultAction.asInstanceOf[js.Any], userData = userData.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreFullScreenEvent]
  }
  
  extension [Self <: PreFullScreenEvent](x: Self) {
    
    inline def setFullScreen(value: Boolean): Self = StObject.set(x, "fullScreen", value.asInstanceOf[js.Any])
    
    inline def setPreventDefaultAction(value: Boolean): Self = StObject.set(x, "preventDefaultAction", value.asInstanceOf[js.Any])
  }
}
