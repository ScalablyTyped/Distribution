package typings.node.http2Mod

import typings.node.NodeJS.ArrayBufferView
import typings.node.bufferMod.global.Buffer
import typings.node.nodeColonnetMod.Socket
import typings.node.nodeColontlsMod.TLSSocket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Http2Session extends StObject {
  
  @JSName("addListener")
  @scala.annotation.targetName("addListener_ping")
  def addListener(event: "ping", listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_timeout")
  def addListener(event: "timeout", listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_close")
  def addListener(event: "close", listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_localSettings")
  def addListener(event: "localSettings", listener: js.Function1[/* settings */ Settings, Unit]): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_error")
  def addListener(event: "error", listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_remoteSettings")
  def addListener(event: "remoteSettings", listener: js.Function1[/* settings */ Settings, Unit]): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_frameError")
  def addListener(
    event: "frameError",
    listener: js.Function3[/* frameType */ Double, /* errorCode */ Double, /* streamID */ Double, Unit]
  ): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_goaway")
  def addListener(
    event: "goaway",
    listener: js.Function3[/* errorCode */ Double, /* lastStreamID */ Double, /* opaqueData */ Buffer, Unit]
  ): this.type = js.native
  def addListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  def addListener(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  
  /**
    * Value will be `undefined` if the `Http2Session` is not yet connected to a
    * socket, `h2c` if the `Http2Session` is not connected to a `TLSSocket`, or
    * will return the value of the connected `TLSSocket`'s own `alpnProtocol`property.
    * @since v9.4.0
    */
  val alpnProtocol: js.UndefOr[String] = js.native
  
  /**
    * Gracefully closes the `Http2Session`, allowing any existing streams to
    * complete on their own and preventing new `Http2Stream` instances from being
    * created. Once closed, `http2session.destroy()`_might_ be called if there
    * are no open `Http2Stream` instances.
    *
    * If specified, the `callback` function is registered as a handler for the`'close'` event.
    * @since v9.4.0
    */
  def close(): Unit = js.native
  def close(callback: js.Function0[Unit]): Unit = js.native
  
  /**
    * Will be `true` if this `Http2Session` instance has been closed, otherwise`false`.
    * @since v9.4.0
    */
  val closed: Boolean = js.native
  
  /**
    * Will be `true` if this `Http2Session` instance is still connecting, will be set
    * to `false` before emitting `connect` event and/or calling the `http2.connect`callback.
    * @since v10.0.0
    */
  val connecting: Boolean = js.native
  
  /**
    * Immediately terminates the `Http2Session` and the associated `net.Socket` or`tls.TLSSocket`.
    *
    * Once destroyed, the `Http2Session` will emit the `'close'` event. If `error`is not undefined, an `'error'` event will be emitted immediately before the`'close'` event.
    *
    * If there are any remaining open `Http2Streams` associated with the`Http2Session`, those will also be destroyed.
    * @since v8.4.0
    * @param error An `Error` object if the `Http2Session` is being destroyed due to an error.
    * @param code The HTTP/2 error code to send in the final `GOAWAY` frame. If unspecified, and `error` is not undefined, the default is `INTERNAL_ERROR`, otherwise defaults to `NO_ERROR`.
    */
  def destroy(): Unit = js.native
  def destroy(error: js.Error): Unit = js.native
  def destroy(error: js.Error, code: Double): Unit = js.native
  def destroy(error: Unit, code: Double): Unit = js.native
  
  /**
    * Will be `true` if this `Http2Session` instance has been destroyed and must no
    * longer be used, otherwise `false`.
    * @since v8.4.0
    */
  val destroyed: Boolean = js.native
  
  @JSName("emit")
  @scala.annotation.targetName("emit_timeout")
  def emit(event: "timeout"): Boolean = js.native
  @JSName("emit")
  @scala.annotation.targetName("emit_close")
  def emit(event: "close"): Boolean = js.native
  @JSName("emit")
  @scala.annotation.targetName("emit_ping")
  def emit(event: "ping"): Boolean = js.native
  @JSName("emit")
  @scala.annotation.targetName("emit_error")
  def emit(event: "error", err: js.Error): Boolean = js.native
  @JSName("emit")
  @scala.annotation.targetName("emit_goaway")
  def emit(event: "goaway", errorCode: Double, lastStreamID: Double, opaqueData: Buffer): Boolean = js.native
  @JSName("emit")
  @scala.annotation.targetName("emit_frameError")
  def emit(event: "frameError", frameType: Double, errorCode: Double, streamID: Double): Boolean = js.native
  @JSName("emit")
  @scala.annotation.targetName("emit_remoteSettings")
  def emit(event: "remoteSettings", settings: Settings): Boolean = js.native
  @JSName("emit")
  @scala.annotation.targetName("emit_localSettings")
  def emit(event: "localSettings", settings: Settings): Boolean = js.native
  def emit(event: String, args: Any*): Boolean = js.native
  def emit(event: js.Symbol, args: Any*): Boolean = js.native
  
  /**
    * Value is `undefined` if the `Http2Session` session socket has not yet been
    * connected, `true` if the `Http2Session` is connected with a `TLSSocket`,
    * and `false` if the `Http2Session` is connected to any other kind of socket
    * or stream.
    * @since v9.4.0
    */
  val encrypted: js.UndefOr[Boolean] = js.native
  
  /**
    * Transmits a `GOAWAY` frame to the connected peer _without_ shutting down the`Http2Session`.
    * @since v9.4.0
    * @param code An HTTP/2 error code
    * @param lastStreamID The numeric ID of the last processed `Http2Stream`
    * @param opaqueData A `TypedArray` or `DataView` instance containing additional data to be carried within the `GOAWAY` frame.
    */
  def goaway(): Unit = js.native
  def goaway(code: Double): Unit = js.native
  def goaway(code: Double, lastStreamID: Double): Unit = js.native
  def goaway(code: Double, lastStreamID: Double, opaqueData: ArrayBufferView): Unit = js.native
  def goaway(code: Double, lastStreamID: Unit, opaqueData: ArrayBufferView): Unit = js.native
  def goaway(code: Unit, lastStreamID: Double): Unit = js.native
  def goaway(code: Unit, lastStreamID: Double, opaqueData: ArrayBufferView): Unit = js.native
  def goaway(code: Unit, lastStreamID: Unit, opaqueData: ArrayBufferView): Unit = js.native
  
  /**
    * A prototype-less object describing the current local settings of this`Http2Session`. The local settings are local to _this_`Http2Session` instance.
    * @since v8.4.0
    */
  val localSettings: Settings = js.native
  
  @JSName("on")
  @scala.annotation.targetName("on_ping")
  def on(event: "ping", listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  @scala.annotation.targetName("on_timeout")
  def on(event: "timeout", listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  @scala.annotation.targetName("on_close")
  def on(event: "close", listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  @scala.annotation.targetName("on_error")
  def on(event: "error", listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  @JSName("on")
  @scala.annotation.targetName("on_localSettings")
  def on(event: "localSettings", listener: js.Function1[/* settings */ Settings, Unit]): this.type = js.native
  @JSName("on")
  @scala.annotation.targetName("on_remoteSettings")
  def on(event: "remoteSettings", listener: js.Function1[/* settings */ Settings, Unit]): this.type = js.native
  @JSName("on")
  @scala.annotation.targetName("on_goaway")
  def on(
    event: "goaway",
    listener: js.Function3[/* errorCode */ Double, /* lastStreamID */ Double, /* opaqueData */ Buffer, Unit]
  ): this.type = js.native
  @JSName("on")
  @scala.annotation.targetName("on_frameError")
  def on(
    event: "frameError",
    listener: js.Function3[/* frameType */ Double, /* errorCode */ Double, /* streamID */ Double, Unit]
  ): this.type = js.native
  def on(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  def on(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  
  @JSName("once")
  @scala.annotation.targetName("once_timeout")
  def once(event: "timeout", listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_ping")
  def once(event: "ping", listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_close")
  def once(event: "close", listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_remoteSettings")
  def once(event: "remoteSettings", listener: js.Function1[/* settings */ Settings, Unit]): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_error")
  def once(event: "error", listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_localSettings")
  def once(event: "localSettings", listener: js.Function1[/* settings */ Settings, Unit]): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_frameError")
  def once(
    event: "frameError",
    listener: js.Function3[/* frameType */ Double, /* errorCode */ Double, /* streamID */ Double, Unit]
  ): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_goaway")
  def once(
    event: "goaway",
    listener: js.Function3[/* errorCode */ Double, /* lastStreamID */ Double, /* opaqueData */ Buffer, Unit]
  ): this.type = js.native
  def once(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  def once(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  
  /**
    * If the `Http2Session` is connected to a `TLSSocket`, the `originSet` property
    * will return an `Array` of origins for which the `Http2Session` may be
    * considered authoritative.
    *
    * The `originSet` property is only available when using a secure TLS connection.
    * @since v9.4.0
    */
  val originSet: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Indicates whether the `Http2Session` is currently waiting for acknowledgment of
    * a sent `SETTINGS` frame. Will be `true` after calling the`http2session.settings()` method. Will be `false` once all sent `SETTINGS`frames have been acknowledged.
    * @since v8.4.0
    */
  val pendingSettingsAck: Boolean = js.native
  
  /**
    * Sends a `PING` frame to the connected HTTP/2 peer. A `callback` function must
    * be provided. The method will return `true` if the `PING` was sent, `false`otherwise.
    *
    * The maximum number of outstanding (unacknowledged) pings is determined by the`maxOutstandingPings` configuration option. The default maximum is 10.
    *
    * If provided, the `payload` must be a `Buffer`, `TypedArray`, or `DataView`containing 8 bytes of data that will be transmitted with the `PING` and
    * returned with the ping acknowledgment.
    *
    * The callback will be invoked with three arguments: an error argument that will
    * be `null` if the `PING` was successfully acknowledged, a `duration` argument
    * that reports the number of milliseconds elapsed since the ping was sent and the
    * acknowledgment was received, and a `Buffer` containing the 8-byte `PING`payload.
    *
    * ```js
    * session.ping(Buffer.from('abcdefgh'), (err, duration, payload) => {
    *   if (!err) {
    *     console.log(`Ping acknowledged in ${duration} milliseconds`);
    *     console.log(`With payload '${payload.toString()}'`);
    *   }
    * });
    * ```
    *
    * If the `payload` argument is not specified, the default payload will be the
    * 64-bit timestamp (little endian) marking the start of the `PING` duration.
    * @since v8.9.3
    * @param payload Optional ping payload.
    */
  def ping(
    callback: js.Function3[/* err */ js.Error | Null, /* duration */ Double, /* payload */ Buffer, Unit]
  ): Boolean = js.native
  def ping(
    payload: ArrayBufferView,
    callback: js.Function3[/* err */ js.Error | Null, /* duration */ Double, /* payload */ Buffer, Unit]
  ): Boolean = js.native
  
  @JSName("prependListener")
  @scala.annotation.targetName("prependListener_timeout")
  def prependListener(event: "timeout", listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  @scala.annotation.targetName("prependListener_close")
  def prependListener(event: "close", listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  @scala.annotation.targetName("prependListener_ping")
  def prependListener(event: "ping", listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  @scala.annotation.targetName("prependListener_remoteSettings")
  def prependListener(event: "remoteSettings", listener: js.Function1[/* settings */ Settings, Unit]): this.type = js.native
  @JSName("prependListener")
  @scala.annotation.targetName("prependListener_localSettings")
  def prependListener(event: "localSettings", listener: js.Function1[/* settings */ Settings, Unit]): this.type = js.native
  @JSName("prependListener")
  @scala.annotation.targetName("prependListener_error")
  def prependListener(event: "error", listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  @JSName("prependListener")
  @scala.annotation.targetName("prependListener_goaway")
  def prependListener(
    event: "goaway",
    listener: js.Function3[/* errorCode */ Double, /* lastStreamID */ Double, /* opaqueData */ Buffer, Unit]
  ): this.type = js.native
  @JSName("prependListener")
  @scala.annotation.targetName("prependListener_frameError")
  def prependListener(
    event: "frameError",
    listener: js.Function3[/* frameType */ Double, /* errorCode */ Double, /* streamID */ Double, Unit]
  ): this.type = js.native
  def prependListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  def prependListener(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  
  @JSName("prependOnceListener")
  @scala.annotation.targetName("prependOnceListener_close")
  def prependOnceListener(event: "close", listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  @scala.annotation.targetName("prependOnceListener_ping")
  def prependOnceListener(event: "ping", listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  @scala.annotation.targetName("prependOnceListener_timeout")
  def prependOnceListener(event: "timeout", listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  @scala.annotation.targetName("prependOnceListener_localSettings")
  def prependOnceListener(event: "localSettings", listener: js.Function1[/* settings */ Settings, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  @scala.annotation.targetName("prependOnceListener_remoteSettings")
  def prependOnceListener(event: "remoteSettings", listener: js.Function1[/* settings */ Settings, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  @scala.annotation.targetName("prependOnceListener_error")
  def prependOnceListener(event: "error", listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  @scala.annotation.targetName("prependOnceListener_frameError")
  def prependOnceListener(
    event: "frameError",
    listener: js.Function3[/* frameType */ Double, /* errorCode */ Double, /* streamID */ Double, Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  @scala.annotation.targetName("prependOnceListener_goaway")
  def prependOnceListener(
    event: "goaway",
    listener: js.Function3[/* errorCode */ Double, /* lastStreamID */ Double, /* opaqueData */ Buffer, Unit]
  ): this.type = js.native
  def prependOnceListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  def prependOnceListener(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  
  /**
    * Calls `ref()` on this `Http2Session`instance's underlying `net.Socket`.
    * @since v9.4.0
    */
  def ref(): Unit = js.native
  
  /**
    * A prototype-less object describing the current remote settings of this`Http2Session`. The remote settings are set by the _connected_ HTTP/2 peer.
    * @since v8.4.0
    */
  val remoteSettings: Settings = js.native
  
  /**
    * Sets the local endpoint's window size.
    * The `windowSize` is the total window size to set, not
    * the delta.
    *
    * ```js
    * const http2 = require('http2');
    *
    * const server = http2.createServer();
    * const expectedWindowSize = 2 ** 20;
    * server.on('connect', (session) => {
    *
    *   // Set local window size to be 2 ** 20
    *   session.setLocalWindowSize(expectedWindowSize);
    * });
    * ```
    * @since v15.3.0, v14.18.0
    */
  def setLocalWindowSize(windowSize: Double): Unit = js.native
  
  /**
    * Used to set a callback function that is called when there is no activity on
    * the `Http2Session` after `msecs` milliseconds. The given `callback` is
    * registered as a listener on the `'timeout'` event.
    * @since v8.4.0
    */
  def setTimeout(msecs: Double): Unit = js.native
  def setTimeout(msecs: Double, callback: js.Function0[Unit]): Unit = js.native
  
  /**
    * Updates the current local settings for this `Http2Session` and sends a new`SETTINGS` frame to the connected HTTP/2 peer.
    *
    * Once called, the `http2session.pendingSettingsAck` property will be `true`while the session is waiting for the remote peer to acknowledge the new
    * settings.
    *
    * The new settings will not become effective until the `SETTINGS` acknowledgment
    * is received and the `'localSettings'` event is emitted. It is possible to send
    * multiple `SETTINGS` frames while acknowledgment is still pending.
    * @since v8.4.0
    * @param callback Callback that is called once the session is connected or right away if the session is already connected.
    */
  def settings(settings: Settings): Unit = js.native
  def settings(
    settings: Settings,
    callback: js.Function3[/* err */ js.Error | Null, /* settings */ Settings, /* duration */ Double, Unit]
  ): Unit = js.native
  
  /**
    * Returns a `Proxy` object that acts as a `net.Socket` (or `tls.TLSSocket`) but
    * limits available methods to ones safe to use with HTTP/2.
    *
    * `destroy`, `emit`, `end`, `pause`, `read`, `resume`, and `write` will throw
    * an error with code `ERR_HTTP2_NO_SOCKET_MANIPULATION`. See `Http2Session and Sockets` for more information.
    *
    * `setTimeout` method will be called on this `Http2Session`.
    *
    * All other interactions will be routed directly to the socket.
    * @since v8.4.0
    */
  val socket: Socket | TLSSocket = js.native
  
  /**
    * Provides miscellaneous information about the current state of the`Http2Session`.
    *
    * An object describing the current status of this `Http2Session`.
    * @since v8.4.0
    */
  val state: SessionState = js.native
  
  /**
    * The `http2session.type` will be equal to`http2.constants.NGHTTP2_SESSION_SERVER` if this `Http2Session` instance is a
    * server, and `http2.constants.NGHTTP2_SESSION_CLIENT` if the instance is a
    * client.
    * @since v8.4.0
    */
  val `type`: Double = js.native
  
  /**
    * Calls `unref()` on this `Http2Session`instance's underlying `net.Socket`.
    * @since v9.4.0
    */
  def unref(): Unit = js.native
}
