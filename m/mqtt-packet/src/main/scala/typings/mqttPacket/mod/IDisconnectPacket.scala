package typings.mqttPacket.mod

import typings.mqttPacket.anon.ServerReference
import typings.mqttPacket.mqttPacketStrings.disconnect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDisconnectPacket
  extends IPacket
     with Packet {
  @JSName("cmd")
  var cmd_IDisconnectPacket: disconnect
  var properties: js.UndefOr[ServerReference] = js.undefined
}

object IDisconnectPacket {
  @scala.inline
  def apply(
    cmd: disconnect,
    length: js.UndefOr[Double] = js.undefined,
    messageId: js.UndefOr[Double] = js.undefined,
    properties: ServerReference = null
  ): IDisconnectPacket = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any])
    if (!js.isUndefined(length)) __obj.updateDynamic("length")(length.get.asInstanceOf[js.Any])
    if (!js.isUndefined(messageId)) __obj.updateDynamic("messageId")(messageId.get.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDisconnectPacket]
  }
}

