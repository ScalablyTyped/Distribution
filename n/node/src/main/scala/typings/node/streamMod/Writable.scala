package typings.node.streamMod

import typings.node.Anon_Chunk
import typings.node.Error
import typings.node.NodeJS.WritableStream
import typings.node.nodeStrings.close
import typings.node.nodeStrings.drain
import typings.node.nodeStrings.error
import typings.node.nodeStrings.finish
import typings.node.nodeStrings.pipe
import typings.node.nodeStrings.unpipe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stream", "Writable")
@js.native
class Writable ()
  extends Stream
     with WritableStream {
  def this(opts: WritableOptions) = this()
  var _writev: js.UndefOr[
    js.Function2[
      /* chunks */ js.Array[Anon_Chunk], 
      /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
      Unit
    ]
  ] = js.native
  var destroyed: Boolean = js.native
  val writableFinished: Boolean = js.native
  val writableHighWaterMark: Double = js.native
  val writableLength: Double = js.native
  val writableObjectMode: Boolean = js.native
  def _destroy(error: Null, callback: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]): Unit = js.native
  def _destroy(error: Error, callback: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]): Unit = js.native
  def _final(callback: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]): Unit = js.native
  def _write(
    chunk: js.Any,
    encoding: java.lang.String,
    callback: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]
  ): Unit = js.native
  /* InferMemberOverrides */
  override def addListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def addListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  /**
    * Event emitter
    * The defined events on documents including:
    * 1. close
    * 2. drain
    * 3. error
    * 4. finish
    * 5. pipe
    * 6. unpipe
    */
  @JSName("addListener")
  def addListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
  def cork(): Unit = js.native
  def destroy(): Unit = js.native
  def destroy(error: Error): Unit = js.native
  /* InferMemberOverrides */
  override def emit(event: java.lang.String, args: js.Any*): Boolean = js.native
  /* InferMemberOverrides */
  override def emit(event: js.Symbol, args: js.Any*): Boolean = js.native
  @JSName("emit")
  def emit_close(event: close): Boolean = js.native
  @JSName("emit")
  def emit_drain(event: drain): Boolean = js.native
  @JSName("emit")
  def emit_error(event: error, err: Error): Boolean = js.native
  @JSName("emit")
  def emit_finish(event: finish): Boolean = js.native
  @JSName("emit")
  def emit_pipe(event: pipe, src: Readable): Boolean = js.native
  @JSName("emit")
  def emit_unpipe(event: unpipe, src: Readable): Boolean = js.native
  def end(chunk: js.Any): Unit = js.native
  def end(chunk: js.Any, cb: js.Function0[Unit]): Unit = js.native
  def end(chunk: js.Any, encoding: java.lang.String): Unit = js.native
  def end(chunk: js.Any, encoding: java.lang.String, cb: js.Function0[Unit]): Unit = js.native
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
  def on_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
  @JSName("on")
  def on_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
  @JSName("on")
  def on_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def once(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def once(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  @JSName("once")
  def once_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
  @JSName("once")
  def once_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
  @JSName("once")
  def once_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
  // Added in Node 6...
  /* InferMemberOverrides */
  override def prependListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def prependListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def prependOnceListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def prependOnceListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
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
  def removeListener_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
  def setDefaultEncoding(encoding: java.lang.String): this.type = js.native
  /* InferMemberOverrides */
  override def setMaxListeners(n: Double): this.type = js.native
  def uncork(): Unit = js.native
  def write(chunk: js.Any): Boolean = js.native
  def write(chunk: js.Any, cb: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]): Boolean = js.native
  def write(chunk: js.Any, encoding: java.lang.String): Boolean = js.native
  def write(
    chunk: js.Any,
    encoding: java.lang.String,
    cb: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]
  ): Boolean = js.native
}

