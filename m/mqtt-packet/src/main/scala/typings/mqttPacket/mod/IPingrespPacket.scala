package typings.mqttPacket.mod

import typings.mqttPacket.mqttPacketStrings.pingresp
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
  def apply(
    cmd: pingresp,
    length: js.UndefOr[Double] = js.undefined,
    messageId: js.UndefOr[Double] = js.undefined
  ): IPingrespPacket = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any])
    if (!js.isUndefined(length)) __obj.updateDynamic("length")(length.get.asInstanceOf[js.Any])
    if (!js.isUndefined(messageId)) __obj.updateDynamic("messageId")(messageId.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPingrespPacket]
  }
}

