package typings
package mqttDashPacketLib.mqttDashPacketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ISubackPacket extends IPacket {
  @JSName("cmd")
  var cmd_ISubackPacket: mqttDashPacketLib.mqttDashPacketLibStrings.suback
  var granted: js.Array[scala.Double]
}

