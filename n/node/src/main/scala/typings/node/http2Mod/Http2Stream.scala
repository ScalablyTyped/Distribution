package typings.node.http2Mod

import typings.node.bufferMod.global.Buffer
import typings.node.httpMod.OutgoingHttpHeaders
import typings.node.nodeColonstreamMod.Readable
import typings.node.nodeStrings.close
import typings.node.nodeStrings.data
import typings.node.nodeStrings.drain
import typings.node.nodeStrings.end
import typings.node.nodeStrings.error
import typings.node.nodeStrings.finish
import typings.node.nodeStrings.frameError
import typings.node.nodeStrings.pipe
import typings.node.nodeStrings.streamClosed
import typings.node.nodeStrings.timeout
import typings.node.nodeStrings.trailers
import typings.node.nodeStrings.unpipe
import typings.node.nodeStrings.wantTrailers
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
  
  def addListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  def addListener(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_aborted(event: typings.node.nodeStrings.aborted, listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_data(event: data, listener: js.Function1[/* chunk */ Buffer | String, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_frameError(event: frameError, listener: js.Function2[/* frameType */ Double, /* errorCode */ Double, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_streamClosed(event: streamClosed, listener: js.Function1[/* code */ Double, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_timeout(event: timeout, listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_trailers(
    event: trailers,
    listener: js.Function2[/* trailers */ IncomingHttpHeaders, /* flags */ Double, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_wantTrailers(event: wantTrailers, listener: js.Function0[Unit]): this.type = js.native
  
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
  
  def emit(event: String, args: Any*): Boolean = js.native
  def emit(event: js.Symbol, args: Any*): Boolean = js.native
  @JSName("emit")
  def emit_aborted(event: typings.node.nodeStrings.aborted): Boolean = js.native
  @JSName("emit")
  def emit_close(event: close): Boolean = js.native
  @JSName("emit")
  def emit_data(event: data, chunk: String): Boolean = js.native
  @JSName("emit")
  def emit_data(event: data, chunk: Buffer): Boolean = js.native
  @JSName("emit")
  def emit_drain(event: drain): Boolean = js.native
  @JSName("emit")
  def emit_end(event: end): Boolean = js.native
  @JSName("emit")
  def emit_error(event: error, err: js.Error): Boolean = js.native
  @JSName("emit")
  def emit_finish(event: finish): Boolean = js.native
  @JSName("emit")
  def emit_frameError(event: frameError, frameType: Double, errorCode: Double): Boolean = js.native
  @JSName("emit")
  def emit_pipe(event: pipe, src: Readable): Boolean = js.native
  @JSName("emit")
  def emit_streamClosed(event: streamClosed, code: Double): Boolean = js.native
  @JSName("emit")
  def emit_timeout(event: timeout): Boolean = js.native
  @JSName("emit")
  def emit_trailers(event: trailers, trailers: IncomingHttpHeaders, flags: Double): Boolean = js.native
  @JSName("emit")
  def emit_unpipe(event: unpipe, src: Readable): Boolean = js.native
  @JSName("emit")
  def emit_wantTrailers(event: wantTrailers): Boolean = js.native
  
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
  
  def on(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  def on(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  @JSName("on")
  def on_aborted(event: typings.node.nodeStrings.aborted, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_data(event: data, listener: js.Function1[/* chunk */ Buffer | String, Unit]): this.type = js.native
  @JSName("on")
  def on_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_end(event: end, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  @JSName("on")
  def on_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_frameError(event: frameError, listener: js.Function2[/* frameType */ Double, /* errorCode */ Double, Unit]): this.type = js.native
  @JSName("on")
  def on_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
  @JSName("on")
  def on_streamClosed(event: streamClosed, listener: js.Function1[/* code */ Double, Unit]): this.type = js.native
  @JSName("on")
  def on_timeout(event: timeout, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_trailers(
    event: trailers,
    listener: js.Function2[/* trailers */ IncomingHttpHeaders, /* flags */ Double, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
  @JSName("on")
  def on_wantTrailers(event: wantTrailers, listener: js.Function0[Unit]): this.type = js.native
  
  def once(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  def once(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  @JSName("once")
  def once_aborted(event: typings.node.nodeStrings.aborted, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_data(event: data, listener: js.Function1[/* chunk */ Buffer | String, Unit]): this.type = js.native
  @JSName("once")
  def once_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_end(event: end, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  @JSName("once")
  def once_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_frameError(event: frameError, listener: js.Function2[/* frameType */ Double, /* errorCode */ Double, Unit]): this.type = js.native
  @JSName("once")
  def once_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
  @JSName("once")
  def once_streamClosed(event: streamClosed, listener: js.Function1[/* code */ Double, Unit]): this.type = js.native
  @JSName("once")
  def once_timeout(event: timeout, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_trailers(
    event: trailers,
    listener: js.Function2[/* trailers */ IncomingHttpHeaders, /* flags */ Double, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
  @JSName("once")
  def once_wantTrailers(event: wantTrailers, listener: js.Function0[Unit]): this.type = js.native
  
  /**
    * Set to `true` if the `Http2Stream` instance has not yet been assigned a
    * numeric stream identifier.
    * @since v9.4.0
    */
  val pending: Boolean = js.native
  
  def prependListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  def prependListener(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_aborted(event: typings.node.nodeStrings.aborted, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_data(event: data, listener: js.Function1[/* chunk */ Buffer | String, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_frameError(event: frameError, listener: js.Function2[/* frameType */ Double, /* errorCode */ Double, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_streamClosed(event: streamClosed, listener: js.Function1[/* code */ Double, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_timeout(event: timeout, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_trailers(
    event: trailers,
    listener: js.Function2[/* trailers */ IncomingHttpHeaders, /* flags */ Double, Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_wantTrailers(event: wantTrailers, listener: js.Function0[Unit]): this.type = js.native
  
  def prependOnceListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  def prependOnceListener(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_aborted(event: typings.node.nodeStrings.aborted, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_data(event: data, listener: js.Function1[/* chunk */ Buffer | String, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_frameError(event: frameError, listener: js.Function2[/* frameType */ Double, /* errorCode */ Double, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_streamClosed(event: streamClosed, listener: js.Function1[/* code */ Double, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_timeout(event: timeout, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_trailers(
    event: trailers,
    listener: js.Function2[/* trailers */ IncomingHttpHeaders, /* flags */ Double, Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_wantTrailers(event: wantTrailers, listener: js.Function0[Unit]): this.type = js.native
  
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
    * const http2 = require('node:http2');
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
    * const http2 = require('node:http2');
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
