package typings.mqttDashPacket.mqttDashPacketMod

import typings.mqttDashPacket.Anon_ReasonString
import typings.mqttDashPacket.mqttDashPacketStrings.suback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISubackPacket
  extends IPacket
     with Packet {
  @JSName("cmd")
  var cmd_ISubackPacket: suback
  var granted: js.Array[Double | js.Object]
  var properties: js.UndefOr[Anon_ReasonString] = js.undefined
}

object ISubackPacket {
  @scala.inline
  def apply(
    cmd: suback,
    granted: js.Array[Double | js.Object],
    length: Int | Double = null,
    messageId: Int | Double = null,
    properties: Anon_ReasonString = null
  ): ISubackPacket = {
    val __obj = js.Dynamic.literal(cmd = cmd, granted = granted)
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (messageId != null) __obj.updateDynamic("messageId")(messageId.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties)
    __obj.asInstanceOf[ISubackPacket]
  }
}

