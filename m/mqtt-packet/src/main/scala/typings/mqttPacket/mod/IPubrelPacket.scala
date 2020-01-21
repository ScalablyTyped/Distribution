package typings.mqttPacket.mod

import typings.mqttPacket.AnonReasonString
import typings.mqttPacket.mqttPacketStrings.pubrel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPubrelPacket
  extends IPacket
     with Packet {
  @JSName("cmd")
  var cmd_IPubrelPacket: pubrel
  var properties: js.UndefOr[AnonReasonString] = js.undefined
}

object IPubrelPacket {
  @scala.inline
  def apply(
    cmd: pubrel,
    length: Int | Double = null,
    messageId: Int | Double = null,
    properties: AnonReasonString = null
  ): IPubrelPacket = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (messageId != null) __obj.updateDynamic("messageId")(messageId.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPubrelPacket]
  }
}

