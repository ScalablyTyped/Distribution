package typings.openseadragon.mod

import typings.std.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyMouseTrackerEvent
  extends StObject
     with MouseTrackerEvent[KeyboardEvent] {
  
  var alt: Boolean
  
  var ctrl: Boolean
  
  var keyCode: Double
  
  var meta: Boolean
  
  var preventDefault: Boolean
  
  var shift: Boolean
}
object KeyMouseTrackerEvent {
  
  inline def apply(
    alt: Boolean,
    ctrl: Boolean,
    eventSource: MouseTracker,
    keyCode: Double,
    meta: Boolean,
    originalEvent: KeyboardEvent,
    preventDefault: Boolean,
    shift: Boolean,
    userData: Any
  ): KeyMouseTrackerEvent = {
    val __obj = js.Dynamic.literal(alt = alt.asInstanceOf[js.Any], ctrl = ctrl.asInstanceOf[js.Any], eventSource = eventSource.asInstanceOf[js.Any], keyCode = keyCode.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any], preventDefault = preventDefault.asInstanceOf[js.Any], shift = shift.asInstanceOf[js.Any], userData = userData.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyMouseTrackerEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KeyMouseTrackerEvent] (val x: Self) extends AnyVal {
    
    inline def setAlt(value: Boolean): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
    
    inline def setCtrl(value: Boolean): Self = StObject.set(x, "ctrl", value.asInstanceOf[js.Any])
    
    inline def setKeyCode(value: Double): Self = StObject.set(x, "keyCode", value.asInstanceOf[js.Any])
    
    inline def setMeta(value: Boolean): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setPreventDefault(value: Boolean): Self = StObject.set(x, "preventDefault", value.asInstanceOf[js.Any])
    
    inline def setShift(value: Boolean): Self = StObject.set(x, "shift", value.asInstanceOf[js.Any])
  }
}
