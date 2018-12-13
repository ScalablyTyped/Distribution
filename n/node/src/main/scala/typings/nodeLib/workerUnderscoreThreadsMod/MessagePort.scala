package typings
package nodeLib.workerUnderscoreThreadsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("worker_threads", "MessagePort")
@js.native
class MessagePort ()
  extends nodeLib.eventsMod.EventEmitter {
  @JSName("addListener")
  def addListener_close(event: nodeLib.nodeLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_message(event: nodeLib.nodeLibStrings.message, listener: js.Function1[/* value */ js.Any, scala.Unit]): this.type = js.native
  def close(): scala.Unit = js.native
  @JSName("emit")
  def emit_close(event: nodeLib.nodeLibStrings.close): scala.Boolean = js.native
  @JSName("emit")
  def emit_message(event: nodeLib.nodeLibStrings.message, value: js.Any): scala.Boolean = js.native
  @JSName("off")
  def off_close(event: nodeLib.nodeLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("off")
  def off_message(event: nodeLib.nodeLibStrings.message, listener: js.Function1[/* value */ js.Any, scala.Unit]): this.type = js.native
  @JSName("on")
  def on_close(event: nodeLib.nodeLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_message(event: nodeLib.nodeLibStrings.message, listener: js.Function1[/* value */ js.Any, scala.Unit]): this.type = js.native
  @JSName("once")
  def once_close(event: nodeLib.nodeLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("once")
  def once_message(event: nodeLib.nodeLibStrings.message, listener: js.Function1[/* value */ js.Any, scala.Unit]): this.type = js.native
  def postMessage(value: js.Any): scala.Unit = js.native
  def postMessage(value: js.Any, transferList: js.Array[stdLib.ArrayBuffer | MessagePort]): scala.Unit = js.native
  @JSName("prependListener")
  def prependListener_close(event: nodeLib.nodeLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_message(event: nodeLib.nodeLibStrings.message, listener: js.Function1[/* value */ js.Any, scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_close(event: nodeLib.nodeLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_message(event: nodeLib.nodeLibStrings.message, listener: js.Function1[/* value */ js.Any, scala.Unit]): this.type = js.native
  def ref(): scala.Unit = js.native
  @JSName("removeListener")
  def removeListener_close(event: nodeLib.nodeLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_message(event: nodeLib.nodeLibStrings.message, listener: js.Function1[/* value */ js.Any, scala.Unit]): this.type = js.native
  def start(): scala.Unit = js.native
  def unref(): scala.Unit = js.native
}

