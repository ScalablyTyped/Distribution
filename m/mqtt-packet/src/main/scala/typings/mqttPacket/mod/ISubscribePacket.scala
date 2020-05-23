package typings.mqttPacket.mod

import typings.mqttPacket.anon.ReasonString
import typings.mqttPacket.mqttPacketStrings.subscribe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISubscribePacket
  extends IPacket
     with Packet {
  @JSName("cmd")
  var cmd_ISubscribePacket: subscribe
  var properties: js.UndefOr[ReasonString] = js.undefined
  var subscriptions: js.Array[ISubscription]
}

object ISubscribePacket {
  @scala.inline
  def apply(
    cmd: subscribe,
    subscriptions: js.Array[ISubscription],
    length: js.UndefOr[Double] = js.undefined,
    messageId: js.UndefOr[Double] = js.undefined,
    properties: ReasonString = null
  ): ISubscribePacket = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any], subscriptions = subscriptions.asInstanceOf[js.Any])
    if (!js.isUndefined(length)) __obj.updateDynamic("length")(length.get.asInstanceOf[js.Any])
    if (!js.isUndefined(messageId)) __obj.updateDynamic("messageId")(messageId.get.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISubscribePacket]
  }
}

