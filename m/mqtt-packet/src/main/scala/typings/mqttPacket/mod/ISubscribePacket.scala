package typings.mqttPacket.mod

import typings.mqttPacket.AnonReasonString
import typings.mqttPacket.mqttPacketStrings.subscribe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISubscribePacket
  extends IPacket
     with Packet {
  @JSName("cmd")
  var cmd_ISubscribePacket: subscribe
  var properties: js.UndefOr[AnonReasonString] = js.undefined
  var subscriptions: js.Array[ISubscription]
}

object ISubscribePacket {
  @scala.inline
  def apply(
    cmd: subscribe,
    subscriptions: js.Array[ISubscription],
    length: Int | Double = null,
    messageId: Int | Double = null,
    properties: AnonReasonString = null
  ): ISubscribePacket = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any], subscriptions = subscriptions.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (messageId != null) __obj.updateDynamic("messageId")(messageId.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISubscribePacket]
  }
}

