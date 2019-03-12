package typings
package nodeLib.streamMod.internalNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Readable
  extends nodeLib.streamMod.internal
     with nodeLib.NodeJSNs.ReadableStream {
  @JSName(org.scalablytyped.runtime.Symbol.asyncIterator)
  var asyncIterator_Readable: js.Function0[nodeLib.AsyncIterableIterator[_]] = js.native
  val readableHighWaterMark: scala.Double = js.native
  val readableLength: scala.Double = js.native
  def _destroy(
    error: nodeLib.Error,
    callback: js.Function1[/* error */ js.UndefOr[nodeLib.Error | scala.Null], scala.Unit]
  ): scala.Unit = js.native
  def _destroy(
    error: scala.Null,
    callback: js.Function1[/* error */ js.UndefOr[nodeLib.Error | scala.Null], scala.Unit]
  ): scala.Unit = js.native
  def _read(size: scala.Double): scala.Unit = js.native
  /**
    * Event emitter
    * The defined events on documents including:
    * 1. close
    * 2. data
    * 3. end
    * 4. readable
    * 5. error
    */
  @JSName("addListener")
  def addListener_close(event: nodeLib.nodeLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_data(event: nodeLib.nodeLibStrings.data, listener: js.Function1[/* chunk */ js.Any, scala.Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_end(event: nodeLib.nodeLibStrings.end, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_error(event: nodeLib.nodeLibStrings.error, listener: js.Function1[/* err */ nodeLib.Error, scala.Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_readable(event: nodeLib.nodeLibStrings.readable, listener: js.Function0[scala.Unit]): this.type = js.native
  def destroy(): scala.Unit = js.native
  def destroy(error: nodeLib.Error): scala.Unit = js.native
  @JSName("emit")
  def emit_close(event: nodeLib.nodeLibStrings.close): scala.Boolean = js.native
  @JSName("emit")
  def emit_data(event: nodeLib.nodeLibStrings.data, chunk: js.Any): scala.Boolean = js.native
  @JSName("emit")
  def emit_end(event: nodeLib.nodeLibStrings.end): scala.Boolean = js.native
  @JSName("emit")
  def emit_error(event: nodeLib.nodeLibStrings.error, err: nodeLib.Error): scala.Boolean = js.native
  @JSName("emit")
  def emit_readable(event: nodeLib.nodeLibStrings.readable): scala.Boolean = js.native
  @JSName("on")
  def on_close(event: nodeLib.nodeLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_data(event: nodeLib.nodeLibStrings.data, listener: js.Function1[/* chunk */ js.Any, scala.Unit]): this.type = js.native
  @JSName("on")
  def on_end(event: nodeLib.nodeLibStrings.end, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_error(event: nodeLib.nodeLibStrings.error, listener: js.Function1[/* err */ nodeLib.Error, scala.Unit]): this.type = js.native
  @JSName("on")
  def on_readable(event: nodeLib.nodeLibStrings.readable, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("once")
  def once_close(event: nodeLib.nodeLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("once")
  def once_data(event: nodeLib.nodeLibStrings.data, listener: js.Function1[/* chunk */ js.Any, scala.Unit]): this.type = js.native
  @JSName("once")
  def once_end(event: nodeLib.nodeLibStrings.end, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("once")
  def once_error(event: nodeLib.nodeLibStrings.error, listener: js.Function1[/* err */ nodeLib.Error, scala.Unit]): this.type = js.native
  @JSName("once")
  def once_readable(event: nodeLib.nodeLibStrings.readable, listener: js.Function0[scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def pipe[T /* <: nodeLib.NodeJSNs.WritableStream */](destination: T): T = js.native
  /* InferMemberOverrides */
  override def pipe[T /* <: nodeLib.NodeJSNs.WritableStream */](destination: T, options: nodeLib.Anon_End): T = js.native
  @JSName("prependListener")
  def prependListener_close(event: nodeLib.nodeLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_data(event: nodeLib.nodeLibStrings.data, listener: js.Function1[/* chunk */ js.Any, scala.Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_end(event: nodeLib.nodeLibStrings.end, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_error(event: nodeLib.nodeLibStrings.error, listener: js.Function1[/* err */ nodeLib.Error, scala.Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_readable(event: nodeLib.nodeLibStrings.readable, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_close(event: nodeLib.nodeLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_data(event: nodeLib.nodeLibStrings.data, listener: js.Function1[/* chunk */ js.Any, scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_end(event: nodeLib.nodeLibStrings.end, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_error(event: nodeLib.nodeLibStrings.error, listener: js.Function1[/* err */ nodeLib.Error, scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_readable(event: nodeLib.nodeLibStrings.readable, listener: js.Function0[scala.Unit]): this.type = js.native
  def push(chunk: js.Any): scala.Boolean = js.native
  def push(chunk: js.Any, encoding: java.lang.String): scala.Boolean = js.native
  @JSName("removeListener")
  def removeListener_close(event: nodeLib.nodeLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_data(event: nodeLib.nodeLibStrings.data, listener: js.Function1[/* chunk */ js.Any, scala.Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_end(event: nodeLib.nodeLibStrings.end, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_error(event: nodeLib.nodeLibStrings.error, listener: js.Function1[/* err */ nodeLib.Error, scala.Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_readable(event: nodeLib.nodeLibStrings.readable, listener: js.Function0[scala.Unit]): this.type = js.native
  def unshift(chunk: js.Any): scala.Unit = js.native
}

