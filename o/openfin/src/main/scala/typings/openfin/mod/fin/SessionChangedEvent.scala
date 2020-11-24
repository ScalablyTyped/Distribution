package typings.openfin.mod.fin

import typings.openfin.openfinStrings.`remote-connect`
import typings.openfin.openfinStrings.`remote-disconnect`
import typings.openfin.openfinStrings.`session-changed`
import typings.openfin.openfinStrings.lock
import typings.openfin.openfinStrings.system
import typings.openfin.openfinStrings.unknown
import typings.openfin.openfinStrings.unlock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SessionChangedEvent extends js.Object {
  
  /**
    * the action that triggered this event:
    */
  var reason: lock | unlock | `remote-connect` | `remote-disconnect` | unknown = js.native
  
  var topic: system = js.native
  
  var `type`: `session-changed` = js.native
}
object SessionChangedEvent {
  
  @scala.inline
  def apply(
    reason: lock | unlock | `remote-connect` | `remote-disconnect` | unknown,
    topic: system,
    `type`: `session-changed`
  ): SessionChangedEvent = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionChangedEvent]
  }
  
  @scala.inline
  implicit class SessionChangedEventOps[Self <: SessionChangedEvent] (val x: Self) extends AnyVal {
    
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
    def setReason(value: lock | unlock | `remote-connect` | `remote-disconnect` | unknown): Self = this.set("reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopic(value: system): Self = this.set("topic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: `session-changed`): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
