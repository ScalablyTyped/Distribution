package typings.pahoDashMqtt.pahoDashMqttMod._Global_.Paho

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object MQTT {
  import typings.std.Float32Array
  import typings.std.Float64Array
  import typings.std.Int16Array
  import typings.std.Int32Array
  import typings.std.Int8Array
  import typings.std.Uint16Array
  import typings.std.Uint32Array
  import typings.std.Uint8Array
  import typings.std.Uint8ClampedArray

  /**
    * Called when a connection has been lost.
    * @param error A single response object parameter is passed to the onConnectionLost callback containing the
    *  following fields:
    *  <li>errorCode
    *  <li>errorMessage
    */
  type OnConnectionLostHandler = js.Function1[/* error */ MQTTError, Unit]
  /**
    * Called when the connect request has failed or timed out.
    * @param e
    *  A single response object parameter is passed to the onFailure callback containing the following fields:
    *  <li><code>invocationContext</code> as passed in with the corresponding field in the connectOptions.
    *  <li><code>errorCode</code> a number indicating the nature of the error.
    *  <li><code>errorMessage</code> text describing the error.
    */
  type OnFailureCallback = js.Function1[/* e */ ErrorWithInvocationContext, Unit]
  /**
    * Called when a message was delivered or has arrived.
    * @param message The {@link Paho.MQTT.Message} that was delivered or has arrived.
    */
  type OnMessageHandler = js.Function1[
    /* message */ typings.pahoDashMqtt.pahoDashMqttMod._Global_.Paho.MQTT.Message, 
    Unit
  ]
  /**
    * Called when the subscribe acknowledgement has been received from the server.
    * @param o
    *  A single response object parameter is passed to the onSuccess callback containing the following fields:
    *  <li><code>invocationContext</code> as passed in with the corresponding field in the connectOptions.
    */
  type OnSubscribeSuccessCallback = js.Function1[/* o */ OnSubscribeSuccessParams, Unit]
  /**
    * Called when the connect acknowledgement has been received from the server.
    * @param o
    *  A single response object parameter is passed to the onSuccess callback containing the following fields:
    *  <li><code>invocationContext</code> as passed in with the corresponding field in the connectOptions.
    */
  type OnSuccessCallback = js.Function1[/* o */ WithInvocationContext, Unit]
  type TraceFunction = js.Function1[/* element */ TraceElement, Unit]
  type TypedArray = Int8Array | Uint8Array | Uint8ClampedArray | Int16Array | Uint16Array | Int32Array | Uint32Array | Float32Array | Float64Array
}
