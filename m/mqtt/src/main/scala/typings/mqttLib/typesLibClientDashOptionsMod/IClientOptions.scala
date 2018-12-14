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
  var will: js.UndefOr[mqttLib.Anon_Retain] = js.undefined
  var wsOptions: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
}

