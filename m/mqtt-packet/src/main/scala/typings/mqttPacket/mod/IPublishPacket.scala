package typings.mqttPacket.mod

import typings.mqttPacket.anon.CorrelationData
import typings.mqttPacket.mqttPacketStrings.publish
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPublishPacket
  extends IPacket
     with Packet {
  @JSName("cmd")
  var cmd_IPublishPacket: publish
  var dup: Boolean
  var payload: String | Buffer
  var properties: js.UndefOr[CorrelationData] = js.undefined
  var qos: QoS
  var retain: Boolean
  var topic: String
}

object IPublishPacket {
  @scala.inline
  def apply(
    cmd: publish,
    dup: Boolean,
    payload: String | Buffer,
    qos: QoS,
    retain: Boolean,
    topic: String,
    length: js.UndefOr[Double] = js.undefined,
    messageId: js.UndefOr[Double] = js.undefined,
    properties: CorrelationData = null
  ): IPublishPacket = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any], dup = dup.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], qos = qos.asInstanceOf[js.Any], retain = retain.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    if (!js.isUndefined(length)) __obj.updateDynamic("length")(length.get.asInstanceOf[js.Any])
    if (!js.isUndefined(messageId)) __obj.updateDynamic("messageId")(messageId.get.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPublishPacket]
  }
}

