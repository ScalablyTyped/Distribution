package typings.node.http2Mod

import typings.node.bufferMod.global.BufferEncoding
import typings.node.httpMod.OutgoingHttpHeaders
import typings.node.nodeColonnetMod.Socket
import typings.node.nodeColonstreamMod.Readable
import typings.node.nodeColontlsMod.TLSSocket
import typings.node.nodeStrings._empty
import typings.node.nodeStrings.close
import typings.node.nodeStrings.drain
import typings.node.nodeStrings.error
import typings.node.nodeStrings.finish
import typings.node.nodeStrings.pipe
import typings.node.nodeStrings.unpipe
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("http2", "Http2ServerResponse")
@js.native
open class Http2ServerResponse protected () extends StObject {
  def this(stream: ServerHttp2Stream) = this()
  
  def addListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  def addListener(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_error(event: error, listener: js.Function1[/* error */ js.Error, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
  
  /**
    * This method adds HTTP trailing headers (a header but at the end of the
    * message) to the response.
    *
    * Attempting to set a header field name or value that contains invalid characters
    * will result in a `TypeError` being thrown.
    * @since v8.4.0
    */
  def addTrailers(trailers: OutgoingHttpHeaders): Unit = js.native
  
  /**
    * See `response.socket`.
    * @since v8.4.0
    * @deprecated Since v13.0.0 - Use `socket`.
    */
  val connection: Socket | TLSSocket = js.native
  
  /**
    * Call `http2stream.pushStream()` with the given headers, and wrap the
    * given `Http2Stream` on a newly created `Http2ServerResponse` as the callback
    * parameter if successful. When `Http2ServerRequest` is closed, the callback is
    * called with an error `ERR_HTTP2_INVALID_STREAM`.
    * @since v8.4.0
    * @param headers An object describing the headers
    * @param callback Called once `http2stream.pushStream()` is finished, or either when the attempt to create the pushed `Http2Stream` has failed or has been rejected, or the state of
    * `Http2ServerRequest` is closed prior to calling the `http2stream.pushStream()` method
    */
  def createPushResponse(
    headers: OutgoingHttpHeaders,
    callback: js.Function2[/* err */ js.Error | Null, /* res */ this.type, Unit]
  ): Unit = js.native
  
  def emit(event: String, args: Any*): Boolean = js.native
  def emit(event: js.Symbol, args: Any*): Boolean = js.native
  @JSName("emit")
  def emit_close(event: close): Boolean = js.native
  @JSName("emit")
  def emit_drain(event: drain): Boolean = js.native
  @JSName("emit")
  def emit_error(event: error, error: js.Error): Boolean = js.native
  @JSName("emit")
  def emit_finish(event: finish): Boolean = js.native
  @JSName("emit")
  def emit_pipe(event: pipe, src: Readable): Boolean = js.native
  @JSName("emit")
  def emit_unpipe(event: unpipe, src: Readable): Boolean = js.native
  
  /**
    * This method signals to the server that all of the response headers and body
    * have been sent; that server should consider this message complete.
    * The method, `response.end()`, MUST be called on each response.
    *
    * If `data` is specified, it is equivalent to calling `response.write(data, encoding)` followed by `response.end(callback)`.
    *
    * If `callback` is specified, it will be called when the response stream
    * is finished.
    * @since v8.4.0
    */
  def end(): this.type = js.native
  def end(callback: js.Function0[Unit]): this.type = js.native
  def end(data: String): this.type = js.native
  def end(data: String, callback: js.Function0[Unit]): this.type = js.native
  def end(data: String, encoding: BufferEncoding): this.type = js.native
  def end(data: String, encoding: BufferEncoding, callback: js.Function0[Unit]): this.type = js.native
  def end(data: js.typedarray.Uint8Array): this.type = js.native
  def end(data: js.typedarray.Uint8Array, callback: js.Function0[Unit]): this.type = js.native
  def end(data: js.typedarray.Uint8Array, encoding: BufferEncoding): this.type = js.native
  def end(data: js.typedarray.Uint8Array, encoding: BufferEncoding, callback: js.Function0[Unit]): this.type = js.native
  
  /**
    * Boolean value that indicates whether the response has completed. Starts
    * as `false`. After `response.end()` executes, the value will be `true`.
    * @since v8.4.0
    * @deprecated Since v13.4.0,v12.16.0 - Use `writableEnded`.
    */
  val finished: Boolean = js.native
  
  /**
    * Reads out a header that has already been queued but not sent to the client.
    * The name is case-insensitive.
    *
    * ```js
    * const contentType = response.getHeader('content-type');
    * ```
    * @since v8.4.0
    */
  def getHeader(name: String): String = js.native
  
  /**
    * Returns an array containing the unique names of the current outgoing headers.
    * All header names are lowercase.
    *
    * ```js
    * response.setHeader('Foo', 'bar');
    * response.setHeader('Set-Cookie', ['foo=bar', 'bar=baz']);
    *
    * const headerNames = response.getHeaderNames();
    * // headerNames === ['foo', 'set-cookie']
    * ```
    * @since v8.4.0
    */
  def getHeaderNames(): js.Array[String] = js.native
  
  /**
    * Returns a shallow copy of the current outgoing headers. Since a shallow copy
    * is used, array values may be mutated without additional calls to various
    * header-related http module methods. The keys of the returned object are the
    * header names and the values are the respective header values. All header names
    * are lowercase.
    *
    * The object returned by the `response.getHeaders()` method _does not_prototypically inherit from the JavaScript `Object`. This means that typical`Object` methods such as `obj.toString()`,
    * `obj.hasOwnProperty()`, and others
    * are not defined and _will not work_.
    *
    * ```js
    * response.setHeader('Foo', 'bar');
    * response.setHeader('Set-Cookie', ['foo=bar', 'bar=baz']);
    *
    * const headers = response.getHeaders();
    * // headers === { foo: 'bar', 'set-cookie': ['foo=bar', 'bar=baz'] }
    * ```
    * @since v8.4.0
    */
  def getHeaders(): OutgoingHttpHeaders = js.native
  
  /**
    * Returns `true` if the header identified by `name` is currently set in the
    * outgoing headers. The header name matching is case-insensitive.
    *
    * ```js
    * const hasContentType = response.hasHeader('content-type');
    * ```
    * @since v8.4.0
    */
  def hasHeader(name: String): Boolean = js.native
  
  /**
    * True if headers were sent, false otherwise (read-only).
    * @since v8.4.0
    */
  val headersSent: Boolean = js.native
  
  def on(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  def on(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  @JSName("on")
  def on_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_error(event: error, listener: js.Function1[/* error */ js.Error, Unit]): this.type = js.native
  @JSName("on")
  def on_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
  @JSName("on")
  def on_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
  
  def once(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  def once(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  @JSName("once")
  def once_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_error(event: error, listener: js.Function1[/* error */ js.Error, Unit]): this.type = js.native
  @JSName("once")
  def once_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
  @JSName("once")
  def once_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
  
  def prependListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  def prependListener(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_error(event: error, listener: js.Function1[/* error */ js.Error, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
  
  def prependOnceListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  def prependOnceListener(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_error(event: error, listener: js.Function1[/* error */ js.Error, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
  
  /**
    * Removes a header that has been queued for implicit sending.
    *
    * ```js
    * response.removeHeader('Content-Encoding');
    * ```
    * @since v8.4.0
    */
  def removeHeader(name: String): Unit = js.native
  
  /**
    * A reference to the original HTTP2 request object.
    * @since v15.7.0
    */
  val req: Http2ServerRequest = js.native
  
  /**
    * When true, the Date header will be automatically generated and sent in
    * the response if it is not already present in the headers. Defaults to true.
    *
    * This should only be disabled for testing; HTTP requires the Date header
    * in responses.
    * @since v8.4.0
    */
  var sendDate: Boolean = js.native
  
  def setHeader(name: String, value: String): Unit = js.native
  def setHeader(name: String, value: js.Array[String]): Unit = js.native
  /**
    * Sets a single header value for implicit headers. If this header already exists
    * in the to-be-sent headers, its value will be replaced. Use an array of strings
    * here to send multiple headers with the same name.
    *
    * ```js
    * response.setHeader('Content-Type', 'text/html; charset=utf-8');
    * ```
    *
    * or
    *
    * ```js
    * response.setHeader('Set-Cookie', ['type=ninja', 'language=javascript']);
    * ```
    *
    * Attempting to set a header field name or value that contains invalid characters
    * will result in a `TypeError` being thrown.
    *
    * When headers have been set with `response.setHeader()`, they will be merged
    * with any headers passed to `response.writeHead()`, with the headers passed
    * to `response.writeHead()` given precedence.
    *
    * ```js
    * // Returns content-type = text/plain
    * const server = http2.createServer((req, res) => {
    *   res.setHeader('Content-Type', 'text/html; charset=utf-8');
    *   res.setHeader('X-Foo', 'bar');
    *   res.writeHead(200, { 'Content-Type': 'text/plain; charset=utf-8' });
    *   res.end('ok');
    * });
    * ```
    * @since v8.4.0
    */
  def setHeader(name: String, value: Double): Unit = js.native
  
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
    * set on `response.stream`.
    *
    * `destroy`, `emit`, `end`, `on` and `once` methods will be called on`response.stream`.
    *
    * `setTimeout` method will be called on `response.stream.session`.
    *
    * `pause`, `read`, `resume`, and `write` will throw an error with code`ERR_HTTP2_NO_SOCKET_MANIPULATION`. See `Http2Session and Sockets` for
    * more information.
    *
    * All other interactions will be routed directly to the socket.
    *
    * ```js
    * const http2 = require('http2');
    * const server = http2.createServer((req, res) => {
    *   const ip = req.socket.remoteAddress;
    *   const port = req.socket.remotePort;
    *   res.end(`Your IP address is ${ip} and your source port is ${port}.`);
    * }).listen(3000);
    * ```
    * @since v8.4.0
    */
  val socket: Socket | TLSSocket = js.native
  
  /**
    * When using implicit headers (not calling `response.writeHead()` explicitly),
    * this property controls the status code that will be sent to the client when
    * the headers get flushed.
    *
    * ```js
    * response.statusCode = 404;
    * ```
    *
    * After response header was sent to the client, this property indicates the
    * status code which was sent out.
    * @since v8.4.0
    */
  var statusCode: Double = js.native
  
  /**
    * Status message is not supported by HTTP/2 (RFC 7540 8.1.2.4). It returns
    * an empty string.
    * @since v8.4.0
    */
  var statusMessage: _empty = js.native
  
  /**
    * The `Http2Stream` object backing the response.
    * @since v8.4.0
    */
  val stream: ServerHttp2Stream = js.native
  
  /**
    * If this method is called and `response.writeHead()` has not been called,
    * it will switch to implicit header mode and flush the implicit headers.
    *
    * This sends a chunk of the response body. This method may
    * be called multiple times to provide successive parts of the body.
    *
    * In the `http` module, the response body is omitted when the
    * request is a HEAD request. Similarly, the `204` and `304` responses _must not_ include a message body.
    *
    * `chunk` can be a string or a buffer. If `chunk` is a string,
    * the second parameter specifies how to encode it into a byte stream.
    * By default the `encoding` is `'utf8'`. `callback` will be called when this chunk
    * of data is flushed.
    *
    * This is the raw HTTP body and has nothing to do with higher-level multi-part
    * body encodings that may be used.
    *
    * The first time `response.write()` is called, it will send the buffered
    * header information and the first chunk of the body to the client. The second
    * time `response.write()` is called, Node.js assumes data will be streamed,
    * and sends the new data separately. That is, the response is buffered up to the
    * first chunk of the body.
    *
    * Returns `true` if the entire data was flushed successfully to the kernel
    * buffer. Returns `false` if all or part of the data was queued in user memory.`'drain'` will be emitted when the buffer is free again.
    * @since v8.4.0
    */
  def write(chunk: String): Boolean = js.native
  def write(chunk: String, callback: js.Function1[/* err */ js.Error, Unit]): Boolean = js.native
  def write(chunk: String, encoding: BufferEncoding): Boolean = js.native
  def write(chunk: String, encoding: BufferEncoding, callback: js.Function1[/* err */ js.Error, Unit]): Boolean = js.native
  def write(chunk: js.typedarray.Uint8Array): Boolean = js.native
  def write(chunk: js.typedarray.Uint8Array, callback: js.Function1[/* err */ js.Error, Unit]): Boolean = js.native
  def write(chunk: js.typedarray.Uint8Array, encoding: BufferEncoding): Boolean = js.native
  def write(
    chunk: js.typedarray.Uint8Array,
    encoding: BufferEncoding,
    callback: js.Function1[/* err */ js.Error, Unit]
  ): Boolean = js.native
  
  /**
    * Sends a status `100 Continue` to the client, indicating that the request body
    * should be sent. See the `'checkContinue'` event on `Http2Server` and`Http2SecureServer`.
    * @since v8.4.0
    */
  def writeContinue(): Unit = js.native
  
  /**
    * Sends a status `103 Early Hints` to the client with a Link header,
    * indicating that the user agent can preload/preconnect the linked resources.
    * The `hints` is an object containing the values of headers to be sent with
    * early hints message.
    *
    * Example:
    *
    * ```js
    * const earlyHintsLink = '</styles.css>; rel=preload; as=style';
    * response.writeEarlyHints({
    *   'link': earlyHintsLink,
    * });
    *
    * const earlyHintsLinks = [
    *   '</styles.css>; rel=preload; as=style',
    *   '</scripts.js>; rel=preload; as=script',
    * ];
    * response.writeEarlyHints({
    *   'link': earlyHintsLinks,
    *   'x-trace-id': 'id for diagnostics'
    * });
    * ```
    *
    * @since v18.11.0
    * @param hints An object containing the values of headers
    */
  def writeEarlyHints(hints: Record[String, String | js.Array[String]]): Unit = js.native
  
  /**
    * Sends a response header to the request. The status code is a 3-digit HTTP
    * status code, like `404`. The last argument, `headers`, are the response headers.
    *
    * Returns a reference to the `Http2ServerResponse`, so that calls can be chained.
    *
    * For compatibility with `HTTP/1`, a human-readable `statusMessage` may be
    * passed as the second argument. However, because the `statusMessage` has no
    * meaning within HTTP/2, the argument will have no effect and a process warning
    * will be emitted.
    *
    * ```js
    * const body = 'hello world';
    * response.writeHead(200, {
    *   'Content-Length': Buffer.byteLength(body),
    *   'Content-Type': 'text/plain; charset=utf-8',
    * });
    * ```
    *
    * `Content-Length` is given in bytes not characters. The`Buffer.byteLength()` API may be used to determine the number of bytes in a
    * given encoding. On outbound messages, Node.js does not check if Content-Length
    * and the length of the body being transmitted are equal or not. However, when
    * receiving messages, Node.js will automatically reject messages when the`Content-Length` does not match the actual payload size.
    *
    * This method may be called at most one time on a message before `response.end()` is called.
    *
    * If `response.write()` or `response.end()` are called before calling
    * this, the implicit/mutable headers will be calculated and call this function.
    *
    * When headers have been set with `response.setHeader()`, they will be merged
    * with any headers passed to `response.writeHead()`, with the headers passed
    * to `response.writeHead()` given precedence.
    *
    * ```js
    * // Returns content-type = text/plain
    * const server = http2.createServer((req, res) => {
    *   res.setHeader('Content-Type', 'text/html; charset=utf-8');
    *   res.setHeader('X-Foo', 'bar');
    *   res.writeHead(200, { 'Content-Type': 'text/plain; charset=utf-8' });
    *   res.end('ok');
    * });
    * ```
    *
    * Attempting to set a header field name or value that contains invalid characters
    * will result in a `TypeError` being thrown.
    * @since v8.4.0
    */
  def writeHead(statusCode: Double): this.type = js.native
  def writeHead(statusCode: Double, headers: OutgoingHttpHeaders): this.type = js.native
  def writeHead(statusCode: Double, statusMessage: String): this.type = js.native
  def writeHead(statusCode: Double, statusMessage: String, headers: OutgoingHttpHeaders): this.type = js.native
}
