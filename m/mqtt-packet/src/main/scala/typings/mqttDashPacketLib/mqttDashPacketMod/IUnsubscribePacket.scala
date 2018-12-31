package typings
package mqttDashPacketLib.mqttDashPacketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUnsubscribePacket extends IPacket {
  @JSName("cmd")
  var cmd_IUnsubscribePacket: mqttDashPacketLib.mqttDashPacketLibStrings.unsubscribe
  var unsubscriptions: js.Array[java.lang.String]
}

