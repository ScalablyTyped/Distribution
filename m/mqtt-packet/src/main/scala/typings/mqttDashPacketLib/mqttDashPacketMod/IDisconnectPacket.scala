package typings
package mqttDashPacketLib.mqttDashPacketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDisconnectPacket
  extends IPacket
     with Packet {
  @JSName("cmd")
  var cmd_IDisconnectPacket: mqttDashPacketLib.mqttDashPacketLibStrings.disconnect
  var properties: js.UndefOr[mqttDashPacketLib.Anon_ReasonStringServerReference] = js.undefined
}

object IDisconnectPacket {
  @scala.inline
  def apply(
    cmd: mqttDashPacketLib.mqttDashPacketLibStrings.disconnect,
    length: scala.Int | scala.Double = null,
    messageId: scala.Int | scala.Double = null,
    properties: mqttDashPacketLib.Anon_ReasonStringServerReference = null
  ): IDisconnectPacket = {
    val __obj = js.Dynamic.literal(cmd = cmd)
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (messageId != null) __obj.updateDynamic("messageId")(messageId.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties)
    __obj.asInstanceOf[IDisconnectPacket]
  }
}

