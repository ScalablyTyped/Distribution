package typings.mqtt.clientOptionsMod

import org.scalablytyped.runtime.StringDictionary
import typings.mqtt.AnonAuthenticationData
import typings.mqtt.AnonHost
import typings.mqtt.AnonPayload
import typings.mqtt.clientMod.MqttClient
import typings.mqtt.mqttStrings.mqtt
import typings.mqtt.mqttStrings.mqtts
import typings.mqtt.mqttStrings.ssl
import typings.mqtt.mqttStrings.tcp
import typings.mqtt.mqttStrings.ws
import typings.mqtt.mqttStrings.wss
import typings.mqtt.mqttStrings.wx
import typings.mqtt.mqttStrings.wxs
import typings.mqtt.storeMod.Store
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IClientOptions extends ISecureClientOptions {
  /**
    * true, set to false to receive QoS 1 and 2 messages while offline
    */
  var clean: js.UndefOr[Boolean] = js.undefined
  /**
    * 'mqttjs_' + Math.random().toString(16).substr(2, 8)
    */
  var clientId: js.UndefOr[String] = js.undefined
  /**
    * 30 * 1000 milliseconds, time to wait before a CONNACK is received
    */
  var connectTimeout: js.UndefOr[Double] = js.undefined
  // port is made into a number subsequently
  var host: js.UndefOr[String] = js.undefined
  // host does NOT include port
  var hostname: js.UndefOr[String] = js.undefined
  /**
    * a Store for the incoming packets
    */
  var incomingStore: js.UndefOr[Store] = js.undefined
  /**
    *  10 seconds, set to 0 to disable
    */
  var keepalive: js.UndefOr[Double] = js.undefined
  /**
    * a Store for the outgoing packets
    */
  var outgoingStore: js.UndefOr[Store] = js.undefined
  /**
    * the password required by your broker, if any
    */
  var password: js.UndefOr[String] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
  var properties: js.UndefOr[AnonAuthenticationData] = js.undefined
  var protocol: js.UndefOr[wss | ws | mqtt | mqtts | tcp | ssl | wx | wxs] = js.undefined
  /**
    * 'MQTT'
    */
  var protocolId: js.UndefOr[String] = js.undefined
  /**
    * 4
    */
  var protocolVersion: js.UndefOr[Double] = js.undefined
  var queueQoSZero: js.UndefOr[Boolean] = js.undefined
  /**
    * 1000 milliseconds, interval between two reconnections
    */
  var reconnectPeriod: js.UndefOr[Double] = js.undefined
  var reschedulePings: js.UndefOr[Boolean] = js.undefined
  /**
    * true, set to false to disable re-subscribe functionality
    */
  var resubscribe: js.UndefOr[Boolean] = js.undefined
  var servers: js.UndefOr[js.Array[AnonHost]] = js.undefined
  var transformWsUrl: js.UndefOr[
    js.Function3[/* url */ String, /* options */ IClientOptions, /* client */ MqttClient, String]
  ] = js.undefined
  /**
    * the username required by your broker, if any
    */
  var username: js.UndefOr[String] = js.undefined
  /**
    * a message that will sent by the broker automatically when the client disconnect badly.
    */
  var will: js.UndefOr[AnonPayload] = js.undefined
  var wsOptions: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}

object IClientOptions {
  @scala.inline
  def apply(
    ca: String | (js.Array[Buffer | String]) | Buffer = null,
    cert: String | (js.Array[Buffer | String]) | Buffer = null,
    clean: js.UndefOr[Boolean] = js.undefined,
    clientId: String = null,
    connectTimeout: Int | Double = null,
    host: String = null,
    hostname: String = null,
    incomingStore: Store = null,
    keepalive: Int | Double = null,
    key: String | (js.Array[Buffer | js.Object | String]) | Buffer = null,
    outgoingStore: Store = null,
    password: String = null,
    path: String = null,
    port: Int | Double = null,
    properties: AnonAuthenticationData = null,
    protocol: wss | ws | mqtt | mqtts | tcp | ssl | wx | wxs = null,
    protocolId: String = null,
    protocolVersion: Int | Double = null,
    queueQoSZero: js.UndefOr[Boolean] = js.undefined,
    reconnectPeriod: Int | Double = null,
    rejectUnauthorized: js.UndefOr[Boolean] = js.undefined,
    reschedulePings: js.UndefOr[Boolean] = js.undefined,
    resubscribe: js.UndefOr[Boolean] = js.undefined,
    servers: js.Array[AnonHost] = null,
    transformWsUrl: (/* url */ String, /* options */ IClientOptions, /* client */ MqttClient) => String = null,
    username: String = null,
    will: AnonPayload = null,
    wsOptions: StringDictionary[js.Any] = null
  ): IClientOptions = {
    val __obj = js.Dynamic.literal()
    if (ca != null) __obj.updateDynamic("ca")(ca.asInstanceOf[js.Any])
    if (cert != null) __obj.updateDynamic("cert")(cert.asInstanceOf[js.Any])
    if (!js.isUndefined(clean)) __obj.updateDynamic("clean")(clean.asInstanceOf[js.Any])
    if (clientId != null) __obj.updateDynamic("clientId")(clientId.asInstanceOf[js.Any])
    if (connectTimeout != null) __obj.updateDynamic("connectTimeout")(connectTimeout.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (hostname != null) __obj.updateDynamic("hostname")(hostname.asInstanceOf[js.Any])
    if (incomingStore != null) __obj.updateDynamic("incomingStore")(incomingStore.asInstanceOf[js.Any])
    if (keepalive != null) __obj.updateDynamic("keepalive")(keepalive.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (outgoingStore != null) __obj.updateDynamic("outgoingStore")(outgoingStore.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (protocolId != null) __obj.updateDynamic("protocolId")(protocolId.asInstanceOf[js.Any])
    if (protocolVersion != null) __obj.updateDynamic("protocolVersion")(protocolVersion.asInstanceOf[js.Any])
    if (!js.isUndefined(queueQoSZero)) __obj.updateDynamic("queueQoSZero")(queueQoSZero.asInstanceOf[js.Any])
    if (reconnectPeriod != null) __obj.updateDynamic("reconnectPeriod")(reconnectPeriod.asInstanceOf[js.Any])
    if (!js.isUndefined(rejectUnauthorized)) __obj.updateDynamic("rejectUnauthorized")(rejectUnauthorized.asInstanceOf[js.Any])
    if (!js.isUndefined(reschedulePings)) __obj.updateDynamic("reschedulePings")(reschedulePings.asInstanceOf[js.Any])
    if (!js.isUndefined(resubscribe)) __obj.updateDynamic("resubscribe")(resubscribe.asInstanceOf[js.Any])
    if (servers != null) __obj.updateDynamic("servers")(servers.asInstanceOf[js.Any])
    if (transformWsUrl != null) __obj.updateDynamic("transformWsUrl")(js.Any.fromFunction3(transformWsUrl))
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    if (will != null) __obj.updateDynamic("will")(will.asInstanceOf[js.Any])
    if (wsOptions != null) __obj.updateDynamic("wsOptions")(wsOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[IClientOptions]
  }
}

