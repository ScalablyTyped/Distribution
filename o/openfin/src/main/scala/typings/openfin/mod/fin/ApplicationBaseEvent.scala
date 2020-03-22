package typings.openfin.mod.fin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplicationBaseEvent extends js.Object {
  var topic: String
  var `type`: OpenFinApplicationEventType
  var uuid: String
}

object ApplicationBaseEvent {
  @scala.inline
  def apply(topic: String, `type`: OpenFinApplicationEventType, uuid: String): ApplicationBaseEvent = {
    val __obj = js.Dynamic.literal(topic = topic.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationBaseEvent]
  }
}

