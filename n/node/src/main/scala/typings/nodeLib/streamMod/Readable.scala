package typings
package nodeLib.streamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stream", "Readable")
@js.native
class Readable ()
  extends Stream
     with nodeLib.NodeJSNs.ReadableStream {
  def this(opts: ReadableOptions) = this()
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
  /* InferMemberOverrides */
  override def addListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def addListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
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
  /* InferMemberOverrides */
  override def emit(event: java.lang.String, args: js.Any*): scala.Boolean = js.native
  /* InferMemberOverrides */
  override def emit(event: js.Symbol, args: js.Any*): scala.Boolean = js.native
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
  /* InferMemberOverrides */
  override def eventNames(): js.Array[java.lang.String | js.Symbol] = js.native
  /* InferMemberOverrides */
  override def getMaxListeners(): scala.Double = js.native
  /* InferMemberOverrides */
  override def listenerCount(`type`: java.lang.String): scala.Double = js.native
  /* InferMemberOverrides */
  override def listenerCount(`type`: js.Symbol): scala.Double = js.native
  /* InferMemberOverrides */
  override def listeners(event: java.lang.String): js.Array[js.Function] = js.native
  /* InferMemberOverrides */
  override def listeners(event: js.Symbol): js.Array[js.Function] = js.native
  /* InferMemberOverrides */
  override def off(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def off(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def on(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def on(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
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
  /* InferMemberOverrides */
  override def once(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def once(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
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
  // Added in Node 6...
  /* InferMemberOverrides */
  override def prependListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def prependListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
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
  /* InferMemberOverrides */
  override def prependOnceListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def prependOnceListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
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
  /* InferMemberOverrides */
  override def rawListeners(event: java.lang.String): js.Array[js.Function] = js.native
  /* InferMemberOverrides */
  override def rawListeners(event: js.Symbol): js.Array[js.Function] = js.native
  /* InferMemberOverrides */
  override def removeAllListeners(): this.type = js.native
  /* InferMemberOverrides */
  override def removeAllListeners(event: java.lang.String): this.type = js.native
  /* InferMemberOverrides */
  override def removeAllListeners(event: js.Symbol): this.type = js.native
  /* InferMemberOverrides */
  override def removeListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def removeListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
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
  /* InferMemberOverrides */
  override def setMaxListeners(n: scala.Double): this.type = js.native
  def unshift(chunk: js.Any): scala.Unit = js.native
  def unshift(chunk: js.Any, encoding: nodeLib.BufferEncoding): scala.Unit = js.native
}

/* static members */
@JSImport("stream", "Readable")
@js.native
object Readable extends js.Object {
  def from(iterable: nodeLib.AsyncIterable[_]): nodeLib.streamMod.Readable = js.native
  def from(iterable: nodeLib.AsyncIterable[_], options: nodeLib.streamMod.ReadableOptions): nodeLib.streamMod.Readable = js.native
  /**
    * A utility method for creating Readable Streams out of iterators.
    */
  def from(iterable: nodeLib.Iterable[_]): nodeLib.streamMod.Readable = js.native
  def from(iterable: nodeLib.Iterable[_], options: nodeLib.streamMod.ReadableOptions): nodeLib.streamMod.Readable = js.native
}

