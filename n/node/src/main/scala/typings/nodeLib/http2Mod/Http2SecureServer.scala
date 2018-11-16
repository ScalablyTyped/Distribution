package typings
package nodeLib.http2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Http2SecureServer
  extends nodeLib.tlsMod.Server {
  @JSName("addListener")
  def addListener_checkContinue(
    event: nodeLib.nodeLibStrings.checkContinue,
    listener: js.Function2[/* request */ Http2ServerRequest, /* response */ Http2ServerResponse, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_request(
    event: nodeLib.nodeLibStrings.request,
    listener: js.Function2[/* request */ Http2ServerRequest, /* response */ Http2ServerResponse, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_sessionError(
    event: nodeLib.nodeLibStrings.sessionError,
    listener: js.Function1[/* err */ nodeLib.Error, scala.Unit]
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
  @JSName("addListener")
  def addListener_timeout(event: nodeLib.nodeLibStrings.timeout, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_unknownProtocol(
    event: nodeLib.nodeLibStrings.unknownProtocol,
    listener: js.Function1[/* socket */ nodeLib.tlsMod.TLSSocket, scala.Unit]
  ): this.type = js.native
  @JSName("emit")
  def emit_checkContinue(
    event: nodeLib.nodeLibStrings.checkContinue,
    request: Http2ServerRequest,
    response: Http2ServerResponse
  ): scala.Boolean = js.native
  @JSName("emit")
  def emit_request(event: nodeLib.nodeLibStrings.request, request: Http2ServerRequest, response: Http2ServerResponse): scala.Boolean = js.native
  @JSName("emit")
  def emit_sessionError(event: nodeLib.nodeLibStrings.sessionError, err: nodeLib.Error): scala.Boolean = js.native
  @JSName("emit")
  def emit_stream(
    event: nodeLib.nodeLibStrings.stream,
    stream: ServerHttp2Stream,
    headers: IncomingHttpHeaders,
    flags: scala.Double
  ): scala.Boolean = js.native
  @JSName("emit")
  def emit_timeout(event: nodeLib.nodeLibStrings.timeout): scala.Boolean = js.native
  @JSName("emit")
  def emit_unknownProtocol(event: nodeLib.nodeLibStrings.unknownProtocol, socket: nodeLib.tlsMod.TLSSocket): scala.Boolean = js.native
  @JSName("on")
  def on_checkContinue(
    event: nodeLib.nodeLibStrings.checkContinue,
    listener: js.Function2[/* request */ Http2ServerRequest, /* response */ Http2ServerResponse, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_request(
    event: nodeLib.nodeLibStrings.request,
    listener: js.Function2[/* request */ Http2ServerRequest, /* response */ Http2ServerResponse, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_sessionError(
    event: nodeLib.nodeLibStrings.sessionError,
    listener: js.Function1[/* err */ nodeLib.Error, scala.Unit]
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
  @JSName("on")
  def on_timeout(event: nodeLib.nodeLibStrings.timeout, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_unknownProtocol(
    event: nodeLib.nodeLibStrings.unknownProtocol,
    listener: js.Function1[/* socket */ nodeLib.tlsMod.TLSSocket, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_checkContinue(
    event: nodeLib.nodeLibStrings.checkContinue,
    listener: js.Function2[/* request */ Http2ServerRequest, /* response */ Http2ServerResponse, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_request(
    event: nodeLib.nodeLibStrings.request,
    listener: js.Function2[/* request */ Http2ServerRequest, /* response */ Http2ServerResponse, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_sessionError(
    event: nodeLib.nodeLibStrings.sessionError,
    listener: js.Function1[/* err */ nodeLib.Error, scala.Unit]
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
  @JSName("once")
  def once_timeout(event: nodeLib.nodeLibStrings.timeout, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("once")
  def once_unknownProtocol(
    event: nodeLib.nodeLibStrings.unknownProtocol,
    listener: js.Function1[/* socket */ nodeLib.tlsMod.TLSSocket, scala.Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_checkContinue(
    event: nodeLib.nodeLibStrings.checkContinue,
    listener: js.Function2[/* request */ Http2ServerRequest, /* response */ Http2ServerResponse, scala.Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_request(
    event: nodeLib.nodeLibStrings.request,
    listener: js.Function2[/* request */ Http2ServerRequest, /* response */ Http2ServerResponse, scala.Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_sessionError(
    event: nodeLib.nodeLibStrings.sessionError,
    listener: js.Function1[/* err */ nodeLib.Error, scala.Unit]
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
  @JSName("prependListener")
  def prependListener_timeout(event: nodeLib.nodeLibStrings.timeout, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_unknownProtocol(
    event: nodeLib.nodeLibStrings.unknownProtocol,
    listener: js.Function1[/* socket */ nodeLib.tlsMod.TLSSocket, scala.Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_checkContinue(
    event: nodeLib.nodeLibStrings.checkContinue,
    listener: js.Function2[/* request */ Http2ServerRequest, /* response */ Http2ServerResponse, scala.Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_request(
    event: nodeLib.nodeLibStrings.request,
    listener: js.Function2[/* request */ Http2ServerRequest, /* response */ Http2ServerResponse, scala.Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_sessionError(
    event: nodeLib.nodeLibStrings.sessionError,
    listener: js.Function1[/* err */ nodeLib.Error, scala.Unit]
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
  @JSName("prependOnceListener")
  def prependOnceListener_timeout(event: nodeLib.nodeLibStrings.timeout, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_unknownProtocol(
    event: nodeLib.nodeLibStrings.unknownProtocol,
    listener: js.Function1[/* socket */ nodeLib.tlsMod.TLSSocket, scala.Unit]
  ): this.type = js.native
}

