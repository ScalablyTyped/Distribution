package typings.node.http2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientHttp2Stream extends StObject {
  
  @JSName("addListener")
  @scala.annotation.targetName("addListener_continue")
  def addListener(event: "continue", listener: js.Function0[js.Object]): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_headers")
  def addListener(
    event: "headers",
    listener: js.Function2[
      /* headers */ IncomingHttpHeaders & IncomingHttpStatusHeader, 
      /* flags */ Double, 
      Unit
    ]
  ): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_push")
  def addListener(event: "push", listener: js.Function2[/* headers */ IncomingHttpHeaders, /* flags */ Double, Unit]): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_response")
  def addListener(
    event: "response",
    listener: js.Function2[
      /* headers */ IncomingHttpHeaders & IncomingHttpStatusHeader, 
      /* flags */ Double, 
      Unit
    ]
  ): this.type = js.native
  def addListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  def addListener(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  
  @JSName("emit")
  @scala.annotation.targetName("emit_continue")
  def emit(event: "continue"): Boolean = js.native
  @JSName("emit")
  @scala.annotation.targetName("emit_headers")
  def emit(event: "headers", headers: IncomingHttpHeaders & IncomingHttpStatusHeader, flags: Double): Boolean = js.native
  @JSName("emit")
  @scala.annotation.targetName("emit_response")
  def emit(event: "response", headers: IncomingHttpHeaders & IncomingHttpStatusHeader, flags: Double): Boolean = js.native
  @JSName("emit")
  @scala.annotation.targetName("emit_push")
  def emit(event: "push", headers: IncomingHttpHeaders, flags: Double): Boolean = js.native
  def emit(event: String, args: Any*): Boolean = js.native
  def emit(event: js.Symbol, args: Any*): Boolean = js.native
  
  @JSName("on")
  @scala.annotation.targetName("on_continue")
  def on(event: "continue", listener: js.Function0[js.Object]): this.type = js.native
  @JSName("on")
  @scala.annotation.targetName("on_response")
  def on(
    event: "response",
    listener: js.Function2[
      /* headers */ IncomingHttpHeaders & IncomingHttpStatusHeader, 
      /* flags */ Double, 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  @scala.annotation.targetName("on_headers")
  def on(
    event: "headers",
    listener: js.Function2[
      /* headers */ IncomingHttpHeaders & IncomingHttpStatusHeader, 
      /* flags */ Double, 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  @scala.annotation.targetName("on_push")
  def on(event: "push", listener: js.Function2[/* headers */ IncomingHttpHeaders, /* flags */ Double, Unit]): this.type = js.native
  def on(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  def on(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  
  @JSName("once")
  @scala.annotation.targetName("once_continue")
  def once(event: "continue", listener: js.Function0[js.Object]): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_push")
  def once(event: "push", listener: js.Function2[/* headers */ IncomingHttpHeaders, /* flags */ Double, Unit]): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_headers")
  def once(
    event: "headers",
    listener: js.Function2[
      /* headers */ IncomingHttpHeaders & IncomingHttpStatusHeader, 
      /* flags */ Double, 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_response")
  def once(
    event: "response",
    listener: js.Function2[
      /* headers */ IncomingHttpHeaders & IncomingHttpStatusHeader, 
      /* flags */ Double, 
      Unit
    ]
  ): this.type = js.native
  def once(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  def once(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  
  @JSName("prependListener")
  @scala.annotation.targetName("prependListener_continue")
  def prependListener(event: "continue", listener: js.Function0[js.Object]): this.type = js.native
  @JSName("prependListener")
  @scala.annotation.targetName("prependListener_push")
  def prependListener(event: "push", listener: js.Function2[/* headers */ IncomingHttpHeaders, /* flags */ Double, Unit]): this.type = js.native
  @JSName("prependListener")
  @scala.annotation.targetName("prependListener_response")
  def prependListener(
    event: "response",
    listener: js.Function2[
      /* headers */ IncomingHttpHeaders & IncomingHttpStatusHeader, 
      /* flags */ Double, 
      Unit
    ]
  ): this.type = js.native
  @JSName("prependListener")
  @scala.annotation.targetName("prependListener_headers")
  def prependListener(
    event: "headers",
    listener: js.Function2[
      /* headers */ IncomingHttpHeaders & IncomingHttpStatusHeader, 
      /* flags */ Double, 
      Unit
    ]
  ): this.type = js.native
  def prependListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  def prependListener(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  
  @JSName("prependOnceListener")
  @scala.annotation.targetName("prependOnceListener_continue")
  def prependOnceListener(event: "continue", listener: js.Function0[js.Object]): this.type = js.native
  @JSName("prependOnceListener")
  @scala.annotation.targetName("prependOnceListener_response")
  def prependOnceListener(
    event: "response",
    listener: js.Function2[
      /* headers */ IncomingHttpHeaders & IncomingHttpStatusHeader, 
      /* flags */ Double, 
      Unit
    ]
  ): this.type = js.native
  @JSName("prependOnceListener")
  @scala.annotation.targetName("prependOnceListener_push")
  def prependOnceListener(event: "push", listener: js.Function2[/* headers */ IncomingHttpHeaders, /* flags */ Double, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  @scala.annotation.targetName("prependOnceListener_headers")
  def prependOnceListener(
    event: "headers",
    listener: js.Function2[
      /* headers */ IncomingHttpHeaders & IncomingHttpStatusHeader, 
      /* flags */ Double, 
      Unit
    ]
  ): this.type = js.native
  def prependOnceListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  def prependOnceListener(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
}
