package typings
package nodeLib.workerUnderscoreThreadsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("worker_threads", "Worker")
@js.native
class Worker protected ()
  extends nodeLib.eventsMod.EventEmitter {
  def this(filename: java.lang.String) = this()
  def this(filename: java.lang.String, options: WorkerOptions) = this()
  val stderr: nodeLib.streamMod.Readable = js.native
  val stdin: nodeLib.streamMod.Writable | scala.Null = js.native
  val stdout: nodeLib.streamMod.Readable = js.native
  val threadId: scala.Double = js.native
  @JSName("addListener")
  def addListener_error(event: nodeLib.nodeLibStrings.error, listener: js.Function1[/* err */ nodeLib.Error, scala.Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_exit(
    event: nodeLib.nodeLibStrings.exit,
    listener: js.Function1[/* exitCode */ scala.Double, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_message(event: nodeLib.nodeLibStrings.message, listener: js.Function1[/* value */ js.Any, scala.Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_online(event: nodeLib.nodeLibStrings.online, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("emit")
  def emit_error(event: nodeLib.nodeLibStrings.error, err: nodeLib.Error): scala.Boolean = js.native
  @JSName("emit")
  def emit_exit(event: nodeLib.nodeLibStrings.exit, exitCode: scala.Double): scala.Boolean = js.native
  @JSName("emit")
  def emit_message(event: nodeLib.nodeLibStrings.message, value: js.Any): scala.Boolean = js.native
  @JSName("emit")
  def emit_online(event: nodeLib.nodeLibStrings.online): scala.Boolean = js.native
  @JSName("off")
  def off_error(event: nodeLib.nodeLibStrings.error, listener: js.Function1[/* err */ nodeLib.Error, scala.Unit]): this.type = js.native
  @JSName("off")
  def off_exit(
    event: nodeLib.nodeLibStrings.exit,
    listener: js.Function1[/* exitCode */ scala.Double, scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_message(event: nodeLib.nodeLibStrings.message, listener: js.Function1[/* value */ js.Any, scala.Unit]): this.type = js.native
  @JSName("off")
  def off_online(event: nodeLib.nodeLibStrings.online, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_error(event: nodeLib.nodeLibStrings.error, listener: js.Function1[/* err */ nodeLib.Error, scala.Unit]): this.type = js.native
  @JSName("on")
  def on_exit(
    event: nodeLib.nodeLibStrings.exit,
    listener: js.Function1[/* exitCode */ scala.Double, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_message(event: nodeLib.nodeLibStrings.message, listener: js.Function1[/* value */ js.Any, scala.Unit]): this.type = js.native
  @JSName("on")
  def on_online(event: nodeLib.nodeLibStrings.online, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("once")
  def once_error(event: nodeLib.nodeLibStrings.error, listener: js.Function1[/* err */ nodeLib.Error, scala.Unit]): this.type = js.native
  @JSName("once")
  def once_exit(
    event: nodeLib.nodeLibStrings.exit,
    listener: js.Function1[/* exitCode */ scala.Double, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_message(event: nodeLib.nodeLibStrings.message, listener: js.Function1[/* value */ js.Any, scala.Unit]): this.type = js.native
  @JSName("once")
  def once_online(event: nodeLib.nodeLibStrings.online, listener: js.Function0[scala.Unit]): this.type = js.native
  def postMessage(value: js.Any): scala.Unit = js.native
  def postMessage(value: js.Any, transferList: js.Array[stdLib.ArrayBuffer | MessagePort]): scala.Unit = js.native
  @JSName("prependListener")
  def prependListener_error(event: nodeLib.nodeLibStrings.error, listener: js.Function1[/* err */ nodeLib.Error, scala.Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_exit(
    event: nodeLib.nodeLibStrings.exit,
    listener: js.Function1[/* exitCode */ scala.Double, scala.Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_message(event: nodeLib.nodeLibStrings.message, listener: js.Function1[/* value */ js.Any, scala.Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_online(event: nodeLib.nodeLibStrings.online, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_error(event: nodeLib.nodeLibStrings.error, listener: js.Function1[/* err */ nodeLib.Error, scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_exit(
    event: nodeLib.nodeLibStrings.exit,
    listener: js.Function1[/* exitCode */ scala.Double, scala.Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_message(event: nodeLib.nodeLibStrings.message, listener: js.Function1[/* value */ js.Any, scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_online(event: nodeLib.nodeLibStrings.online, listener: js.Function0[scala.Unit]): this.type = js.native
  def ref(): scala.Unit = js.native
  @JSName("removeListener")
  def removeListener_error(event: nodeLib.nodeLibStrings.error, listener: js.Function1[/* err */ nodeLib.Error, scala.Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_exit(
    event: nodeLib.nodeLibStrings.exit,
    listener: js.Function1[/* exitCode */ scala.Double, scala.Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_message(event: nodeLib.nodeLibStrings.message, listener: js.Function1[/* value */ js.Any, scala.Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_online(event: nodeLib.nodeLibStrings.online, listener: js.Function0[scala.Unit]): this.type = js.native
  def terminate(): scala.Unit = js.native
  def terminate(callback: js.Function2[/* err */ nodeLib.Error, /* exitCode */ scala.Double, scala.Unit]): scala.Unit = js.native
  def unref(): scala.Unit = js.native
}

