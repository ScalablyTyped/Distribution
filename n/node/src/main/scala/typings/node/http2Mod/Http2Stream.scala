package typings.node.http2Mod

import typings.node.bufferMod.global.Buffer
import typings.node.httpMod.OutgoingHttpHeaders
import typings.node.nodeColonstreamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Http2Stream extends StObject {
  
  /**
    * Set to `true` if the `Http2Stream` instance was aborted abnormally. When set,
    * the `'aborted'` event will have been emitted.
    * @since v8.4.0
    */
  val aborted: Boolean = js.native
  
  @JSName("addListener")
  @scala.annotation.targetName("addListener_drain")
  def addListener(event: "drain", listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_timeout")
  def addListener(event: "timeout", listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_finish")
  def addListener(event: "finish", listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_wantTrailers")
  def addListener(event: "wantTrailers", listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_aborted")
  def addListener(event: "aborted", listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_close")
  def addListener(event: "close", listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_end")
  def addListener(event: "end", listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_streamClosed")
  def addListener(event: "streamClosed", listener: js.Function1[/* code */ Double, Unit]): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_unpipe")
  def addListener(event: "unpipe", listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_error")
  def addListener(event: "error", listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_data")
  def addListener(event: "data", listener: js.Function1[/* chunk */ Buffer | String, Unit]): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_pipe")
  def addListener(event: "pipe", listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_frameError")
  def addListener(event: "frameError", listener: js.Function2[/* frameType */ Double, /* errorCode */ Double, Unit]): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_trailers")
  def addListener(
    event: "trailers",
    listener: js.Function2[/* trailers */ IncomingHttpHeaders, /* flags */ Double, Unit]
  ): this.type = js.native
  def addListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  def addListener(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  
  /**
    * This property shows the number of characters currently buffered to be written.
    * See `net.Socket.bufferSize` for details.
    * @since v11.2.0, v10.16.0
    */
  val bufferSize: Double = js.native
  
  /**
    * Closes the `Http2Stream` instance by sending an `RST_STREAM` frame to the
    * connected HTTP/2 peer.
    * @since v8.4.0
    * @param [code=http2.constants.NGHTTP2_NO_ERROR] Unsigned 32-bit integer identifying the error code.
    * @param callback An optional function registered to listen for the `'close'` event.
    */
  def close(): Unit = js.native
  def close(code: Double): Unit = js.native
  def close(code: Double, callback: js.Function0[Unit]): Unit = js.native
  def close(code: Unit, callback: js.Function0[Unit]): Unit = js.native
  
  /**
    * Set to `true` if the `Http2Stream` instance has been closed.
    * @since v9.4.0
    */
  val closed: Boolean = js.native
  
  /**
    * Set to `true` if the `Http2Stream` instance has been destroyed and is no longer
    * usable.
    * @since v8.4.0
    */
  val destroyed: Boolean = js.native
  
  @JSName("emit")
  @scala.annotation.targetName("emit_wantTrailers")
  def emit(event: "wantTrailers"): Boolean = js.native
  @JSName("emit")
  @scala.annotation.targetName("emit_aborted")
  def emit(event: "aborted"): Boolean = js.native
  @JSName("emit")
  @scala.annotation.targetName("emit_timeout")
  def emit(event: "timeout"): Boolean = js.native
  @JSName("emit")
  @scala.annotation.targetName("emit_close")
  def emit(event: "close"): Boolean = js.native
  @JSName("emit")
  @scala.annotation.targetName("emit_drain")
  def emit(event: "drain"): Boolean = js.native
  @JSName("emit")
  @scala.annotation.targetName("emit_finish")
  def emit(event: "finish"): Boolean = js.native
  @JSName("emit")
  @scala.annotation.targetName("emit_end")
  def emit(event: "end"): Boolean = js.native
  @JSName("emit")
  @scala.annotation.targetName("emit_data")
  def emit(event: "data", chunk: String): Boolean = js.native
  @JSName("emit")
  @scala.annotation.targetName("emit_data")
  def emit(event: "data", chunk: Buffer): Boolean = js.native
  @JSName("emit")
  @scala.annotation.targetName("emit_streamClosed")
  def emit(event: "streamClosed", code: Double): Boolean = js.native
  @JSName("emit")
  @scala.annotation.targetName("emit_error")
  def emit(event: "error", err: js.Error): Boolean = js.native
  @JSName("emit")
  @scala.annotation.targetName("emit_frameError")
  def emit(event: "frameError", frameType: Double, errorCode: Double): Boolean = js.native
  @JSName("emit")
  @scala.annotation.targetName("emit_pipe")
  def emit(event: "pipe", src: Readable): Boolean = js.native
  @JSName("emit")
  @scala.annotation.targetName("emit_unpipe")
  def emit(event: "unpipe", src: Readable): Boolean = js.native
  @JSName("emit")
  @scala.annotation.targetName("emit_trailers")
  def emit(event: "trailers", trailers: IncomingHttpHeaders, flags: Double): Boolean = js.native
  def emit(event: String, args: Any*): Boolean = js.native
  def emit(event: js.Symbol, args: Any*): Boolean = js.native
  
  /**
    * Set to `true` if the `END_STREAM` flag was set in the request or response
    * HEADERS frame received, indicating that no additional data should be received
    * and the readable side of the `Http2Stream` will be closed.
    * @since v10.11.0
    */
  val endAfterHeaders: Boolean = js.native
  
  /**
    * The numeric stream identifier of this `Http2Stream` instance. Set to `undefined`if the stream identifier has not yet been assigned.
    * @since v8.4.0
    */
  val id: js.UndefOr[Double] = js.native
  
  @JSName("on")
  @scala.annotation.targetName("on_aborted")
  def on(event: "aborted", listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  @scala.annotation.targetName("on_timeout")
  def on(event: "timeout", listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  @scala.annotation.targetName("on_close")
  def on(event: "close", listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  @scala.annotation.targetName("on_finish")
  def on(event: "finish", listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  @scala.annotation.targetName("on_end")
  def on(event: "end", listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  @scala.annotation.targetName("on_wantTrailers")
  def on(event: "wantTrailers", listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  @scala.annotation.targetName("on_drain")
  def on(event: "drain", listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  @scala.annotation.targetName("on_unpipe")
  def on(event: "unpipe", listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
  @JSName("on")
  @scala.annotation.targetName("on_streamClosed")
  def on(event: "streamClosed", listener: js.Function1[/* code */ Double, Unit]): this.type = js.native
  @JSName("on")
  @scala.annotation.targetName("on_error")
  def on(event: "error", listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  @JSName("on")
  @scala.annotation.targetName("on_data")
  def on(event: "data", listener: js.Function1[/* chunk */ Buffer | String, Unit]): this.type = js.native
  @JSName("on")
  @scala.annotation.targetName("on_pipe")
  def on(event: "pipe", listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
  @JSName("on")
  @scala.annotation.targetName("on_frameError")
  def on(event: "frameError", listener: js.Function2[/* frameType */ Double, /* errorCode */ Double, Unit]): this.type = js.native
  @JSName("on")
  @scala.annotation.targetName("on_trailers")
  def on(
    event: "trailers",
    listener: js.Function2[/* trailers */ IncomingHttpHeaders, /* flags */ Double, Unit]
  ): this.type = js.native
  def on(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  def on(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  
  @JSName("once")
  @scala.annotation.targetName("once_end")
  def once(event: "end", listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_aborted")
  def once(event: "aborted", listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_drain")
  def once(event: "drain", listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_wantTrailers")
  def once(event: "wantTrailers", listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_timeout")
  def once(event: "timeout", listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_finish")
  def once(event: "finish", listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_close")
  def once(event: "close", listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_streamClosed")
  def once(event: "streamClosed", listener: js.Function1[/* code */ Double, Unit]): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_error")
  def once(event: "error", listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_pipe")
  def once(event: "pipe", listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_unpipe")
  def once(event: "unpipe", listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_data")
  def once(event: "data", listener: js.Function1[/* chunk */ Buffer | String, Unit]): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_trailers")
  def once(
    event: "trailers",
    listener: js.Function2[/* trailers */ IncomingHttpHeaders, /* flags */ Double, Unit]
  ): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_frameError")
  def once(event: "frameError", listener: js.Function2[/* frameType */ Double, /* errorCode */ Double, Unit]): this.type = js.native
  def once(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  def once(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  
  /**
    * Set to `true` if the `Http2Stream` instance has not yet been assigned a
    * numeric stream identifier.
    * @since v9.4.0
    */
  val pending: Boolean = js.native
  
  @JSName("prependListener")
  @scala.annotation.targetName("prependListener_timeout")
  def prependListener(event: "timeout", listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  @scala.annotation.targetName("prependListener_finish")
  def prependListener(event: "finish", listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  @scala.annotation.targetName("prependListener_wantTrailers")
  def prependListener(event: "wantTrailers", listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  @scala.annotation.targetName("prependListener_close")
  def prependListener(event: "close", listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  @scala.annotation.targetName("prependListener_drain")
  def prependListener(event: "drain", listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  @scala.annotation.targetName("prependListener_aborted")
  def prependListener(event: "aborted", listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  @scala.annotation.targetName("prependListener_end")
  def prependListener(event: "end", listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  @scala.annotation.targetName("prependListener_streamClosed")
  def prependListener(event: "streamClosed", listener: js.Function1[/* code */ Double, Unit]): this.type = js.native
  @JSName("prependListener")
  @scala.annotation.targetName("prependListener_pipe")
  def prependListener(event: "pipe", listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
  @JSName("prependListener")
  @scala.annotation.targetName("prependListener_data")
  def prependListener(event: "data", listener: js.Function1[/* chunk */ Buffer | String, Unit]): this.type = js.native
  @JSName("prependListener")
  @scala.annotation.targetName("prependListener_unpipe")
  def prependListener(event: "unpipe", listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
  @JSName("prependListener")
  @scala.annotation.targetName("prependListener_error")
  def prependListener(event: "error", listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  @JSName("prependListener")
  @scala.annotation.targetName("prependListener_frameError")
  def prependListener(event: "frameError", listener: js.Function2[/* frameType */ Double, /* errorCode */ Double, Unit]): this.type = js.native
  @JSName("prependListener")
  @scala.annotation.targetName("prependListener_trailers")
  def prependListener(
    event: "trailers",
    listener: js.Function2[/* trailers */ IncomingHttpHeaders, /* flags */ Double, Unit]
  ): this.type = js.native
  def prependListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  def prependListener(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  
  @JSName("prependOnceListener")
  @scala.annotation.targetName("prependOnceListener_drain")
  def prependOnceListener(event: "drain", listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  @scala.annotation.targetName("prependOnceListener_aborted")
  def prependOnceListener(event: "aborted", listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  @scala.annotation.targetName("prependOnceListener_end")
  def prependOnceListener(event: "end", listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  @scala.annotation.targetName("prependOnceListener_close")
  def prependOnceListener(event: "close", listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  @scala.annotation.targetName("prependOnceListener_timeout")
  def prependOnceListener(event: "timeout", listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  @scala.annotation.targetName("prependOnceListener_finish")
  def prependOnceListener(event: "finish", listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  @scala.annotation.targetName("prependOnceListener_wantTrailers")
  def prependOnceListener(event: "wantTrailers", listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  @scala.annotation.targetName("prependOnceListener_streamClosed")
  def prependOnceListener(event: "streamClosed", listener: js.Function1[/* code */ Double, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  @scala.annotation.targetName("prependOnceListener_data")
  def prependOnceListener(event: "data", listener: js.Function1[/* chunk */ Buffer | String, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  @scala.annotation.targetName("prependOnceListener_pipe")
  def prependOnceListener(event: "pipe", listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  @scala.annotation.targetName("prependOnceListener_error")
  def prependOnceListener(event: "error", listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  @scala.annotation.targetName("prependOnceListener_unpipe")
  def prependOnceListener(event: "unpipe", listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  @scala.annotation.targetName("prependOnceListener_frameError")
  def prependOnceListener(event: "frameError", listener: js.Function2[/* frameType */ Double, /* errorCode */ Double, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  @scala.annotation.targetName("prependOnceListener_trailers")
  def prependOnceListener(
    event: "trailers",
    listener: js.Function2[/* trailers */ IncomingHttpHeaders, /* flags */ Double, Unit]
  ): this.type = js.native
  def prependOnceListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  def prependOnceListener(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  
  /**
    * Updates the priority for this `Http2Stream` instance.
    * @since v8.4.0
    */
  def priority(options: StreamPriorityOptions): Unit = js.native
  
  /**
    * Set to the `RST_STREAM` `error code` reported when the `Http2Stream` is
    * destroyed after either receiving an `RST_STREAM` frame from the connected peer,
    * calling `http2stream.close()`, or `http2stream.destroy()`. Will be`undefined` if the `Http2Stream` has not been closed.
    * @since v8.4.0
    */
  val rstCode: Double = js.native
  
  /**
    * Sends a trailing `HEADERS` frame to the connected HTTP/2 peer. This method
    * will cause the `Http2Stream` to be immediately closed and must only be
    * called after the `'wantTrailers'` event has been emitted. When sending a
    * request or sending a response, the `options.waitForTrailers` option must be set
    * in order to keep the `Http2Stream` open after the final `DATA` frame so that
    * trailers can be sent.
    *
    * ```js
    * const http2 = require('http2');
    * const server = http2.createServer();
    * server.on('stream', (stream) => {
    *   stream.respond(undefined, { waitForTrailers: true });
    *   stream.on('wantTrailers', () => {
    *     stream.sendTrailers({ xyz: 'abc' });
    *   });
    *   stream.end('Hello World');
    * });
    * ```
    *
    * The HTTP/1 specification forbids trailers from containing HTTP/2 pseudo-header
    * fields (e.g. `':method'`, `':path'`, etc).
    * @since v10.0.0
    */
  def sendTrailers(headers: OutgoingHttpHeaders): Unit = js.native
  
  /**
    * An object containing the outbound headers sent for this `Http2Stream`.
    * @since v9.5.0
    */
  val sentHeaders: OutgoingHttpHeaders = js.native
  
  /**
    * An array of objects containing the outbound informational (additional) headers
    * sent for this `Http2Stream`.
    * @since v9.5.0
    */
  val sentInfoHeaders: js.UndefOr[js.Array[OutgoingHttpHeaders]] = js.native
  
  /**
    * An object containing the outbound trailers sent for this `HttpStream`.
    * @since v9.5.0
    */
  val sentTrailers: js.UndefOr[OutgoingHttpHeaders] = js.native
  
  /**
    * A reference to the `Http2Session` instance that owns this `Http2Stream`. The
    * value will be `undefined` after the `Http2Stream` instance is destroyed.
    * @since v8.4.0
    */
  val session: Http2Session = js.native
  
  /**
    * ```js
    * const http2 = require('http2');
    * const client = http2.connect('http://example.org:8000');
    * const { NGHTTP2_CANCEL } = http2.constants;
    * const req = client.request({ ':path': '/' });
    *
    * // Cancel the stream if there's no activity after 5 seconds
    * req.setTimeout(5000, () => req.close(NGHTTP2_CANCEL));
    * ```
    * @since v8.4.0
    */
  def setTimeout(msecs: Double): Unit = js.native
  def setTimeout(msecs: Double, callback: js.Function0[Unit]): Unit = js.native
  
  /**
    * Provides miscellaneous information about the current state of the`Http2Stream`.
    *
    * A current state of this `Http2Stream`.
    * @since v8.4.0
    */
  val state: StreamState = js.native
}
