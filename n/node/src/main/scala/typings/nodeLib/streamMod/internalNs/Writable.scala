package typings
package nodeLib.streamMod.internalNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Writable
  extends nodeLib.streamMod.internal
     with nodeLib.NodeJSNs.WritableStream {
  var _writev: js.UndefOr[
    js.Function2[
      /* chunks */ js.Array[nodeLib.Anon_Chunk], 
      /* callback */ js.Function1[/* error */ js.UndefOr[nodeLib.Error | scala.Null], scala.Unit], 
      scala.Unit
    ]
  ] = js.native
  val writableHighWaterMark: scala.Double = js.native
  val writableLength: scala.Double = js.native
  def _destroy(
    error: nodeLib.Error,
    callback: js.Function1[/* error */ js.UndefOr[nodeLib.Error | scala.Null], scala.Unit]
  ): scala.Unit = js.native
  def _destroy(
    error: scala.Null,
    callback: js.Function1[/* error */ js.UndefOr[nodeLib.Error | scala.Null], scala.Unit]
  ): scala.Unit = js.native
  def _final(callback: js.Function1[/* error */ js.UndefOr[nodeLib.Error | scala.Null], scala.Unit]): scala.Unit = js.native
  def _write(
    chunk: js.Any,
    encoding: java.lang.String,
    callback: js.Function1[/* error */ js.UndefOr[nodeLib.Error | scala.Null], scala.Unit]
  ): scala.Unit = js.native
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
  def addListener_close(event: nodeLib.nodeLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_drain(event: nodeLib.nodeLibStrings.drain, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_error(event: nodeLib.nodeLibStrings.error, listener: js.Function1[/* err */ nodeLib.Error, scala.Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_finish(event: nodeLib.nodeLibStrings.finish, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_pipe(event: nodeLib.nodeLibStrings.pipe, listener: js.Function1[/* src */ Readable, scala.Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_unpipe(event: nodeLib.nodeLibStrings.unpipe, listener: js.Function1[/* src */ Readable, scala.Unit]): this.type = js.native
  def cork(): scala.Unit = js.native
  def destroy(): scala.Unit = js.native
  def destroy(error: nodeLib.Error): scala.Unit = js.native
  @JSName("emit")
  def emit_close(event: nodeLib.nodeLibStrings.close): scala.Boolean = js.native
  @JSName("emit")
  def emit_drain(event: nodeLib.nodeLibStrings.drain): scala.Boolean = js.native
  @JSName("emit")
  def emit_error(event: nodeLib.nodeLibStrings.error, err: nodeLib.Error): scala.Boolean = js.native
  @JSName("emit")
  def emit_finish(event: nodeLib.nodeLibStrings.finish): scala.Boolean = js.native
  @JSName("emit")
  def emit_pipe(event: nodeLib.nodeLibStrings.pipe, src: Readable): scala.Boolean = js.native
  @JSName("emit")
  def emit_unpipe(event: nodeLib.nodeLibStrings.unpipe, src: Readable): scala.Boolean = js.native
  def end(chunk: js.Any): scala.Unit = js.native
  def end(chunk: js.Any, cb: js.Function0[scala.Unit]): scala.Unit = js.native
  def end(chunk: js.Any, encoding: java.lang.String): scala.Unit = js.native
  def end(chunk: js.Any, encoding: java.lang.String, cb: js.Function0[scala.Unit]): scala.Unit = js.native
  @JSName("on")
  def on_close(event: nodeLib.nodeLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_drain(event: nodeLib.nodeLibStrings.drain, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_error(event: nodeLib.nodeLibStrings.error, listener: js.Function1[/* err */ nodeLib.Error, scala.Unit]): this.type = js.native
  @JSName("on")
  def on_finish(event: nodeLib.nodeLibStrings.finish, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_pipe(event: nodeLib.nodeLibStrings.pipe, listener: js.Function1[/* src */ Readable, scala.Unit]): this.type = js.native
  @JSName("on")
  def on_unpipe(event: nodeLib.nodeLibStrings.unpipe, listener: js.Function1[/* src */ Readable, scala.Unit]): this.type = js.native
  @JSName("once")
  def once_close(event: nodeLib.nodeLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("once")
  def once_drain(event: nodeLib.nodeLibStrings.drain, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("once")
  def once_error(event: nodeLib.nodeLibStrings.error, listener: js.Function1[/* err */ nodeLib.Error, scala.Unit]): this.type = js.native
  @JSName("once")
  def once_finish(event: nodeLib.nodeLibStrings.finish, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("once")
  def once_pipe(event: nodeLib.nodeLibStrings.pipe, listener: js.Function1[/* src */ Readable, scala.Unit]): this.type = js.native
  @JSName("once")
  def once_unpipe(event: nodeLib.nodeLibStrings.unpipe, listener: js.Function1[/* src */ Readable, scala.Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_close(event: nodeLib.nodeLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_drain(event: nodeLib.nodeLibStrings.drain, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_error(event: nodeLib.nodeLibStrings.error, listener: js.Function1[/* err */ nodeLib.Error, scala.Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_finish(event: nodeLib.nodeLibStrings.finish, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_pipe(event: nodeLib.nodeLibStrings.pipe, listener: js.Function1[/* src */ Readable, scala.Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_unpipe(event: nodeLib.nodeLibStrings.unpipe, listener: js.Function1[/* src */ Readable, scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_close(event: nodeLib.nodeLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_drain(event: nodeLib.nodeLibStrings.drain, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_error(event: nodeLib.nodeLibStrings.error, listener: js.Function1[/* err */ nodeLib.Error, scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_finish(event: nodeLib.nodeLibStrings.finish, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_pipe(event: nodeLib.nodeLibStrings.pipe, listener: js.Function1[/* src */ Readable, scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_unpipe(event: nodeLib.nodeLibStrings.unpipe, listener: js.Function1[/* src */ Readable, scala.Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_close(event: nodeLib.nodeLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_drain(event: nodeLib.nodeLibStrings.drain, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_error(event: nodeLib.nodeLibStrings.error, listener: js.Function1[/* err */ nodeLib.Error, scala.Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_finish(event: nodeLib.nodeLibStrings.finish, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_pipe(event: nodeLib.nodeLibStrings.pipe, listener: js.Function1[/* src */ Readable, scala.Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_unpipe(event: nodeLib.nodeLibStrings.unpipe, listener: js.Function1[/* src */ Readable, scala.Unit]): this.type = js.native
  def setDefaultEncoding(encoding: java.lang.String): this.type = js.native
  def uncork(): scala.Unit = js.native
  def write(chunk: js.Any): scala.Boolean = js.native
  def write(chunk: js.Any, cb: js.Function1[/* error */ js.UndefOr[nodeLib.Error | scala.Null], scala.Unit]): scala.Boolean = js.native
  def write(chunk: js.Any, encoding: java.lang.String): scala.Boolean = js.native
  def write(
    chunk: js.Any,
    encoding: java.lang.String,
    cb: js.Function1[/* error */ js.UndefOr[nodeLib.Error | scala.Null], scala.Unit]
  ): scala.Boolean = js.native
}

