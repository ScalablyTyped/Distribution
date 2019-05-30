package typings
package mqttLib.typesLibClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mqtt/types/lib/client", "MqttClient")
@js.native
class MqttClient protected ()
  extends nodeLib.eventsMod.EventEmitter {
  def this(streamBuilder: js.Function1[/* client */ MqttClient, IStream], options: mqttLib.typesLibClientDashOptionsMod.IClientOptions) = this()
  var connected: scala.Boolean = js.native
  var disconnected: scala.Boolean = js.native
  var disconnecting: scala.Boolean = js.native
  var incomingStore: mqttLib.typesLibStoreMod.Store = js.native
  var options: mqttLib.typesLibClientDashOptionsMod.IClientOptions = js.native
  var outgoingStore: mqttLib.typesLibStoreMod.Store = js.native
  var queueQoSZero: scala.Boolean = js.native
  var reconnecting: scala.Boolean = js.native
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
  def end(force: scala.Boolean): this.type = js.native
  def end(force: scala.Boolean, opts: js.Object): this.type = js.native
  def end(force: scala.Boolean, opts: js.Object, cb: CloseCallback): this.type = js.native
  /**
    * getLastMessageId
    */
  def getLastMessageId(): scala.Double = js.native
  /**
    * Handle messages with backpressure support, one at a time.
    * Override at will.
    *
    * @param packet packet the packet
    * @param callback callback call when finished
    * @api public
    */
  def handleMessage(packet: mqttDashPacketLib.mqttDashPacketMod.Packet, callback: PacketCallback): scala.Unit = js.native
  def on(event: java.lang.String, cb: js.Function): this.type = js.native
  @JSName("on")
  def on_error(event: mqttLib.mqttLibStrings.error, cb: OnErrorCallback): this.type = js.native
  @JSName("on")
  def on_message(event: mqttLib.mqttLibStrings.message, cb: OnMessageCallback): this.type = js.native
  @JSName("on")
  def on_packetreceive(event: mqttLib.mqttLibStrings.packetreceive, cb: OnPacketCallback): this.type = js.native
  @JSName("on")
  def on_packetsend(event: mqttLib.mqttLibStrings.packetsend, cb: OnPacketCallback): this.type = js.native
  def once(event: java.lang.String, cb: js.Function): this.type = js.native
  @JSName("once")
  def once_error(event: mqttLib.mqttLibStrings.error, cb: OnErrorCallback): this.type = js.native
  @JSName("once")
  def once_message(event: mqttLib.mqttLibStrings.message, cb: OnMessageCallback): this.type = js.native
  @JSName("once")
  def once_packetreceive(event: mqttLib.mqttLibStrings.packetreceive, cb: OnPacketCallback): this.type = js.native
  @JSName("once")
  def once_packetsend(event: mqttLib.mqttLibStrings.packetsend, cb: OnPacketCallback): this.type = js.native
  def publish(topic: java.lang.String, message: java.lang.String): this.type = js.native
  def publish(topic: java.lang.String, message: java.lang.String, callback: PacketCallback): this.type = js.native
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
  def publish(
    topic: java.lang.String,
    message: java.lang.String,
    opts: mqttLib.typesLibClientDashOptionsMod.IClientPublishOptions
  ): this.type = js.native
  def publish(
    topic: java.lang.String,
    message: java.lang.String,
    opts: mqttLib.typesLibClientDashOptionsMod.IClientPublishOptions,
    callback: PacketCallback
  ): this.type = js.native
  def publish(topic: java.lang.String, message: nodeLib.Buffer): this.type = js.native
  def publish(topic: java.lang.String, message: nodeLib.Buffer, callback: PacketCallback): this.type = js.native
  def publish(
    topic: java.lang.String,
    message: nodeLib.Buffer,
    opts: mqttLib.typesLibClientDashOptionsMod.IClientPublishOptions
  ): this.type = js.native
  def publish(
    topic: java.lang.String,
    message: nodeLib.Buffer,
    opts: mqttLib.typesLibClientDashOptionsMod.IClientPublishOptions,
    callback: PacketCallback
  ): this.type = js.native
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
  def reconnect(opts: mqttLib.typesLibClientDashOptionsMod.IClientReconnectOptions): this.type = js.native
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
  def removeOutgoingMessage(mid: scala.Double): this.type = js.native
  def subscribe(topic: java.lang.String): this.type = js.native
  def subscribe(topic: java.lang.String, callback: ClientSubscribeCallback): this.type = js.native
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
  def subscribe(topic: java.lang.String, opts: mqttLib.typesLibClientDashOptionsMod.IClientSubscribeOptions): this.type = js.native
  def subscribe(
    topic: java.lang.String,
    opts: mqttLib.typesLibClientDashOptionsMod.IClientSubscribeOptions,
    callback: ClientSubscribeCallback
  ): this.type = js.native
  def subscribe(topic: js.Array[java.lang.String]): this.type = js.native
  def subscribe(topic: js.Array[java.lang.String], callback: ClientSubscribeCallback): this.type = js.native
  def subscribe(
    topic: js.Array[java.lang.String],
    opts: mqttLib.typesLibClientDashOptionsMod.IClientSubscribeOptions
  ): this.type = js.native
  def subscribe(
    topic: js.Array[java.lang.String],
    opts: mqttLib.typesLibClientDashOptionsMod.IClientSubscribeOptions,
    callback: ClientSubscribeCallback
  ): this.type = js.native
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
  def unsubscribe(topic: java.lang.String): this.type = js.native
  def unsubscribe(topic: java.lang.String, opts: js.Object): this.type = js.native
  def unsubscribe(topic: java.lang.String, opts: js.Object, callback: PacketCallback): this.type = js.native
  def unsubscribe(topic: js.Array[java.lang.String]): this.type = js.native
  def unsubscribe(topic: js.Array[java.lang.String], opts: js.Object): this.type = js.native
  def unsubscribe(topic: js.Array[java.lang.String], opts: js.Object, callback: PacketCallback): this.type = js.native
}

