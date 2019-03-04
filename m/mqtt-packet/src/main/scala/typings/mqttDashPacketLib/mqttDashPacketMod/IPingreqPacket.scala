package typings
package mqttDashPacketLib.mqttDashPacketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPingreqPacket
  extends IPacket
     with Packet {
  @JSName("cmd")
  var cmd_IPingreqPacket: mqttDashPacketLib.mqttDashPacketLibStrings.pingreq
}

object IPingreqPacket {
  @scala.inline
  def apply(
    cmd: mqttDashPacketLib.mqttDashPacketLibStrings.pingreq,
    length: scala.Int | scala.Double = null,
    messageId: scala.Int | scala.Double = null
  ): IPingreqPacket = {
    val __obj = js.Dynamic.literal(cmd = cmd)
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (messageId != null) __obj.updateDynamic("messageId")(messageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPingreqPacket]
  }
}

