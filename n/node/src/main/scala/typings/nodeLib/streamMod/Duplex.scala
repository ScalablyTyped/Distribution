package typings
package nodeLib.streamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Note: Duplex extends both Readable and Writable.
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- nodeLib.streamMod.Writable because Inheritance from two classes. Inlined writable, writableFinished, writableHighWaterMark, writableLength, _write, _writev, _destroy, _destroy, _final, write, write, write, write, setDefaultEncoding, end, end, end, end, end, end, cork, uncork, destroy, destroy, addListener_close, addListener_drain, addListener_error, addListener_finish, addListener_pipe, addListener_unpipe, addListener, addListener, emit_close, emit_drain, emit_error, emit_finish, emit_pipe, emit_unpipe, emit, emit, on_close, on_drain, on_error, on_finish, on_pipe, on_unpipe, on, on, once_close, once_drain, once_error, once_finish, once_pipe, once_unpipe, once, once, prependListener_close, prependListener_drain, prependListener_error, prependListener_finish, prependListener_pipe, prependListener_unpipe, prependListener, prependListener, prependOnceListener_close, prependOnceListener_drain, prependOnceListener_error, prependOnceListener_finish, prependOnceListener_pipe, prependOnceListener_unpipe, prependOnceListener, prependOnceListener, removeListener_close, removeListener_drain, removeListener_error, removeListener_finish, removeListener_pipe, removeListener_unpipe, removeListener, removeListener */ @JSImport("stream", "Duplex")
@js.native
class Duplex () extends Readable {
  def this(opts: DuplexOptions) = this()
  var _writev: js.UndefOr[
    js.Function2[
      /* chunks */ js.Array[nodeLib.Anon_Chunk], 
      /* callback */ js.Function1[js.UndefOr[nodeLib.Error | scala.Null], scala.Unit], 
      scala.Unit
    ]
  ] = js.native
  val writable: scala.Boolean = js.native
  val writableFinished: scala.Boolean = js.native
  val writableHighWaterMark: scala.Double = js.native
  val writableLength: scala.Double = js.native
  def _final(callback: js.Function1[js.UndefOr[nodeLib.Error | scala.Null], scala.Unit]): scala.Unit = js.native
  def _write(
    chunk: js.Any,
    encoding: java.lang.String,
    callback: js.Function1[js.UndefOr[nodeLib.Error | scala.Null], scala.Unit]
  ): scala.Unit = js.native
  @JSName("addListener")
  def addListener_drain(event: nodeLib.nodeLibStrings.drain, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_finish(event: nodeLib.nodeLibStrings.finish, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_pipe(event: nodeLib.nodeLibStrings.pipe, listener: js.Function1[/* src */ Readable, scala.Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_unpipe(event: nodeLib.nodeLibStrings.unpipe, listener: js.Function1[/* src */ Readable, scala.Unit]): this.type = js.native
  def cork(): scala.Unit = js.native
  @JSName("emit")
  def emit_drain(event: nodeLib.nodeLibStrings.drain): scala.Boolean = js.native
  @JSName("emit")
  def emit_finish(event: nodeLib.nodeLibStrings.finish): scala.Boolean = js.native
  @JSName("emit")
  def emit_pipe(event: nodeLib.nodeLibStrings.pipe, src: Readable): scala.Boolean = js.native
  @JSName("emit")
  def emit_unpipe(event: nodeLib.nodeLibStrings.unpipe, src: Readable): scala.Boolean = js.native
  def end(): scala.Unit = js.native
  def end(cb: js.Function0[scala.Unit]): scala.Unit = js.native
  def end(chunk: js.Any): scala.Unit = js.native
  def end(chunk: js.Any, cb: js.Function0[scala.Unit]): scala.Unit = js.native
  def end(chunk: js.Any, encoding: java.lang.String): scala.Unit = js.native
  def end(chunk: js.Any, encoding: java.lang.String, cb: js.Function0[scala.Unit]): scala.Unit = js.native
  @JSName("on")
  def on_drain(event: nodeLib.nodeLibStrings.drain, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_finish(event: nodeLib.nodeLibStrings.finish, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_pipe(event: nodeLib.nodeLibStrings.pipe, listener: js.Function1[/* src */ Readable, scala.Unit]): this.type = js.native
  @JSName("on")
  def on_unpipe(event: nodeLib.nodeLibStrings.unpipe, listener: js.Function1[/* src */ Readable, scala.Unit]): this.type = js.native
  @JSName("once")
  def once_drain(event: nodeLib.nodeLibStrings.drain, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("once")
  def once_finish(event: nodeLib.nodeLibStrings.finish, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("once")
  def once_pipe(event: nodeLib.nodeLibStrings.pipe, listener: js.Function1[/* src */ Readable, scala.Unit]): this.type = js.native
  @JSName("once")
  def once_unpipe(event: nodeLib.nodeLibStrings.unpipe, listener: js.Function1[/* src */ Readable, scala.Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_drain(event: nodeLib.nodeLibStrings.drain, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_finish(event: nodeLib.nodeLibStrings.finish, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_pipe(event: nodeLib.nodeLibStrings.pipe, listener: js.Function1[/* src */ Readable, scala.Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_unpipe(event: nodeLib.nodeLibStrings.unpipe, listener: js.Function1[/* src */ Readable, scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_drain(event: nodeLib.nodeLibStrings.drain, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_finish(event: nodeLib.nodeLibStrings.finish, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_pipe(event: nodeLib.nodeLibStrings.pipe, listener: js.Function1[/* src */ Readable, scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_unpipe(event: nodeLib.nodeLibStrings.unpipe, listener: js.Function1[/* src */ Readable, scala.Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_drain(event: nodeLib.nodeLibStrings.drain, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_finish(event: nodeLib.nodeLibStrings.finish, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_pipe(event: nodeLib.nodeLibStrings.pipe, listener: js.Function1[/* src */ Readable, scala.Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_unpipe(event: nodeLib.nodeLibStrings.unpipe, listener: js.Function1[/* src */ Readable, scala.Unit]): this.type = js.native
  def setDefaultEncoding(encoding: java.lang.String): this.type = js.native
  def uncork(): scala.Unit = js.native
  def write(chunk: js.Any): scala.Boolean = js.native
  def write(chunk: js.Any, cb: js.Function1[js.UndefOr[nodeLib.Error | scala.Null], scala.Unit]): scala.Boolean = js.native
  def write(chunk: js.Any, encoding: java.lang.String): scala.Boolean = js.native
  def write(
    chunk: js.Any,
    encoding: java.lang.String,
    cb: js.Function1[js.UndefOr[nodeLib.Error | scala.Null], scala.Unit]
  ): scala.Boolean = js.native
}

