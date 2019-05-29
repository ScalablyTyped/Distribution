package typings
package mqttLib.typesLibClientDashOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IClientOptions extends ISecureClientOptions {
  /**
    * true, set to false to receive QoS 1 and 2 messages while offline
    */
  var clean: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * 'mqttjs_' + Math.random().toString(16).substr(2, 8)
    */
  var clientId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 30 * 1000 milliseconds, time to wait before a CONNACK is received
    */
  var connectTimeout: js.UndefOr[scala.Double] = js.undefined
  // port is made into a number subsequently
  var host: js.UndefOr[java.lang.String] = js.undefined
  // host does NOT include port
  var hostname: js.UndefOr[java.lang.String] = js.undefined
  /**
    * a Store for the incoming packets
    */
  var incomingStore: js.UndefOr[mqttLib.typesLibStoreMod.Store] = js.undefined
  /**
    *  10 seconds, set to 0 to disable
    */
  var keepalive: js.UndefOr[scala.Double] = js.undefined
  /**
    * a Store for the outgoing packets
    */
  var outgoingStore: js.UndefOr[mqttLib.typesLibStoreMod.Store] = js.undefined
  /**
    * the password required by your broker, if any
    */
  var password: js.UndefOr[java.lang.String] = js.undefined
  var path: js.UndefOr[java.lang.String] = js.undefined
  var port: js.UndefOr[scala.Double] = js.undefined
  var protocol: js.UndefOr[
    mqttLib.mqttLibStrings.wss | mqttLib.mqttLibStrings.ws | mqttLib.mqttLibStrings.mqtt | mqttLib.mqttLibStrings.mqtts | mqttLib.mqttLibStrings.tcp | mqttLib.mqttLibStrings.ssl | mqttLib.mqttLibStrings.wx | mqttLib.mqttLibStrings.wxs
  ] = js.undefined
  /**
    * 'MQTT'
    */
  var protocolId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 4
    */
  var protocolVersion: js.UndefOr[scala.Double] = js.undefined
  var queueQoSZero: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * 1000 milliseconds, interval between two reconnections
    */
  var reconnectPeriod: js.UndefOr[scala.Double] = js.undefined
  var reschedulePings: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * true, set to false to disable re-subscribe functionality
    */
  var resubscribe: js.UndefOr[scala.Boolean] = js.undefined
  var servers: js.UndefOr[js.Array[mqttLib.Anon_Host]] = js.undefined
  var transformWsUrl: js.UndefOr[
    js.Function3[
      /* url */ java.lang.String, 
      /* options */ IClientOptions, 
      /* client */ mqttLib.typesLibClientMod.MqttClient, 
      java.lang.String
    ]
  ] = js.undefined
  /**
    * the username required by your broker, if any
    */
  var username: js.UndefOr[java.lang.String] = js.undefined
  /**
    * a message that will sent by the broker automatically when the client disconnect badly.
    */
  var will: js.UndefOr[mqttLib.Anon_Payload] = js.undefined
  var wsOptions: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
}

object IClientOptions {
  @scala.inline
  def apply(
    ca: java.lang.String | (js.Array[nodeLib.Buffer | java.lang.String]) | nodeLib.Buffer = null,
    cert: java.lang.String | (js.Array[nodeLib.Buffer | java.lang.String]) | nodeLib.Buffer = null,
    clean: js.UndefOr[scala.Boolean] = js.undefined,
    clientId: java.lang.String = null,
    connectTimeout: scala.Int | scala.Double = null,
    host: java.lang.String = null,
    hostname: java.lang.String = null,
    incomingStore: mqttLib.typesLibStoreMod.Store = null,
    keepalive: scala.Int | scala.Double = null,
    key: java.lang.String | (js.Array[nodeLib.Buffer | js.Object | java.lang.String]) | nodeLib.Buffer = null,
    outgoingStore: mqttLib.typesLibStoreMod.Store = null,
    password: java.lang.String = null,
    path: java.lang.String = null,
    port: scala.Int | scala.Double = null,
    protocol: mqttLib.mqttLibStrings.wss | mqttLib.mqttLibStrings.ws | mqttLib.mqttLibStrings.mqtt | mqttLib.mqttLibStrings.mqtts | mqttLib.mqttLibStrings.tcp | mqttLib.mqttLibStrings.ssl | mqttLib.mqttLibStrings.wx | mqttLib.mqttLibStrings.wxs = null,
    protocolId: java.lang.String = null,
    protocolVersion: scala.Int | scala.Double = null,
    queueQoSZero: js.UndefOr[scala.Boolean] = js.undefined,
    reconnectPeriod: scala.Int | scala.Double = null,
    rejectUnauthorized: js.UndefOr[scala.Boolean] = js.undefined,
    reschedulePings: js.UndefOr[scala.Boolean] = js.undefined,
    resubscribe: js.UndefOr[scala.Boolean] = js.undefined,
    servers: js.Array[mqttLib.Anon_Host] = null,
    transformWsUrl: (/* url */ java.lang.String, /* options */ IClientOptions, /* client */ mqttLib.typesLibClientMod.MqttClient) => java.lang.String = null,
    username: java.lang.String = null,
    will: mqttLib.Anon_Payload = null,
    wsOptions: org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): IClientOptions = {
    val __obj = js.Dynamic.literal()
    if (ca != null) __obj.updateDynamic("ca")(ca.asInstanceOf[js.Any])
    if (cert != null) __obj.updateDynamic("cert")(cert.asInstanceOf[js.Any])
    if (!js.isUndefined(clean)) __obj.updateDynamic("clean")(clean)
    if (clientId != null) __obj.updateDynamic("clientId")(clientId)
    if (connectTimeout != null) __obj.updateDynamic("connectTimeout")(connectTimeout.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host)
    if (hostname != null) __obj.updateDynamic("hostname")(hostname)
    if (incomingStore != null) __obj.updateDynamic("incomingStore")(incomingStore)
    if (keepalive != null) __obj.updateDynamic("keepalive")(keepalive.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (outgoingStore != null) __obj.updateDynamic("outgoingStore")(outgoingStore)
    if (password != null) __obj.updateDynamic("password")(password)
    if (path != null) __obj.updateDynamic("path")(path)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (protocolId != null) __obj.updateDynamic("protocolId")(protocolId)
    if (protocolVersion != null) __obj.updateDynamic("protocolVersion")(protocolVersion.asInstanceOf[js.Any])
    if (!js.isUndefined(queueQoSZero)) __obj.updateDynamic("queueQoSZero")(queueQoSZero)
    if (reconnectPeriod != null) __obj.updateDynamic("reconnectPeriod")(reconnectPeriod.asInstanceOf[js.Any])
    if (!js.isUndefined(rejectUnauthorized)) __obj.updateDynamic("rejectUnauthorized")(rejectUnauthorized)
    if (!js.isUndefined(reschedulePings)) __obj.updateDynamic("reschedulePings")(reschedulePings)
    if (!js.isUndefined(resubscribe)) __obj.updateDynamic("resubscribe")(resubscribe)
    if (servers != null) __obj.updateDynamic("servers")(servers)
    if (transformWsUrl != null) __obj.updateDynamic("transformWsUrl")(js.Any.fromFunction3(transformWsUrl))
    if (username != null) __obj.updateDynamic("username")(username)
    if (will != null) __obj.updateDynamic("will")(will)
    if (wsOptions != null) __obj.updateDynamic("wsOptions")(wsOptions)
    __obj.asInstanceOf[IClientOptions]
  }
}

