package typings
package mqttDashPacketLib.mqttDashPacketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISubscribePacket extends IPacket {
  @JSName("cmd")
  var cmd_ISubscribePacket: mqttDashPacketLib.mqttDashPacketLibStrings.subscribe
  var subscriptions: js.Array[ISubscription]
}

