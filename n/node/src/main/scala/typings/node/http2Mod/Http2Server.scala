package typings.node.http2Mod

import typings.node.Error
import typings.node.netMod.Server
import typings.node.nodeStrings.checkContinue
import typings.node.nodeStrings.request
import typings.node.nodeStrings.session
import typings.node.nodeStrings.sessionError
import typings.node.nodeStrings.stream
import typings.node.nodeStrings.timeout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Http2Server extends Server {
  @JSName("addListener")
  def addListener_checkContinue(
    event: checkContinue,
    listener: js.Function2[/* request */ Http2ServerRequest, /* response */ Http2ServerResponse, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_request(
    event: request,
    listener: js.Function2[/* request */ Http2ServerRequest, /* response */ Http2ServerResponse, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_session(event: session, listener: js.Function1[/* session */ ServerHttp2Session, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_sessionError(event: sessionError, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
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
  @JSName("addListener")
  def addListener_timeout(event: timeout, listener: js.Function0[Unit]): this.type = js.native
  @JSName("emit")
  def emit_checkContinue(event: checkContinue, request: Http2ServerRequest, response: Http2ServerResponse): Boolean = js.native
  @JSName("emit")
  def emit_request(event: request, request: Http2ServerRequest, response: Http2ServerResponse): Boolean = js.native
  @JSName("emit")
  def emit_session(event: session, session: ServerHttp2Session): Boolean = js.native
  @JSName("emit")
  def emit_sessionError(event: sessionError, err: Error): Boolean = js.native
  @JSName("emit")
  def emit_stream(event: stream, stream: ServerHttp2Stream, headers: IncomingHttpHeaders, flags: Double): Boolean = js.native
  @JSName("emit")
  def emit_timeout(event: timeout): Boolean = js.native
  @JSName("on")
  def on_checkContinue(
    event: checkContinue,
    listener: js.Function2[/* request */ Http2ServerRequest, /* response */ Http2ServerResponse, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_request(
    event: request,
    listener: js.Function2[/* request */ Http2ServerRequest, /* response */ Http2ServerResponse, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_session(event: session, listener: js.Function1[/* session */ ServerHttp2Session, Unit]): this.type = js.native
  @JSName("on")
  def on_sessionError(event: sessionError, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
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
  @JSName("on")
  def on_timeout(event: timeout, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_checkContinue(
    event: checkContinue,
    listener: js.Function2[/* request */ Http2ServerRequest, /* response */ Http2ServerResponse, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_request(
    event: request,
    listener: js.Function2[/* request */ Http2ServerRequest, /* response */ Http2ServerResponse, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_session(event: session, listener: js.Function1[/* session */ ServerHttp2Session, Unit]): this.type = js.native
  @JSName("once")
  def once_sessionError(event: sessionError, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
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
  @JSName("once")
  def once_timeout(event: timeout, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_checkContinue(
    event: checkContinue,
    listener: js.Function2[/* request */ Http2ServerRequest, /* response */ Http2ServerResponse, Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_request(
    event: request,
    listener: js.Function2[/* request */ Http2ServerRequest, /* response */ Http2ServerResponse, Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_session(event: session, listener: js.Function1[/* session */ ServerHttp2Session, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_sessionError(event: sessionError, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
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
  @JSName("prependListener")
  def prependListener_timeout(event: timeout, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_checkContinue(
    event: checkContinue,
    listener: js.Function2[/* request */ Http2ServerRequest, /* response */ Http2ServerResponse, Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_request(
    event: request,
    listener: js.Function2[/* request */ Http2ServerRequest, /* response */ Http2ServerResponse, Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_session(event: session, listener: js.Function1[/* session */ ServerHttp2Session, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_sessionError(event: sessionError, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
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
  @JSName("prependOnceListener")
  def prependOnceListener_timeout(event: timeout, listener: js.Function0[Unit]): this.type = js.native
  def setTimeout(): this.type = js.native
  def setTimeout(msec: Double): this.type = js.native
  def setTimeout(msec: Double, callback: js.Function0[Unit]): this.type = js.native
}

