package typings.mqttPacket.mod

import typings.mqttPacket.AnonReasonString
import typings.mqttPacket.mqttPacketStrings.unsuback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUnsubackPacket
  extends IPacket
     with Packet {
  @JSName("cmd")
  var cmd_IUnsubackPacket: unsuback
  var properties: js.UndefOr[AnonReasonString] = js.undefined
}

object IUnsubackPacket {
  @scala.inline
  def apply(
    cmd: unsuback,
    length: Int | Double = null,
    messageId: Int | Double = null,
    properties: AnonReasonString = null
  ): IUnsubackPacket = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (messageId != null) __obj.updateDynamic("messageId")(messageId.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUnsubackPacket]
  }
}

