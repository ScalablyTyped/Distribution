package typings.pahoDashMqtt.pahoDashMqttMod._Global_.Paho.MQTT

import typings.pahoDashMqtt.pahoDashMqttNumbers.`3`
import typings.pahoDashMqtt.pahoDashMqttNumbers.`4`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Attributes used with a connection.
  */
trait ConnectionOptions extends js.Object {
  /**
    * If true(default) the client and server persistent state is deleted on successful connect.
    * @default true
    */
  var cleanSession: js.UndefOr[Boolean] = js.undefined
  /**
    * If present this contains either a set of hostnames or fully qualified
    * WebSocket URIs (ws://example.com:1883/mqtt), that are tried in order in place of the host and port
    * paramater on the construtor. The hosts are tried one at at time in order until one of then succeeds.
    */
  var hosts: js.UndefOr[js.Array[String]] = js.undefined
  /** Passed to the onSuccess callback or onFailure callback. */
  var invocationContext: js.UndefOr[js.Any] = js.undefined
  /**
    * The server disconnects this client if there is no activity for this number of seconds.
    * @default The default value of 60 seconds is assumed if not set.
    */
  var keepAliveInterval: js.UndefOr[Double] = js.undefined
  /**
    * Specifies the mqtt version to use when connecting
    * <dl>
    *     <dt>3 - MQTT 3.1</dt>
    *     <dt>4 - MQTT 3.1.1 (default)</dt>
    * </dl>
    * @default 4
    */
  var mqttVersion: js.UndefOr[`3` | `4`] = js.undefined
  /**
    * Called when the connect request has failed or timed out.
    */
  var onFailure: js.UndefOr[OnFailureCallback] = js.undefined
  /**
    * Called when the connect acknowledgement has been received from the server.
    */
  var onSuccess: js.UndefOr[OnSuccessCallback] = js.undefined
  /** Authentication password for this connection. */
  var password: js.UndefOr[String] = js.undefined
  /**
    * If present the set of ports matching the hosts. If hosts contains URIs, this property is not used.
    */
  var ports: js.UndefOr[js.Array[Double]] = js.undefined
  /**
    * If the connect has not succeeded within this number of seconds, it is deemed to have failed.
    * @default The default is 30 seconds.
    */
  var timeout: js.UndefOr[Double] = js.undefined
  /** If present and true, use an SSL Websocket connection. */
  var useSSL: js.UndefOr[Boolean] = js.undefined
  /** Authentication username for this connection. */
  var userName: js.UndefOr[String] = js.undefined
  /** Sent by the server when the client disconnects abnormally. */
  var willMessage: js.UndefOr[typings.pahoDashMqtt.pahoDashMqttMod._Global_.Paho.MQTT.Message] = js.undefined
}

object ConnectionOptions {
  @scala.inline
  def apply(
    cleanSession: js.UndefOr[Boolean] = js.undefined,
    hosts: js.Array[String] = null,
    invocationContext: js.Any = null,
    keepAliveInterval: Int | Double = null,
    mqttVersion: `3` | `4` = null,
    onFailure: /* e */ ErrorWithInvocationContext => Unit = null,
    onSuccess: /* o */ WithInvocationContext => Unit = null,
    password: String = null,
    ports: js.Array[Double] = null,
    timeout: Int | Double = null,
    useSSL: js.UndefOr[Boolean] = js.undefined,
    userName: String = null,
    willMessage: typings.pahoDashMqtt.pahoDashMqttMod._Global_.Paho.MQTT.Message = null
  ): ConnectionOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cleanSession)) __obj.updateDynamic("cleanSession")(cleanSession.asInstanceOf[js.Any])
    if (hosts != null) __obj.updateDynamic("hosts")(hosts.asInstanceOf[js.Any])
    if (invocationContext != null) __obj.updateDynamic("invocationContext")(invocationContext.asInstanceOf[js.Any])
    if (keepAliveInterval != null) __obj.updateDynamic("keepAliveInterval")(keepAliveInterval.asInstanceOf[js.Any])
    if (mqttVersion != null) __obj.updateDynamic("mqttVersion")(mqttVersion.asInstanceOf[js.Any])
    if (onFailure != null) __obj.updateDynamic("onFailure")(js.Any.fromFunction1(onFailure))
    if (onSuccess != null) __obj.updateDynamic("onSuccess")(js.Any.fromFunction1(onSuccess))
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (ports != null) __obj.updateDynamic("ports")(ports.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (!js.isUndefined(useSSL)) __obj.updateDynamic("useSSL")(useSSL.asInstanceOf[js.Any])
    if (userName != null) __obj.updateDynamic("userName")(userName.asInstanceOf[js.Any])
    if (willMessage != null) __obj.updateDynamic("willMessage")(willMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionOptions]
  }
}

