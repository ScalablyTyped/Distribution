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
  var properties: js.UndefOr[mqttDashPacketLib.Anon_ReasonString] = js.undefined
}

object IUnsubackPacket {
  @scala.inline
  def apply(
    cmd: mqttDashPacketLib.mqttDashPacketLibStrings.unsuback,
    length: scala.Int | scala.Double = null,
    messageId: scala.Int | scala.Double = null,
    properties: mqttDashPacketLib.Anon_ReasonString = null
  ): IUnsubackPacket = {
    val __obj = js.Dynamic.literal(cmd = cmd)
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (messageId != null) __obj.updateDynamic("messageId")(messageId.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties)
    __obj.asInstanceOf[IUnsubackPacket]
  }
}

