package typings
package mqttDashPacketLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mqttDashPacketMod {
  type Packet = IConnectPacket | IPublishPacket | IConnackPacket | ISubscribePacket | ISubackPacket | IUnsubscribePacket | IUnsubackPacket | IPubackPacket | IPubcompPacket | IPubrelPacket | IPingreqPacket | IPingrespPacket | IDisconnectPacket | IPubrecPacket
  type PacketCmd = mqttDashPacketLib.mqttDashPacketLibStrings.connack | mqttDashPacketLib.mqttDashPacketLibStrings.connect | mqttDashPacketLib.mqttDashPacketLibStrings.disconnect | mqttDashPacketLib.mqttDashPacketLibStrings.pingreq | mqttDashPacketLib.mqttDashPacketLibStrings.pingresp | mqttDashPacketLib.mqttDashPacketLibStrings.puback | mqttDashPacketLib.mqttDashPacketLibStrings.pubcomp | mqttDashPacketLib.mqttDashPacketLibStrings.publish | mqttDashPacketLib.mqttDashPacketLibStrings.pubrel | mqttDashPacketLib.mqttDashPacketLibStrings.pubrec | mqttDashPacketLib.mqttDashPacketLibStrings.suback | mqttDashPacketLib.mqttDashPacketLibStrings.subscribe | mqttDashPacketLib.mqttDashPacketLibStrings.unsuback | mqttDashPacketLib.mqttDashPacketLibStrings.unsubscribe
  type QoS = mqttDashPacketLib.mqttDashPacketLibNumbers.`0` | mqttDashPacketLib.mqttDashPacketLibNumbers.`1` | mqttDashPacketLib.mqttDashPacketLibNumbers.`2`
}
