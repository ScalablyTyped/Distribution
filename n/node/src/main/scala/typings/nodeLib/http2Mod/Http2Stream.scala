package typings
package nodeLib.http2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("http2", "Http2Stream")
@js.native
class Http2Stream protected ()
  extends nodeLib.streamMod.Duplex {
  val aborted: scala.Boolean = js.native
  val bufferSize: scala.Double = js.native
  val closed: scala.Boolean = js.native
  val destroyed: scala.Boolean = js.native
  /**
    * Set the true if the END_STREAM flag was set in the request or response HEADERS frame received,
    * indicating that no additional data should be received and the readable side of the Http2Stream will be closed.
    */
  val endAfterHeaders: scala.Boolean = js.native
  val pending: scala.Boolean = js.native
  val rstCode: scala.Double = js.native
  val sentHeaders: nodeLib.httpMod.OutgoingHttpHeaders = js.native
  val sentInfoHeaders: js.UndefOr[js.Array[nodeLib.httpMod.OutgoingHttpHeaders]] = js.native
  val sentTrailers: js.UndefOr[nodeLib.httpMod.OutgoingHttpHeaders] = js.native
  val session: Http2Session = js.native
  val state: StreamState = js.native
  @JSName("addListener")
  def addListener_aborted(event: nodeLib.nodeLibStrings.aborted, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_frameError(
    event: nodeLib.nodeLibStrings.frameError,
    listener: js.Function2[/* frameType */ scala.Double, /* errorCode */ scala.Double, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_streamClosed(
    event: nodeLib.nodeLibStrings.streamClosed,
    listener: js.Function1[/* code */ scala.Double, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_timeout(event: nodeLib.nodeLibStrings.timeout, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_trailers(
    event: nodeLib.nodeLibStrings.trailers,
    listener: js.Function2[/* trailers */ IncomingHttpHeaders, /* flags */ scala.Double, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_wantTrailers(event: nodeLib.nodeLibStrings.wantTrailers, listener: js.Function0[scala.Unit]): this.type = js.native
  def close(): scala.Unit = js.native
  def close(code: scala.Double): scala.Unit = js.native
  def close(code: scala.Double, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  @JSName("emit")
  def emit_aborted(event: nodeLib.nodeLibStrings.aborted): scala.Boolean = js.native
  @JSName("emit")
  def emit_data(event: nodeLib.nodeLibStrings.data, chunk: java.lang.String): scala.Boolean = js.native
  @JSName("emit")
  def emit_data(event: nodeLib.nodeLibStrings.data, chunk: nodeLib.Buffer): scala.Boolean = js.native
  @JSName("emit")
  def emit_frameError(event: nodeLib.nodeLibStrings.frameError, frameType: scala.Double, errorCode: scala.Double): scala.Boolean = js.native
  @JSName("emit")
  def emit_pipe(event: nodeLib.nodeLibStrings.pipe, src: nodeLib.streamMod.Readable): scala.Boolean = js.native
  @JSName("emit")
  def emit_streamClosed(event: nodeLib.nodeLibStrings.streamClosed, code: scala.Double): scala.Boolean = js.native
  @JSName("emit")
  def emit_timeout(event: nodeLib.nodeLibStrings.timeout): scala.Boolean = js.native
  @JSName("emit")
  def emit_trailers(event: nodeLib.nodeLibStrings.trailers, trailers: IncomingHttpHeaders, flags: scala.Double): scala.Boolean = js.native
  @JSName("emit")
  def emit_unpipe(event: nodeLib.nodeLibStrings.unpipe, src: nodeLib.streamMod.Readable): scala.Boolean = js.native
  @JSName("emit")
  def emit_wantTrailers(event: nodeLib.nodeLibStrings.wantTrailers): scala.Boolean = js.native
  @JSName("on")
  def on_aborted(event: nodeLib.nodeLibStrings.aborted, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_frameError(
    event: nodeLib.nodeLibStrings.frameError,
    listener: js.Function2[/* frameType */ scala.Double, /* errorCode */ scala.Double, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_streamClosed(
    event: nodeLib.nodeLibStrings.streamClosed,
    listener: js.Function1[/* code */ scala.Double, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_timeout(event: nodeLib.nodeLibStrings.timeout, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_trailers(
    event: nodeLib.nodeLibStrings.trailers,
    listener: js.Function2[/* trailers */ IncomingHttpHeaders, /* flags */ scala.Double, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_wantTrailers(event: nodeLib.nodeLibStrings.wantTrailers, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("once")
  def once_aborted(event: nodeLib.nodeLibStrings.aborted, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("once")
  def once_frameError(
    event: nodeLib.nodeLibStrings.frameError,
    listener: js.Function2[/* frameType */ scala.Double, /* errorCode */ scala.Double, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_streamClosed(
    event: nodeLib.nodeLibStrings.streamClosed,
    listener: js.Function1[/* code */ scala.Double, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_timeout(event: nodeLib.nodeLibStrings.timeout, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("once")
  def once_trailers(
    event: nodeLib.nodeLibStrings.trailers,
    listener: js.Function2[/* trailers */ IncomingHttpHeaders, /* flags */ scala.Double, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_wantTrailers(event: nodeLib.nodeLibStrings.wantTrailers, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_aborted(event: nodeLib.nodeLibStrings.aborted, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_frameError(
    event: nodeLib.nodeLibStrings.frameError,
    listener: js.Function2[/* frameType */ scala.Double, /* errorCode */ scala.Double, scala.Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_streamClosed(
    event: nodeLib.nodeLibStrings.streamClosed,
    listener: js.Function1[/* code */ scala.Double, scala.Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_timeout(event: nodeLib.nodeLibStrings.timeout, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_trailers(
    event: nodeLib.nodeLibStrings.trailers,
    listener: js.Function2[/* trailers */ IncomingHttpHeaders, /* flags */ scala.Double, scala.Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_wantTrailers(event: nodeLib.nodeLibStrings.wantTrailers, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_aborted(event: nodeLib.nodeLibStrings.aborted, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_frameError(
    event: nodeLib.nodeLibStrings.frameError,
    listener: js.Function2[/* frameType */ scala.Double, /* errorCode */ scala.Double, scala.Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_streamClosed(
    event: nodeLib.nodeLibStrings.streamClosed,
    listener: js.Function1[/* code */ scala.Double, scala.Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_timeout(event: nodeLib.nodeLibStrings.timeout, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_trailers(
    event: nodeLib.nodeLibStrings.trailers,
    listener: js.Function2[/* trailers */ IncomingHttpHeaders, /* flags */ scala.Double, scala.Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_wantTrailers(event: nodeLib.nodeLibStrings.wantTrailers, listener: js.Function0[scala.Unit]): this.type = js.native
  def priority(options: StreamPriorityOptions): scala.Unit = js.native
  def sendTrailers(headers: nodeLib.httpMod.OutgoingHttpHeaders): scala.Unit = js.native
  def setTimeout(msecs: scala.Double): scala.Unit = js.native
  def setTimeout(msecs: scala.Double, callback: js.Function0[scala.Unit]): scala.Unit = js.native
}

