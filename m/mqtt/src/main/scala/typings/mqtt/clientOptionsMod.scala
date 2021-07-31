package typings.mqtt

import org.scalablytyped.runtime.StringDictionary
import typings.mqtt.anon.AuthenticationData
import typings.mqtt.anon.CorrelationData
import typings.mqtt.anon.Host
import typings.mqtt.anon.Payload
import typings.mqtt.clientMod.MqttClient
import typings.mqtt.mqttStrings.mqtts
import typings.mqtt.mqttStrings.ssl
import typings.mqtt.mqttStrings.tcp
import typings.mqtt.mqttStrings.ws
import typings.mqtt.mqttStrings.wss
import typings.mqtt.mqttStrings.wx
import typings.mqtt.mqttStrings.wxs
import typings.mqtt.storeMod.Store
import typings.mqttPacket.mod.QoS
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clientOptionsMod {
  
  trait IClientOptions
    extends StObject
       with ISecureClientOptions {
    
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
    
    var properties: js.UndefOr[AuthenticationData] = js.undefined
    
    var protocol: js.UndefOr[wss | ws | typings.mqtt.mqttStrings.mqtt | mqtts | tcp | ssl | wx | wxs] = js.undefined
    
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
    
    var servers: js.UndefOr[js.Array[Host]] = js.undefined
    
    var transformWsUrl: js.UndefOr[
        js.Function3[/* url */ String, /* options */ this.type, /* client */ MqttClient, String]
      ] = js.undefined
    
    /**
      * the username required by your broker, if any
      */
    var username: js.UndefOr[String] = js.undefined
    
    /**
      * a message that will sent by the broker automatically when the client disconnect badly.
      */
    var will: js.UndefOr[Payload] = js.undefined
    
    var wsOptions: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  }
  object IClientOptions {
    
    @scala.inline
    def apply(): IClientOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IClientOptions]
    }
    
    @scala.inline
    implicit class IClientOptionsMutableBuilder[Self <: IClientOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClean(value: Boolean): Self = StObject.set(x, "clean", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCleanUndefined: Self = StObject.set(x, "clean", js.undefined)
      
      @scala.inline
      def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
      
      @scala.inline
      def setConnectTimeout(value: Double): Self = StObject.set(x, "connectTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectTimeoutUndefined: Self = StObject.set(x, "connectTimeout", js.undefined)
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      @scala.inline
      def setIncomingStore(value: Store): Self = StObject.set(x, "incomingStore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncomingStoreUndefined: Self = StObject.set(x, "incomingStore", js.undefined)
      
      @scala.inline
      def setKeepalive(value: Double): Self = StObject.set(x, "keepalive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepaliveUndefined: Self = StObject.set(x, "keepalive", js.undefined)
      
      @scala.inline
      def setOutgoingStore(value: Store): Self = StObject.set(x, "outgoingStore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutgoingStoreUndefined: Self = StObject.set(x, "outgoingStore", js.undefined)
      
      @scala.inline
      def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setProperties(value: AuthenticationData): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      @scala.inline
      def setProtocol(value: wss | ws | typings.mqtt.mqttStrings.mqtt | mqtts | tcp | ssl | wx | wxs): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocolId(value: String): Self = StObject.set(x, "protocolId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocolIdUndefined: Self = StObject.set(x, "protocolId", js.undefined)
      
      @scala.inline
      def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      @scala.inline
      def setProtocolVersion(value: Double): Self = StObject.set(x, "protocolVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocolVersionUndefined: Self = StObject.set(x, "protocolVersion", js.undefined)
      
      @scala.inline
      def setQueueQoSZero(value: Boolean): Self = StObject.set(x, "queueQoSZero", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueueQoSZeroUndefined: Self = StObject.set(x, "queueQoSZero", js.undefined)
      
      @scala.inline
      def setReconnectPeriod(value: Double): Self = StObject.set(x, "reconnectPeriod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReconnectPeriodUndefined: Self = StObject.set(x, "reconnectPeriod", js.undefined)
      
      @scala.inline
      def setReschedulePings(value: Boolean): Self = StObject.set(x, "reschedulePings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReschedulePingsUndefined: Self = StObject.set(x, "reschedulePings", js.undefined)
      
      @scala.inline
      def setResubscribe(value: Boolean): Self = StObject.set(x, "resubscribe", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResubscribeUndefined: Self = StObject.set(x, "resubscribe", js.undefined)
      
      @scala.inline
      def setServers(value: js.Array[Host]): Self = StObject.set(x, "servers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServersUndefined: Self = StObject.set(x, "servers", js.undefined)
      
      @scala.inline
      def setServersVarargs(value: Host*): Self = StObject.set(x, "servers", js.Array(value :_*))
      
      @scala.inline
      def setTransformWsUrl(value: (/* url */ String, IClientOptions, /* client */ MqttClient) => String): Self = StObject.set(x, "transformWsUrl", js.Any.fromFunction3(value))
      
      @scala.inline
      def setTransformWsUrlUndefined: Self = StObject.set(x, "transformWsUrl", js.undefined)
      
      @scala.inline
      def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
      
      @scala.inline
      def setWill(value: Payload): Self = StObject.set(x, "will", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWillUndefined: Self = StObject.set(x, "will", js.undefined)
      
      @scala.inline
      def setWsOptions(value: StringDictionary[js.Any]): Self = StObject.set(x, "wsOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWsOptionsUndefined: Self = StObject.set(x, "wsOptions", js.undefined)
    }
  }
  
  trait IClientPublishOptions extends StObject {
    
    /**
      * callback called when message is put into `outgoingStore`
      */
    var cbStorePut: js.UndefOr[StorePutCallback] = js.undefined
    
    /**
      * whether or not mark a message as duplicate
      */
    var dup: js.UndefOr[Boolean] = js.undefined
    
    /*
      *  MQTT 5.0 properties object
      */
    var properties: js.UndefOr[CorrelationData] = js.undefined
    
    /**
      * the QoS
      */
    var qos: js.UndefOr[QoS] = js.undefined
    
    /**
      * the retain flag
      */
    var retain: js.UndefOr[Boolean] = js.undefined
  }
  object IClientPublishOptions {
    
    @scala.inline
    def apply(): IClientPublishOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IClientPublishOptions]
    }
    
    @scala.inline
    implicit class IClientPublishOptionsMutableBuilder[Self <: IClientPublishOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCbStorePut(value: () => Unit): Self = StObject.set(x, "cbStorePut", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCbStorePutUndefined: Self = StObject.set(x, "cbStorePut", js.undefined)
      
      @scala.inline
      def setDup(value: Boolean): Self = StObject.set(x, "dup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDupUndefined: Self = StObject.set(x, "dup", js.undefined)
      
      @scala.inline
      def setProperties(value: CorrelationData): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      @scala.inline
      def setQos(value: QoS): Self = StObject.set(x, "qos", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQosUndefined: Self = StObject.set(x, "qos", js.undefined)
      
      @scala.inline
      def setRetain(value: Boolean): Self = StObject.set(x, "retain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetainUndefined: Self = StObject.set(x, "retain", js.undefined)
    }
  }
  
  trait IClientReconnectOptions extends StObject {
    
    /**
      * a Store for the incoming packets
      */
    var incomingStore: js.UndefOr[Store] = js.undefined
    
    /**
      * a Store for the outgoing packets
      */
    var outgoingStore: js.UndefOr[Store] = js.undefined
  }
  object IClientReconnectOptions {
    
    @scala.inline
    def apply(): IClientReconnectOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IClientReconnectOptions]
    }
    
    @scala.inline
    implicit class IClientReconnectOptionsMutableBuilder[Self <: IClientReconnectOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIncomingStore(value: Store): Self = StObject.set(x, "incomingStore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncomingStoreUndefined: Self = StObject.set(x, "incomingStore", js.undefined)
      
      @scala.inline
      def setOutgoingStore(value: Store): Self = StObject.set(x, "outgoingStore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutgoingStoreUndefined: Self = StObject.set(x, "outgoingStore", js.undefined)
    }
  }
  
  trait IClientSubscribeOptions extends StObject {
    
    /*
      * no local flag
      * */
    var nl: js.UndefOr[Boolean] = js.undefined
    
    /**
      * the QoS
      */
    var qos: QoS
    
    /*
      * Retain As Published flag
      * */
    var rap: js.UndefOr[Boolean] = js.undefined
    
    /*
      * Retain Handling option
      * */
    var rh: js.UndefOr[Double] = js.undefined
  }
  object IClientSubscribeOptions {
    
    @scala.inline
    def apply(qos: QoS): IClientSubscribeOptions = {
      val __obj = js.Dynamic.literal(qos = qos.asInstanceOf[js.Any])
      __obj.asInstanceOf[IClientSubscribeOptions]
    }
    
    @scala.inline
    implicit class IClientSubscribeOptionsMutableBuilder[Self <: IClientSubscribeOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNl(value: Boolean): Self = StObject.set(x, "nl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNlUndefined: Self = StObject.set(x, "nl", js.undefined)
      
      @scala.inline
      def setQos(value: QoS): Self = StObject.set(x, "qos", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRap(value: Boolean): Self = StObject.set(x, "rap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRapUndefined: Self = StObject.set(x, "rap", js.undefined)
      
      @scala.inline
      def setRh(value: Double): Self = StObject.set(x, "rh", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRhUndefined: Self = StObject.set(x, "rh", js.undefined)
    }
  }
  
  trait ISecureClientOptions extends StObject {
    
    /**
      * Optionally override the trusted CA certificates in PEM format
      */
    var ca: js.UndefOr[String | (js.Array[Buffer | String]) | Buffer] = js.undefined
    
    /**
      * optional cert chains in PEM format
      */
    var cert: js.UndefOr[String | (js.Array[Buffer | String]) | Buffer] = js.undefined
    
    /**
      * optional private keys in PEM format
      */
    var key: js.UndefOr[String | (js.Array[Buffer | js.Object | String]) | Buffer] = js.undefined
    
    var rejectUnauthorized: js.UndefOr[Boolean] = js.undefined
  }
  object ISecureClientOptions {
    
    @scala.inline
    def apply(): ISecureClientOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISecureClientOptions]
    }
    
    @scala.inline
    implicit class ISecureClientOptionsMutableBuilder[Self <: ISecureClientOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCa(value: String | (js.Array[Buffer | String]) | Buffer): Self = StObject.set(x, "ca", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaUndefined: Self = StObject.set(x, "ca", js.undefined)
      
      @scala.inline
      def setCaVarargs(value: (Buffer | String)*): Self = StObject.set(x, "ca", js.Array(value :_*))
      
      @scala.inline
      def setCert(value: String | (js.Array[Buffer | String]) | Buffer): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCertUndefined: Self = StObject.set(x, "cert", js.undefined)
      
      @scala.inline
      def setCertVarargs(value: (Buffer | String)*): Self = StObject.set(x, "cert", js.Array(value :_*))
      
      @scala.inline
      def setKey(value: String | (js.Array[Buffer | js.Object | String]) | Buffer): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setKeyVarargs(value: (Buffer | js.Object | String)*): Self = StObject.set(x, "key", js.Array(value :_*))
      
      @scala.inline
      def setRejectUnauthorized(value: Boolean): Self = StObject.set(x, "rejectUnauthorized", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRejectUnauthorizedUndefined: Self = StObject.set(x, "rejectUnauthorized", js.undefined)
    }
  }
  
  type StorePutCallback = js.Function0[Unit]
}
