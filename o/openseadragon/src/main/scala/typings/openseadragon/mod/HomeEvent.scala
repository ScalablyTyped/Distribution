package typings.openseadragon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HomeEvent
  extends StObject
     with OSDEvent[Viewer] {
  
  var immediately: Boolean
}
object HomeEvent {
  
  inline def apply(eventSource: Viewer, immediately: Boolean, userData: Any): HomeEvent = {
    val __obj = js.Dynamic.literal(eventSource = eventSource.asInstanceOf[js.Any], immediately = immediately.asInstanceOf[js.Any], userData = userData.asInstanceOf[js.Any])
    __obj.asInstanceOf[HomeEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HomeEvent] (val x: Self) extends AnyVal {
    
    inline def setImmediately(value: Boolean): Self = StObject.set(x, "immediately", value.asInstanceOf[js.Any])
  }
}
