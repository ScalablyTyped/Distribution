package typings.openfin.mod.fin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowEvent extends ApplicationBaseEvent {
  var name: String
}

object WindowEvent {
  @scala.inline
  def apply(name: String, topic: String, `type`: OpenFinApplicationEventType, uuid: String): WindowEvent = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowEvent]
  }
}

