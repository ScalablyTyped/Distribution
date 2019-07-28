package typings.mqttDashPacket.mqttDashPacketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPacket extends js.Object {
  var cmd: PacketCmd
  var length: js.UndefOr[Double] = js.undefined
  var messageId: js.UndefOr[Double] = js.undefined
}

object IPacket {
  @scala.inline
  def apply(cmd: PacketCmd, length: Int | Double = null, messageId: Int | Double = null): IPacket = {
    val __obj = js.Dynamic.literal(cmd = cmd)
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (messageId != null) __obj.updateDynamic("messageId")(messageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPacket]
  }
}

