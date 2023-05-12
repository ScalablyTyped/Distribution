package typings.node.http2Mod

import typings.node.fsPromisesMod.FileHandle
import typings.node.httpMod.OutgoingHttpHeaders
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServerHttp2Stream extends StObject {
  
  /**
    * Sends an additional informational `HEADERS` frame to the connected HTTP/2 peer.
    * @since v8.4.0
    */
  def additionalHeaders(headers: OutgoingHttpHeaders): Unit = js.native
  
  /**
    * True if headers were sent, false otherwise (read-only).
    * @since v8.4.0
    */
  val headersSent: Boolean = js.native
  
  /**
    * Read-only property mapped to the `SETTINGS_ENABLE_PUSH` flag of the remote
    * client's most recent `SETTINGS` frame. Will be `true` if the remote peer
    * accepts push streams, `false` otherwise. Settings are the same for every`Http2Stream` in the same `Http2Session`.
    * @since v8.4.0
    */
  val pushAllowed: Boolean = js.native
  
  /**
    * Initiates a push stream. The callback is invoked with the new `Http2Stream`instance created for the push stream passed as the second argument, or an`Error` passed as the first argument.
    *
    * ```js
    * const http2 = require('node:http2');
    * const server = http2.createServer();
    * server.on('stream', (stream) => {
    *   stream.respond({ ':status': 200 });
    *   stream.pushStream({ ':path': '/' }, (err, pushStream, headers) => {
    *     if (err) throw err;
    *     pushStream.respond({ ':status': 200 });
    *     pushStream.end('some pushed data');
    *   });
    *   stream.end('some data');
    * });
    * ```
    *
    * Setting the weight of a push stream is not allowed in the `HEADERS` frame. Pass
    * a `weight` value to `http2stream.priority` with the `silent` option set to`true` to enable server-side bandwidth balancing between concurrent streams.
    *
    * Calling `http2stream.pushStream()` from within a pushed stream is not permitted
    * and will throw an error.
    * @since v8.4.0
    * @param callback Callback that is called once the push stream has been initiated.
    */
  def pushStream(headers: OutgoingHttpHeaders): Unit = js.native
  def pushStream(
    headers: OutgoingHttpHeaders,
    callback: js.Function3[
      /* err */ js.Error | Null, 
      /* pushStream */ this.type, 
      /* headers */ OutgoingHttpHeaders, 
      Unit
    ]
  ): Unit = js.native
  def pushStream(
    headers: OutgoingHttpHeaders,
    options: Unit,
    callback: js.Function3[
      /* err */ js.Error | Null, 
      /* pushStream */ this.type, 
      /* headers */ OutgoingHttpHeaders, 
      Unit
    ]
  ): Unit = js.native
  def pushStream(headers: OutgoingHttpHeaders, options: StreamPriorityOptions): Unit = js.native
  def pushStream(
    headers: OutgoingHttpHeaders,
    options: StreamPriorityOptions,
    callback: js.Function3[
      /* err */ js.Error | Null, 
      /* pushStream */ this.type, 
      /* headers */ OutgoingHttpHeaders, 
      Unit
    ]
  ): Unit = js.native
  
  /**
    * ```js
    * const http2 = require('node:http2');
    * const server = http2.createServer();
    * server.on('stream', (stream) => {
    *   stream.respond({ ':status': 200 });
    *   stream.end('some data');
    * });
    * ```
    *
    * Initiates a response. When the `options.waitForTrailers` option is set, the`'wantTrailers'` event will be emitted immediately after queuing the last chunk
    * of payload data to be sent. The `http2stream.sendTrailers()` method can then be
    * used to sent trailing header fields to the peer.
    *
    * When `options.waitForTrailers` is set, the `Http2Stream` will not automatically
    * close when the final `DATA` frame is transmitted. User code must call either`http2stream.sendTrailers()` or `http2stream.close()` to close the`Http2Stream`.
    *
    * ```js
    * const http2 = require('node:http2');
    * const server = http2.createServer();
    * server.on('stream', (stream) => {
    *   stream.respond({ ':status': 200 }, { waitForTrailers: true });
    *   stream.on('wantTrailers', () => {
    *     stream.sendTrailers({ ABC: 'some value to send' });
    *   });
    *   stream.end('some data');
    * });
    * ```
    * @since v8.4.0
    */
  def respond(): Unit = js.native
  def respond(headers: Unit, options: ServerStreamResponseOptions): Unit = js.native
  def respond(headers: OutgoingHttpHeaders): Unit = js.native
  def respond(headers: OutgoingHttpHeaders, options: ServerStreamResponseOptions): Unit = js.native
  
  /**
    * Initiates a response whose data is read from the given file descriptor. No
    * validation is performed on the given file descriptor. If an error occurs while
    * attempting to read data using the file descriptor, the `Http2Stream` will be
    * closed using an `RST_STREAM` frame using the standard `INTERNAL_ERROR` code.
    *
    * When used, the `Http2Stream` object's `Duplex` interface will be closed
    * automatically.
    *
    * ```js
    * const http2 = require('node:http2');
    * const fs = require('node:fs');
    *
    * const server = http2.createServer();
    * server.on('stream', (stream) => {
    *   const fd = fs.openSync('/some/file', 'r');
    *
    *   const stat = fs.fstatSync(fd);
    *   const headers = {
    *     'content-length': stat.size,
    *     'last-modified': stat.mtime.toUTCString(),
    *     'content-type': 'text/plain; charset=utf-8',
    *   };
    *   stream.respondWithFD(fd, headers);
    *   stream.on('close', () => fs.closeSync(fd));
    * });
    * ```
    *
    * The optional `options.statCheck` function may be specified to give user code
    * an opportunity to set additional content headers based on the `fs.Stat` details
    * of the given fd. If the `statCheck` function is provided, the`http2stream.respondWithFD()` method will perform an `fs.fstat()` call to
    * collect details on the provided file descriptor.
    *
    * The `offset` and `length` options may be used to limit the response to a
    * specific range subset. This can be used, for instance, to support HTTP Range
    * requests.
    *
    * The file descriptor or `FileHandle` is not closed when the stream is closed,
    * so it will need to be closed manually once it is no longer needed.
    * Using the same file descriptor concurrently for multiple streams
    * is not supported and may result in data loss. Re-using a file descriptor
    * after a stream has finished is supported.
    *
    * When the `options.waitForTrailers` option is set, the `'wantTrailers'` event
    * will be emitted immediately after queuing the last chunk of payload data to be
    * sent. The `http2stream.sendTrailers()` method can then be used to sent trailing
    * header fields to the peer.
    *
    * When `options.waitForTrailers` is set, the `Http2Stream` will not automatically
    * close when the final `DATA` frame is transmitted. User code _must_ call either`http2stream.sendTrailers()` or `http2stream.close()` to close the`Http2Stream`.
    *
    * ```js
    * const http2 = require('node:http2');
    * const fs = require('node:fs');
    *
    * const server = http2.createServer();
    * server.on('stream', (stream) => {
    *   const fd = fs.openSync('/some/file', 'r');
    *
    *   const stat = fs.fstatSync(fd);
    *   const headers = {
    *     'content-length': stat.size,
    *     'last-modified': stat.mtime.toUTCString(),
    *     'content-type': 'text/plain; charset=utf-8',
    *   };
    *   stream.respondWithFD(fd, headers, { waitForTrailers: true });
    *   stream.on('wantTrailers', () => {
    *     stream.sendTrailers({ ABC: 'some value to send' });
    *   });
    *
    *   stream.on('close', () => fs.closeSync(fd));
    * });
    * ```
    * @since v8.4.0
    * @param fd A readable file descriptor.
    */
  def respondWithFD(fd: Double): Unit = js.native
  def respondWithFD(fd: Double, headers: Unit, options: ServerStreamFileResponseOptions): Unit = js.native
  def respondWithFD(fd: Double, headers: OutgoingHttpHeaders): Unit = js.native
  def respondWithFD(fd: Double, headers: OutgoingHttpHeaders, options: ServerStreamFileResponseOptions): Unit = js.native
  def respondWithFD(fd: FileHandle): Unit = js.native
  def respondWithFD(fd: FileHandle, headers: Unit, options: ServerStreamFileResponseOptions): Unit = js.native
  def respondWithFD(fd: FileHandle, headers: OutgoingHttpHeaders): Unit = js.native
  def respondWithFD(fd: FileHandle, headers: OutgoingHttpHeaders, options: ServerStreamFileResponseOptions): Unit = js.native
  
  /**
    * Sends a regular file as the response. The `path` must specify a regular file
    * or an `'error'` event will be emitted on the `Http2Stream` object.
    *
    * When used, the `Http2Stream` object's `Duplex` interface will be closed
    * automatically.
    *
    * The optional `options.statCheck` function may be specified to give user code
    * an opportunity to set additional content headers based on the `fs.Stat` details
    * of the given file:
    *
    * If an error occurs while attempting to read the file data, the `Http2Stream`will be closed using an `RST_STREAM` frame using the standard `INTERNAL_ERROR`code. If the `onError` callback is
    * defined, then it will be called. Otherwise
    * the stream will be destroyed.
    *
    * Example using a file path:
    *
    * ```js
    * const http2 = require('node:http2');
    * const server = http2.createServer();
    * server.on('stream', (stream) => {
    *   function statCheck(stat, headers) {
    *     headers['last-modified'] = stat.mtime.toUTCString();
    *   }
    *
    *   function onError(err) {
    *     // stream.respond() can throw if the stream has been destroyed by
    *     // the other side.
    *     try {
    *       if (err.code === 'ENOENT') {
    *         stream.respond({ ':status': 404 });
    *       } else {
    *         stream.respond({ ':status': 500 });
    *       }
    *     } catch (err) {
    *       // Perform actual error handling.
    *       console.error(err);
    *     }
    *     stream.end();
    *   }
    *
    *   stream.respondWithFile('/some/file',
    *                          { 'content-type': 'text/plain; charset=utf-8' },
    *                          { statCheck, onError });
    * });
    * ```
    *
    * The `options.statCheck` function may also be used to cancel the send operation
    * by returning `false`. For instance, a conditional request may check the stat
    * results to determine if the file has been modified to return an appropriate`304` response:
    *
    * ```js
    * const http2 = require('node:http2');
    * const server = http2.createServer();
    * server.on('stream', (stream) => {
    *   function statCheck(stat, headers) {
    *     // Check the stat here...
    *     stream.respond({ ':status': 304 });
    *     return false; // Cancel the send operation
    *   }
    *   stream.respondWithFile('/some/file',
    *                          { 'content-type': 'text/plain; charset=utf-8' },
    *                          { statCheck });
    * });
    * ```
    *
    * The `content-length` header field will be automatically set.
    *
    * The `offset` and `length` options may be used to limit the response to a
    * specific range subset. This can be used, for instance, to support HTTP Range
    * requests.
    *
    * The `options.onError` function may also be used to handle all the errors
    * that could happen before the delivery of the file is initiated. The
    * default behavior is to destroy the stream.
    *
    * When the `options.waitForTrailers` option is set, the `'wantTrailers'` event
    * will be emitted immediately after queuing the last chunk of payload data to be
    * sent. The `http2stream.sendTrailers()` method can then be used to sent trailing
    * header fields to the peer.
    *
    * When `options.waitForTrailers` is set, the `Http2Stream` will not automatically
    * close when the final `DATA` frame is transmitted. User code must call either`http2stream.sendTrailers()` or `http2stream.close()` to close the`Http2Stream`.
    *
    * ```js
    * const http2 = require('node:http2');
    * const server = http2.createServer();
    * server.on('stream', (stream) => {
    *   stream.respondWithFile('/some/file',
    *                          { 'content-type': 'text/plain; charset=utf-8' },
    *                          { waitForTrailers: true });
    *   stream.on('wantTrailers', () => {
    *     stream.sendTrailers({ ABC: 'some value to send' });
    *   });
    * });
    * ```
    * @since v8.4.0
    */
  def respondWithFile(path: String): Unit = js.native
  def respondWithFile(path: String, headers: Unit, options: ServerStreamFileResponseOptionsWithError): Unit = js.native
  def respondWithFile(path: String, headers: OutgoingHttpHeaders): Unit = js.native
  def respondWithFile(path: String, headers: OutgoingHttpHeaders, options: ServerStreamFileResponseOptionsWithError): Unit = js.native
}
