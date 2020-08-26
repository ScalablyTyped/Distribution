package typings.mqtt.anon

import typings.mqttPacket.mod.QoS
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Payload extends js.Object {
  /**
    * the message to publish
    */
  var payload: Buffer | String = js.native
  /*
    *  properies object of will
    * */
  var properties: js.UndefOr[ContentType] = js.native
  /**
    * the QoS
    */
  var qos: QoS = js.native
  /**
    * the retain flag
    */
  var retain: Boolean = js.native
  /**
    * the topic to publish
    */
  var topic: String = js.native
}

object Payload {
  @scala.inline
  def apply(payload: Buffer | String, qos: QoS, retain: Boolean, topic: String): Payload = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], qos = qos.asInstanceOf[js.Any], retain = retain.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
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
    def setPayload(value: Buffer | String): Self = this.set("payload", value.asInstanceOf[js.Any])
    @scala.inline
    def setQos(value: QoS): Self = this.set("qos", value.asInstanceOf[js.Any])
    @scala.inline
    def setRetain(value: Boolean): Self = this.set("retain", value.asInstanceOf[js.Any])
    @scala.inline
    def setTopic(value: String): Self = this.set("topic", value.asInstanceOf[js.Any])
    @scala.inline
    def setProperties(value: ContentType): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
  }
  
}

