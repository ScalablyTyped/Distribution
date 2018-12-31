package typings
package mqttDashPacketLib.mqttDashPacketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPublishPacket extends IPacket {
  @JSName("cmd")
  var cmd_IPublishPacket: mqttDashPacketLib.mqttDashPacketLibStrings.publish
  var dup: scala.Boolean
  var payload: java.lang.String | nodeLib.Buffer
  var qos: QoS
  var retain: scala.Boolean
  var topic: java.lang.String
}

