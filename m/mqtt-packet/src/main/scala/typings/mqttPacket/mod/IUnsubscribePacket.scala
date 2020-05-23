package typings.mqttPacket.mod

import typings.mqttPacket.anon.ReasonString
import typings.mqttPacket.mqttPacketStrings.unsubscribe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUnsubscribePacket
  extends IPacket
     with Packet {
  @JSName("cmd")
  var cmd_IUnsubscribePacket: unsubscribe
  var properties: js.UndefOr[ReasonString] = js.undefined
  var unsubscriptions: js.Array[String]
}

object IUnsubscribePacket {
  @scala.inline
  def apply(
    cmd: unsubscribe,
    unsubscriptions: js.Array[String],
    length: js.UndefOr[Double] = js.undefined,
    messageId: js.UndefOr[Double] = js.undefined,
    properties: ReasonString = null
  ): IUnsubscribePacket = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any], unsubscriptions = unsubscriptions.asInstanceOf[js.Any])
    if (!js.isUndefined(length)) __obj.updateDynamic("length")(length.get.asInstanceOf[js.Any])
    if (!js.isUndefined(messageId)) __obj.updateDynamic("messageId")(messageId.get.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUnsubscribePacket]
  }
}

