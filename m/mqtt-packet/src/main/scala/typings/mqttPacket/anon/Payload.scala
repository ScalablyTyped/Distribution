package typings.mqttPacket.anon

import typings.mqttPacket.mod.QoS
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Payload extends js.Object {
  var payload: Buffer
  var properties: js.UndefOr[ContentType] = js.undefined
  var qos: js.UndefOr[QoS] = js.undefined
  var retain: js.UndefOr[Boolean] = js.undefined
  var topic: String
}

object Payload {
  @scala.inline
  def apply(
    payload: Buffer,
    topic: String,
    properties: ContentType = null,
    qos: QoS = null,
    retain: js.UndefOr[Boolean] = js.undefined
  ): Payload = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (qos != null) __obj.updateDynamic("qos")(qos.asInstanceOf[js.Any])
    if (!js.isUndefined(retain)) __obj.updateDynamic("retain")(retain.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Payload]
  }
}

