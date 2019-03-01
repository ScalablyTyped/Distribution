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
  var granted: js.Array[scala.Double]
}

object ISubackPacket {
  @scala.inline
  def apply(
    cmd: mqttDashPacketLib.mqttDashPacketLibStrings.suback,
    granted: js.Array[scala.Double],
    length: scala.Int | scala.Double = null,
    messageId: scala.Int | scala.Double = null
  ): ISubackPacket = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cmd")(cmd)
    __obj.updateDynamic("granted")(granted)
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (messageId != null) __obj.updateDynamic("messageId")(messageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISubackPacket]
  }
}

