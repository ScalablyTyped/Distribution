package typings.node.workerUnderscoreThreadsMod

import typings.node.Error
import typings.node.eventsMod.EventEmitter
import typings.node.nodeStrings.error
import typings.node.nodeStrings.exit
import typings.node.nodeStrings.message
import typings.node.nodeStrings.online
import typings.node.streamMod.Readable
import typings.node.streamMod.Writable
import typings.node.vmMod.Context
import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("worker_threads", "Worker")
@js.native
class Worker protected () extends EventEmitter {
  def this(filename: java.lang.String) = this()
  def this(filename: java.lang.String, options: WorkerOptions) = this()
  val stderr: Readable = js.native
  val stdin: Writable | Null = js.native
  val stdout: Readable = js.native
  val threadId: Double = js.native
  @JSName("addListener")
  def addListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_exit(event: exit, listener: js.Function1[/* exitCode */ Double, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_message(event: message, listener: js.Function1[/* value */ js.Any, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_online(event: online, listener: js.Function0[Unit]): this.type = js.native
  @JSName("emit")
  def emit_error(event: error, err: Error): Boolean = js.native
  @JSName("emit")
  def emit_exit(event: exit, exitCode: Double): Boolean = js.native
  @JSName("emit")
  def emit_message(event: message, value: js.Any): Boolean = js.native
  @JSName("emit")
  def emit_online(event: online): Boolean = js.native
  /**
    * Transfer a `MessagePort` to a different `vm` Context. The original `port`
    * object will be rendered unusable, and the returned `MessagePort` instance will
    * take its place.
    *
    * The returned `MessagePort` will be an object in the target context, and will
    * inherit from its global `Object` class. Objects passed to the
    * `port.onmessage()` listener will also be created in the target context
    * and inherit from its global `Object` class.
    *
    * However, the created `MessagePort` will no longer inherit from
    * `EventEmitter`, and only `port.onmessage()` can be used to receive
    * events using it.
    */
  def moveMessagePortToContext(port: MessagePort, context: Context): MessagePort = js.native
  @JSName("off")
  def off_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
  @JSName("off")
  def off_exit(event: exit, listener: js.Function1[/* exitCode */ Double, Unit]): this.type = js.native
  @JSName("off")
  def off_message(event: message, listener: js.Function1[/* value */ js.Any, Unit]): this.type = js.native
  @JSName("off")
  def off_online(event: online, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
  @JSName("on")
  def on_exit(event: exit, listener: js.Function1[/* exitCode */ Double, Unit]): this.type = js.native
  @JSName("on")
  def on_message(event: message, listener: js.Function1[/* value */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_online(event: online, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
  @JSName("once")
  def once_exit(event: exit, listener: js.Function1[/* exitCode */ Double, Unit]): this.type = js.native
  @JSName("once")
  def once_message(event: message, listener: js.Function1[/* value */ js.Any, Unit]): this.type = js.native
  @JSName("once")
  def once_online(event: online, listener: js.Function0[Unit]): this.type = js.native
  def postMessage(value: js.Any): Unit = js.native
  def postMessage(value: js.Any, transferList: js.Array[ArrayBuffer | MessagePort]): Unit = js.native
  @JSName("prependListener")
  def prependListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_exit(event: exit, listener: js.Function1[/* exitCode */ Double, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_message(event: message, listener: js.Function1[/* value */ js.Any, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_online(event: online, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_exit(event: exit, listener: js.Function1[/* exitCode */ Double, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_message(event: message, listener: js.Function1[/* value */ js.Any, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_online(event: online, listener: js.Function0[Unit]): this.type = js.native
  /**
    * Receive a single message from a given `MessagePort`. If no message is available,
    * `undefined` is returned, otherwise an object with a single `message` property
    * that contains the message payload, corresponding to the oldest message in the
    * `MessagePort`’s queue.
    */
  def receiveMessageOnPort(port: MessagePort): js.UndefOr[js.Object] = js.native
  def ref(): Unit = js.native
  @JSName("removeListener")
  def removeListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_exit(event: exit, listener: js.Function1[/* exitCode */ Double, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_message(event: message, listener: js.Function1[/* value */ js.Any, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_online(event: online, listener: js.Function0[Unit]): this.type = js.native
  /**
    * Stop all JavaScript execution in the worker thread as soon as possible.
    * Returns a Promise for the exit code that is fulfilled when the `exit` event is emitted.
    */
  def terminate(): js.Promise[Double] = js.native
  def unref(): Unit = js.native
}

