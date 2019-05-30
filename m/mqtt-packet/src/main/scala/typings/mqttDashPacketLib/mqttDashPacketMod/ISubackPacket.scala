package typings
package mqttDashPacketLib.mqttDashPacketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISubackPacket
  extends IPacket
     with Packet {
  @JSName("cmd")
  var cmd_ISubackPacket: mqttDashPacketLib.mqttDashPacketLibStrings.suback
  var granted: js.Array[scala.Double | js.Object]
  var properties: js.UndefOr[mqttDashPacketLib.Anon_ReasonString] = js.undefined
}

object ISubackPacket {
  @scala.inline
  def apply(
    cmd: mqttDashPacketLib.mqttDashPacketLibStrings.suback,
    granted: js.Array[scala.Double | js.Object],
    length: scala.Int | scala.Double = null,
    messageId: scala.Int | scala.Double = null,
    properties: mqttDashPacketLib.Anon_ReasonString = null
  ): ISubackPacket = {
    val __obj = js.Dynamic.literal(cmd = cmd, granted = granted)
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (messageId != null) __obj.updateDynamic("messageId")(messageId.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties)
    __obj.asInstanceOf[ISubackPacket]
  }
}

