package typings.mqttDashPacket.mqttDashPacketMod

import typings.mqttDashPacket.Anon_ReasonStringServerReference
import typings.mqttDashPacket.mqttDashPacketStrings.disconnect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDisconnectPacket
  extends IPacket
     with Packet {
  @JSName("cmd")
  var cmd_IDisconnectPacket: disconnect
  var properties: js.UndefOr[Anon_ReasonStringServerReference] = js.undefined
}

object IDisconnectPacket {
  @scala.inline
  def apply(
    cmd: disconnect,
    length: Int | Double = null,
    messageId: Int | Double = null,
    properties: Anon_ReasonStringServerReference = null
  ): IDisconnectPacket = {
    val __obj = js.Dynamic.literal(cmd = cmd)
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (messageId != null) __obj.updateDynamic("messageId")(messageId.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties)
    __obj.asInstanceOf[IDisconnectPacket]
  }
}

