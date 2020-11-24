package typings.openfin.transportMod

import typings.openfin.eventsBaseMod.RuntimeEvent
import typings.openfin.openfinStrings.`process-desktop-event`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventMessage extends Message[RuntimeEvent[String, String]] {
  
  @JSName("action")
  var action_EventMessage: `process-desktop-event` = js.native
}
object EventMessage {
  
  @scala.inline
  def apply(action: `process-desktop-event`, payload: RuntimeEvent[String, String]): EventMessage = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventMessage]
  }
  
  @scala.inline
  implicit class EventMessageOps[Self <: EventMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAction(value: `process-desktop-event`): Self = this.set("action", value.asInstanceOf[js.Any])
  }
}
