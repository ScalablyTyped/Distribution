package typings
package nodeLib.http2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("http2", "ServerHttp2Session")
@js.native
class ServerHttp2Session protected () extends Http2Session {
  val server: Http2Server | Http2SecureServer = js.native
  @JSName("addListener")
  def addListener_connect(
    event: nodeLib.nodeLibStrings.connect,
    listener: js.Function2[
      /* session */ this.type, 
      /* socket */ nodeLib.netMod.Socket | nodeLib.tlsMod.TLSSocket, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_stream(
    event: nodeLib.nodeLibStrings.stream,
    listener: js.Function3[
      /* stream */ ServerHttp2Stream, 
      /* headers */ IncomingHttpHeaders, 
      /* flags */ scala.Double, 
      scala.Unit
    ]
  ): this.type = js.native
  def altsvc(alt: java.lang.String, originOrStream: java.lang.String): scala.Unit = js.native
  def altsvc(alt: java.lang.String, originOrStream: AlternativeServiceOptions): scala.Unit = js.native
  def altsvc(alt: java.lang.String, originOrStream: nodeLib.urlMod.URL): scala.Unit = js.native
  def altsvc(alt: java.lang.String, originOrStream: scala.Double): scala.Unit = js.native
  @JSName("emit")
  def emit_connect(event: nodeLib.nodeLibStrings.connect, session: ServerHttp2Session, socket: nodeLib.netMod.Socket): scala.Boolean = js.native
  @JSName("emit")
  def emit_connect(
    event: nodeLib.nodeLibStrings.connect,
    session: ServerHttp2Session,
    socket: nodeLib.tlsMod.TLSSocket
  ): scala.Boolean = js.native
  @JSName("emit")
  def emit_stream(
    event: nodeLib.nodeLibStrings.stream,
    stream: ServerHttp2Stream,
    headers: IncomingHttpHeaders,
    flags: scala.Double
  ): scala.Boolean = js.native
  @JSName("on")
  def on_connect(
    event: nodeLib.nodeLibStrings.connect,
    listener: js.Function2[
      /* session */ this.type, 
      /* socket */ nodeLib.netMod.Socket | nodeLib.tlsMod.TLSSocket, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_stream(
    event: nodeLib.nodeLibStrings.stream,
    listener: js.Function3[
      /* stream */ ServerHttp2Stream, 
      /* headers */ IncomingHttpHeaders, 
      /* flags */ scala.Double, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_connect(
    event: nodeLib.nodeLibStrings.connect,
    listener: js.Function2[
      /* session */ this.type, 
      /* socket */ nodeLib.netMod.Socket | nodeLib.tlsMod.TLSSocket, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_stream(
    event: nodeLib.nodeLibStrings.stream,
    listener: js.Function3[
      /* stream */ ServerHttp2Stream, 
      /* headers */ IncomingHttpHeaders, 
      /* flags */ scala.Double, 
      scala.Unit
    ]
  ): this.type = js.native
  def origin(args: (java.lang.String | nodeLib.urlMod.URL | nodeLib.Anon_Origin)*): scala.Unit = js.native
  @JSName("prependListener")
  def prependListener_connect(
    event: nodeLib.nodeLibStrings.connect,
    listener: js.Function2[
      /* session */ this.type, 
      /* socket */ nodeLib.netMod.Socket | nodeLib.tlsMod.TLSSocket, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_stream(
    event: nodeLib.nodeLibStrings.stream,
    listener: js.Function3[
      /* stream */ ServerHttp2Stream, 
      /* headers */ IncomingHttpHeaders, 
      /* flags */ scala.Double, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_connect(
    event: nodeLib.nodeLibStrings.connect,
    listener: js.Function2[
      /* session */ this.type, 
      /* socket */ nodeLib.netMod.Socket | nodeLib.tlsMod.TLSSocket, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_stream(
    event: nodeLib.nodeLibStrings.stream,
    listener: js.Function3[
      /* stream */ ServerHttp2Stream, 
      /* headers */ IncomingHttpHeaders, 
      /* flags */ scala.Double, 
      scala.Unit
    ]
  ): this.type = js.native
}

