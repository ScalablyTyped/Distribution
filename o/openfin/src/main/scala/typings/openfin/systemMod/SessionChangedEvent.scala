package typings.openfin.systemMod

import typings.openfin.eventsBaseMod.BaseEvent
import typings.openfin.openfinStrings.`remote-connect`
import typings.openfin.openfinStrings.`remote-disconnect`
import typings.openfin.openfinStrings.lock
import typings.openfin.openfinStrings.unknown
import typings.openfin.openfinStrings.unlock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SessionChangedEvent[Topic, Type] extends BaseEvent[Topic, Type] {
  
  var reason: lock | unlock | `remote-connect` | `remote-disconnect` | unknown = js.native
}
object SessionChangedEvent {
  
  @scala.inline
  def apply[Topic, Type](
    reason: lock | unlock | `remote-connect` | `remote-disconnect` | unknown,
    topic: Topic,
    `type`: Type
  ): SessionChangedEvent[Topic, Type] = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionChangedEvent[Topic, Type]]
  }
  
  @scala.inline
  implicit class SessionChangedEventOps[Self <: SessionChangedEvent[_, _], Topic, Type] (val x: Self with (SessionChangedEvent[Topic, Type])) extends AnyVal {
    
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
  }
}
