package typings.mqttPacket.mod

import typings.mqttPacket.mqttPacketStrings.pingreq
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
  def apply(
    cmd: pingreq,
    length: js.UndefOr[Double] = js.undefined,
    messageId: js.UndefOr[Double] = js.undefined
  ): IPingreqPacket = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any])
    if (!js.isUndefined(length)) __obj.updateDynamic("length")(length.get.asInstanceOf[js.Any])
    if (!js.isUndefined(messageId)) __obj.updateDynamic("messageId")(messageId.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPingreqPacket]
  }
}

