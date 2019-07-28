package typings.mqttDashPacket.mqttDashPacketMod

import typings.mqttDashPacket.Anon_ContentTypeCorrelationData
import typings.mqttDashPacket.mqttDashPacketStrings.publish
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
  var properties: js.UndefOr[Anon_ContentTypeCorrelationData] = js.undefined
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
    properties: Anon_ContentTypeCorrelationData = null
  ): IPublishPacket = {
    val __obj = js.Dynamic.literal(cmd = cmd, dup = dup, payload = payload.asInstanceOf[js.Any], qos = qos, retain = retain, topic = topic)
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (messageId != null) __obj.updateDynamic("messageId")(messageId.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties)
    __obj.asInstanceOf[IPublishPacket]
  }
}

