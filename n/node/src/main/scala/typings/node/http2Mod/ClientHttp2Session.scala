package typings.node.http2Mod

import typings.node.httpMod.OutgoingHttpHeaders
import typings.node.nodeNetMod.Socket
import typings.node.nodeStrings.altsvc
import typings.node.nodeStrings.origin
import typings.node.nodeStrings.stream
import typings.node.nodeTlsMod.TLSSocket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientHttp2Session extends StObject {
  
  def addListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  def addListener(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_altsvc(
    event: altsvc,
    listener: js.Function3[/* alt */ String, /* origin */ String, /* stream */ Double, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_connect(
    event: typings.node.nodeStrings.connect,
    listener: js.Function2[/* session */ this.type, /* socket */ Socket | TLSSocket, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_origin(event: origin, listener: js.Function1[/* origins */ js.Array[String], Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_stream(
    event: stream,
    listener: js.Function3[
      /* stream */ ClientHttp2Stream, 
      /* headers */ IncomingHttpHeaders & IncomingHttpStatusHeader, 
      /* flags */ Double, 
      Unit
    ]
  ): this.type = js.native
  
  def emit(event: String, args: Any*): Boolean = js.native
  def emit(event: js.Symbol, args: Any*): Boolean = js.native
  @JSName("emit")
  def emit_altsvc(event: altsvc, alt: String, origin: String, stream: Double): Boolean = js.native
  @JSName("emit")
  def emit_connect(event: typings.node.nodeStrings.connect, session: ClientHttp2Session, socket: Socket): Boolean = js.native
  @JSName("emit")
  def emit_connect(event: typings.node.nodeStrings.connect, session: ClientHttp2Session, socket: TLSSocket): Boolean = js.native
  @JSName("emit")
  def emit_origin(event: origin, origins: js.Array[String]): Boolean = js.native
  @JSName("emit")
  def emit_stream(
    event: stream,
    stream: ClientHttp2Stream,
    headers: IncomingHttpHeaders & IncomingHttpStatusHeader,
    flags: Double
  ): Boolean = js.native
  
  def on(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  def on(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  @JSName("on")
  def on_altsvc(
    event: altsvc,
    listener: js.Function3[/* alt */ String, /* origin */ String, /* stream */ Double, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_connect(
    event: typings.node.nodeStrings.connect,
    listener: js.Function2[/* session */ this.type, /* socket */ Socket | TLSSocket, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_origin(event: origin, listener: js.Function1[/* origins */ js.Array[String], Unit]): this.type = js.native
  @JSName("on")
  def on_stream(
    event: stream,
    listener: js.Function3[
      /* stream */ ClientHttp2Stream, 
      /* headers */ IncomingHttpHeaders & IncomingHttpStatusHeader, 
      /* flags */ Double, 
      Unit
    ]
  ): this.type = js.native
  
  def once(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  def once(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  @JSName("once")
  def once_altsvc(
    event: altsvc,
    listener: js.Function3[/* alt */ String, /* origin */ String, /* stream */ Double, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_connect(
    event: typings.node.nodeStrings.connect,
    listener: js.Function2[/* session */ this.type, /* socket */ Socket | TLSSocket, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_origin(event: origin, listener: js.Function1[/* origins */ js.Array[String], Unit]): this.type = js.native
  @JSName("once")
  def once_stream(
    event: stream,
    listener: js.Function3[
      /* stream */ ClientHttp2Stream, 
      /* headers */ IncomingHttpHeaders & IncomingHttpStatusHeader, 
      /* flags */ Double, 
      Unit
    ]
  ): this.type = js.native
  
  def prependListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  def prependListener(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_altsvc(
    event: altsvc,
    listener: js.Function3[/* alt */ String, /* origin */ String, /* stream */ Double, Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_connect(
    event: typings.node.nodeStrings.connect,
    listener: js.Function2[/* session */ this.type, /* socket */ Socket | TLSSocket, Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_origin(event: origin, listener: js.Function1[/* origins */ js.Array[String], Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_stream(
    event: stream,
    listener: js.Function3[
      /* stream */ ClientHttp2Stream, 
      /* headers */ IncomingHttpHeaders & IncomingHttpStatusHeader, 
      /* flags */ Double, 
      Unit
    ]
  ): this.type = js.native
  
  def prependOnceListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  def prependOnceListener(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_altsvc(
    event: altsvc,
    listener: js.Function3[/* alt */ String, /* origin */ String, /* stream */ Double, Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_connect(
    event: typings.node.nodeStrings.connect,
    listener: js.Function2[/* session */ this.type, /* socket */ Socket | TLSSocket, Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_origin(event: origin, listener: js.Function1[/* origins */ js.Array[String], Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_stream(
    event: stream,
    listener: js.Function3[
      /* stream */ ClientHttp2Stream, 
      /* headers */ IncomingHttpHeaders & IncomingHttpStatusHeader, 
      /* flags */ Double, 
      Unit
    ]
  ): this.type = js.native
  
  /**
    * For HTTP/2 Client `Http2Session` instances only, the `http2session.request()`creates and returns an `Http2Stream` instance that can be used to send an
    * HTTP/2 request to the connected server.
    *
    * When a `ClientHttp2Session` is first created, the socket may not yet be
    * connected. if `clienthttp2session.request()` is called during this time, the
    * actual request will be deferred until the socket is ready to go.
    * If the `session` is closed before the actual request be executed, an`ERR_HTTP2_GOAWAY_SESSION` is thrown.
    *
    * This method is only available if `http2session.type` is equal to`http2.constants.NGHTTP2_SESSION_CLIENT`.
    *
    * ```js
    * const http2 = require('http2');
    * const clientSession = http2.connect('https://localhost:1234');
    * const {
    *   HTTP2_HEADER_PATH,
    *   HTTP2_HEADER_STATUS
    * } = http2.constants;
    *
    * const req = clientSession.request({ [HTTP2_HEADER_PATH]: '/' });
    * req.on('response', (headers) => {
    *   console.log(headers[HTTP2_HEADER_STATUS]);
    *   req.on('data', (chunk) => { // ..  });
    *   req.on('end', () => { // ..  });
    * });
    * ```
    *
    * When the `options.waitForTrailers` option is set, the `'wantTrailers'` event
    * is emitted immediately after queuing the last chunk of payload data to be sent.
    * The `http2stream.sendTrailers()` method can then be called to send trailing
    * headers to the peer.
    *
    * When `options.waitForTrailers` is set, the `Http2Stream` will not automatically
    * close when the final `DATA` frame is transmitted. User code must call either`http2stream.sendTrailers()` or `http2stream.close()` to close the`Http2Stream`.
    *
    * When `options.signal` is set with an `AbortSignal` and then `abort` on the
    * corresponding `AbortController` is called, the request will emit an `'error'`event with an `AbortError` error.
    *
    * The `:method` and `:path` pseudo-headers are not specified within `headers`,
    * they respectively default to:
    *
    * * `:method` \= `'GET'`
    * * `:path` \= `/`
    * @since v8.4.0
    */
  def request(): ClientHttp2Stream = js.native
  def request(headers: Unit, options: ClientSessionRequestOptions): ClientHttp2Stream = js.native
  def request(headers: OutgoingHttpHeaders): ClientHttp2Stream = js.native
  def request(headers: OutgoingHttpHeaders, options: ClientSessionRequestOptions): ClientHttp2Stream = js.native
}
