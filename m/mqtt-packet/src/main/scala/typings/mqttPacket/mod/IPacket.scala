package typings.mqttPacket.mod

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
  def apply(
    cmd: PacketCmd,
    length: js.UndefOr[Double] = js.undefined,
    messageId: js.UndefOr[Double] = js.undefined
  ): IPacket = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any])
    if (!js.isUndefined(length)) __obj.updateDynamic("length")(length.get.asInstanceOf[js.Any])
    if (!js.isUndefined(messageId)) __obj.updateDynamic("messageId")(messageId.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPacket]
  }
}

