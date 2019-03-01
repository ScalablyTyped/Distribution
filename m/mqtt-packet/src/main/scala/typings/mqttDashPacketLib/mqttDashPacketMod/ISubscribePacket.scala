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
  var subscriptions: js.Array[ISubscription]
}

object ISubscribePacket {
  @scala.inline
  def apply(
    cmd: mqttDashPacketLib.mqttDashPacketLibStrings.subscribe,
    subscriptions: js.Array[ISubscription],
    length: scala.Int | scala.Double = null,
    messageId: scala.Int | scala.Double = null
  ): ISubscribePacket = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cmd")(cmd)
    __obj.updateDynamic("subscriptions")(subscriptions)
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (messageId != null) __obj.updateDynamic("messageId")(messageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISubscribePacket]
  }
}

