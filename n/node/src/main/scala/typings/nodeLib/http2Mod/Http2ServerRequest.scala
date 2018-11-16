package typings
package nodeLib.http2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("http2", "Http2ServerRequest")
@js.native
class Http2ServerRequest protected ()
  extends nodeLib.streamMod.Readable {
  var headers: IncomingHttpHeaders = js.native
  var httpVersion: java.lang.String = js.native
  var method: java.lang.String = js.native
  var rawHeaders: js.Array[java.lang.String] = js.native
  var rawTrailers: js.Array[java.lang.String] = js.native
  var socket: nodeLib.netMod.Socket | nodeLib.tlsMod.TLSSocket = js.native
  var stream: ServerHttp2Stream = js.native
  var trailers: IncomingHttpHeaders = js.native
  var url: java.lang.String = js.native
  @JSName("addListener")
  def addListener_aborted(
    event: nodeLib.nodeLibStrings.aborted,
    listener: js.Function2[/* hadError */ scala.Boolean, /* code */ scala.Double, scala.Unit]
  ): this.type = js.native
  @JSName("emit")
  def emit_aborted(event: nodeLib.nodeLibStrings.aborted, hadError: scala.Boolean, code: scala.Double): scala.Boolean = js.native
  @JSName("on")
  def on_aborted(
    event: nodeLib.nodeLibStrings.aborted,
    listener: js.Function2[/* hadError */ scala.Boolean, /* code */ scala.Double, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_aborted(
    event: nodeLib.nodeLibStrings.aborted,
    listener: js.Function2[/* hadError */ scala.Boolean, /* code */ scala.Double, scala.Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_aborted(
    event: nodeLib.nodeLibStrings.aborted,
    listener: js.Function2[/* hadError */ scala.Boolean, /* code */ scala.Double, scala.Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_aborted(
    event: nodeLib.nodeLibStrings.aborted,
    listener: js.Function2[/* hadError */ scala.Boolean, /* code */ scala.Double, scala.Unit]
  ): this.type = js.native
  def setTimeout(msecs: scala.Double): scala.Unit = js.native
  def setTimeout(msecs: scala.Double, callback: js.Function0[scala.Unit]): scala.Unit = js.native
}

