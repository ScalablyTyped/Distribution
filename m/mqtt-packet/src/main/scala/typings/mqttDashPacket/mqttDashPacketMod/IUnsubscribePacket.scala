package typings.mqttDashPacket.mqttDashPacketMod

import typings.mqttDashPacket.Anon_ReasonString
import typings.mqttDashPacket.mqttDashPacketStrings.unsubscribe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUnsubscribePacket
  extends IPacket
     with Packet {
  @JSName("cmd")
  var cmd_IUnsubscribePacket: unsubscribe
  var properties: js.UndefOr[Anon_ReasonString] = js.undefined
  var unsubscriptions: js.Array[String]
}

object IUnsubscribePacket {
  @scala.inline
  def apply(
    cmd: unsubscribe,
    unsubscriptions: js.Array[String],
    length: Int | Double = null,
    messageId: Int | Double = null,
    properties: Anon_ReasonString = null
  ): IUnsubscribePacket = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any], unsubscriptions = unsubscriptions.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (messageId != null) __obj.updateDynamic("messageId")(messageId.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUnsubscribePacket]
  }
}

