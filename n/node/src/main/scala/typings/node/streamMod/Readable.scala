package typings.node.streamMod

import typings.node.Anon_End
import typings.node.AsyncIterable
import typings.node.BufferEncoding
import typings.node.Error
import typings.node.Iterable
import typings.node.NodeJS.ReadableStream
import typings.node.NodeJS.WritableStream
import typings.node.nodeStrings.close
import typings.node.nodeStrings.data
import typings.node.nodeStrings.end
import typings.node.nodeStrings.error
import typings.node.nodeStrings.readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stream", "Readable")
@js.native
class Readable ()
  extends Stream
     with ReadableStream {
  def this(opts: ReadableOptions) = this()
  var destroyed: Boolean = js.native
  val readableHighWaterMark: Double = js.native
  val readableLength: Double = js.native
  val readableObjectMode: Boolean = js.native
  def _destroy(error: Null, callback: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]): Unit = js.native
  def _destroy(error: Error, callback: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]): Unit = js.native
  def _read(size: Double): Unit = js.native
  /* InferMemberOverrides */
  override def addListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def addListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
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
  def addListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_data(event: data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
  def destroy(): Unit = js.native
  def destroy(error: Error): Unit = js.native
  /* InferMemberOverrides */
  override def emit(event: java.lang.String, args: js.Any*): Boolean = js.native
  /* InferMemberOverrides */
  override def emit(event: js.Symbol, args: js.Any*): Boolean = js.native
  @JSName("emit")
  def emit_close(event: close): Boolean = js.native
  @JSName("emit")
  def emit_data(event: data, chunk: js.Any): Boolean = js.native
  @JSName("emit")
  def emit_end(event: end): Boolean = js.native
  @JSName("emit")
  def emit_error(event: error, err: Error): Boolean = js.native
  @JSName("emit")
  def emit_readable(event: readable): Boolean = js.native
  /* InferMemberOverrides */
  override def eventNames(): js.Array[java.lang.String | js.Symbol] = js.native
  /* InferMemberOverrides */
  override def getMaxListeners(): Double = js.native
  /* InferMemberOverrides */
  override def listenerCount(`type`: java.lang.String): Double = js.native
  /* InferMemberOverrides */
  override def listenerCount(`type`: js.Symbol): Double = js.native
  /* InferMemberOverrides */
  override def listeners(event: java.lang.String): js.Array[js.Function] = js.native
  /* InferMemberOverrides */
  override def listeners(event: js.Symbol): js.Array[js.Function] = js.native
  /* InferMemberOverrides */
  override def off(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def off(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def on(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def on(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_data(event: data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_end(event: end, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
  @JSName("on")
  def on_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def once(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def once(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  @JSName("once")
  def once_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_data(event: data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
  @JSName("once")
  def once_end(event: end, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
  @JSName("once")
  def once_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def pipe[T /* <: WritableStream */](destination: T): T = js.native
  /* InferMemberOverrides */
  override def pipe[T /* <: WritableStream */](destination: T, options: Anon_End): T = js.native
  // Added in Node 6...
  /* InferMemberOverrides */
  override def prependListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def prependListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_data(event: data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def prependOnceListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def prependOnceListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_data(event: data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
  def push(chunk: js.Any): Boolean = js.native
  def push(chunk: js.Any, encoding: java.lang.String): Boolean = js.native
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
  override def removeListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def removeListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_data(event: data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def setMaxListeners(n: Double): this.type = js.native
  def unshift(chunk: js.Any): Unit = js.native
  def unshift(chunk: js.Any, encoding: BufferEncoding): Unit = js.native
}

/* static members */
@JSImport("stream", "Readable")
@js.native
object Readable extends js.Object {
  def from(iterable: AsyncIterable[_]): Readable = js.native
  def from(iterable: AsyncIterable[_], options: ReadableOptions): Readable = js.native
  /**
    * A utility method for creating Readable Streams out of iterators.
    */
  def from(iterable: Iterable[_]): Readable = js.native
  def from(iterable: Iterable[_], options: ReadableOptions): Readable = js.native
}

