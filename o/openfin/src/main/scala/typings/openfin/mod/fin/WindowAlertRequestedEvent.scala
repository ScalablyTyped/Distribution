package typings.openfin.mod.fin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowAlertRequestedEvent extends WindowEvent {
  var message: String
  var url: String
}

object WindowAlertRequestedEvent {
  @scala.inline
  def apply(
    message: String,
    name: String,
    topic: String,
    `type`: OpenFinApplicationEventType,
    url: String,
    uuid: String
  ): WindowAlertRequestedEvent = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowAlertRequestedEvent]
  }
}

