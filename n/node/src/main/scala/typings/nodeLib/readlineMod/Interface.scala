package typings
package nodeLib.readlineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("readline", "Interface")
@js.native
class Interface protected ()
  extends nodeLib.eventsMod.EventEmitter {
  /**
    * NOTE: According to the documentation:
    *
    * > Instances of the `readline.Interface` class are constructed using the
    * > `readline.createInterface()` method.
    *
    * @see https://nodejs.org/dist/latest-v10.x/docs/api/readline.html#readline_class_interface
    */
  protected def this(input: nodeLib.NodeJSNs.ReadableStream) = this()
  /**
    * NOTE: According to the documentation:
    *
    * > Instances of the `readline.Interface` class are constructed using the
    * > `readline.createInterface()` method.
    *
    * @see https://nodejs.org/dist/latest-v10.x/docs/api/readline.html#readline_class_interface
    */
  protected def this(options: ReadLineOptions) = this()
  protected def this(input: nodeLib.NodeJSNs.ReadableStream, output: nodeLib.NodeJSNs.WritableStream) = this()
  protected def this(input: nodeLib.NodeJSNs.ReadableStream, output: nodeLib.NodeJSNs.WritableStream, completer: AsyncCompleter) = this()
  protected def this(input: nodeLib.NodeJSNs.ReadableStream, output: nodeLib.NodeJSNs.WritableStream, completer: Completer) = this()
  protected def this(input: nodeLib.NodeJSNs.ReadableStream, output: nodeLib.NodeJSNs.WritableStream, completer: AsyncCompleter, terminal: scala.Boolean) = this()
  protected def this(input: nodeLib.NodeJSNs.ReadableStream, output: nodeLib.NodeJSNs.WritableStream, completer: Completer, terminal: scala.Boolean) = this()
  val terminal: scala.Boolean = js.native
  @JSName("addListener")
  def addListener_SIGCONT(event: nodeLib.nodeLibStrings.SIGCONT, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_SIGINT(event: nodeLib.nodeLibStrings.SIGINT, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_SIGTSTP(event: nodeLib.nodeLibStrings.SIGTSTP, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_close(event: nodeLib.nodeLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_line(
    event: nodeLib.nodeLibStrings.line,
    listener: js.Function1[/* input */ java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_pause(event: nodeLib.nodeLibStrings.pause, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_resume(event: nodeLib.nodeLibStrings.resume, listener: js.Function0[scala.Unit]): this.type = js.native
  def close(): scala.Unit = js.native
  @JSName("emit")
  def emit_SIGCONT(event: nodeLib.nodeLibStrings.SIGCONT): scala.Boolean = js.native
  @JSName("emit")
  def emit_SIGINT(event: nodeLib.nodeLibStrings.SIGINT): scala.Boolean = js.native
  @JSName("emit")
  def emit_SIGTSTP(event: nodeLib.nodeLibStrings.SIGTSTP): scala.Boolean = js.native
  @JSName("emit")
  def emit_close(event: nodeLib.nodeLibStrings.close): scala.Boolean = js.native
  @JSName("emit")
  def emit_line(event: nodeLib.nodeLibStrings.line, input: java.lang.String): scala.Boolean = js.native
  @JSName("emit")
  def emit_pause(event: nodeLib.nodeLibStrings.pause): scala.Boolean = js.native
  @JSName("emit")
  def emit_resume(event: nodeLib.nodeLibStrings.resume): scala.Boolean = js.native
  @JSName("on")
  def on_SIGCONT(event: nodeLib.nodeLibStrings.SIGCONT, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_SIGINT(event: nodeLib.nodeLibStrings.SIGINT, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_SIGTSTP(event: nodeLib.nodeLibStrings.SIGTSTP, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_close(event: nodeLib.nodeLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_line(
    event: nodeLib.nodeLibStrings.line,
    listener: js.Function1[/* input */ java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_pause(event: nodeLib.nodeLibStrings.pause, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_resume(event: nodeLib.nodeLibStrings.resume, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("once")
  def once_SIGCONT(event: nodeLib.nodeLibStrings.SIGCONT, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("once")
  def once_SIGINT(event: nodeLib.nodeLibStrings.SIGINT, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("once")
  def once_SIGTSTP(event: nodeLib.nodeLibStrings.SIGTSTP, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("once")
  def once_close(event: nodeLib.nodeLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("once")
  def once_line(
    event: nodeLib.nodeLibStrings.line,
    listener: js.Function1[/* input */ java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_pause(event: nodeLib.nodeLibStrings.pause, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("once")
  def once_resume(event: nodeLib.nodeLibStrings.resume, listener: js.Function0[scala.Unit]): this.type = js.native
  def pause(): this.type = js.native
  @JSName("prependListener")
  def prependListener_SIGCONT(event: nodeLib.nodeLibStrings.SIGCONT, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_SIGINT(event: nodeLib.nodeLibStrings.SIGINT, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_SIGTSTP(event: nodeLib.nodeLibStrings.SIGTSTP, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_close(event: nodeLib.nodeLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_line(
    event: nodeLib.nodeLibStrings.line,
    listener: js.Function1[/* input */ java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_pause(event: nodeLib.nodeLibStrings.pause, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_resume(event: nodeLib.nodeLibStrings.resume, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_SIGCONT(event: nodeLib.nodeLibStrings.SIGCONT, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_SIGINT(event: nodeLib.nodeLibStrings.SIGINT, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_SIGTSTP(event: nodeLib.nodeLibStrings.SIGTSTP, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_close(event: nodeLib.nodeLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_line(
    event: nodeLib.nodeLibStrings.line,
    listener: js.Function1[/* input */ java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_pause(event: nodeLib.nodeLibStrings.pause, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_resume(event: nodeLib.nodeLibStrings.resume, listener: js.Function0[scala.Unit]): this.type = js.native
  def prompt(): scala.Unit = js.native
  def prompt(preserveCursor: scala.Boolean): scala.Unit = js.native
  def question(query: java.lang.String, callback: js.Function1[/* answer */ java.lang.String, scala.Unit]): scala.Unit = js.native
  def resume(): this.type = js.native
  def setPrompt(prompt: java.lang.String): scala.Unit = js.native
  def write(data: java.lang.String): scala.Unit = js.native
  def write(data: java.lang.String, key: Key): scala.Unit = js.native
  def write(data: nodeLib.Buffer): scala.Unit = js.native
  def write(data: nodeLib.Buffer, key: Key): scala.Unit = js.native
}

