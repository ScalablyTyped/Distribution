package typings.node.http2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Http2Server
  extends StObject
     with HTTP2ServerCommon {
  
  @JSName("addListener")
  @scala.annotation.targetName("addListener_timeout")
  def addListener(event: "timeout", listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_sessionError")
  def addListener(event: "sessionError", listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_session")
  def addListener(event: "session", listener: js.Function1[/* session */ ServerHttp2Session, Unit]): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_checkContinue")
  def addListener(
    event: "checkContinue",
    listener: js.Function2[/* request */ Http2ServerRequest, /* response */ Http2ServerResponse, Unit]
  ): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_request")
  def addListener(
    event: "request",
    listener: js.Function2[/* request */ Http2ServerRequest, /* response */ Http2ServerResponse, Unit]
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
  
  @JSName("emit")
  @scala.annotation.targetName("emit_timeout")
  def emit(event: "timeout"): Boolean = js.native
  @JSName("emit")
  @scala.annotation.targetName("emit_sessionError")
  def emit(event: "sessionError", err: js.Error): Boolean = js.native
  @JSName("emit")
  @scala.annotation.targetName("emit_checkContinue")
  def emit(event: "checkContinue", request: Http2ServerRequest, response: Http2ServerResponse): Boolean = js.native
  @JSName("emit")
  @scala.annotation.targetName("emit_request")
  def emit(event: "request", request: Http2ServerRequest, response: Http2ServerResponse): Boolean = js.native
  @JSName("emit")
  @scala.annotation.targetName("emit_session")
  def emit(event: "session", session: ServerHttp2Session): Boolean = js.native
  @JSName("emit")
  @scala.annotation.targetName("emit_stream")
  def emit(event: "stream", stream: ServerHttp2Stream, headers: IncomingHttpHeaders, flags: Double): Boolean = js.native
  def emit(event: String, args: Any*): Boolean = js.native
  def emit(event: js.Symbol, args: Any*): Boolean = js.native
  
  @JSName("on")
  @scala.annotation.targetName("on_timeout")
  def on(event: "timeout", listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  @scala.annotation.targetName("on_sessionError")
  def on(event: "sessionError", listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  @JSName("on")
  @scala.annotation.targetName("on_session")
  def on(event: "session", listener: js.Function1[/* session */ ServerHttp2Session, Unit]): this.type = js.native
  @JSName("on")
  @scala.annotation.targetName("on_request")
  def on(
    event: "request",
    listener: js.Function2[/* request */ Http2ServerRequest, /* response */ Http2ServerResponse, Unit]
  ): this.type = js.native
  @JSName("on")
  @scala.annotation.targetName("on_checkContinue")
  def on(
    event: "checkContinue",
    listener: js.Function2[/* request */ Http2ServerRequest, /* response */ Http2ServerResponse, Unit]
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
  @scala.annotation.targetName("once_timeout")
  def once(event: "timeout", listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_session")
  def once(event: "session", listener: js.Function1[/* session */ ServerHttp2Session, Unit]): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_sessionError")
  def once(event: "sessionError", listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_checkContinue")
  def once(
    event: "checkContinue",
    listener: js.Function2[/* request */ Http2ServerRequest, /* response */ Http2ServerResponse, Unit]
  ): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_request")
  def once(
    event: "request",
    listener: js.Function2[/* request */ Http2ServerRequest, /* response */ Http2ServerResponse, Unit]
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
  
  @JSName("prependListener")
  @scala.annotation.targetName("prependListener_timeout")
  def prependListener(event: "timeout", listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  @scala.annotation.targetName("prependListener_session")
  def prependListener(event: "session", listener: js.Function1[/* session */ ServerHttp2Session, Unit]): this.type = js.native
  @JSName("prependListener")
  @scala.annotation.targetName("prependListener_sessionError")
  def prependListener(event: "sessionError", listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  @JSName("prependListener")
  @scala.annotation.targetName("prependListener_checkContinue")
  def prependListener(
    event: "checkContinue",
    listener: js.Function2[/* request */ Http2ServerRequest, /* response */ Http2ServerResponse, Unit]
  ): this.type = js.native
  @JSName("prependListener")
  @scala.annotation.targetName("prependListener_request")
  def prependListener(
    event: "request",
    listener: js.Function2[/* request */ Http2ServerRequest, /* response */ Http2ServerResponse, Unit]
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
  @scala.annotation.targetName("prependOnceListener_timeout")
  def prependOnceListener(event: "timeout", listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  @scala.annotation.targetName("prependOnceListener_session")
  def prependOnceListener(event: "session", listener: js.Function1[/* session */ ServerHttp2Session, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  @scala.annotation.targetName("prependOnceListener_sessionError")
  def prependOnceListener(event: "sessionError", listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  @scala.annotation.targetName("prependOnceListener_checkContinue")
  def prependOnceListener(
    event: "checkContinue",
    listener: js.Function2[/* request */ Http2ServerRequest, /* response */ Http2ServerResponse, Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  @scala.annotation.targetName("prependOnceListener_request")
  def prependOnceListener(
    event: "request",
    listener: js.Function2[/* request */ Http2ServerRequest, /* response */ Http2ServerResponse, Unit]
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
}
