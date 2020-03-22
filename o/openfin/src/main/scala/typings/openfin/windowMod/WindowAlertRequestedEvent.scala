package typings.openfin.windowMod

import typings.openfin.eventsBaseMod.WindowEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowAlertRequestedEvent[Topic, Type] extends WindowEvent[Topic, Type] {
  var message: String
  var url: String
}

object WindowAlertRequestedEvent {
  @scala.inline
  def apply[Topic, Type](message: String, name: String, topic: Topic, `type`: Type, url: String, uuid: String): WindowAlertRequestedEvent[Topic, Type] = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowAlertRequestedEvent[Topic, Type]]
  }
}

