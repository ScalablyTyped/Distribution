package typings.mqttDashPacket.mqttDashPacketMod

import typings.mqttDashPacket.Anon_ReasonString
import typings.mqttDashPacket.mqttDashPacketStrings.pubcomp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPubcompPacket
  extends IPacket
     with Packet {
  @JSName("cmd")
  var cmd_IPubcompPacket: pubcomp
  var properties: js.UndefOr[Anon_ReasonString] = js.undefined
}

object IPubcompPacket {
  @scala.inline
  def apply(
    cmd: pubcomp,
    length: Int | Double = null,
    messageId: Int | Double = null,
    properties: Anon_ReasonString = null
  ): IPubcompPacket = {
    val __obj = js.Dynamic.literal(cmd = cmd)
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (messageId != null) __obj.updateDynamic("messageId")(messageId.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties)
    __obj.asInstanceOf[IPubcompPacket]
  }
}

