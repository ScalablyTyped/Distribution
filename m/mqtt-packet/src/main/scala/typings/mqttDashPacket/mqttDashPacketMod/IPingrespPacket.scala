package typings.mqttDashPacket.mqttDashPacketMod

import typings.mqttDashPacket.mqttDashPacketStrings.pingresp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPingrespPacket
  extends IPacket
     with Packet {
  @JSName("cmd")
  var cmd_IPingrespPacket: pingresp
}

object IPingrespPacket {
  @scala.inline
  def apply(cmd: pingresp, length: Int | Double = null, messageId: Int | Double = null): IPingrespPacket = {
    val __obj = js.Dynamic.literal(cmd = cmd)
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (messageId != null) __obj.updateDynamic("messageId")(messageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPingrespPacket]
  }
}

