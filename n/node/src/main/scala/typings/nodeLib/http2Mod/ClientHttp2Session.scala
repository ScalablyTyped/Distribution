package typings
package nodeLib.http2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("http2", "ClientHttp2Session")
@js.native
class ClientHttp2Session protected () extends Http2Session {
  @JSName("addListener")
  def addListener_altsvc(
    event: nodeLib.nodeLibStrings.altsvc,
    listener: js.Function3[
      /* alt */ java.lang.String, 
      /* origin */ java.lang.String, 
      /* stream */ scala.Double, 
      scala.Unit
    ]
  ): this.type = js.native
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
  def addListener_origin(
    event: nodeLib.nodeLibStrings.origin,
    listener: js.Function1[/* origins */ js.Array[java.lang.String], scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_stream(
    event: nodeLib.nodeLibStrings.stream,
    listener: js.Function3[
      /* stream */ ClientHttp2Stream, 
      /* headers */ IncomingHttpHeaders with IncomingHttpStatusHeader, 
      /* flags */ scala.Double, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("emit")
  def emit_altsvc(
    event: nodeLib.nodeLibStrings.altsvc,
    alt: java.lang.String,
    origin: java.lang.String,
    stream: scala.Double
  ): scala.Boolean = js.native
  @JSName("emit")
  def emit_connect(event: nodeLib.nodeLibStrings.connect, session: ClientHttp2Session, socket: nodeLib.netMod.Socket): scala.Boolean = js.native
  @JSName("emit")
  def emit_connect(
    event: nodeLib.nodeLibStrings.connect,
    session: ClientHttp2Session,
    socket: nodeLib.tlsMod.TLSSocket
  ): scala.Boolean = js.native
  @JSName("emit")
  def emit_origin(event: nodeLib.nodeLibStrings.origin, origins: js.Array[java.lang.String]): scala.Boolean = js.native
  @JSName("emit")
  def emit_stream(
    event: nodeLib.nodeLibStrings.stream,
    stream: ClientHttp2Stream,
    headers: IncomingHttpHeaders with IncomingHttpStatusHeader,
    flags: scala.Double
  ): scala.Boolean = js.native
  @JSName("on")
  def on_altsvc(
    event: nodeLib.nodeLibStrings.altsvc,
    listener: js.Function3[
      /* alt */ java.lang.String, 
      /* origin */ java.lang.String, 
      /* stream */ scala.Double, 
      scala.Unit
    ]
  ): this.type = js.native
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
  def on_origin(
    event: nodeLib.nodeLibStrings.origin,
    listener: js.Function1[/* origins */ js.Array[java.lang.String], scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_stream(
    event: nodeLib.nodeLibStrings.stream,
    listener: js.Function3[
      /* stream */ ClientHttp2Stream, 
      /* headers */ IncomingHttpHeaders with IncomingHttpStatusHeader, 
      /* flags */ scala.Double, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_altsvc(
    event: nodeLib.nodeLibStrings.altsvc,
    listener: js.Function3[
      /* alt */ java.lang.String, 
      /* origin */ java.lang.String, 
      /* stream */ scala.Double, 
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
  def once_origin(
    event: nodeLib.nodeLibStrings.origin,
    listener: js.Function1[/* origins */ js.Array[java.lang.String], scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_stream(
    event: nodeLib.nodeLibStrings.stream,
    listener: js.Function3[
      /* stream */ ClientHttp2Stream, 
      /* headers */ IncomingHttpHeaders with IncomingHttpStatusHeader, 
      /* flags */ scala.Double, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_altsvc(
    event: nodeLib.nodeLibStrings.altsvc,
    listener: js.Function3[
      /* alt */ java.lang.String, 
      /* origin */ java.lang.String, 
      /* stream */ scala.Double, 
      scala.Unit
    ]
  ): this.type = js.native
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
  def prependListener_origin(
    event: nodeLib.nodeLibStrings.origin,
    listener: js.Function1[/* origins */ js.Array[java.lang.String], scala.Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_stream(
    event: nodeLib.nodeLibStrings.stream,
    listener: js.Function3[
      /* stream */ ClientHttp2Stream, 
      /* headers */ IncomingHttpHeaders with IncomingHttpStatusHeader, 
      /* flags */ scala.Double, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_altsvc(
    event: nodeLib.nodeLibStrings.altsvc,
    listener: js.Function3[
      /* alt */ java.lang.String, 
      /* origin */ java.lang.String, 
      /* stream */ scala.Double, 
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
  def prependOnceListener_origin(
    event: nodeLib.nodeLibStrings.origin,
    listener: js.Function1[/* origins */ js.Array[java.lang.String], scala.Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_stream(
    event: nodeLib.nodeLibStrings.stream,
    listener: js.Function3[
      /* stream */ ClientHttp2Stream, 
      /* headers */ IncomingHttpHeaders with IncomingHttpStatusHeader, 
      /* flags */ scala.Double, 
      scala.Unit
    ]
  ): this.type = js.native
  def request(): ClientHttp2Stream = js.native
  def request(headers: nodeLib.httpMod.OutgoingHttpHeaders): ClientHttp2Stream = js.native
  def request(headers: nodeLib.httpMod.OutgoingHttpHeaders, options: ClientSessionRequestOptions): ClientHttp2Stream = js.native
}

