package typings
package mqttDashPacketLib.mqttDashPacketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConnackPacket extends IPacket {
  @JSName("cmd")
  var cmd_IConnackPacket: mqttDashPacketLib.mqttDashPacketLibStrings.connack
  var returnCode: scala.Double
  var sessionPresent: scala.Boolean
}

