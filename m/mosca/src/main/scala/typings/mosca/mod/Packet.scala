package typings.mosca.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Packet extends js.Object {
  var messageId: String = js.native
  var payload: js.Any = js.native
  var qos: Double = js.native
  var retain: Boolean = js.native
  var topic: String = js.native
}

object Packet {
  @scala.inline
  def apply(messageId: String, payload: js.Any, qos: Double, retain: Boolean, topic: String): Packet = {
    val __obj = js.Dynamic.literal(messageId = messageId.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], qos = qos.asInstanceOf[js.Any], retain = retain.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[Packet]
  }
  @scala.inline
  implicit class PacketOps[Self <: Packet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMessageId(value: String): Self = this.set("messageId", value.asInstanceOf[js.Any])
    @scala.inline
    def setPayload(value: js.Any): Self = this.set("payload", value.asInstanceOf[js.Any])
    @scala.inline
    def setQos(value: Double): Self = this.set("qos", value.asInstanceOf[js.Any])
    @scala.inline
    def setRetain(value: Boolean): Self = this.set("retain", value.asInstanceOf[js.Any])
    @scala.inline
    def setTopic(value: String): Self = this.set("topic", value.asInstanceOf[js.Any])
  }
  
}

