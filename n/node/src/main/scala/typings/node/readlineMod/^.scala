package typings.node.readlineMod

import typings.node.NodeJSNs.ReadableStream
import typings.node.NodeJSNs.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("readline", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def clearLine(stream: WritableStream, dir: Double): Unit = js.native
  def clearScreenDown(stream: WritableStream): Unit = js.native
  def createInterface(input: ReadableStream): Interface = js.native
  def createInterface(input: ReadableStream, output: WritableStream): Interface = js.native
  def createInterface(input: ReadableStream, output: WritableStream, completer: AsyncCompleter): Interface = js.native
  def createInterface(input: ReadableStream, output: WritableStream, completer: AsyncCompleter, terminal: Boolean): Interface = js.native
  def createInterface(input: ReadableStream, output: WritableStream, completer: Completer): Interface = js.native
  def createInterface(input: ReadableStream, output: WritableStream, completer: Completer, terminal: Boolean): Interface = js.native
  def createInterface(options: ReadLineOptions): Interface = js.native
  def cursorTo(stream: WritableStream, x: Double): Unit = js.native
  def cursorTo(stream: WritableStream, x: Double, y: Double): Unit = js.native
  def emitKeypressEvents(stream: ReadableStream): Unit = js.native
  def emitKeypressEvents(stream: ReadableStream, interface: Interface): Unit = js.native
  def moveCursor(stream: WritableStream, dx: java.lang.String, dy: java.lang.String): Unit = js.native
  def moveCursor(stream: WritableStream, dx: java.lang.String, dy: Double): Unit = js.native
  def moveCursor(stream: WritableStream, dx: Double, dy: java.lang.String): Unit = js.native
  def moveCursor(stream: WritableStream, dx: Double, dy: Double): Unit = js.native
}

