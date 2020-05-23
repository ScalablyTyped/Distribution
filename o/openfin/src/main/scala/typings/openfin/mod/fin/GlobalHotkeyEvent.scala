package typings.openfin.mod.fin

import typings.openfin.anon.EntityType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalHotkeyEvent extends js.Object {
  var hotkey: String
  /**
    * The Identity that has just registered the hotkey
    */
  var identity: EntityType
  var topic: String
  var `type`: OpenFinGlobalHotkeyEventType
}

object GlobalHotkeyEvent {
  @scala.inline
  def apply(hotkey: String, identity: EntityType, topic: String, `type`: OpenFinGlobalHotkeyEventType): GlobalHotkeyEvent = {
    val __obj = js.Dynamic.literal(hotkey = hotkey.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalHotkeyEvent]
  }
}

