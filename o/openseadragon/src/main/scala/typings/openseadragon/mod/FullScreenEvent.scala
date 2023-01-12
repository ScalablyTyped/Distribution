package typings.openseadragon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FullScreenEvent
  extends StObject
     with OSDEvent[Viewer] {
  
  var fullScreen: Boolean
}
object FullScreenEvent {
  
  inline def apply(eventSource: Viewer, fullScreen: Boolean, userData: Any): FullScreenEvent = {
    val __obj = js.Dynamic.literal(eventSource = eventSource.asInstanceOf[js.Any], fullScreen = fullScreen.asInstanceOf[js.Any], userData = userData.asInstanceOf[js.Any])
    __obj.asInstanceOf[FullScreenEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FullScreenEvent] (val x: Self) extends AnyVal {
    
    inline def setFullScreen(value: Boolean): Self = StObject.set(x, "fullScreen", value.asInstanceOf[js.Any])
  }
}
