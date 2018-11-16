package typings
package nodeLib.http2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientHttp2Stream extends Http2Stream {
  @JSName("addListener")
  def addListener_headers(
    event: nodeLib.nodeLibStrings.headers,
    listener: js.Function2[
      /* headers */ IncomingHttpHeaders with IncomingHttpStatusHeader, 
      /* flags */ scala.Double, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_push(
    event: nodeLib.nodeLibStrings.push,
    listener: js.Function2[/* headers */ IncomingHttpHeaders, /* flags */ scala.Double, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_response(
    event: nodeLib.nodeLibStrings.response,
    listener: js.Function2[
      /* headers */ IncomingHttpHeaders with IncomingHttpStatusHeader, 
      /* flags */ scala.Double, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("emit")
  def emit_headers(
    event: nodeLib.nodeLibStrings.headers,
    headers: IncomingHttpHeaders with IncomingHttpStatusHeader,
    flags: scala.Double
  ): scala.Boolean = js.native
  @JSName("emit")
  def emit_push(event: nodeLib.nodeLibStrings.push, headers: IncomingHttpHeaders, flags: scala.Double): scala.Boolean = js.native
  @JSName("emit")
  def emit_response(
    event: nodeLib.nodeLibStrings.response,
    headers: IncomingHttpHeaders with IncomingHttpStatusHeader,
    flags: scala.Double
  ): scala.Boolean = js.native
  @JSName("on")
  def on_headers(
    event: nodeLib.nodeLibStrings.headers,
    listener: js.Function2[
      /* headers */ IncomingHttpHeaders with IncomingHttpStatusHeader, 
      /* flags */ scala.Double, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_push(
    event: nodeLib.nodeLibStrings.push,
    listener: js.Function2[/* headers */ IncomingHttpHeaders, /* flags */ scala.Double, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_response(
    event: nodeLib.nodeLibStrings.response,
    listener: js.Function2[
      /* headers */ IncomingHttpHeaders with IncomingHttpStatusHeader, 
      /* flags */ scala.Double, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_headers(
    event: nodeLib.nodeLibStrings.headers,
    listener: js.Function2[
      /* headers */ IncomingHttpHeaders with IncomingHttpStatusHeader, 
      /* flags */ scala.Double, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_push(
    event: nodeLib.nodeLibStrings.push,
    listener: js.Function2[/* headers */ IncomingHttpHeaders, /* flags */ scala.Double, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_response(
    event: nodeLib.nodeLibStrings.response,
    listener: js.Function2[
      /* headers */ IncomingHttpHeaders with IncomingHttpStatusHeader, 
      /* flags */ scala.Double, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_headers(
    event: nodeLib.nodeLibStrings.headers,
    listener: js.Function2[
      /* headers */ IncomingHttpHeaders with IncomingHttpStatusHeader, 
      /* flags */ scala.Double, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_push(
    event: nodeLib.nodeLibStrings.push,
    listener: js.Function2[/* headers */ IncomingHttpHeaders, /* flags */ scala.Double, scala.Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_response(
    event: nodeLib.nodeLibStrings.response,
    listener: js.Function2[
      /* headers */ IncomingHttpHeaders with IncomingHttpStatusHeader, 
      /* flags */ scala.Double, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_headers(
    event: nodeLib.nodeLibStrings.headers,
    listener: js.Function2[
      /* headers */ IncomingHttpHeaders with IncomingHttpStatusHeader, 
      /* flags */ scala.Double, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_push(
    event: nodeLib.nodeLibStrings.push,
    listener: js.Function2[/* headers */ IncomingHttpHeaders, /* flags */ scala.Double, scala.Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_response(
    event: nodeLib.nodeLibStrings.response,
    listener: js.Function2[
      /* headers */ IncomingHttpHeaders with IncomingHttpStatusHeader, 
      /* flags */ scala.Double, 
      scala.Unit
    ]
  ): this.type = js.native
}

