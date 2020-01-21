package typings.node.workerThreadsMod

import typings.node.eventsMod.EventEmitter
import typings.node.nodeStrings.close
import typings.node.nodeStrings.message
import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("worker_threads", "MessagePort")
@js.native
class MessagePort () extends EventEmitter {
  @JSName("addListener")
  def addListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_message(event: message, listener: js.Function1[/* value */ js.Any, Unit]): this.type = js.native
  def close(): Unit = js.native
  @JSName("emit")
  def emit_close(event: close): Boolean = js.native
  @JSName("emit")
  def emit_message(event: message, value: js.Any): Boolean = js.native
  @JSName("off")
  def off_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("off")
  def off_message(event: message, listener: js.Function1[/* value */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_message(event: message, listener: js.Function1[/* value */ js.Any, Unit]): this.type = js.native
  @JSName("once")
  def once_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_message(event: message, listener: js.Function1[/* value */ js.Any, Unit]): this.type = js.native
  def postMessage(value: js.Any): Unit = js.native
  def postMessage(value: js.Any, transferList: js.Array[ArrayBuffer | MessagePort]): Unit = js.native
  @JSName("prependListener")
  def prependListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_message(event: message, listener: js.Function1[/* value */ js.Any, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_message(event: message, listener: js.Function1[/* value */ js.Any, Unit]): this.type = js.native
  def ref(): Unit = js.native
  @JSName("removeListener")
  def removeListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_message(event: message, listener: js.Function1[/* value */ js.Any, Unit]): this.type = js.native
  def start(): Unit = js.native
  def unref(): Unit = js.native
}

