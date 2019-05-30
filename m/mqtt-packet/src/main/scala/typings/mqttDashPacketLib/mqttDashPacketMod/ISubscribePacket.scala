package typings
package mqttDashPacketLib.mqttDashPacketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISubscribePacket
  extends IPacket
     with Packet {
  @JSName("cmd")
  var cmd_ISubscribePacket: mqttDashPacketLib.mqttDashPacketLibStrings.subscribe
  var properties: js.UndefOr[mqttDashPacketLib.Anon_ReasonString] = js.undefined
  var subscriptions: js.Array[ISubscription]
}

object ISubscribePacket {
  @scala.inline
  def apply(
    cmd: mqttDashPacketLib.mqttDashPacketLibStrings.subscribe,
    subscriptions: js.Array[ISubscription],
    length: scala.Int | scala.Double = null,
    messageId: scala.Int | scala.Double = null,
    properties: mqttDashPacketLib.Anon_ReasonString = null
  ): ISubscribePacket = {
    val __obj = js.Dynamic.literal(cmd = cmd, subscriptions = subscriptions)
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (messageId != null) __obj.updateDynamic("messageId")(messageId.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties)
    __obj.asInstanceOf[ISubscribePacket]
  }
}

