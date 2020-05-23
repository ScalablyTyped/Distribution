package typings.mz.mod

import typings.mz.readlineMod.Completer
import typings.mz.readlineMod.ReadLineOptions
import typings.node.NodeJS.ReadableStream
import typings.node.NodeJS.WritableStream
import typings.node.readlineMod.Direction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mz", "readline")
@js.native
object readline extends js.Object {
  @js.native
  class Interface ()
    extends typings.mz.readlineMod.Interface
  
  /**
    * Clears the current line of this WriteStream in a direction identified by `dir`.
    */
  def clearLine(stream: WritableStream, dir: Direction): Boolean = js.native
  def clearLine(stream: WritableStream, dir: Direction, callback: js.Function0[Unit]): Boolean = js.native
  /**
    * Clears this `WriteStream` from the current cursor down.
    */
  def clearScreenDown(stream: WritableStream): Boolean = js.native
  def clearScreenDown(stream: WritableStream, callback: js.Function0[Unit]): Boolean = js.native
  def createInterface(input: ReadableStream): typings.mz.readlineMod.Interface = js.native
  def createInterface(input: ReadableStream, output: WritableStream): typings.mz.readlineMod.Interface = js.native
  def createInterface(input: ReadableStream, output: WritableStream, completer: Completer): typings.mz.readlineMod.Interface = js.native
  def createInterface(input: ReadableStream, output: WritableStream, completer: Completer, terminal: Boolean): typings.mz.readlineMod.Interface = js.native
  def createInterface(options: ReadLineOptions): typings.mz.readlineMod.Interface = js.native
  /**
    * Moves this WriteStream's cursor to the specified position.
    */
  def cursorTo(stream: WritableStream, x: Double): Boolean = js.native
  def cursorTo(stream: WritableStream, x: Double, y: Double): Boolean = js.native
  def cursorTo(stream: WritableStream, x: Double, y: Double, callback: js.Function0[Unit]): Boolean = js.native
  def emitKeypressEvents(stream: ReadableStream): Unit = js.native
  def emitKeypressEvents(stream: ReadableStream, readlineInterface: typings.node.readlineMod.Interface): Unit = js.native
  /**
    * Moves this WriteStream's cursor relative to its current position.
    */
  def moveCursor(stream: WritableStream, dx: Double, dy: Double): Boolean = js.native
  def moveCursor(stream: WritableStream, dx: Double, dy: Double, callback: js.Function0[Unit]): Boolean = js.native
}

