package typings.mqtt

import typings.mqtt.anon.AuthenticationData
import typings.mqtt.anon.CorrelationData
import typings.mqtt.anon.Host
import typings.mqtt.anon.Payload
import typings.mqtt.anon.SubscriptionIdentifier
import typings.mqtt.clientMod.MqttClient
import typings.mqtt.messageIdProviderMod.IMessageIdProvider
import typings.mqtt.mqttStrings.mqtts
import typings.mqtt.mqttStrings.ssl
import typings.mqtt.mqttStrings.tcp
import typings.mqtt.mqttStrings.ws
import typings.mqtt.mqttStrings.wss
import typings.mqtt.mqttStrings.wx
import typings.mqtt.mqttStrings.wxs
import typings.mqtt.storeMod.Store
import typings.mqttPacket.mod.QoS
import typings.node.bufferMod.global.Buffer
import typings.node.httpMod.ClientRequestArgs
import typings.ws.mod.ClientOptions
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
    
    var messageIdProvider: js.UndefOr[IMessageIdProvider] = js.undefined
    
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
    
    var wsOptions: js.UndefOr[ClientOptions | ClientRequestArgs] = js.undefined
  }
  object IClientOptions {
    
    inline def apply(): IClientOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IClientOptions]
    }
    
    extension [Self <: IClientOptions](x: Self) {
      
      inline def setClean(value: Boolean): Self = StObject.set(x, "clean", value.asInstanceOf[js.Any])
      
      inline def setCleanUndefined: Self = StObject.set(x, "clean", js.undefined)
      
      inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      inline def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
      
      inline def setConnectTimeout(value: Double): Self = StObject.set(x, "connectTimeout", value.asInstanceOf[js.Any])
      
      inline def setConnectTimeoutUndefined: Self = StObject.set(x, "connectTimeout", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      inline def setIncomingStore(value: Store): Self = StObject.set(x, "incomingStore", value.asInstanceOf[js.Any])
      
      inline def setIncomingStoreUndefined: Self = StObject.set(x, "incomingStore", js.undefined)
      
      inline def setKeepalive(value: Double): Self = StObject.set(x, "keepalive", value.asInstanceOf[js.Any])
      
      inline def setKeepaliveUndefined: Self = StObject.set(x, "keepalive", js.undefined)
      
      inline def setMessageIdProvider(value: IMessageIdProvider): Self = StObject.set(x, "messageIdProvider", value.asInstanceOf[js.Any])
      
      inline def setMessageIdProviderUndefined: Self = StObject.set(x, "messageIdProvider", js.undefined)
      
      inline def setOutgoingStore(value: Store): Self = StObject.set(x, "outgoingStore", value.asInstanceOf[js.Any])
      
      inline def setOutgoingStoreUndefined: Self = StObject.set(x, "outgoingStore", js.undefined)
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setProperties(value: AuthenticationData): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      inline def setProtocol(value: wss | ws | typings.mqtt.mqttStrings.mqtt | mqtts | tcp | ssl | wx | wxs): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setProtocolId(value: String): Self = StObject.set(x, "protocolId", value.asInstanceOf[js.Any])
      
      inline def setProtocolIdUndefined: Self = StObject.set(x, "protocolId", js.undefined)
      
      inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      inline def setProtocolVersion(value: Double): Self = StObject.set(x, "protocolVersion", value.asInstanceOf[js.Any])
      
      inline def setProtocolVersionUndefined: Self = StObject.set(x, "protocolVersion", js.undefined)
      
      inline def setQueueQoSZero(value: Boolean): Self = StObject.set(x, "queueQoSZero", value.asInstanceOf[js.Any])
      
      inline def setQueueQoSZeroUndefined: Self = StObject.set(x, "queueQoSZero", js.undefined)
      
      inline def setReconnectPeriod(value: Double): Self = StObject.set(x, "reconnectPeriod", value.asInstanceOf[js.Any])
      
      inline def setReconnectPeriodUndefined: Self = StObject.set(x, "reconnectPeriod", js.undefined)
      
      inline def setReschedulePings(value: Boolean): Self = StObject.set(x, "reschedulePings", value.asInstanceOf[js.Any])
      
      inline def setReschedulePingsUndefined: Self = StObject.set(x, "reschedulePings", js.undefined)
      
      inline def setResubscribe(value: Boolean): Self = StObject.set(x, "resubscribe", value.asInstanceOf[js.Any])
      
      inline def setResubscribeUndefined: Self = StObject.set(x, "resubscribe", js.undefined)
      
      inline def setServers(value: js.Array[Host]): Self = StObject.set(x, "servers", value.asInstanceOf[js.Any])
      
      inline def setServersUndefined: Self = StObject.set(x, "servers", js.undefined)
      
      inline def setServersVarargs(value: Host*): Self = StObject.set(x, "servers", js.Array(value*))
      
      inline def setTransformWsUrl(value: (/* url */ String, IClientOptions, /* client */ MqttClient) => String): Self = StObject.set(x, "transformWsUrl", js.Any.fromFunction3(value))
      
      inline def setTransformWsUrlUndefined: Self = StObject.set(x, "transformWsUrl", js.undefined)
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
      
      inline def setWill(value: Payload): Self = StObject.set(x, "will", value.asInstanceOf[js.Any])
      
      inline def setWillUndefined: Self = StObject.set(x, "will", js.undefined)
      
      inline def setWsOptions(value: ClientOptions | ClientRequestArgs): Self = StObject.set(x, "wsOptions", value.asInstanceOf[js.Any])
      
      inline def setWsOptionsUndefined: Self = StObject.set(x, "wsOptions", js.undefined)
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
    
    inline def apply(): IClientPublishOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IClientPublishOptions]
    }
    
    extension [Self <: IClientPublishOptions](x: Self) {
      
      inline def setCbStorePut(value: () => Unit): Self = StObject.set(x, "cbStorePut", js.Any.fromFunction0(value))
      
      inline def setCbStorePutUndefined: Self = StObject.set(x, "cbStorePut", js.undefined)
      
      inline def setDup(value: Boolean): Self = StObject.set(x, "dup", value.asInstanceOf[js.Any])
      
      inline def setDupUndefined: Self = StObject.set(x, "dup", js.undefined)
      
      inline def setProperties(value: CorrelationData): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      inline def setQos(value: QoS): Self = StObject.set(x, "qos", value.asInstanceOf[js.Any])
      
      inline def setQosUndefined: Self = StObject.set(x, "qos", js.undefined)
      
      inline def setRetain(value: Boolean): Self = StObject.set(x, "retain", value.asInstanceOf[js.Any])
      
      inline def setRetainUndefined: Self = StObject.set(x, "retain", js.undefined)
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
    
    inline def apply(): IClientReconnectOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IClientReconnectOptions]
    }
    
    extension [Self <: IClientReconnectOptions](x: Self) {
      
      inline def setIncomingStore(value: Store): Self = StObject.set(x, "incomingStore", value.asInstanceOf[js.Any])
      
      inline def setIncomingStoreUndefined: Self = StObject.set(x, "incomingStore", js.undefined)
      
      inline def setOutgoingStore(value: Store): Self = StObject.set(x, "outgoingStore", value.asInstanceOf[js.Any])
      
      inline def setOutgoingStoreUndefined: Self = StObject.set(x, "outgoingStore", js.undefined)
    }
  }
  
  trait IClientSubscribeOptions extends StObject {
    
    /*
      * no local flag
      * */
    var nl: js.UndefOr[Boolean] = js.undefined
    
    /*
      *  MQTT 5.0 properies object of subscribe
      * */
    var properties: js.UndefOr[SubscriptionIdentifier] = js.undefined
    
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
    
    inline def apply(qos: QoS): IClientSubscribeOptions = {
      val __obj = js.Dynamic.literal(qos = qos.asInstanceOf[js.Any])
      __obj.asInstanceOf[IClientSubscribeOptions]
    }
    
    extension [Self <: IClientSubscribeOptions](x: Self) {
      
      inline def setNl(value: Boolean): Self = StObject.set(x, "nl", value.asInstanceOf[js.Any])
      
      inline def setNlUndefined: Self = StObject.set(x, "nl", js.undefined)
      
      inline def setProperties(value: SubscriptionIdentifier): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      inline def setQos(value: QoS): Self = StObject.set(x, "qos", value.asInstanceOf[js.Any])
      
      inline def setRap(value: Boolean): Self = StObject.set(x, "rap", value.asInstanceOf[js.Any])
      
      inline def setRapUndefined: Self = StObject.set(x, "rap", js.undefined)
      
      inline def setRh(value: Double): Self = StObject.set(x, "rh", value.asInstanceOf[js.Any])
      
      inline def setRhUndefined: Self = StObject.set(x, "rh", js.undefined)
    }
  }
  
  trait ISecureClientOptions extends StObject {
    
    /**
      * optional alpn's
      */
    var ALPNProtocols: js.UndefOr[
        (js.Array[Buffer | String | js.typedarray.Uint8Array]) | Buffer | js.typedarray.Uint8Array
      ] = js.undefined
    
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
    
    inline def apply(): ISecureClientOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISecureClientOptions]
    }
    
    extension [Self <: ISecureClientOptions](x: Self) {
      
      inline def setALPNProtocols(value: (js.Array[Buffer | String | js.typedarray.Uint8Array]) | Buffer | js.typedarray.Uint8Array): Self = StObject.set(x, "ALPNProtocols", value.asInstanceOf[js.Any])
      
      inline def setALPNProtocolsUndefined: Self = StObject.set(x, "ALPNProtocols", js.undefined)
      
      inline def setALPNProtocolsVarargs(value: (Buffer | String | js.typedarray.Uint8Array)*): Self = StObject.set(x, "ALPNProtocols", js.Array(value*))
      
      inline def setCa(value: String | (js.Array[Buffer | String]) | Buffer): Self = StObject.set(x, "ca", value.asInstanceOf[js.Any])
      
      inline def setCaUndefined: Self = StObject.set(x, "ca", js.undefined)
      
      inline def setCaVarargs(value: (Buffer | String)*): Self = StObject.set(x, "ca", js.Array(value*))
      
      inline def setCert(value: String | (js.Array[Buffer | String]) | Buffer): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
      
      inline def setCertUndefined: Self = StObject.set(x, "cert", js.undefined)
      
      inline def setCertVarargs(value: (Buffer | String)*): Self = StObject.set(x, "cert", js.Array(value*))
      
      inline def setKey(value: String | (js.Array[Buffer | js.Object | String]) | Buffer): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setKeyVarargs(value: (Buffer | js.Object | String)*): Self = StObject.set(x, "key", js.Array(value*))
      
      inline def setRejectUnauthorized(value: Boolean): Self = StObject.set(x, "rejectUnauthorized", value.asInstanceOf[js.Any])
      
      inline def setRejectUnauthorizedUndefined: Self = StObject.set(x, "rejectUnauthorized", js.undefined)
    }
  }
  
  type StorePutCallback = js.Function0[Unit]
}
