package typings.mqtt.clientOptionsMod

import org.scalablytyped.runtime.StringDictionary
import typings.mqtt.anon.AuthenticationData
import typings.mqtt.anon.Host
import typings.mqtt.anon.Payload
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IClientOptions extends ISecureClientOptions {
  
  /**
    * true, set to false to receive QoS 1 and 2 messages while offline
    */
  var clean: js.UndefOr[Boolean] = js.native
  
  /**
    * 'mqttjs_' + Math.random().toString(16).substr(2, 8)
    */
  var clientId: js.UndefOr[String] = js.native
  
  /**
    * 30 * 1000 milliseconds, time to wait before a CONNACK is received
    */
  var connectTimeout: js.UndefOr[Double] = js.native
  
  // port is made into a number subsequently
  var host: js.UndefOr[String] = js.native
  
  // host does NOT include port
  var hostname: js.UndefOr[String] = js.native
  
  /**
    * a Store for the incoming packets
    */
  var incomingStore: js.UndefOr[Store] = js.native
  
  /**
    *  10 seconds, set to 0 to disable
    */
  var keepalive: js.UndefOr[Double] = js.native
  
  /**
    * a Store for the outgoing packets
    */
  var outgoingStore: js.UndefOr[Store] = js.native
  
  /**
    * the password required by your broker, if any
    */
  var password: js.UndefOr[String] = js.native
  
  var path: js.UndefOr[String] = js.native
  
  var port: js.UndefOr[Double] = js.native
  
  var properties: js.UndefOr[AuthenticationData] = js.native
  
  var protocol: js.UndefOr[wss | ws | mqtt | mqtts | tcp | ssl | wx | wxs] = js.native
  
  /**
    * 'MQTT'
    */
  var protocolId: js.UndefOr[String] = js.native
  
  /**
    * 4
    */
  var protocolVersion: js.UndefOr[Double] = js.native
  
  var queueQoSZero: js.UndefOr[Boolean] = js.native
  
  /**
    * 1000 milliseconds, interval between two reconnections
    */
  var reconnectPeriod: js.UndefOr[Double] = js.native
  
  var reschedulePings: js.UndefOr[Boolean] = js.native
  
  /**
    * true, set to false to disable re-subscribe functionality
    */
  var resubscribe: js.UndefOr[Boolean] = js.native
  
  var servers: js.UndefOr[js.Array[Host]] = js.native
  
  var transformWsUrl: js.UndefOr[
    js.Function3[/* url */ String, /* options */ this.type, /* client */ MqttClient, String]
  ] = js.native
  
  /**
    * the username required by your broker, if any
    */
  var username: js.UndefOr[String] = js.native
  
  /**
    * a message that will sent by the broker automatically when the client disconnect badly.
    */
  var will: js.UndefOr[Payload] = js.native
  
  var wsOptions: js.UndefOr[StringDictionary[js.Any]] = js.native
}
object IClientOptions {
  
  @scala.inline
  def apply(): IClientOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClientOptions]
  }
  
  @scala.inline
  implicit class IClientOptionsOps[Self <: IClientOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClean(value: Boolean): Self = this.set("clean", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClean: Self = this.set("clean", js.undefined)
    
    @scala.inline
    def setClientId(value: String): Self = this.set("clientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientId: Self = this.set("clientId", js.undefined)
    
    @scala.inline
    def setConnectTimeout(value: Double): Self = this.set("connectTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectTimeout: Self = this.set("connectTimeout", js.undefined)
    
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    
    @scala.inline
    def setHostname(value: String): Self = this.set("hostname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHostname: Self = this.set("hostname", js.undefined)
    
    @scala.inline
    def setIncomingStore(value: Store): Self = this.set("incomingStore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncomingStore: Self = this.set("incomingStore", js.undefined)
    
    @scala.inline
    def setKeepalive(value: Double): Self = this.set("keepalive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeepalive: Self = this.set("keepalive", js.undefined)
    
    @scala.inline
    def setOutgoingStore(value: Store): Self = this.set("outgoingStore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutgoingStore: Self = this.set("outgoingStore", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    
    @scala.inline
    def setProperties(value: AuthenticationData): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
    
    @scala.inline
    def setProtocol(value: wss | ws | mqtt | mqtts | tcp | ssl | wx | wxs): Self = this.set("protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtocol: Self = this.set("protocol", js.undefined)
    
    @scala.inline
    def setProtocolId(value: String): Self = this.set("protocolId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtocolId: Self = this.set("protocolId", js.undefined)
    
    @scala.inline
    def setProtocolVersion(value: Double): Self = this.set("protocolVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtocolVersion: Self = this.set("protocolVersion", js.undefined)
    
    @scala.inline
    def setQueueQoSZero(value: Boolean): Self = this.set("queueQoSZero", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueueQoSZero: Self = this.set("queueQoSZero", js.undefined)
    
    @scala.inline
    def setReconnectPeriod(value: Double): Self = this.set("reconnectPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReconnectPeriod: Self = this.set("reconnectPeriod", js.undefined)
    
    @scala.inline
    def setReschedulePings(value: Boolean): Self = this.set("reschedulePings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReschedulePings: Self = this.set("reschedulePings", js.undefined)
    
    @scala.inline
    def setResubscribe(value: Boolean): Self = this.set("resubscribe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResubscribe: Self = this.set("resubscribe", js.undefined)
    
    @scala.inline
    def setServersVarargs(value: Host*): Self = this.set("servers", js.Array(value :_*))
    
    @scala.inline
    def setServers(value: js.Array[Host]): Self = this.set("servers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServers: Self = this.set("servers", js.undefined)
    
    @scala.inline
    def setTransformWsUrl(value: (/* url */ String, IClientOptions, /* client */ MqttClient) => String): Self = this.set("transformWsUrl", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteTransformWsUrl: Self = this.set("transformWsUrl", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsername: Self = this.set("username", js.undefined)
    
    @scala.inline
    def setWill(value: Payload): Self = this.set("will", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWill: Self = this.set("will", js.undefined)
    
    @scala.inline
    def setWsOptions(value: StringDictionary[js.Any]): Self = this.set("wsOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWsOptions: Self = this.set("wsOptions", js.undefined)
  }
}
