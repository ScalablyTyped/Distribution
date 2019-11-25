package typings.mqttDashPacket.mqttDashPacketMod

import typings.mqttDashPacket.mqttDashPacketStrings.pingreq
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPingreqPacket
  extends IPacket
     with Packet {
  @JSName("cmd")
  var cmd_IPingreqPacket: pingreq
}

object IPingreqPacket {
  @scala.inline
  def apply(cmd: pingreq, length: Int | Double = null, messageId: Int | Double = null): IPingreqPacket = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (messageId != null) __obj.updateDynamic("messageId")(messageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPingreqPacket]
  }
}

