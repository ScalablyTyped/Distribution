package typings.mqttPacket.mod

import typings.mqttPacket.anon.AssignedClientIdentifier
import typings.mqttPacket.mqttPacketStrings.connack
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConnackPacket
  extends IPacket
     with Packet {
  @JSName("cmd")
  var cmd_IConnackPacket: connack
  var properties: js.UndefOr[AssignedClientIdentifier] = js.undefined
  var returnCode: Double
  var sessionPresent: Boolean
}

object IConnackPacket {
  @scala.inline
  def apply(
    cmd: connack,
    returnCode: Double,
    sessionPresent: Boolean,
    length: js.UndefOr[Double] = js.undefined,
    messageId: js.UndefOr[Double] = js.undefined,
    properties: AssignedClientIdentifier = null
  ): IConnackPacket = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any], returnCode = returnCode.asInstanceOf[js.Any], sessionPresent = sessionPresent.asInstanceOf[js.Any])
    if (!js.isUndefined(length)) __obj.updateDynamic("length")(length.get.asInstanceOf[js.Any])
    if (!js.isUndefined(messageId)) __obj.updateDynamic("messageId")(messageId.get.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConnackPacket]
  }
}

