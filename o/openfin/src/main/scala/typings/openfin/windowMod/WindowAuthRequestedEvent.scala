package typings.openfin.windowMod

import typings.openfin.anon.Host
import typings.openfin.eventsBaseMod.WindowEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowAuthRequestedEvent[Topic, Type] extends WindowEvent[Topic, Type] {
  var authInfo: Host
}

object WindowAuthRequestedEvent {
  @scala.inline
  def apply[Topic, Type](authInfo: Host, name: String, topic: Topic, `type`: Type, uuid: String): WindowAuthRequestedEvent[Topic, Type] = {
    val __obj = js.Dynamic.literal(authInfo = authInfo.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowAuthRequestedEvent[Topic, Type]]
  }
}

