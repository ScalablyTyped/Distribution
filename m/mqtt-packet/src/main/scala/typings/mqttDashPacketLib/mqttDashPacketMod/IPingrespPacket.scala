package typings
package mqttDashPacketLib.mqttDashPacketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPingrespPacket
  extends IPacket
     with Packet {
  @JSName("cmd")
  var cmd_IPingrespPacket: mqttDashPacketLib.mqttDashPacketLibStrings.pingresp
}

object IPingrespPacket {
  @scala.inline
  def apply(
    cmd: mqttDashPacketLib.mqttDashPacketLibStrings.pingresp,
    length: scala.Int | scala.Double = null,
    messageId: scala.Int | scala.Double = null
  ): IPingrespPacket = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cmd")(cmd)
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (messageId != null) __obj.updateDynamic("messageId")(messageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPingrespPacket]
  }
}

