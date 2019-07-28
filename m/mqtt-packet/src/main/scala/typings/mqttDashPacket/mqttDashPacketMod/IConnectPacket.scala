package typings.mqttDashPacket.mqttDashPacketMod

import typings.mqttDashPacket.Anon_AuthenticationData
import typings.mqttDashPacket.Anon_Payload
import typings.mqttDashPacket.mqttDashPacketNumbers.`3`
import typings.mqttDashPacket.mqttDashPacketNumbers.`4`
import typings.mqttDashPacket.mqttDashPacketNumbers.`5`
import typings.mqttDashPacket.mqttDashPacketStrings.MQIsdp
import typings.mqttDashPacket.mqttDashPacketStrings.MQTT
import typings.mqttDashPacket.mqttDashPacketStrings.connect
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConnectPacket
  extends IPacket
     with Packet {
  var clean: js.UndefOr[Boolean] = js.undefined
  var clientId: String
  @JSName("cmd")
  var cmd_IConnectPacket: connect
  var keepalive: js.UndefOr[Double] = js.undefined
  var password: js.UndefOr[Buffer] = js.undefined
  var properties: js.UndefOr[Anon_AuthenticationData] = js.undefined
  var protocolId: js.UndefOr[MQTT | MQIsdp] = js.undefined
  var protocolVersion: js.UndefOr[`4` | `5` | `3`] = js.undefined
  var username: js.UndefOr[String] = js.undefined
  var will: js.UndefOr[Anon_Payload] = js.undefined
}

object IConnectPacket {
  @scala.inline
  def apply(
    clientId: String,
    cmd: connect,
    clean: js.UndefOr[Boolean] = js.undefined,
    keepalive: Int | Double = null,
    length: Int | Double = null,
    messageId: Int | Double = null,
    password: Buffer = null,
    properties: Anon_AuthenticationData = null,
    protocolId: MQTT | MQIsdp = null,
    protocolVersion: `4` | `5` | `3` = null,
    username: String = null,
    will: Anon_Payload = null
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

