package typings.openfin.mod.fin

import typings.openfin.anon.Host
import typings.openfin.openfinStrings.window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowAuthRequestedEvent extends WindowBaseEvent {
  var authInfo: Host
}

object WindowAuthRequestedEvent {
  @scala.inline
  def apply(authInfo: Host, name: String, topic: window, `type`: OpenFinWindowEventType, uuid: String): WindowAuthRequestedEvent = {
    val __obj = js.Dynamic.literal(authInfo = authInfo.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowAuthRequestedEvent]
  }
}

