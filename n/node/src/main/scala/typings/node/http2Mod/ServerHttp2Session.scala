package typings.node.http2Mod

import typings.node.anon.Origin
import typings.node.nodeColonnetMod.Socket
import typings.node.nodeColontlsMod.TLSSocket
import typings.node.nodeColonurlMod.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServerHttp2Session extends StObject {
  
  @JSName("addListener")
  @scala.annotation.targetName("addListener_connect")
  def addListener(
    event: "connect",
    listener: js.Function2[/* session */ this.type, /* socket */ Socket | TLSSocket, Unit]
  ): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_stream")
  def addListener(
    event: "stream",
    listener: js.Function3[
      /* stream */ ServerHttp2Stream, 
      /* headers */ IncomingHttpHeaders, 
      /* flags */ Double, 
      Unit
    ]
  ): this.type = js.native
  def addListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  def addListener(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  
  def altsvc(alt: String, originOrStream: String): Unit = js.native
  /**
    * Submits an `ALTSVC` frame (as defined by [RFC 7838](https://tools.ietf.org/html/rfc7838)) to the connected client.
    *
    * ```js
    * const http2 = require('http2');
    *
    * const server = http2.createServer();
    * server.on('session', (session) => {
    *   // Set altsvc for origin https://example.org:80
    *   session.altsvc('h2=":8000"', 'https://example.org:80');
    * });
    *
    * server.on('stream', (stream) => {
    *   // Set altsvc for a specific stream
    *   stream.session.altsvc('h2=":8000"', stream.id);
    * });
    * ```
    *
    * Sending an `ALTSVC` frame with a specific stream ID indicates that the alternate
    * service is associated with the origin of the given `Http2Stream`.
    *
    * The `alt` and origin string _must_ contain only ASCII bytes and are
    * strictly interpreted as a sequence of ASCII bytes. The special value `'clear'`may be passed to clear any previously set alternative service for a given
    * domain.
    *
    * When a string is passed for the `originOrStream` argument, it will be parsed as
    * a URL and the origin will be derived. For instance, the origin for the
    * HTTP URL `'https://example.org/foo/bar'` is the ASCII string`'https://example.org'`. An error will be thrown if either the given string
    * cannot be parsed as a URL or if a valid origin cannot be derived.
    *
    * A `URL` object, or any object with an `origin` property, may be passed as`originOrStream`, in which case the value of the `origin` property will be
    * used. The value of the `origin` property _must_ be a properly serialized
    * ASCII origin.
    * @since v9.4.0
    * @param alt A description of the alternative service configuration as defined by `RFC 7838`.
    * @param originOrStream Either a URL string specifying the origin (or an `Object` with an `origin` property) or the numeric identifier of an active `Http2Stream` as given by the
    * `http2stream.id` property.
    */
  def altsvc(alt: String, originOrStream: Double): Unit = js.native
  def altsvc(alt: String, originOrStream: AlternativeServiceOptions): Unit = js.native
  def altsvc(alt: String, originOrStream: URL): Unit = js.native
  
  @JSName("emit")
  @scala.annotation.targetName("emit_connect")
  def emit(event: "connect", session: ServerHttp2Session, socket: Socket): Boolean = js.native
  @JSName("emit")
  @scala.annotation.targetName("emit_connect")
  def emit(event: "connect", session: ServerHttp2Session, socket: TLSSocket): Boolean = js.native
  @JSName("emit")
  @scala.annotation.targetName("emit_stream")
  def emit(event: "stream", stream: ServerHttp2Stream, headers: IncomingHttpHeaders, flags: Double): Boolean = js.native
  def emit(event: String, args: Any*): Boolean = js.native
  def emit(event: js.Symbol, args: Any*): Boolean = js.native
  
  @JSName("on")
  @scala.annotation.targetName("on_connect")
  def on(
    event: "connect",
    listener: js.Function2[/* session */ this.type, /* socket */ Socket | TLSSocket, Unit]
  ): this.type = js.native
  @JSName("on")
  @scala.annotation.targetName("on_stream")
  def on(
    event: "stream",
    listener: js.Function3[
      /* stream */ ServerHttp2Stream, 
      /* headers */ IncomingHttpHeaders, 
      /* flags */ Double, 
      Unit
    ]
  ): this.type = js.native
  def on(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  def on(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  
  @JSName("once")
  @scala.annotation.targetName("once_connect")
  def once(
    event: "connect",
    listener: js.Function2[/* session */ this.type, /* socket */ Socket | TLSSocket, Unit]
  ): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_stream")
  def once(
    event: "stream",
    listener: js.Function3[
      /* stream */ ServerHttp2Stream, 
      /* headers */ IncomingHttpHeaders, 
      /* flags */ Double, 
      Unit
    ]
  ): this.type = js.native
  def once(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  def once(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  
  /**
    * Submits an `ORIGIN` frame (as defined by [RFC 8336](https://tools.ietf.org/html/rfc8336)) to the connected client
    * to advertise the set of origins for which the server is capable of providing
    * authoritative responses.
    *
    * ```js
    * const http2 = require('http2');
    * const options = getSecureOptionsSomehow();
    * const server = http2.createSecureServer(options);
    * server.on('stream', (stream) => {
    *   stream.respond();
    *   stream.end('ok');
    * });
    * server.on('session', (session) => {
    *   session.origin('https://example.com', 'https://example.org');
    * });
    * ```
    *
    * When a string is passed as an `origin`, it will be parsed as a URL and the
    * origin will be derived. For instance, the origin for the HTTP URL`'https://example.org/foo/bar'` is the ASCII string`'https://example.org'`. An error will be thrown if either the given
    * string
    * cannot be parsed as a URL or if a valid origin cannot be derived.
    *
    * A `URL` object, or any object with an `origin` property, may be passed as
    * an `origin`, in which case the value of the `origin` property will be
    * used. The value of the `origin` property _must_ be a properly serialized
    * ASCII origin.
    *
    * Alternatively, the `origins` option may be used when creating a new HTTP/2
    * server using the `http2.createSecureServer()` method:
    *
    * ```js
    * const http2 = require('http2');
    * const options = getSecureOptionsSomehow();
    * options.origins = ['https://example.com', 'https://example.org'];
    * const server = http2.createSecureServer(options);
    * server.on('stream', (stream) => {
    *   stream.respond();
    *   stream.end('ok');
    * });
    * ```
    * @since v10.12.0
    * @param origins One or more URL Strings passed as separate arguments.
    */
  def origin(origins: (String | URL | Origin)*): Unit = js.native
  
  @JSName("prependListener")
  @scala.annotation.targetName("prependListener_connect")
  def prependListener(
    event: "connect",
    listener: js.Function2[/* session */ this.type, /* socket */ Socket | TLSSocket, Unit]
  ): this.type = js.native
  @JSName("prependListener")
  @scala.annotation.targetName("prependListener_stream")
  def prependListener(
    event: "stream",
    listener: js.Function3[
      /* stream */ ServerHttp2Stream, 
      /* headers */ IncomingHttpHeaders, 
      /* flags */ Double, 
      Unit
    ]
  ): this.type = js.native
  def prependListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  def prependListener(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  
  @JSName("prependOnceListener")
  @scala.annotation.targetName("prependOnceListener_connect")
  def prependOnceListener(
    event: "connect",
    listener: js.Function2[/* session */ this.type, /* socket */ Socket | TLSSocket, Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  @scala.annotation.targetName("prependOnceListener_stream")
  def prependOnceListener(
    event: "stream",
    listener: js.Function3[
      /* stream */ ServerHttp2Stream, 
      /* headers */ IncomingHttpHeaders, 
      /* flags */ Double, 
      Unit
    ]
  ): this.type = js.native
  def prependOnceListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  def prependOnceListener(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  
  val server: Http2Server | Http2SecureServer = js.native
}
