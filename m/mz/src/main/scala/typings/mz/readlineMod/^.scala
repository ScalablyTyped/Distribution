package typings.mz.readlineMod

import typings.node.NodeJSNs.ReadableStream
import typings.node.NodeJSNs.WritableStream
import typings.node.readlineMod.AsyncCompleter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mz/readline", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def clearLine(stream: WritableStream, dir: Double): Unit = js.native
  def clearScreenDown(stream: WritableStream): Unit = js.native
  def createInterface(input: ReadableStream): ReadLine = js.native
  def createInterface(input: ReadableStream, output: WritableStream): ReadLine = js.native
  def createInterface(input: ReadableStream, output: WritableStream, completer: Completer): ReadLine = js.native
  def createInterface(input: ReadableStream, output: WritableStream, completer: Completer, terminal: Boolean): ReadLine = js.native
  def createInterface(input: ReadableStream, output: WritableStream, completer: AsyncCompleter): typings.node.readlineMod.Interface = js.native
  def createInterface(input: ReadableStream, output: WritableStream, completer: AsyncCompleter, terminal: Boolean): typings.node.readlineMod.Interface = js.native
  def createInterface(input: ReadableStream, output: WritableStream, completer: typings.node.readlineMod.Completer): typings.node.readlineMod.Interface = js.native
  def createInterface(
    input: ReadableStream,
    output: WritableStream,
    completer: typings.node.readlineMod.Completer,
    terminal: Boolean
  ): typings.node.readlineMod.Interface = js.native
  def createInterface(options: ReadLineOptions): ReadLine = js.native
  def createInterface(options: typings.node.readlineMod.ReadLineOptions): typings.node.readlineMod.Interface = js.native
  @JSName("createInterface")
  def createInterface_Interface(input: ReadableStream): typings.node.readlineMod.Interface = js.native
  @JSName("createInterface")
  def createInterface_Interface(input: ReadableStream, output: WritableStream): typings.node.readlineMod.Interface = js.native
  def cursorTo(stream: WritableStream, x: Double): Unit = js.native
  def cursorTo(stream: WritableStream, x: Double, y: Double): Unit = js.native
  def emitKeypressEvents(stream: ReadableStream): Unit = js.native
  def emitKeypressEvents(stream: ReadableStream, interface: typings.node.readlineMod.Interface): Unit = js.native
  def moveCursor(stream: WritableStream, dx: String, dy: String): Unit = js.native
  def moveCursor(stream: WritableStream, dx: String, dy: Double): Unit = js.native
  def moveCursor(stream: WritableStream, dx: Double, dy: String): Unit = js.native
  def moveCursor(stream: WritableStream, dx: Double, dy: Double): Unit = js.native
}

