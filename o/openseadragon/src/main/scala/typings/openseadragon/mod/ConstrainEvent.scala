package typings.openseadragon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConstrainEvent
  extends StObject
     with OSDEvent[Viewer] {
  
  var immediately: Boolean
}
object ConstrainEvent {
  
  inline def apply(eventSource: Viewer, immediately: Boolean, userData: Any): ConstrainEvent = {
    val __obj = js.Dynamic.literal(eventSource = eventSource.asInstanceOf[js.Any], immediately = immediately.asInstanceOf[js.Any], userData = userData.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConstrainEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConstrainEvent] (val x: Self) extends AnyVal {
    
    inline def setImmediately(value: Boolean): Self = StObject.set(x, "immediately", value.asInstanceOf[js.Any])
  }
}
