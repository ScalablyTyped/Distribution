package typings.mqttPacket.mod

import typings.mqttPacket.anon.ReasonString
import typings.mqttPacket.mqttPacketStrings.suback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISubackPacket
  extends IPacket
     with Packet {
  @JSName("cmd")
  var cmd_ISubackPacket: suback
  var granted: js.Array[Double | js.Object]
  var properties: js.UndefOr[ReasonString] = js.undefined
}

object ISubackPacket {
  @scala.inline
  def apply(
    cmd: suback,
    granted: js.Array[Double | js.Object],
    length: js.UndefOr[Double] = js.undefined,
    messageId: js.UndefOr[Double] = js.undefined,
    properties: ReasonString = null
  ): ISubackPacket = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any], granted = granted.asInstanceOf[js.Any])
    if (!js.isUndefined(length)) __obj.updateDynamic("length")(length.get.asInstanceOf[js.Any])
    if (!js.isUndefined(messageId)) __obj.updateDynamic("messageId")(messageId.get.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISubackPacket]
  }
}

