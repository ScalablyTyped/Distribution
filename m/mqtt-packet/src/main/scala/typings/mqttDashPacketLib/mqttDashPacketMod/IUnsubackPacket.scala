package typings
package mqttDashPacketLib.mqttDashPacketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUnsubackPacket
  extends IPacket
     with Packet {
  @JSName("cmd")
  var cmd_IUnsubackPacket: mqttDashPacketLib.mqttDashPacketLibStrings.unsuback
}

object IUnsubackPacket {
  @scala.inline
  def apply(
    cmd: mqttDashPacketLib.mqttDashPacketLibStrings.unsuback,
    length: scala.Int | scala.Double = null,
    messageId: scala.Int | scala.Double = null
  ): IUnsubackPacket = {
    val __obj = js.Dynamic.literal(cmd = cmd)
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (messageId != null) __obj.updateDynamic("messageId")(messageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUnsubackPacket]
  }
}

