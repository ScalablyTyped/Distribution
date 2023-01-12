package typings.openseadragon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ControlsEnabledEvent
  extends StObject
     with OSDEvent[Viewer] {
  
  var enabled: Boolean
}
object ControlsEnabledEvent {
  
  inline def apply(enabled: Boolean, eventSource: Viewer, userData: Any): ControlsEnabledEvent = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], eventSource = eventSource.asInstanceOf[js.Any], userData = userData.asInstanceOf[js.Any])
    __obj.asInstanceOf[ControlsEnabledEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ControlsEnabledEvent] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
  }
}
