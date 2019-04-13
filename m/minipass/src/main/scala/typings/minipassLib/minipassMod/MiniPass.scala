package typings
package minipassLib.minipassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MiniPass
  extends nodeLib.eventsMod.EventEmitter
     with nodeLib.NodeJSNs.WritableStream {
  var buffer: js.Any = js.native
  val bufferLength: scala.Double = js.native
  val emittedEnd: scala.Boolean = js.native
  var encoding: java.lang.String | scala.Null = js.native
  val flowing: scala.Boolean = js.native
  var pipes: js.Any = js.native
  var readable: scala.Boolean = js.native
  def addEventHandler(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  @JSName("addEventHandler")
  def addEventHandler_close(event: minipassLib.minipassLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("addEventHandler")
  def addEventHandler_data(event: minipassLib.minipassLibStrings.data, listener: js.Function1[/* chunk */ js.Any, scala.Unit]): this.type = js.native
  @JSName("addEventHandler")
  def addEventHandler_drain(event: minipassLib.minipassLibStrings.drain, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("addEventHandler")
  def addEventHandler_end(event: minipassLib.minipassLibStrings.end, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("addEventHandler")
  def addEventHandler_finish(event: minipassLib.minipassLibStrings.finish, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("addEventHandler")
  def addEventHandler_prefinish(event: minipassLib.minipassLibStrings.prefinish, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("addEventHandler")
  def addEventHandler_readable(event: minipassLib.minipassLibStrings.readable, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("addEventHandler")
  def addEventHandler_resume(event: minipassLib.minipassLibStrings.resume, listener: js.Function0[scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def addListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def addListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def emit(event: java.lang.String, args: js.Any*): scala.Boolean = js.native
  /* InferMemberOverrides */
  override def emit(event: js.Symbol, args: js.Any*): scala.Boolean = js.native
  @JSName("emit")
  def emit_close(event: minipassLib.minipassLibStrings.close): scala.Boolean = js.native
  @JSName("emit")
  def emit_data(event: minipassLib.minipassLibStrings.data, chunk: js.Any): scala.Boolean = js.native
  @JSName("emit")
  def emit_drain(event: minipassLib.minipassLibStrings.drain): scala.Boolean = js.native
  @JSName("emit")
  def emit_end(event: minipassLib.minipassLibStrings.end): scala.Boolean = js.native
  @JSName("emit")
  def emit_finish(event: minipassLib.minipassLibStrings.finish): scala.Boolean = js.native
  @JSName("emit")
  def emit_prefinish(event: minipassLib.minipassLibStrings.prefinish): scala.Boolean = js.native
  @JSName("emit")
  def emit_readable(event: minipassLib.minipassLibStrings.readable): scala.Boolean = js.native
  @JSName("emit")
  def emit_resume(event: minipassLib.minipassLibStrings.resume): scala.Boolean = js.native
  def end(chunk: js.Any): scala.Unit = js.native
  def end(chunk: js.Any, cb: js.Function0[scala.Unit]): scala.Unit = js.native
  def end(chunk: js.Any, encoding: java.lang.String): scala.Unit = js.native
  def end(chunk: js.Any, encoding: java.lang.String, cb: js.Function0[scala.Unit]): scala.Unit = js.native
  def end(chunk: js.Any, encoding: scala.Null, cb: js.Function0[scala.Unit]): scala.Unit = js.native
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
  def on_close(event: minipassLib.minipassLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_data(event: minipassLib.minipassLibStrings.data, listener: js.Function1[/* chunk */ js.Any, scala.Unit]): this.type = js.native
  @JSName("on")
  def on_drain(event: minipassLib.minipassLibStrings.drain, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_end(event: minipassLib.minipassLibStrings.end, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_finish(event: minipassLib.minipassLibStrings.finish, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_prefinish(event: minipassLib.minipassLibStrings.prefinish, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_readable(event: minipassLib.minipassLibStrings.readable, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_resume(event: minipassLib.minipassLibStrings.resume, listener: js.Function0[scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def once(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def once(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  @JSName("once")
  def once_close(event: minipassLib.minipassLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("once")
  def once_data(event: minipassLib.minipassLibStrings.data, listener: js.Function1[/* chunk */ js.Any, scala.Unit]): this.type = js.native
  @JSName("once")
  def once_drain(event: minipassLib.minipassLibStrings.drain, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("once")
  def once_end(event: minipassLib.minipassLibStrings.end, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("once")
  def once_finish(event: minipassLib.minipassLibStrings.finish, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("once")
  def once_prefinish(event: minipassLib.minipassLibStrings.prefinish, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("once")
  def once_readable(event: minipassLib.minipassLibStrings.readable, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("once")
  def once_resume(event: minipassLib.minipassLibStrings.resume, listener: js.Function0[scala.Unit]): this.type = js.native
  def pause(): scala.Unit = js.native
  def pipe[T /* <: nodeLib.NodeJSNs.WritableStream */](destination: T): T = js.native
  def pipe[T /* <: nodeLib.NodeJSNs.WritableStream */](destination: T, options: minipassLib.Anon_End): T = js.native
  // Added in Node 6...
  /* InferMemberOverrides */
  override def prependListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def prependListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_close(event: minipassLib.minipassLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_data(event: minipassLib.minipassLibStrings.data, listener: js.Function1[/* chunk */ js.Any, scala.Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_drain(event: minipassLib.minipassLibStrings.drain, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_end(event: minipassLib.minipassLibStrings.end, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_finish(event: minipassLib.minipassLibStrings.finish, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_prefinish(event: minipassLib.minipassLibStrings.prefinish, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_readable(event: minipassLib.minipassLibStrings.readable, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_resume(event: minipassLib.minipassLibStrings.resume, listener: js.Function0[scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def prependOnceListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def prependOnceListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_close(event: minipassLib.minipassLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_data(event: minipassLib.minipassLibStrings.data, listener: js.Function1[/* chunk */ js.Any, scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_drain(event: minipassLib.minipassLibStrings.drain, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_end(event: minipassLib.minipassLibStrings.end, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_finish(event: minipassLib.minipassLibStrings.finish, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_prefinish(event: minipassLib.minipassLibStrings.prefinish, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_readable(event: minipassLib.minipassLibStrings.readable, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_resume(event: minipassLib.minipassLibStrings.resume, listener: js.Function0[scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def rawListeners(event: java.lang.String): js.Array[js.Function] = js.native
  /* InferMemberOverrides */
  override def rawListeners(event: js.Symbol): js.Array[js.Function] = js.native
  def read(): js.Any = js.native
  def read(size: scala.Double): js.Any = js.native
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
  def removeListener_close(event: minipassLib.minipassLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_data(event: minipassLib.minipassLibStrings.data, listener: js.Function1[/* chunk */ js.Any, scala.Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_drain(event: minipassLib.minipassLibStrings.drain, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_end(event: minipassLib.minipassLibStrings.end, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_finish(event: minipassLib.minipassLibStrings.finish, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_prefinish(event: minipassLib.minipassLibStrings.prefinish, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_readable(event: minipassLib.minipassLibStrings.readable, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_resume(event: minipassLib.minipassLibStrings.resume, listener: js.Function0[scala.Unit]): this.type = js.native
  def resume(): scala.Unit = js.native
  def setEncoding(): scala.Unit = js.native
  def setEncoding(encoding: java.lang.String): scala.Unit = js.native
  /* InferMemberOverrides */
  override def setMaxListeners(n: scala.Double): this.type = js.native
  def write(chunk: js.Any): scala.Boolean = js.native
  def write(chunk: js.Any, cb: js.Function0[scala.Unit]): scala.Boolean = js.native
  def write(chunk: js.Any, encoding: java.lang.String): scala.Boolean = js.native
  def write(chunk: js.Any, encoding: java.lang.String, cb: js.Function0[scala.Unit]): scala.Boolean = js.native
  def write(chunk: js.Any, encoding: scala.Null, cb: js.Function0[scala.Unit]): scala.Boolean = js.native
}

