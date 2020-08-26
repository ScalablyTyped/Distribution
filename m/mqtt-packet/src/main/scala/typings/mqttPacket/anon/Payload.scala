package typings.mqttPacket.anon

import typings.mqttPacket.mod.QoS
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Payload extends js.Object {
  var payload: Buffer = js.native
  var properties: js.UndefOr[ContentType] = js.native
  var qos: js.UndefOr[QoS] = js.native
  var retain: js.UndefOr[Boolean] = js.native
  var topic: String = js.native
}

object Payload {
  @scala.inline
  def apply(payload: Buffer, topic: String): Payload = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[Payload]
  }
  @scala.inline
  implicit class PayloadOps[Self <: Payload] (val x: Self) extends AnyVal {
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
    def setPayload(value: Buffer): Self = this.set("payload", value.asInstanceOf[js.Any])
    @scala.inline
    def setTopic(value: String): Self = this.set("topic", value.asInstanceOf[js.Any])
    @scala.inline
    def setProperties(value: ContentType): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
    @scala.inline
    def setQos(value: QoS): Self = this.set("qos", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQos: Self = this.set("qos", js.undefined)
    @scala.inline
    def setRetain(value: Boolean): Self = this.set("retain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRetain: Self = this.set("retain", js.undefined)
  }
  
}

