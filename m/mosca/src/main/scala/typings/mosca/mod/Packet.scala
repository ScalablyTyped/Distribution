package typings.mosca.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Packet extends js.Object {
  var messageId: String
  var payload: js.Any
  var qos: Double
  var retain: Boolean
  var topic: String
}

object Packet {
  @scala.inline
  def apply(messageId: String, payload: js.Any, qos: Double, retain: Boolean, topic: String): Packet = {
    val __obj = js.Dynamic.literal(messageId = messageId.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], qos = qos.asInstanceOf[js.Any], retain = retain.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Packet]
  }
}

