package typings.pahoMqtt.mod._Global_.Paho

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object MQTT {
  /**
    * Called when a connection has been lost.
    * @param error A single response object parameter is passed to the onConnectionLost callback containing the
    *  following fields:
    *  <li>errorCode
    *  <li>errorMessage
    */
  type OnConnectionLostHandler = js.Function1[/* error */ typings.pahoMqtt.mod._Global_.Paho.MQTT.MQTTError, scala.Unit]
  /**
    * Called when the connect request has failed or timed out.
    * @param e
    *  A single response object parameter is passed to the onFailure callback containing the following fields:
    *  <li><code>invocationContext</code> as passed in with the corresponding field in the connectOptions.
    *  <li><code>errorCode</code> a number indicating the nature of the error.
    *  <li><code>errorMessage</code> text describing the error.
    */
  type OnFailureCallback = js.Function1[
    /* e */ typings.pahoMqtt.mod._Global_.Paho.MQTT.ErrorWithInvocationContext, 
    scala.Unit
  ]
  /**
    * Called when a message was delivered or has arrived.
    * @param message The {@link Paho.MQTT.Message} that was delivered or has arrived.
    */
  type OnMessageHandler = js.Function1[/* message */ typings.pahoMqtt.mod._Global_.Paho.MQTT.Message, scala.Unit]
  /**
    * Called when the subscribe acknowledgement has been received from the server.
    * @param o
    *  A single response object parameter is passed to the onSuccess callback containing the following fields:
    *  <li><code>invocationContext</code> as passed in with the corresponding field in the connectOptions.
    */
  type OnSubscribeSuccessCallback = js.Function1[
    /* o */ typings.pahoMqtt.mod._Global_.Paho.MQTT.OnSubscribeSuccessParams, 
    scala.Unit
  ]
  /**
    * Called when the connect acknowledgement has been received from the server.
    * @param o
    *  A single response object parameter is passed to the onSuccess callback containing the following fields:
    *  <li><code>invocationContext</code> as passed in with the corresponding field in the connectOptions.
    */
  type OnSuccessCallback = js.Function1[/* o */ typings.pahoMqtt.mod._Global_.Paho.MQTT.WithInvocationContext, scala.Unit]
  type TraceFunction = js.Function1[/* element */ typings.pahoMqtt.mod._Global_.Paho.MQTT.TraceElement, scala.Unit]
  type TypedArray = typings.std.Int8Array | typings.std.Uint8Array | typings.std.Uint8ClampedArray | typings.std.Int16Array | typings.std.Uint16Array | typings.std.Int32Array | typings.std.Uint32Array | typings.std.Float32Array | typings.std.Float64Array
}
