package typings.mqttPacket.mod

import typings.mqttPacket.AnonServerReference
import typings.mqttPacket.mqttPacketStrings.disconnect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDisconnectPacket
  extends IPacket
     with Packet {
  @JSName("cmd")
  var cmd_IDisconnectPacket: disconnect
  var properties: js.UndefOr[AnonServerReference] = js.undefined
}

object IDisconnectPacket {
  @scala.inline
  def apply(
    cmd: disconnect,
    length: Int | Double = null,
    messageId: Int | Double = null,
    properties: AnonServerReference = null
  ): IDisconnectPacket = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (messageId != null) __obj.updateDynamic("messageId")(messageId.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDisconnectPacket]
  }
}

