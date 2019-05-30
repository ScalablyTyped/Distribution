package typings
package mqttDashPacketLib.mqttDashPacketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPubackPacket
  extends IPacket
     with Packet {
  @JSName("cmd")
  var cmd_IPubackPacket: mqttDashPacketLib.mqttDashPacketLibStrings.puback
  var properties: js.UndefOr[mqttDashPacketLib.Anon_ReasonString] = js.undefined
}

object IPubackPacket {
  @scala.inline
  def apply(
    cmd: mqttDashPacketLib.mqttDashPacketLibStrings.puback,
    length: scala.Int | scala.Double = null,
    messageId: scala.Int | scala.Double = null,
    properties: mqttDashPacketLib.Anon_ReasonString = null
  ): IPubackPacket = {
    val __obj = js.Dynamic.literal(cmd = cmd)
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (messageId != null) __obj.updateDynamic("messageId")(messageId.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties)
    __obj.asInstanceOf[IPubackPacket]
  }
}

