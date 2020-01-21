package typings.mqttPacket.mod

import typings.mqttPacket.AnonContentTypeCorrelationData
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
  var properties: js.UndefOr[AnonContentTypeCorrelationData] = js.undefined
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
    length: Int | Double = null,
    messageId: Int | Double = null,
    properties: AnonContentTypeCorrelationData = null
  ): IPublishPacket = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any], dup = dup.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], qos = qos.asInstanceOf[js.Any], retain = retain.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (messageId != null) __obj.updateDynamic("messageId")(messageId.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPublishPacket]
  }
}

