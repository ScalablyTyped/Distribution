package typings.pahoMqtt.mod.global.Paho.MQTT

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The JavaScript application communicates to the server using a {@link Paho.MQTT.Client} object.
  *
  * Most applications will create just one Client object and then call its connect() method,
  * however applications can create more than one Client object if they wish.
  * In this case the combination of host, port and clientId attributes must be different for each Client object.
  *
  * The send, subscribe and unsubscribe methods are implemented as asynchronous JavaScript methods
  * (even though the underlying protocol exchange might be synchronous in nature).
  * This means they signal their completion by calling back to the application,
  * via Success or Failure callback functions provided by the application on the method in question.
  * Such callbacks are called at most once per method invocation and do not persist beyond the lifetime
  * of the script that made the invocation.
  *
  * In contrast there are some callback functions, most notably {@link onMessageArrived},
  * that are defined on the {@link Paho.MQTT.Client} object.
  * These may get called multiple times, and aren't directly related to specific method invocations made by the
  * client.
  *
  */
@JSGlobal("Paho.MQTT.Client")
@js.native
class Client protected () extends js.Object {
  /**
    * @param hostUri - the address of the messaging server as a fully qualified WebSocket URI
    * @param clientId - the Messaging client identifier, between 1 and 23 characters in length.
    */
  def this(hostUri: String, clientId: String) = this()
   // tslint:disable-line unified-signatures (these cannot actually be neatly unified)
  /**
    * @param host - the address of the messaging server as a DNS name or dotted decimal IP address.
    * @param port - the port number to connect to
    * @param clientId - the Messaging client identifier, between 1 and 23 characters in length.
    */
  def this(host: String, port: Double, clientId: String) = this()
  /**
    * @param host - the address of the messaging server as a DNS name or dotted decimal IP address.
    * @param port - the port number to connect to
    * @param path - the path on the host to connect to - only used if host is not a URI. Default: '/mqtt'.
    * @param clientId - the Messaging client identifier, between 1 and 23 characters in length.
    */
  def this(host: String, port: Double, path: String, clientId: String) = this()
  /** used when connecting to the server. */
  val clientId: String = js.native
  /** the server's DNS hostname or dotted decimal IP address. */
  val host: String = js.native
  /**
    * called when a connection has been lost. after a connect() method has succeeded.
    * Establish the call back used when a connection has been lost. The connection may be
    * lost because the client initiates a disconnect or because the server or network
    * cause the client to be disconnected. The disconnect call back may be called without
    * the connectionComplete call back being invoked if, for example the client fails to
    * connect.
    * A single response object parameter is passed to the onConnectionLost callback containing the following
    * fields:
    * <li>errorCode
    * <li>errorMessage
    */
  @JSName("onConnectionLost")
  var onConnectionLost_Original: OnConnectionLostHandler = js.native
  /**
    * called when a message has arrived in this Paho.MQTT.client.
    * Parameters passed to the onMessageArrived callback are:
    * <li> {@link Paho.MQTT.Message} that has arrived.
    */
  @JSName("onMessageArrived")
  var onMessageArrived_Original: OnMessageHandler = js.native
  /**
    * called when a message has been delivered.
    * All processing that this Client will ever do has been completed. So, for example,
    * in the case of a Qos=2 message sent by this client, the PubComp flow has been received from the server
    * and the message has been removed from persistent storage before this callback is invoked.
    * Parameters passed to the onMessageDelivered callback are:
    * <li>{@link Paho.MQTT.Message} that was delivered.
    */
  @JSName("onMessageDelivered")
  var onMessageDelivered_Original: OnMessageHandler = js.native
  /** the server's path. */
  val path: String = js.native
  /** the server's port. */
  val port: Double = js.native
  /** function called with trace information, if set */
  var trace: js.UndefOr[TraceFunction] = js.native
  /**
    * Connect this Messaging client to its server.
    * @throws {InvalidState} if the client is not in disconnected state. The client must have received
    *      connectionLost or disconnected before calling connect for a second or subsequent time.
    */
  def connect(): Unit = js.native
  def connect(connectionOptions: ConnectionOptions): Unit = js.native
  /**
    * Normal disconnect of this Messaging client from its server.
    *
    * @throws {InvalidState} if the client is already disconnected.
    */
  def disconnect(): Unit = js.native
  /**
    * Get the contents of the trace log.
    *
    *  @return tracebuffer containing the time ordered trace records.
    */
  def getTraceLog(): js.Array[_] = js.native
  /**
    * @returns True if the client is currently connected
    */
  def isConnected(): Boolean = js.native
  /**
    * called when a connection has been lost. after a connect() method has succeeded.
    * Establish the call back used when a connection has been lost. The connection may be
    * lost because the client initiates a disconnect or because the server or network
    * cause the client to be disconnected. The disconnect call back may be called without
    * the connectionComplete call back being invoked if, for example the client fails to
    * connect.
    * A single response object parameter is passed to the onConnectionLost callback containing the following
    * fields:
    * <li>errorCode
    * <li>errorMessage
    */
  def onConnectionLost(error: MQTTError): Unit = js.native
  /**
    * called when a message has arrived in this Paho.MQTT.client.
    * Parameters passed to the onMessageArrived callback are:
    * <li> {@link Paho.MQTT.Message} that has arrived.
    */
  def onMessageArrived(message: Message): Unit = js.native
  /**
    * called when a message has been delivered.
    * All processing that this Client will ever do has been completed. So, for example,
    * in the case of a Qos=2 message sent by this client, the PubComp flow has been received from the server
    * and the message has been removed from persistent storage before this callback is invoked.
    * Parameters passed to the onMessageDelivered callback are:
    * <li>{@link Paho.MQTT.Message} that was delivered.
    */
  def onMessageDelivered(message: Message): Unit = js.native
  /**
    * Send a message to the consumers of the destination in the Message.
    *
    * @param message - <b>mandatory</b> The {@link Paho.MQTT.Message} object to be sent.
    * @throws {InvalidState} if the client is not connected.
    */
  def send(message: Message): Unit = js.native
  /**
    * Send a message to the consumers of the destination in the Message.
    *
    * @param topic - <b>mandatory</b> The name of the destination to which the message is to be sent.
    * @param payload - The message data to be sent.
    * @param qos The Quality of Service used to deliver the message.
    *        <dl>
    *            <dt>0 Best effort (default).
    *            <dt>1 At least once.
    *            <dt>2 Exactly once.
    *        </dl>
    * @param retained If true, the message is to be retained by the server and delivered to both
    * current and future subscriptions. If false the server only delivers the message to current subscribers,
    * this is the default for new Messages. A received message has the retained boolean set to true if the
    * message was published with the retained boolean set to true and the subscrption was made after the
    * message has been published.
    * @throws {InvalidState} if the client is not connected.
    */
  def send(topic: String, payload: String): Unit = js.native
  def send(topic: String, payload: String, qos: js.UndefOr[scala.Nothing], retained: Boolean): Unit = js.native
  def send(topic: String, payload: String, qos: Qos): Unit = js.native
  def send(topic: String, payload: String, qos: Qos, retained: Boolean): Unit = js.native
  def send(topic: String, payload: ArrayBuffer): Unit = js.native
  def send(topic: String, payload: ArrayBuffer, qos: js.UndefOr[scala.Nothing], retained: Boolean): Unit = js.native
  def send(topic: String, payload: ArrayBuffer, qos: Qos): Unit = js.native
  def send(topic: String, payload: ArrayBuffer, qos: Qos, retained: Boolean): Unit = js.native
  /**
    * Start tracing.
    */
  def startTrace(): Unit = js.native
  /**
    * Stop tracing.
    */
  def stopTrace(): Unit = js.native
  /**
    * Subscribe for messages, request receipt of a copy of messages sent to the destinations described by the
    * filter.
    *
    * @param filter A filter describing the destinations to receive messages from.
    * @param subcribeOptions Used to control the subscription
    * @throws {InvalidState} if the client is not in connected state.
    */
  def subscribe(filter: String): Unit = js.native
  def subscribe(filter: String, subcribeOptions: SubscribeOptions): Unit = js.native
  /**
    * Unsubscribe for messages, stop receiving messages sent to destinations described by the filter.
    *
    * @param filter - describing the destinations to receive messages from.
    * @param unsubscribeOptions - used to control the subscription
    * @throws {InvalidState} if the client is not in connected state.
    */
  def unsubscribe(filter: String): Unit = js.native
  def unsubscribe(filter: String, unsubcribeOptions: UnsubscribeOptions): Unit = js.native
}

