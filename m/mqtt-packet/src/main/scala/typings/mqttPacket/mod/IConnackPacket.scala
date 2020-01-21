package typings.mqttPacket.mod

import typings.mqttPacket.AnonAssignedClientIdentifier
import typings.mqttPacket.mqttPacketStrings.connack
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConnackPacket
  extends IPacket
     with Packet {
  @JSName("cmd")
  var cmd_IConnackPacket: connack
  var properties: js.UndefOr[AnonAssignedClientIdentifier] = js.undefined
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
    properties: AnonAssignedClientIdentifier = null
  ): IConnackPacket = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any], returnCode = returnCode.asInstanceOf[js.Any], sessionPresent = sessionPresent.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (messageId != null) __obj.updateDynamic("messageId")(messageId.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConnackPacket]
  }
}

