package typings
package mqttDashPacketLib.mqttDashPacketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConnectPacket
  extends IPacket
     with Packet {
  var clean: js.UndefOr[scala.Boolean] = js.undefined
  var clientId: java.lang.String
  @JSName("cmd")
  var cmd_IConnectPacket: mqttDashPacketLib.mqttDashPacketLibStrings.connect
  var keepalive: js.UndefOr[scala.Double] = js.undefined
  var password: js.UndefOr[nodeLib.Buffer] = js.undefined
  var properties: js.UndefOr[mqttDashPacketLib.Anon_AuthenticationData] = js.undefined
  var protocolId: js.UndefOr[
    mqttDashPacketLib.mqttDashPacketLibStrings.MQTT | mqttDashPacketLib.mqttDashPacketLibStrings.MQIsdp
  ] = js.undefined
  var protocolVersion: js.UndefOr[
    mqttDashPacketLib.mqttDashPacketLibNumbers.`4` | mqttDashPacketLib.mqttDashPacketLibNumbers.`5` | mqttDashPacketLib.mqttDashPacketLibNumbers.`3`
  ] = js.undefined
  var username: js.UndefOr[java.lang.String] = js.undefined
  var will: js.UndefOr[mqttDashPacketLib.Anon_Payload] = js.undefined
}

object IConnectPacket {
  @scala.inline
  def apply(
    clientId: java.lang.String,
    cmd: mqttDashPacketLib.mqttDashPacketLibStrings.connect,
    clean: js.UndefOr[scala.Boolean] = js.undefined,
    keepalive: scala.Int | scala.Double = null,
    length: scala.Int | scala.Double = null,
    messageId: scala.Int | scala.Double = null,
    password: nodeLib.Buffer = null,
    properties: mqttDashPacketLib.Anon_AuthenticationData = null,
    protocolId: mqttDashPacketLib.mqttDashPacketLibStrings.MQTT | mqttDashPacketLib.mqttDashPacketLibStrings.MQIsdp = null,
    protocolVersion: mqttDashPacketLib.mqttDashPacketLibNumbers.`4` | mqttDashPacketLib.mqttDashPacketLibNumbers.`5` | mqttDashPacketLib.mqttDashPacketLibNumbers.`3` = null,
    username: java.lang.String = null,
    will: mqttDashPacketLib.Anon_Payload = null
  ): IConnectPacket = {
    val __obj = js.Dynamic.literal(clientId = clientId, cmd = cmd)
    if (!js.isUndefined(clean)) __obj.updateDynamic("clean")(clean)
    if (keepalive != null) __obj.updateDynamic("keepalive")(keepalive.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (messageId != null) __obj.updateDynamic("messageId")(messageId.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    if (protocolId != null) __obj.updateDynamic("protocolId")(protocolId.asInstanceOf[js.Any])
    if (protocolVersion != null) __obj.updateDynamic("protocolVersion")(protocolVersion.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username)
    if (will != null) __obj.updateDynamic("will")(will)
    __obj.asInstanceOf[IConnectPacket]
  }
}

