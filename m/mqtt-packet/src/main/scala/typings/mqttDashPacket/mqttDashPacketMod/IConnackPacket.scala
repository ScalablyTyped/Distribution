package typings.mqttDashPacket.mqttDashPacketMod

import typings.mqttDashPacket.Anon_AssignedClientIdentifier
import typings.mqttDashPacket.mqttDashPacketStrings.connack
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConnackPacket
  extends IPacket
     with Packet {
  @JSName("cmd")
  var cmd_IConnackPacket: connack
  var properties: js.UndefOr[Anon_AssignedClientIdentifier] = js.undefined
  var returnCode: Double
  var sessionPresent: Boolean
}

object IConnackPacket {
  @scala.inline
  def apply(
    cmd: connack,
    returnCode: Double,
    sessionPresent: Boolean,
    length: Int | Double = null,
    messageId: Int | Double = null,
    properties: Anon_AssignedClientIdentifier = null
  ): IConnackPacket = {
    val __obj = js.Dynamic.literal(cmd = cmd, returnCode = returnCode, sessionPresent = sessionPresent)
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (messageId != null) __obj.updateDynamic("messageId")(messageId.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties)
    __obj.asInstanceOf[IConnackPacket]
  }
}

