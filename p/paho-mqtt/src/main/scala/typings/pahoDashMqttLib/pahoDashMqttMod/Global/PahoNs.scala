package typings
package pahoDashMqttLib.pahoDashMqttMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Paho")
@js.native
object PahoNs extends js.Object {
  /**
    * Send and receive messages using web browsers.
    * <p>
    * This programming interface lets a JavaScript client application use the MQTT V3.1 or
    * V3.1.1 protocol to connect to an MQTT-supporting messaging server.
    *
    * The function supported includes:
    * <ol>
    * <li>Connecting to and disconnecting from a server. The server is identified by its host name and port number.
    * <li>Specifying options that relate to the communications link with the server,
    * for example the frequency of keep-alive heartbeats, and whether SSL/TLS is required.
    * <li>Subscribing to and receiving messages from MQTT Topics.
    * <li>Publishing messages to MQTT Topics.
    * </ol>
    * <p>
    * The API consists of two main objects:
    * <dl>
    * <dt><b>{@link Paho.MQTT.Client}</b></dt>
    * <dd>This contains methods that provide the functionality of the API,
    * including provision of callbacks that notify the application when a message
    * arrives from or is delivered to the messaging server,
    * or when the status of its connection to the messaging server changes.</dd>
    * <dt><b>{@link Paho.MQTT.Message}</b></dt>
    * <dd>This encapsulates the payload of the message along with various attributes
    * associated with its delivery, in particular the destination to which it has
    * been (or is about to be) sent.</dd>
    * </dl>
    * <p>
    * The programming interface validates parameters passed to it, and will throw
    * an Error containing an error message intended for developer use, if it detects
    * an error with any parameter.
    * <p>
    */
  @JSName("MQTT")
  @js.native
  object MQTTNs extends js.Object {
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
    @js.native
    class Client protected () extends js.Object {
      /**
        * @param hostUri - the address of the messaging server as a fully qualified WebSocket URI
        * @param clientId - the Messaging client identifier, between 1 and 23 characters in length.
        */
      def this(hostUri: java.lang.String, clientId: java.lang.String) = this()
       // tslint:disable-line unified-signatures (these cannot actually be neatly unified)
      /**
        * @param host - the address of the messaging server as a DNS name or dotted decimal IP address.
        * @param port - the port number to connect to
        * @param clientId - the Messaging client identifier, between 1 and 23 characters in length.
        */
      def this(host: java.lang.String, port: scala.Double, clientId: java.lang.String) = this()
      /**
        * @param host - the address of the messaging server as a DNS name or dotted decimal IP address.
        * @param port - the port number to connect to
        * @param path - the path on the host to connect to - only used if host is not a URI. Default: '/mqtt'.
        * @param clientId - the Messaging client identifier, between 1 and 23 characters in length.
        */
      def this(host: java.lang.String, port: scala.Double, path: java.lang.String, clientId: java.lang.String) = this()
      /** used when connecting to the server. */
      val clientId: java.lang.String = js.native
      /** the server's DNS hostname or dotted decimal IP address. */
      val host: java.lang.String = js.native
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
      val path: java.lang.String = js.native
      /** the server's port. */
      val port: scala.Double = js.native
      /** function called with trace information, if set */
      var trace: js.UndefOr[TraceFunction] = js.native
      /**
        * Connect this Messaging client to its server.
        * @throws {InvalidState} if the client is not in disconnected state. The client must have received
        *      connectionLost or disconnected before calling connect for a second or subsequent time.
        */
      def connect(): scala.Unit = js.native
      def connect(connectionOptions: ConnectionOptions): scala.Unit = js.native
      /**
        * Normal disconnect of this Messaging client from its server.
        *
        * @throws {InvalidState} if the client is already disconnected.
        */
      def disconnect(): scala.Unit = js.native
      /**
        * Get the contents of the trace log.
        *
        *  @return tracebuffer containing the time ordered trace records.
        */
      def getTraceLog(): js.Array[_] = js.native
      /**
        * @returns True if the client is currently connected
        */
      def isConnected(): scala.Boolean = js.native
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
      def onConnectionLost(error: MQTTError): scala.Unit = js.native
      /**
        * called when a message has arrived in this Paho.MQTT.client.
        * Parameters passed to the onMessageArrived callback are:
        * <li> {@link Paho.MQTT.Message} that has arrived.
        */
      def onMessageArrived(message: Message): scala.Unit = js.native
      /**
        * called when a message has been delivered.
        * All processing that this Client will ever do has been completed. So, for example,
        * in the case of a Qos=2 message sent by this client, the PubComp flow has been received from the server
        * and the message has been removed from persistent storage before this callback is invoked.
        * Parameters passed to the onMessageDelivered callback are:
        * <li>{@link Paho.MQTT.Message} that was delivered.
        */
      def onMessageDelivered(message: Message): scala.Unit = js.native
      /**
        * Send a message to the consumers of the destination in the Message.
        *
        * @param message - <b>mandatory</b> The {@link Paho.MQTT.Message} object to be sent.
        * @throws {InvalidState} if the client is not connected.
        */
      def send(message: Message): scala.Unit = js.native
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
      def send(topic: java.lang.String, payload: java.lang.String): scala.Unit = js.native
      def send(topic: java.lang.String, payload: java.lang.String, qos: Qos): scala.Unit = js.native
      def send(topic: java.lang.String, payload: java.lang.String, qos: Qos, retained: scala.Boolean): scala.Unit = js.native
      def send(topic: java.lang.String, payload: stdLib.ArrayBuffer): scala.Unit = js.native
      def send(topic: java.lang.String, payload: stdLib.ArrayBuffer, qos: Qos): scala.Unit = js.native
      def send(topic: java.lang.String, payload: stdLib.ArrayBuffer, qos: Qos, retained: scala.Boolean): scala.Unit = js.native
      /**
        * Start tracing.
        */
      def startTrace(): scala.Unit = js.native
      /**
        * Stop tracing.
        */
      def stopTrace(): scala.Unit = js.native
      /**
        * Subscribe for messages, request receipt of a copy of messages sent to the destinations described by the
        * filter.
        *
        * @param filter A filter describing the destinations to receive messages from.
        * @param subcribeOptions Used to control the subscription
        * @throws {InvalidState} if the client is not in connected state.
        */
      def subscribe(filter: java.lang.String): scala.Unit = js.native
      def subscribe(filter: java.lang.String, subcribeOptions: SubscribeOptions): scala.Unit = js.native
      /**
        * Unsubscribe for messages, stop receiving messages sent to destinations described by the filter.
        *
        * @param filter - describing the destinations to receive messages from.
        * @param unsubscribeOptions - used to control the subscription
        * @throws {InvalidState} if the client is not in connected state.
        */
      def unsubscribe(filter: java.lang.String): scala.Unit = js.native
      def unsubscribe(filter: java.lang.String, unsubcribeOptions: UnsubscribeOptions): scala.Unit = js.native
    }
    
    /**
      * Attributes used with a connection.
      */
    trait ConnectionOptions extends js.Object {
      /**
        * If true(default) the client and server persistent state is deleted on successful connect.
        * @default true
        */
      var cleanSession: js.UndefOr[scala.Boolean] = js.undefined
      /**
        * If present this contains either a set of hostnames or fully qualified
        * WebSocket URIs (ws://example.com:1883/mqtt), that are tried in order in place of the host and port
        * paramater on the construtor. The hosts are tried one at at time in order until one of then succeeds.
        */
      var hosts: js.UndefOr[js.Array[java.lang.String]] = js.undefined
      /** Passed to the onSuccess callback or onFailure callback. */
      var invocationContext: js.UndefOr[js.Any] = js.undefined
      /**
        * The server disconnects this client if there is no activity for this number of seconds.
        * @default The default value of 60 seconds is assumed if not set.
        */
      var keepAliveInterval: js.UndefOr[scala.Double] = js.undefined
      /**
        * Specifies the mqtt version to use when connecting
        * <dl>
        *     <dt>3 - MQTT 3.1</dt>
        *     <dt>4 - MQTT 3.1.1 (default)</dt>
        * </dl>
        * @default 4
        */
      var mqttVersion: js.UndefOr[
            pahoDashMqttLib.pahoDashMqttLibNumbers.`3` | pahoDashMqttLib.pahoDashMqttLibNumbers.`4`
          ] = js.undefined
      /**
        * Called when the connect request has failed or timed out.
        */
      var onFailure: js.UndefOr[OnFailureCallback] = js.undefined
      /**
        * Called when the connect acknowledgement has been received from the server.
        */
      var onSuccess: js.UndefOr[OnSuccessCallback] = js.undefined
      /** Authentication password for this connection. */
      var password: js.UndefOr[java.lang.String] = js.undefined
      /**
        * If present the set of ports matching the hosts. If hosts contains URIs, this property is not used.
        */
      var ports: js.UndefOr[js.Array[scala.Double]] = js.undefined
      /**
        * If the connect has not succeeded within this number of seconds, it is deemed to have failed.
        * @default The default is 30 seconds.
        */
      var timeout: js.UndefOr[scala.Double] = js.undefined
      /** If present and true, use an SSL Websocket connection. */
      var useSSL: js.UndefOr[scala.Boolean] = js.undefined
      /** Authentication username for this connection. */
      var userName: js.UndefOr[java.lang.String] = js.undefined
      /** Sent by the server when the client disconnects abnormally. */
      var willMessage: js.UndefOr[Message] = js.undefined
    }
    
    trait ErrorWithInvocationContext
      extends MQTTError
         with WithInvocationContext
    
    trait MQTTError extends js.Object {
      /** A number indicating the nature of the error. */
      var errorCode: scala.Double
      /** Text describing the error */
      var errorMessage: java.lang.String
    }
    
    /**
      * An application message, sent or received.
      */
    @js.native
    class Message protected () extends js.Object {
      /**
        * @param payload The message data to be sent.
        */
      def this(payload: java.lang.String) = this()
      def this(payload: TypedArray) = this()
      def this(payload: stdLib.ArrayBuffer) = this()
      /**
        * The name of the destination to which the message is to be sent
        * (for messages about to be sent) or the name of the destination from which the message has been received.
        * (for messages received by the onMessage function).
        */
      var destinationName: java.lang.String = js.native
      /**
        * If true, this message might be a duplicate of one which has already been received.
        * This is only set on messages received from the server.
        */
      val duplicate: scala.Boolean = js.native
      /**
        * The payload.
        * @return if payload is a string. Return the original otherwise.
        */
      val payloadBytes: stdLib.ArrayBuffer | TypedArray = js.native
      /**
        *  The payload as a string if the payload consists of valid UTF-8 characters.
        *  @throw {Error} if the payload is not valid UTF-8
        */
      val payloadString: java.lang.String = js.native
      /**
        * The Quality of Service used to deliver the message.
        * <dl>
        *     <dt>0 Best effort (default).
        *     <dt>1 At least once.
        *     <dt>2 Exactly once.
        * </dl>
        *
        * @default 0
        */
      var qos: Qos = js.native
      /**
        * If true, the message is to be retained by the server and delivered to both current and future
        * subscriptions. If false the server only delivers the message to current subscribers, this is the default
        * for new Messages. A received message has the retained boolean set to true if the message was published
        * with the retained boolean set to true and the subscription was made after the message has been published.
        *
        * @default false
        */
      var retained: scala.Boolean = js.native
    }
    
    trait OnSubscribeSuccessParams extends WithInvocationContext {
      var grantedQos: Qos
    }
    
    /**
      * The Quality of Service used to deliver a message.
      * <dl>
      *    <dt>0 Best effort (default).</dt>
      *    <dt>1 At least once.</dt>
      *    <dt>2 Exactly once.</dt>
      * </dl>
      */
    /* Rewritten from type alias, can be one of: 
      - pahoDashMqttLib.pahoDashMqttLibNumbers.`0`
      - pahoDashMqttLib.pahoDashMqttLibNumbers.`1`
      - pahoDashMqttLib.pahoDashMqttLibNumbers.`2`
    */
    trait Qos extends js.Object
    
    /**
      * Used to control a subscription
      */
    trait SubscribeOptions extends js.Object {
      /** passed to the onSuccess callback or onFailure callback. */
      var invocationContext: js.UndefOr[js.Any] = js.undefined
      /** called when the subscribe request has failed or timed out. */
      var onFailure: js.UndefOr[OnFailureCallback] = js.undefined
      /** called when the subscribe acknowledgement has been received from the server. */
      var onSuccess: js.UndefOr[OnSubscribeSuccessCallback] = js.undefined
      /** the maximum qos of any publications sent as a result of making this subscription. */
      var qos: js.UndefOr[Qos] = js.undefined
      /**
        * timeout which, if present, determines the number of seconds after which the onFailure calback is called.
        * The presence of a timeout does not prevent the onSuccess callback from being called when the subscribe
        * completes.
        */
      var timeout: js.UndefOr[scala.Double] = js.undefined
    }
    
    trait TraceElement extends js.Object {
      var message: java.lang.String
      var severity: pahoDashMqttLib.pahoDashMqttLibStrings.Debug
    }
    
    trait UnsubscribeOptions extends js.Object {
      /** passed to the onSuccess callback or onFailure callback.  */
      var invocationContext: js.UndefOr[js.Any] = js.undefined
      /** called when the unsubscribe request has failed or timed out. */
      var onFailure: js.UndefOr[OnFailureCallback] = js.undefined
      /** called when the unsubscribe acknowledgement has been received from the server. */
      var onSuccess: js.UndefOr[OnSuccessCallback] = js.undefined
      /**
        * timeout which, if present, determines the number of seconds after which the onFailure calback is called.
        * The presence of a timeout does not prevent the onSuccess callback from being called when the unsubscribe
        * completes.
        */
      var timeout: js.UndefOr[scala.Double] = js.undefined
    }
    
    trait WithInvocationContext extends js.Object {
      /**
        * <code>invocationContext</code> as passed in with the corresponding field in the connectOptions or
        * subscribeOptions.
        */
      var invocationContext: js.Any
    }
    
    /**
      * Called when a connection has been lost.
      * @param error A single response object parameter is passed to the onConnectionLost callback containing the
      *  following fields:
      *  <li>errorCode
      *  <li>errorMessage
      */
    type OnConnectionLostHandler = js.Function1[/* error */ MQTTError, scala.Unit]
    /**
      * Called when the connect request has failed or timed out.
      * @param e
      *  A single response object parameter is passed to the onFailure callback containing the following fields:
      *  <li><code>invocationContext</code> as passed in with the corresponding field in the connectOptions.
      *  <li><code>errorCode</code> a number indicating the nature of the error.
      *  <li><code>errorMessage</code> text describing the error.
      */
    type OnFailureCallback = js.Function1[/* e */ ErrorWithInvocationContext, scala.Unit]
    /**
      * Called when a message was delivered or has arrived.
      * @param message The {@link Paho.MQTT.Message} that was delivered or has arrived.
      */
    type OnMessageHandler = js.Function1[/* message */ Message, scala.Unit]
    /**
      * Called when the subscribe acknowledgement has been received from the server.
      * @param o
      *  A single response object parameter is passed to the onSuccess callback containing the following fields:
      *  <li><code>invocationContext</code> as passed in with the corresponding field in the connectOptions.
      */
    type OnSubscribeSuccessCallback = js.Function1[/* o */ OnSubscribeSuccessParams, scala.Unit]
    /**
      * Called when the connect acknowledgement has been received from the server.
      * @param o
      *  A single response object parameter is passed to the onSuccess callback containing the following fields:
      *  <li><code>invocationContext</code> as passed in with the corresponding field in the connectOptions.
      */
    type OnSuccessCallback = js.Function1[/* o */ WithInvocationContext, scala.Unit]
    type TraceFunction = js.Function1[/* element */ TraceElement, scala.Unit]
    type TypedArray = stdLib.Int8Array | stdLib.Uint8Array | stdLib.Uint8ClampedArray | stdLib.Int16Array | stdLib.Uint16Array | stdLib.Int32Array | stdLib.Uint32Array | stdLib.Float32Array | stdLib.Float64Array
  }
  
}

