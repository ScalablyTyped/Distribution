package typings.openfin.mod.fin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SystemBaseEvent extends js.Object {
  var topic: String
  var `type`: OpenFinSystemEventType
  var uuid: String
}

object SystemBaseEvent {
  @scala.inline
  def apply(topic: String, `type`: OpenFinSystemEventType, uuid: String): SystemBaseEvent = {
    val __obj = js.Dynamic.literal(topic = topic.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemBaseEvent]
  }
}

