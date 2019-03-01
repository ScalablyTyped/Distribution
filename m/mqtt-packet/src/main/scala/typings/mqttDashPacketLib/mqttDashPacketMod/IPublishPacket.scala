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
    messageId: scala.Int | scala.Double = null
  ): IPublishPacket = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cmd")(cmd)
    __obj.updateDynamic("dup")(dup)
    __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    __obj.updateDynamic("qos")(qos)
    __obj.updateDynamic("retain")(retain)
    __obj.updateDynamic("topic")(topic)
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (messageId != null) __obj.updateDynamic("messageId")(messageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPublishPacket]
  }
}

