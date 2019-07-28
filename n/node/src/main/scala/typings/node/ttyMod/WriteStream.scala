package typings.node.ttyMod

import typings.node.netMod.Socket
import typings.node.nodeStrings.resize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tty", "WriteStream")
@js.native
class WriteStream () extends Socket {
  var columns: Double = js.native
  var isTTY: Boolean = js.native
  var rows: Double = js.native
  @JSName("addListener")
  def addListener_resize(event: resize, listener: js.Function0[Unit]): this.type = js.native
  def clearLine(dir: Direction): Unit = js.native
  def clearScreenDown(): Unit = js.native
  def cursorTo(x: Double, y: Double): Unit = js.native
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
  @JSName("on")
  def on_resize(event: resize, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_resize(event: resize, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_resize(event: resize, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_resize(event: resize, listener: js.Function0[Unit]): this.type = js.native
}

