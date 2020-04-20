package typings.mosca.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Message extends js.Object {
  var payload: js.Any
  var qos: Double
  var retain: Boolean
  var topic: String
}

object Message {
  @scala.inline
  def apply(payload: js.Any, qos: Double, retain: Boolean, topic: String): Message = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], qos = qos.asInstanceOf[js.Any], retain = retain.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[Message]
  }
}

