package typings.node.http2Mod

import typings.node.AnonOrigin
import typings.node.netMod.Socket
import typings.node.nodeStrings.stream
import typings.node.tlsMod.TLSSocket
import typings.node.urlMod.URL_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerHttp2Session extends Http2Session {
  val server: Http2Server | Http2SecureServer = js.native
  @JSName("addListener")
  def addListener_connect(
    event: typings.node.nodeStrings.connect,
    listener: js.Function2[/* session */ this.type, /* socket */ Socket | TLSSocket, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_stream(
    event: stream,
    listener: js.Function3[
      /* stream */ ServerHttp2Stream, 
      /* headers */ IncomingHttpHeaders, 
      /* flags */ Double, 
      Unit
    ]
  ): this.type = js.native
  def altsvc(alt: String, originOrStream: String): Unit = js.native
  def altsvc(alt: String, originOrStream: Double): Unit = js.native
  def altsvc(alt: String, originOrStream: AlternativeServiceOptions): Unit = js.native
  def altsvc(alt: String, originOrStream: URL_): Unit = js.native
  @JSName("emit")
  def emit_connect(event: typings.node.nodeStrings.connect, session: ServerHttp2Session, socket: Socket): Boolean = js.native
  @JSName("emit")
  def emit_connect(event: typings.node.nodeStrings.connect, session: ServerHttp2Session, socket: TLSSocket): Boolean = js.native
  @JSName("emit")
  def emit_stream(event: stream, stream: ServerHttp2Stream, headers: IncomingHttpHeaders, flags: Double): Boolean = js.native
  @JSName("on")
  def on_connect(
    event: typings.node.nodeStrings.connect,
    listener: js.Function2[/* session */ this.type, /* socket */ Socket | TLSSocket, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_stream(
    event: stream,
    listener: js.Function3[
      /* stream */ ServerHttp2Stream, 
      /* headers */ IncomingHttpHeaders, 
      /* flags */ Double, 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_connect(
    event: typings.node.nodeStrings.connect,
    listener: js.Function2[/* session */ this.type, /* socket */ Socket | TLSSocket, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_stream(
    event: stream,
    listener: js.Function3[
      /* stream */ ServerHttp2Stream, 
      /* headers */ IncomingHttpHeaders, 
      /* flags */ Double, 
      Unit
    ]
  ): this.type = js.native
  def origin(args: (String | URL_ | AnonOrigin)*): Unit = js.native
  @JSName("prependListener")
  def prependListener_connect(
    event: typings.node.nodeStrings.connect,
    listener: js.Function2[/* session */ this.type, /* socket */ Socket | TLSSocket, Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_stream(
    event: stream,
    listener: js.Function3[
      /* stream */ ServerHttp2Stream, 
      /* headers */ IncomingHttpHeaders, 
      /* flags */ Double, 
      Unit
    ]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_connect(
    event: typings.node.nodeStrings.connect,
    listener: js.Function2[/* session */ this.type, /* socket */ Socket | TLSSocket, Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_stream(
    event: stream,
    listener: js.Function3[
      /* stream */ ServerHttp2Stream, 
      /* headers */ IncomingHttpHeaders, 
      /* flags */ Double, 
      Unit
    ]
  ): this.type = js.native
}

