package typings.node.http2Mod

import typings.node.bufferMod.global.Buffer
import typings.node.nodeColonnetMod.Socket
import typings.node.nodeColontlsMod.TLSSocket
import typings.node.nodeStrings.close
import typings.node.nodeStrings.data
import typings.node.nodeStrings.end
import typings.node.nodeStrings.error
import typings.node.nodeStrings.readable
import typings.node.streamMod.ReadableOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("http2", "Http2ServerRequest")
@js.native
open class Http2ServerRequest protected () extends StObject {
  def this(
    stream: ServerHttp2Stream,
    headers: IncomingHttpHeaders,
    options: ReadableOptions,
    rawHeaders: js.Array[String]
  ) = this()
  
  /**
    * The `request.aborted` property will be `true` if the request has
    * been aborted.
    * @since v10.1.0
    */
  val aborted: Boolean = js.native
  
  def addListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  def addListener(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_aborted(
    event: typings.node.nodeStrings.aborted,
    listener: js.Function2[/* hadError */ Boolean, /* code */ Double, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_data(event: data, listener: js.Function1[/* chunk */ Buffer | String, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
  
  /**
    * The request authority pseudo header field. Because HTTP/2 allows requests
    * to set either `:authority` or `host`, this value is derived from`req.headers[':authority']` if present. Otherwise, it is derived from`req.headers['host']`.
    * @since v8.4.0
    */
  val authority: String = js.native
  
  /**
    * The `request.complete` property will be `true` if the request has
    * been completed, aborted, or destroyed.
    * @since v12.10.0
    */
  val complete: Boolean = js.native
  
  /**
    * See `request.socket`.
    * @since v8.4.0
    * @deprecated Since v13.0.0 - Use `socket`.
    */
  val connection: Socket | TLSSocket = js.native
  
  def emit(event: String, args: Any*): Boolean = js.native
  def emit(event: js.Symbol, args: Any*): Boolean = js.native
  @JSName("emit")
  def emit_aborted(event: typings.node.nodeStrings.aborted, hadError: Boolean, code: Double): Boolean = js.native
  @JSName("emit")
  def emit_close(event: close): Boolean = js.native
  @JSName("emit")
  def emit_data(event: data, chunk: String): Boolean = js.native
  @JSName("emit")
  def emit_data(event: data, chunk: Buffer): Boolean = js.native
  @JSName("emit")
  def emit_end(event: end): Boolean = js.native
  @JSName("emit")
  def emit_error(event: error, err: js.Error): Boolean = js.native
  @JSName("emit")
  def emit_readable(event: readable): Boolean = js.native
  
  /**
    * The request/response headers object.
    *
    * Key-value pairs of header names and values. Header names are lower-cased.
    *
    * ```js
    * // Prints something like:
    * //
    * // { 'user-agent': 'curl/7.22.0',
    * //   host: '127.0.0.1:8000',
    * //   accept: '*' }
    * console.log(request.headers);
    * ```
    *
    * See `HTTP/2 Headers Object`.
    *
    * In HTTP/2, the request path, host name, protocol, and method are represented as
    * special headers prefixed with the `:` character (e.g. `':path'`). These special
    * headers will be included in the `request.headers` object. Care must be taken not
    * to inadvertently modify these special headers or errors may occur. For instance,
    * removing all headers from the request will cause errors to occur:
    *
    * ```js
    * removeAllHeaders(request.headers);
    * assert(request.url);   // Fails because the :path header has been removed
    * ```
    * @since v8.4.0
    */
  val headers: IncomingHttpHeaders = js.native
  
  /**
    * In case of server request, the HTTP version sent by the client. In the case of
    * client response, the HTTP version of the connected-to server. Returns`'2.0'`.
    *
    * Also `message.httpVersionMajor` is the first integer and`message.httpVersionMinor` is the second.
    * @since v8.4.0
    */
  val httpVersion: String = js.native
  
  val httpVersionMajor: Double = js.native
  
  val httpVersionMinor: Double = js.native
  
  /**
    * The request method as a string. Read-only. Examples: `'GET'`, `'DELETE'`.
    * @since v8.4.0
    */
  val method: String = js.native
  
  def on(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  def on(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  @JSName("on")
  def on_aborted(
    event: typings.node.nodeStrings.aborted,
    listener: js.Function2[/* hadError */ Boolean, /* code */ Double, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_data(event: data, listener: js.Function1[/* chunk */ Buffer | String, Unit]): this.type = js.native
  @JSName("on")
  def on_end(event: end, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  @JSName("on")
  def on_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
  
  def once(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  def once(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  @JSName("once")
  def once_aborted(
    event: typings.node.nodeStrings.aborted,
    listener: js.Function2[/* hadError */ Boolean, /* code */ Double, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_data(event: data, listener: js.Function1[/* chunk */ Buffer | String, Unit]): this.type = js.native
  @JSName("once")
  def once_end(event: end, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  @JSName("once")
  def once_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
  
  def prependListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  def prependListener(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_aborted(
    event: typings.node.nodeStrings.aborted,
    listener: js.Function2[/* hadError */ Boolean, /* code */ Double, Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_data(event: data, listener: js.Function1[/* chunk */ Buffer | String, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
  
  def prependOnceListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  def prependOnceListener(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_aborted(
    event: typings.node.nodeStrings.aborted,
    listener: js.Function2[/* hadError */ Boolean, /* code */ Double, Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_data(event: data, listener: js.Function1[/* chunk */ Buffer | String, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
  
  /**
    * The raw request/response headers list exactly as they were received.
    *
    * The keys and values are in the same list. It is _not_ a
    * list of tuples. So, the even-numbered offsets are key values, and the
    * odd-numbered offsets are the associated values.
    *
    * Header names are not lowercased, and duplicates are not merged.
    *
    * ```js
    * // Prints something like:
    * //
    * // [ 'user-agent',
    * //   'this is invalid because there can be only one',
    * //   'User-Agent',
    * //   'curl/7.22.0',
    * //   'Host',
    * //   '127.0.0.1:8000',
    * //   'ACCEPT',
    * //   '*' ]
    * console.log(request.rawHeaders);
    * ```
    * @since v8.4.0
    */
  val rawHeaders: js.Array[String] = js.native
  
  /**
    * The raw request/response trailer keys and values exactly as they were
    * received. Only populated at the `'end'` event.
    * @since v8.4.0
    */
  val rawTrailers: js.Array[String] = js.native
  
  def read(): Buffer | String | Null = js.native
  def read(size: Double): Buffer | String | Null = js.native
  
  /**
    * The request scheme pseudo header field indicating the scheme
    * portion of the target URL.
    * @since v8.4.0
    */
  val scheme: String = js.native
  
  /**
    * Sets the `Http2Stream`'s timeout value to `msecs`. If a callback is
    * provided, then it is added as a listener on the `'timeout'` event on
    * the response object.
    *
    * If no `'timeout'` listener is added to the request, the response, or
    * the server, then `Http2Stream` s are destroyed when they time out. If a
    * handler is assigned to the request, the response, or the server's `'timeout'`events, timed out sockets must be handled explicitly.
    * @since v8.4.0
    */
  def setTimeout(msecs: Double): Unit = js.native
  def setTimeout(msecs: Double, callback: js.Function0[Unit]): Unit = js.native
  
  /**
    * Returns a `Proxy` object that acts as a `net.Socket` (or `tls.TLSSocket`) but
    * applies getters, setters, and methods based on HTTP/2 logic.
    *
    * `destroyed`, `readable`, and `writable` properties will be retrieved from and
    * set on `request.stream`.
    *
    * `destroy`, `emit`, `end`, `on` and `once` methods will be called on`request.stream`.
    *
    * `setTimeout` method will be called on `request.stream.session`.
    *
    * `pause`, `read`, `resume`, and `write` will throw an error with code`ERR_HTTP2_NO_SOCKET_MANIPULATION`. See `Http2Session and Sockets` for
    * more information.
    *
    * All other interactions will be routed directly to the socket. With TLS support,
    * use `request.socket.getPeerCertificate()` to obtain the client's
    * authentication details.
    * @since v8.4.0
    */
  val socket: Socket | TLSSocket = js.native
  
  /**
    * The `Http2Stream` object backing the request.
    * @since v8.4.0
    */
  val stream: ServerHttp2Stream = js.native
  
  /**
    * The request/response trailers object. Only populated at the `'end'` event.
    * @since v8.4.0
    */
  val trailers: IncomingHttpHeaders = js.native
  
  /**
    * Request URL string. This contains only the URL that is present in the actual
    * HTTP request. If the request is:
    *
    * ```http
    * GET /status?name=ryan HTTP/1.1
    * Accept: text/plain
    * ```
    *
    * Then `request.url` will be:
    *
    * ```js
    * '/status?name=ryan'
    * ```
    *
    * To parse the url into its parts, `new URL()` can be used:
    *
    * ```console
    * $ node
    * > new URL('/status?name=ryan', 'http://example.com')
    * URL {
    *   href: 'http://example.com/status?name=ryan',
    *   origin: 'http://example.com',
    *   protocol: 'http:',
    *   username: '',
    *   password: '',
    *   host: 'example.com',
    *   hostname: 'example.com',
    *   port: '',
    *   pathname: '/status',
    *   search: '?name=ryan',
    *   searchParams: URLSearchParams { 'name' => 'ryan' },
    *   hash: ''
    * }
    * ```
    * @since v8.4.0
    */
  var url: String = js.native
}
