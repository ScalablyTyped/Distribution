package typings
package mqttDashPacketLib.mqttDashPacketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPubcompPacket
  extends IPacket
     with Packet {
  @JSName("cmd")
  var cmd_IPubcompPacket: mqttDashPacketLib.mqttDashPacketLibStrings.pubcomp
  var properties: js.UndefOr[mqttDashPacketLib.Anon_ReasonString] = js.undefined
}

object IPubcompPacket {
  @scala.inline
  def apply(
    cmd: mqttDashPacketLib.mqttDashPacketLibStrings.pubcomp,
    length: scala.Int | scala.Double = null,
    messageId: scala.Int | scala.Double = null,
    properties: mqttDashPacketLib.Anon_ReasonString = null
  ): IPubcompPacket = {
    val __obj = js.Dynamic.literal(cmd = cmd)
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (messageId != null) __obj.updateDynamic("messageId")(messageId.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties)
    __obj.asInstanceOf[IPubcompPacket]
  }
}

