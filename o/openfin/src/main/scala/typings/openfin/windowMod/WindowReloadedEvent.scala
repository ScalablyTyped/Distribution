package typings.openfin.windowMod

import typings.openfin.eventsBaseMod.WindowEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowReloadedEvent[Topic, Type] extends WindowEvent[Topic, Type] {
  var url: String
}

object WindowReloadedEvent {
  @scala.inline
  def apply[Topic, Type](name: String, topic: Topic, `type`: Type, url: String, uuid: String): WindowReloadedEvent[Topic, Type] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowReloadedEvent[Topic, Type]]
  }
}

