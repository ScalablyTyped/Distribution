package typings.node.ttyMod

import typings.node.netMod.Socket
import typings.node.nodeStrings.resize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tty", "WriteStream")
@js.native
class WriteStream protected () extends Socket {
  def this(fd: Double) = this()
  var columns: Double = js.native
  var isTTY: Boolean = js.native
  var rows: Double = js.native
  @JSName("addListener")
  def addListener_resize(event: resize, listener: js.Function0[Unit]): this.type = js.native
  /**
    * Clears the current line of this WriteStream in a direction identified by `dir`.
    */
  def clearLine(dir: Direction): Boolean = js.native
  def clearLine(dir: Direction, callback: js.Function0[Unit]): Boolean = js.native
  /**
    * Clears this `WriteStream` from the current cursor down.
    */
  def clearScreenDown(): Boolean = js.native
  def clearScreenDown(callback: js.Function0[Unit]): Boolean = js.native
  /**
    * Moves this WriteStream's cursor to the specified position.
    */
  def cursorTo(x: Double): Boolean = js.native
  def cursorTo(x: Double, callback: js.Function0[Unit]): Boolean = js.native
  def cursorTo(x: Double, y: Double): Boolean = js.native
  def cursorTo(x: Double, y: Double, callback: js.Function0[Unit]): Boolean = js.native
  @JSName("emit")
  def emit_resize(event: resize): Boolean = js.native
  /**
    * @default `process.env`
    */
  def getColorDepth(): Double = js.native
  def getColorDepth(env: js.Object): Double = js.native
  def getWindowSize(): js.Tuple2[Double, Double] = js.native
  def hasColors(): Boolean = js.native
  def hasColors(depth: Double): Boolean = js.native
  def hasColors(depth: Double, env: js.Object): Boolean = js.native
  def hasColors(env: js.Object): Boolean = js.native
  /**
    * Moves this WriteStream's cursor relative to its current position.
    */
  def moveCursor(dx: Double, dy: Double): Boolean = js.native
  def moveCursor(dx: Double, dy: Double, callback: js.Function0[Unit]): Boolean = js.native
  @JSName("on")
  def on_resize(event: resize, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_resize(event: resize, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_resize(event: resize, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_resize(event: resize, listener: js.Function0[Unit]): this.type = js.native
}

