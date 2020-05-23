package typings.mqttPacket.mod

import typings.mqttPacket.anon.ReasonString
import typings.mqttPacket.mqttPacketStrings.pubcomp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPubcompPacket
  extends IPacket
     with Packet {
  @JSName("cmd")
  var cmd_IPubcompPacket: pubcomp
  var properties: js.UndefOr[ReasonString] = js.undefined
}

object IPubcompPacket {
  @scala.inline
  def apply(
    cmd: pubcomp,
    length: js.UndefOr[Double] = js.undefined,
    messageId: js.UndefOr[Double] = js.undefined,
    properties: ReasonString = null
  ): IPubcompPacket = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any])
    if (!js.isUndefined(length)) __obj.updateDynamic("length")(length.get.asInstanceOf[js.Any])
    if (!js.isUndefined(messageId)) __obj.updateDynamic("messageId")(messageId.get.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPubcompPacket]
  }
}

