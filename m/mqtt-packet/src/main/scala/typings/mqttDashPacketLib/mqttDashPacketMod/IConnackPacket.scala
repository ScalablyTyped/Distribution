package typings
package mqttDashPacketLib.mqttDashPacketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConnackPacket
  extends IPacket
     with Packet {
  @JSName("cmd")
  var cmd_IConnackPacket: mqttDashPacketLib.mqttDashPacketLibStrings.connack
  var returnCode: scala.Double
  var sessionPresent: scala.Boolean
}

object IConnackPacket {
  @scala.inline
  def apply(
    cmd: mqttDashPacketLib.mqttDashPacketLibStrings.connack,
    returnCode: scala.Double,
    sessionPresent: scala.Boolean,
    length: scala.Int | scala.Double = null,
    messageId: scala.Int | scala.Double = null
  ): IConnackPacket = {
    val __obj = js.Dynamic.literal(cmd = cmd, returnCode = returnCode, sessionPresent = sessionPresent)
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (messageId != null) __obj.updateDynamic("messageId")(messageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConnackPacket]
  }
}

