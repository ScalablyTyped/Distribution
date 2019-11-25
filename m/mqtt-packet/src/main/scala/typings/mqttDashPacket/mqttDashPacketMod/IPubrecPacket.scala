package typings.mqttDashPacket.mqttDashPacketMod

import typings.mqttDashPacket.Anon_ReasonString
import typings.mqttDashPacket.mqttDashPacketStrings.pubrec
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPubrecPacket
  extends IPacket
     with Packet {
  @JSName("cmd")
  var cmd_IPubrecPacket: pubrec
  var properties: js.UndefOr[Anon_ReasonString] = js.undefined
}

object IPubrecPacket {
  @scala.inline
  def apply(
    cmd: pubrec,
    length: Int | Double = null,
    messageId: Int | Double = null,
    properties: Anon_ReasonString = null
  ): IPubrecPacket = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (messageId != null) __obj.updateDynamic("messageId")(messageId.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPubrecPacket]
  }
}

