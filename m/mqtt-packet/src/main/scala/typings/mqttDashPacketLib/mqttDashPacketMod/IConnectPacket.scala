package typings
package mqttDashPacketLib.mqttDashPacketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IConnectPacket extends IPacket {
  var clean: js.UndefOr[scala.Boolean] = js.undefined
  var clientId: java.lang.String
  @JSName("cmd")
  var cmd_IConnectPacket: mqttDashPacketLib.mqttDashPacketLibStrings.connect
  var keepalive: js.UndefOr[scala.Double] = js.undefined
  var password: js.UndefOr[nodeLib.Buffer] = js.undefined
  var protocolId: js.UndefOr[
    mqttDashPacketLib.mqttDashPacketLibStrings.MQTT | mqttDashPacketLib.mqttDashPacketLibStrings.MQIsdp
  ] = js.undefined
  var protocolVersion: js.UndefOr[
    mqttDashPacketLib.mqttDashPacketLibNumbers.`4` | mqttDashPacketLib.mqttDashPacketLibNumbers.`3`
  ] = js.undefined
  var username: js.UndefOr[java.lang.String] = js.undefined
  var will: js.UndefOr[mqttDashPacketLib.Anon_Retain] = js.undefined
}

