package typings.pahoMqtt.mod.global.Paho.MQTT

import typings.pahoMqtt.pahoMqttNumbers.`3`
import typings.pahoMqtt.pahoMqttNumbers.`4`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Attributes used with a connection.
  */
@js.native
trait ConnectionOptions extends js.Object {
  /**
    * If true(default) the client and server persistent state is deleted on successful connect.
    * @default true
    */
  var cleanSession: js.UndefOr[Boolean] = js.native
  /**
    * If present this contains either a set of hostnames or fully qualified
    * WebSocket URIs (ws://example.com:1883/mqtt), that are tried in order in place of the host and port
    * paramater on the construtor. The hosts are tried one at at time in order until one of then succeeds.
    */
  var hosts: js.UndefOr[js.Array[String]] = js.native
  /** Passed to the onSuccess callback or onFailure callback. */
  var invocationContext: js.UndefOr[js.Any] = js.native
  /**
    * The server disconnects this client if there is no activity for this number of seconds.
    * @default The default value of 60 seconds is assumed if not set.
    */
  var keepAliveInterval: js.UndefOr[Double] = js.native
  /**
    * Specifies the mqtt version to use when connecting
    * <dl>
    *     <dt>3 - MQTT 3.1</dt>
    *     <dt>4 - MQTT 3.1.1 (default)</dt>
    * </dl>
    * @default 4
    */
  var mqttVersion: js.UndefOr[`3` | `4`] = js.native
  /**
    * Called when the connect request has failed or timed out.
    */
  var onFailure: js.UndefOr[OnFailureCallback] = js.native
  /**
    * Called when the connect acknowledgement has been received from the server.
    */
  var onSuccess: js.UndefOr[OnSuccessCallback] = js.native
  /** Authentication password for this connection. */
  var password: js.UndefOr[String] = js.native
  /**
    * If present the set of ports matching the hosts. If hosts contains URIs, this property is not used.
    */
  var ports: js.UndefOr[js.Array[Double]] = js.native
  /**
    * If the connect has not succeeded within this number of seconds, it is deemed to have failed.
    * @default The default is 30 seconds.
    */
  var timeout: js.UndefOr[Double] = js.native
  /** If present and true, use an SSL Websocket connection. */
  var useSSL: js.UndefOr[Boolean] = js.native
  /** Authentication username for this connection. */
  var userName: js.UndefOr[String] = js.native
  /** Sent by the server when the client disconnects abnormally. */
  var willMessage: js.UndefOr[Message] = js.native
}

object ConnectionOptions {
  @scala.inline
  def apply(): ConnectionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionOptions]
  }
  @scala.inline
  implicit class ConnectionOptionsOps[Self <: ConnectionOptions] (val x: Self) extends AnyVal {
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
    def setCleanSession(value: Boolean): Self = this.set("cleanSession", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCleanSession: Self = this.set("cleanSession", js.undefined)
    @scala.inline
    def setHostsVarargs(value: String*): Self = this.set("hosts", js.Array(value :_*))
    @scala.inline
    def setHosts(value: js.Array[String]): Self = this.set("hosts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHosts: Self = this.set("hosts", js.undefined)
    @scala.inline
    def setInvocationContext(value: js.Any): Self = this.set("invocationContext", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvocationContext: Self = this.set("invocationContext", js.undefined)
    @scala.inline
    def setKeepAliveInterval(value: Double): Self = this.set("keepAliveInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeepAliveInterval: Self = this.set("keepAliveInterval", js.undefined)
    @scala.inline
    def setMqttVersion(value: `3` | `4`): Self = this.set("mqttVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMqttVersion: Self = this.set("mqttVersion", js.undefined)
    @scala.inline
    def setOnFailure(value: /* e */ ErrorWithInvocationContext => Unit): Self = this.set("onFailure", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnFailure: Self = this.set("onFailure", js.undefined)
    @scala.inline
    def setOnSuccess(value: /* o */ WithInvocationContext => Unit): Self = this.set("onSuccess", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSuccess: Self = this.set("onSuccess", js.undefined)
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    @scala.inline
    def setPortsVarargs(value: Double*): Self = this.set("ports", js.Array(value :_*))
    @scala.inline
    def setPorts(value: js.Array[Double]): Self = this.set("ports", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePorts: Self = this.set("ports", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    @scala.inline
    def setUseSSL(value: Boolean): Self = this.set("useSSL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseSSL: Self = this.set("useSSL", js.undefined)
    @scala.inline
    def setUserName(value: String): Self = this.set("userName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserName: Self = this.set("userName", js.undefined)
    @scala.inline
    def setWillMessage(value: Message): Self = this.set("willMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWillMessage: Self = this.set("willMessage", js.undefined)
  }
  
}

