package typings.openfin.mod.fin

import typings.openfin.openfinStrings.`hide-on-close`
import typings.openfin.openfinStrings.hidden
import typings.openfin.openfinStrings.hide
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WindowHiddenEvent
  extends StObject
     with WindowBaseEvent {
  
  /**
    * What action prompted the close.
    * The reasons are: "hide", "hide-on-close"
    */
  var reason: hide | `hide-on-close`
  
  @JSName("type")
  var type_WindowHiddenEvent: hidden
}
object WindowHiddenEvent {
  
  @scala.inline
  def apply(name: String, reason: hide | `hide-on-close`, uuid: String): WindowHiddenEvent = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], topic = "window", uuid = uuid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("hidden")
    __obj.asInstanceOf[WindowHiddenEvent]
  }
  
  @scala.inline
  implicit class WindowHiddenEventMutableBuilder[Self <: WindowHiddenEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReason(value: hide | `hide-on-close`): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: hidden): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
