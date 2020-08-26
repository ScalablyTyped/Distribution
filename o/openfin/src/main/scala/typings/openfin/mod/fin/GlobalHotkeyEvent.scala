package typings.openfin.mod.fin

import typings.openfin.anon.EntityType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlobalHotkeyEvent extends js.Object {
  var hotkey: String = js.native
  /**
    * The Identity that has just registered the hotkey
    */
  var identity: EntityType = js.native
  var topic: String = js.native
  var `type`: OpenFinGlobalHotkeyEventType = js.native
}

object GlobalHotkeyEvent {
  @scala.inline
  def apply(hotkey: String, identity: EntityType, topic: String, `type`: OpenFinGlobalHotkeyEventType): GlobalHotkeyEvent = {
    val __obj = js.Dynamic.literal(hotkey = hotkey.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalHotkeyEvent]
  }
  @scala.inline
  implicit class GlobalHotkeyEventOps[Self <: GlobalHotkeyEvent] (val x: Self) extends AnyVal {
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
    def setHotkey(value: String): Self = this.set("hotkey", value.asInstanceOf[js.Any])
    @scala.inline
    def setIdentity(value: EntityType): Self = this.set("identity", value.asInstanceOf[js.Any])
    @scala.inline
    def setTopic(value: String): Self = this.set("topic", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: OpenFinGlobalHotkeyEventType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

