package typings
package nodeLib.ttyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tty", "WriteStream")
@js.native
class WriteStream ()
  extends nodeLib.netMod.Socket {
  var columns: scala.Double = js.native
  var isTTY: scala.Boolean = js.native
  var rows: scala.Double = js.native
  @JSName("addListener")
  def addListener_resize(event: nodeLib.nodeLibStrings.resize, listener: js.Function0[scala.Unit]): this.type = js.native
  def clearLine(dir: Direction): scala.Unit = js.native
  def clearScreenDown(): scala.Unit = js.native
  def cursorTo(x: scala.Double, y: scala.Double): scala.Unit = js.native
  @JSName("emit")
  def emit_resize(event: nodeLib.nodeLibStrings.resize): scala.Boolean = js.native
  /**
    * @default `process.env`
    */
  def getColorDepth(): scala.Double = js.native
  def getColorDepth(env: js.Object): scala.Double = js.native
  def getWindowSize(): js.Tuple2[scala.Double, scala.Double] = js.native
  @JSName("on")
  def on_resize(event: nodeLib.nodeLibStrings.resize, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("once")
  def once_resize(event: nodeLib.nodeLibStrings.resize, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_resize(event: nodeLib.nodeLibStrings.resize, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_resize(event: nodeLib.nodeLibStrings.resize, listener: js.Function0[scala.Unit]): this.type = js.native
}

