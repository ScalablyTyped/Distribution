package typings.mqttDashPacket.mqttDashPacketMod

import typings.mqttDashPacket.Anon_ReasonString
import typings.mqttDashPacket.mqttDashPacketStrings.unsuback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUnsubackPacket
  extends IPacket
     with Packet {
  @JSName("cmd")
  var cmd_IUnsubackPacket: unsuback
  var properties: js.UndefOr[Anon_ReasonString] = js.undefined
}

object IUnsubackPacket {
  @scala.inline
  def apply(
    cmd: unsuback,
    length: Int | Double = null,
    messageId: Int | Double = null,
    properties: Anon_ReasonString = null
  ): IUnsubackPacket = {
    val __obj = js.Dynamic.literal(cmd = cmd)
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (messageId != null) __obj.updateDynamic("messageId")(messageId.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties)
    __obj.asInstanceOf[IUnsubackPacket]
  }
}

