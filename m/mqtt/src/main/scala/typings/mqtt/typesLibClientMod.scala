package typings.mqtt

import org.scalablytyped.runtime.StringDictionary
import typings.mqtt.anon.Nl
import typings.mqtt.mqttStrings.close
import typings.mqtt.mqttStrings.connect
import typings.mqtt.mqttStrings.disconnect
import typings.mqtt.mqttStrings.end
import typings.mqtt.mqttStrings.error
import typings.mqtt.mqttStrings.message
import typings.mqtt.mqttStrings.offline
import typings.mqtt.mqttStrings.outgoingEmpty
import typings.mqtt.mqttStrings.packetreceive
import typings.mqtt.mqttStrings.packetsend
import typings.mqtt.mqttStrings.reconnect
import typings.mqtt.typesLibClientOptionsMod.IClientOptions
import typings.mqtt.typesLibClientOptionsMod.IClientPublishOptions
import typings.mqtt.typesLibClientOptionsMod.IClientReconnectOptions
import typings.mqtt.typesLibClientOptionsMod.IClientSubscribeOptions
import typings.mqtt.typesLibStoreMod.Store
import typings.mqttPacket.mod.IAuthPacket
import typings.mqttPacket.mod.IConnackPacket
import typings.mqttPacket.mod.IDisconnectPacket
import typings.mqttPacket.mod.IPublishPacket
import typings.mqttPacket.mod.Packet
import typings.mqttPacket.mod.QoS
import typings.node.bufferMod.global.Buffer
import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLibClientMod {
  
  @JSImport("mqtt/types/lib/client", "MqttClient")
  @js.native
  open class MqttClient protected () extends EventEmitter {
    def this(streamBuilder: js.Function1[/* client */ MqttClient, IStream], options: IClientOptions) = this()
    
    var connected: Boolean = js.native
    
    var disconnected: Boolean = js.native
    
    var disconnecting: Boolean = js.native
    
    /**
      * end - close connection
      *
      * @returns {MqttClient} this - for chaining
      * @param {Boolean} force - do not wait for all in-flight messages to be acked
      * @param {Object} opts - opts disconnect
      * @param {Function} cb - called when the client has been closed
      *
      * @api public
      */
    def end(): this.type = js.native
    def end(force: Boolean): this.type = js.native
    def end(force: Boolean, opts: js.Object): this.type = js.native
    def end(force: Boolean, opts: js.Object, cb: CloseCallback): this.type = js.native
    def end(force: Boolean, opts: Unit, cb: CloseCallback): this.type = js.native
    def end(force: Unit, opts: js.Object): this.type = js.native
    def end(force: Unit, opts: js.Object, cb: CloseCallback): this.type = js.native
    def end(force: Unit, opts: Unit, cb: CloseCallback): this.type = js.native
    
    /**
      * getLastMessageId
      */
    def getLastMessageId(): Double = js.native
    
    /**
      * Handle auth packages for MQTT 5 enhanced authentication methods such
      * as challenge response authentication.
      *
      * Challenge-response authentication flow would look something like this:
      *
      * --> CONNECT | authMethod = "mathChallenge" -->
      * <-- AUTH | authMethod = "mathChallenge", authData = "12 + 34" <--
      * --> AUTH | authMethod = "mathChallenge", authData = "46" -->
      * <-- CONNACK | reasonCode = SUCCESS <--
      *
      * This form of authentication has several advantages over traditional
      * credential-based approaches. For instance authentication without the direct
      * exchange of authentication secrets.
      *
      * @param packet the auth packet to handle
      * @param callback call when finished
      * @api public
      */
    def handleAuth(packet: IAuthPacket, callback: PacketCallback): Unit = js.native
    
    /**
      * Handle messages with backpressure support, one at a time.
      * Override at will.
      *
      * @param packet packet the packet
      * @param callback callback call when finished
      * @api public
      */
    def handleMessage(packet: Packet, callback: PacketCallback): Unit = js.native
    
    var incomingStore: Store = js.native
    
    def on(event: end | reconnect | offline | outgoingEmpty, cb: js.Function0[Unit]): this.type = js.native
    def on(event: packetsend | packetreceive, cb: OnPacketCallback): this.type = js.native
    def on(event: String, cb: js.Function): this.type = js.native
    @JSName("on")
    def on_close(event: close, cb: OnCloseCallback): this.type = js.native
    @JSName("on")
    def on_connect(event: connect, cb: OnConnectCallback): this.type = js.native
    @JSName("on")
    def on_disconnect(event: disconnect, cb: OnDisconnectCallback): this.type = js.native
    @JSName("on")
    def on_error(event: error, cb: OnErrorCallback): this.type = js.native
    @JSName("on")
    def on_message(event: message, cb: OnMessageCallback): this.type = js.native
    
    def once(event: end | reconnect | offline | outgoingEmpty, cb: js.Function0[Unit]): this.type = js.native
    def once(event: packetsend | packetreceive, cb: OnPacketCallback): this.type = js.native
    def once(event: String, cb: js.Function): this.type = js.native
    @JSName("once")
    def once_close(event: close, cb: OnCloseCallback): this.type = js.native
    @JSName("once")
    def once_connect(event: connect, cb: OnConnectCallback): this.type = js.native
    @JSName("once")
    def once_disconnect(event: disconnect, cb: OnDisconnectCallback): this.type = js.native
    @JSName("once")
    def once_error(event: error, cb: OnErrorCallback): this.type = js.native
    @JSName("once")
    def once_message(event: message, cb: OnMessageCallback): this.type = js.native
    
    var options: IClientOptions = js.native
    
    var outgoingStore: Store = js.native
    
    def publish(topic: String, message: String): this.type = js.native
    def publish(topic: String, message: String, callback: PacketCallback): this.type = js.native
    /**
      * publish - publish <message> to <topic>
      *
      * @param {String} topic - topic to publish to
      * @param {(String|Buffer)} message - message to publish
      *
      * @param {Object}    [opts] - publish options, includes:
      *   @param {Number}  [opts.qos] - qos level to publish on
      *   @param {Boolean} [opts.retain] - whether or not to retain the message
      *   @param {Function}[opts.cbStorePut] - function(){}
      *       called when message is put into `outgoingStore`
      *
      * @param {Function} [callback] - function(err){}
      *    called when publish succeeds or fails
      *
      * @returns {Client} this - for chaining
      * @api public
      *
      * @example client.publish('topic', 'message')
      * @example
      *     client.publish('topic', 'message', {qos: 1, retain: true})
      * @example client.publish('topic', 'message', console.log)
      */
    def publish(topic: String, message: String, opts: IClientPublishOptions): this.type = js.native
    def publish(topic: String, message: String, opts: IClientPublishOptions, callback: PacketCallback): this.type = js.native
    def publish(topic: String, message: Buffer): this.type = js.native
    def publish(topic: String, message: Buffer, callback: PacketCallback): this.type = js.native
    def publish(topic: String, message: Buffer, opts: IClientPublishOptions): this.type = js.native
    def publish(topic: String, message: Buffer, opts: IClientPublishOptions, callback: PacketCallback): this.type = js.native
    
    var queueQoSZero: Boolean = js.native
    
    /**
      * reconnect - connect again using the same options as connect()
      *
      * @param {Object} [opts] - optional reconnect options, includes:
      *    {Store} incomingStore - a store for the incoming packets
      *    {Store} outgoingStore - a store for the outgoing packets
      *    if opts is not given, current stores are used
      *
      * @returns {MqttClient} this - for chaining
      *
      * @api public
      */
    def reconnect(): this.type = js.native
    def reconnect(opts: IClientReconnectOptions): this.type = js.native
    
    var reconnecting: Boolean = js.native
    
    /**
      * removeOutgoingMessage - remove a message in outgoing store
      * the outgoing callback will be called withe Error('Message removed') if the message is removed
      *
      * @param {Number} mid - messageId to remove message
      * @returns {MqttClient} this - for chaining
      * @api public
      *
      * @example client.removeOutgoingMessage(client.getLastMessageId());
      */
    def removeOutgoingMessage(mid: Double): this.type = js.native
    
    def subscribe(topic: String): this.type = js.native
    def subscribe(topic: String, callback: ClientSubscribeCallback): this.type = js.native
    /**
      * subscribe - subscribe to <topic>
      *
      * @param {String, Array, Object} topic - topic(s) to subscribe to, supports objects in the form {'topic': qos}
      * @param {Object} [opts] - optional subscription options, includes:
      * @param  {Number} [opts.qos] - subscribe qos level
      * @param {Function} [callback] - function(err, granted){} where:
      *    {Error} err - subscription error (none at the moment!)
      *    {Array} granted - array of {topic: 't', qos: 0}
      * @returns {MqttClient} this - for chaining
      * @api public
      * @example client.subscribe('topic')
      * @example client.subscribe('topic', {qos: 1})
      * @example client.subscribe({'topic': 0, 'topic2': 1}, console.log)
      * @example client.subscribe('topic', console.log)
      */
    def subscribe(topic: String, opts: IClientSubscribeOptions): this.type = js.native
    def subscribe(topic: String, opts: IClientSubscribeOptions, callback: ClientSubscribeCallback): this.type = js.native
    def subscribe(topic: js.Array[String]): this.type = js.native
    def subscribe(topic: js.Array[String], callback: ClientSubscribeCallback): this.type = js.native
    def subscribe(topic: js.Array[String], opts: IClientSubscribeOptions): this.type = js.native
    def subscribe(topic: js.Array[String], opts: IClientSubscribeOptions, callback: ClientSubscribeCallback): this.type = js.native
    def subscribe(topic: ISubscriptionMap): this.type = js.native
    def subscribe(topic: ISubscriptionMap, callback: ClientSubscribeCallback): this.type = js.native
    
    /**
      * unsubscribe - unsubscribe from topic(s)
      *
      * @param {String, Array} topic - topics to unsubscribe from
      * @param {Object} opts - opts of unsubscribe
      * @param {Function} [callback] - callback fired on unsuback
      * @returns {MqttClient} this - for chaining
      * @api public
      * @example client.unsubscribe('topic')
      * @example client.unsubscribe('topic', console.log)
      * @example client.unsubscribe('topic', opts, console.log)
      */
    def unsubscribe(topic: String): this.type = js.native
    def unsubscribe(topic: String, opts: js.Object): this.type = js.native
    def unsubscribe(topic: String, opts: js.Object, callback: PacketCallback): this.type = js.native
    def unsubscribe(topic: String, opts: Unit, callback: PacketCallback): this.type = js.native
    def unsubscribe(topic: js.Array[String]): this.type = js.native
    def unsubscribe(topic: js.Array[String], opts: js.Object): this.type = js.native
    def unsubscribe(topic: js.Array[String], opts: js.Object, callback: PacketCallback): this.type = js.native
    def unsubscribe(topic: js.Array[String], opts: Unit, callback: PacketCallback): this.type = js.native
  }
  
  type ClientSubscribeCallback = js.Function2[/* err */ js.Error, /* granted */ js.Array[ISubscriptionGrant], Unit]
  
  type CloseCallback = js.Function1[/* error */ js.UndefOr[js.Error], Unit]
  
  @js.native
  trait IStream extends EventEmitter {
    
    def destroy(): Any = js.native
    
    def end(): Any = js.native
    
    def pipe(to: Any): Any = js.native
  }
  
  trait ISubscriptionGrant extends StObject {
    
    /*
      * no local flag
      * */
    var nl: js.UndefOr[Boolean] = js.undefined
    
    /**
      *  is the granted qos level on it, may return 128 on error
      */
    var qos: QoS | Double
    
    /*
      * Retain As Published flag
      * */
    var rap: js.UndefOr[Boolean] = js.undefined
    
    /*
      * Retain Handling option
      * */
    var rh: js.UndefOr[Double] = js.undefined
    
    /**
      *  is a subscribed to topic
      */
    var topic: String
  }
  object ISubscriptionGrant {
    
    inline def apply(qos: QoS | Double, topic: String): ISubscriptionGrant = {
      val __obj = js.Dynamic.literal(qos = qos.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISubscriptionGrant]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ISubscriptionGrant] (val x: Self) extends AnyVal {
      
      inline def setNl(value: Boolean): Self = StObject.set(x, "nl", value.asInstanceOf[js.Any])
      
      inline def setNlUndefined: Self = StObject.set(x, "nl", js.undefined)
      
      inline def setQos(value: QoS | Double): Self = StObject.set(x, "qos", value.asInstanceOf[js.Any])
      
      inline def setRap(value: Boolean): Self = StObject.set(x, "rap", value.asInstanceOf[js.Any])
      
      inline def setRapUndefined: Self = StObject.set(x, "rap", js.undefined)
      
      inline def setRh(value: Double): Self = StObject.set(x, "rh", value.asInstanceOf[js.Any])
      
      inline def setRhUndefined: Self = StObject.set(x, "rh", js.undefined)
      
      inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    }
  }
  
  type ISubscriptionMap = /**
    * object which has topic names as object keys and as value the options, like {'test1': {qos: 0}, 'test2': {qos: 2}}.
    */
  StringDictionary[Nl]
  
  trait ISubscriptionRequest extends StObject {
    
    /*
      * no local flag
      * */
    var nl: js.UndefOr[Boolean] = js.undefined
    
    /**
      *  is the granted qos level on it
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
    
    /**
      *  is a subscribed to topic
      */
    var topic: String
  }
  object ISubscriptionRequest {
    
    inline def apply(qos: QoS, topic: String): ISubscriptionRequest = {
      val __obj = js.Dynamic.literal(qos = qos.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISubscriptionRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ISubscriptionRequest] (val x: Self) extends AnyVal {
      
      inline def setNl(value: Boolean): Self = StObject.set(x, "nl", value.asInstanceOf[js.Any])
      
      inline def setNlUndefined: Self = StObject.set(x, "nl", js.undefined)
      
      inline def setQos(value: QoS): Self = StObject.set(x, "qos", value.asInstanceOf[js.Any])
      
      inline def setRap(value: Boolean): Self = StObject.set(x, "rap", value.asInstanceOf[js.Any])
      
      inline def setRapUndefined: Self = StObject.set(x, "rap", js.undefined)
      
      inline def setRh(value: Double): Self = StObject.set(x, "rh", value.asInstanceOf[js.Any])
      
      inline def setRhUndefined: Self = StObject.set(x, "rh", js.undefined)
      
      inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    }
  }
  
  type OnCloseCallback = js.Function0[Unit]
  
  type OnConnectCallback = js.Function1[/* packet */ IConnackPacket, Unit]
  
  type OnDisconnectCallback = js.Function1[/* packet */ IDisconnectPacket, Unit]
  
  type OnErrorCallback = js.Function1[/* error */ js.Error, Unit]
  
  type OnMessageCallback = js.Function3[/* topic */ String, /* payload */ Buffer, /* packet */ IPublishPacket, Unit]
  
  type OnPacketCallback = js.Function1[/* packet */ Packet, Unit]
  
  type PacketCallback = js.Function2[/* error */ js.UndefOr[js.Error], /* packet */ js.UndefOr[Packet], Any]
}
