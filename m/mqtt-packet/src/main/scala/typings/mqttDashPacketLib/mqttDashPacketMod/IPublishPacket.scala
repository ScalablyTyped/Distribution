package typings
package mqttDashPacketLib.mqttDashPacketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPublishPacket
  extends IPacket
     with Packet {
  @JSName("cmd")
  var cmd_IPublishPacket: mqttDashPacketLib.mqttDashPacketLibStrings.publish
  var dup: scala.Boolean
  var payload: java.lang.String | nodeLib.Buffer
  var properties: js.UndefOr[mqttDashPacketLib.Anon_ContentTypeCorrelationData] = js.undefined
  var qos: QoS
  var retain: scala.Boolean
  var topic: java.lang.String
}

object IPublishPacket {
  @scala.inline
  def apply(
    cmd: mqttDashPacketLib.mqttDashPacketLibStrings.publish,
    dup: scala.Boolean,
    payload: java.lang.String | nodeLib.Buffer,
    qos: QoS,
    retain: scala.Boolean,
    topic: java.lang.String,
    length: scala.Int | scala.Double = null,
    messageId: scala.Int | scala.Double = null,
    properties: mqttDashPacketLib.Anon_ContentTypeCorrelationData = null
  ): IPublishPacket = {
    val __obj = js.Dynamic.literal(cmd = cmd, dup = dup, payload = payload.asInstanceOf[js.Any], qos = qos, retain = retain, topic = topic)
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (messageId != null) __obj.updateDynamic("messageId")(messageId.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties)
    __obj.asInstanceOf[IPublishPacket]
  }
}

