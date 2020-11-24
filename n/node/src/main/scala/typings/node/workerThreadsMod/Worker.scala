package typings.node.workerThreadsMod

import typings.node.eventsMod.EventEmitter
import typings.node.nodeStrings.error
import typings.node.nodeStrings.exit
import typings.node.nodeStrings.message
import typings.node.nodeStrings.messageerror
import typings.node.nodeStrings.online
import typings.node.streamMod.Readable
import typings.node.streamMod.Writable
import typings.node.urlMod.URL_
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("worker_threads", "Worker")
@js.native
class Worker protected () extends EventEmitter {
  /**
    * @param filename  The path to the Worker’s main script or module.
    *                  Must be either an absolute path or a relative path (i.e. relative to the current working directory) starting with ./ or ../,
    *                  or a WHATWG URL object using file: protocol. If options.eval is true, this is a string containing JavaScript code rather than a path.
    */
  def this(filename: String) = this()
  def this(filename: URL_) = this()
  def this(filename: String, options: WorkerOptions) = this()
  def this(filename: URL_, options: WorkerOptions) = this()
  
  @JSName("addListener")
  def addListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_exit(event: exit, listener: js.Function1[/* exitCode */ Double, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_message(event: message, listener: js.Function1[/* value */ js.Any, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_messageerror(event: messageerror, listener: js.Function1[/* error */ Error, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_online(event: online, listener: js.Function0[Unit]): this.type = js.native
  
  @JSName("emit")
  def emit_error(event: error, err: Error): Boolean = js.native
  @JSName("emit")
  def emit_exit(event: exit, exitCode: Double): Boolean = js.native
  @JSName("emit")
  def emit_message(event: message, value: js.Any): Boolean = js.native
  @JSName("emit")
  def emit_messageerror(event: messageerror, error: Error): Boolean = js.native
  @JSName("emit")
  def emit_online(event: online): Boolean = js.native
  
  /**
    * Returns a readable stream for a V8 snapshot of the current state of the Worker.
    * See [`v8.getHeapSnapshot()`][] for more details.
    *
    * If the Worker thread is no longer running, which may occur before the
    * [`'exit'` event][] is emitted, the returned `Promise` will be rejected
    * immediately with an [`ERR_WORKER_NOT_RUNNING`][] error
    */
  def getHeapSnapshot(): js.Promise[Readable] = js.native
  
  @JSName("off")
  def off_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
  @JSName("off")
  def off_exit(event: exit, listener: js.Function1[/* exitCode */ Double, Unit]): this.type = js.native
  @JSName("off")
  def off_message(event: message, listener: js.Function1[/* value */ js.Any, Unit]): this.type = js.native
  @JSName("off")
  def off_messageerror(event: messageerror, listener: js.Function1[/* error */ Error, Unit]): this.type = js.native
  @JSName("off")
  def off_online(event: online, listener: js.Function0[Unit]): this.type = js.native
  
  @JSName("on")
  def on_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
  @JSName("on")
  def on_exit(event: exit, listener: js.Function1[/* exitCode */ Double, Unit]): this.type = js.native
  @JSName("on")
  def on_message(event: message, listener: js.Function1[/* value */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_messageerror(event: messageerror, listener: js.Function1[/* error */ Error, Unit]): this.type = js.native
  @JSName("on")
  def on_online(event: online, listener: js.Function0[Unit]): this.type = js.native
  
  @JSName("once")
  def once_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
  @JSName("once")
  def once_exit(event: exit, listener: js.Function1[/* exitCode */ Double, Unit]): this.type = js.native
  @JSName("once")
  def once_message(event: message, listener: js.Function1[/* value */ js.Any, Unit]): this.type = js.native
  @JSName("once")
  def once_messageerror(event: messageerror, listener: js.Function1[/* error */ Error, Unit]): this.type = js.native
  @JSName("once")
  def once_online(event: online, listener: js.Function0[Unit]): this.type = js.native
  
  def postMessage(value: js.Any): Unit = js.native
  def postMessage(value: js.Any, transferList: js.Array[TransferListItem]): Unit = js.native
  
  @JSName("prependListener")
  def prependListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_exit(event: exit, listener: js.Function1[/* exitCode */ Double, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_message(event: message, listener: js.Function1[/* value */ js.Any, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_messageerror(event: messageerror, listener: js.Function1[/* error */ Error, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_online(event: online, listener: js.Function0[Unit]): this.type = js.native
  
  @JSName("prependOnceListener")
  def prependOnceListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_exit(event: exit, listener: js.Function1[/* exitCode */ Double, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_message(event: message, listener: js.Function1[/* value */ js.Any, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_messageerror(event: messageerror, listener: js.Function1[/* error */ Error, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_online(event: online, listener: js.Function0[Unit]): this.type = js.native
  
  def ref(): Unit = js.native
  
  @JSName("removeListener")
  def removeListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_exit(event: exit, listener: js.Function1[/* exitCode */ Double, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_message(event: message, listener: js.Function1[/* value */ js.Any, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_messageerror(event: messageerror, listener: js.Function1[/* error */ Error, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_online(event: online, listener: js.Function0[Unit]): this.type = js.native
  
  val resourceLimits: js.UndefOr[ResourceLimits_] = js.native
  
  val stderr: Readable = js.native
  
  val stdin: Writable | Null = js.native
  
  val stdout: Readable = js.native
  
  /**
    * Stop all JavaScript execution in the worker thread as soon as possible.
    * Returns a Promise for the exit code that is fulfilled when the `exit` event is emitted.
    */
  def terminate(): js.Promise[Double] = js.native
  
  val threadId: Double = js.native
  
  def unref(): Unit = js.native
}
