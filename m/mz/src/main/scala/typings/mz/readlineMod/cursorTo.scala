package typings.mz.readlineMod

import typings.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mz/readline", "cursorTo")
@js.native
object cursorTo extends js.Object {
  /**
    * Moves this WriteStream's cursor to the specified position.
    */
  def apply(stream: WritableStream, x: Double): Boolean = js.native
  def apply(stream: WritableStream, x: Double, y: js.UndefOr[scala.Nothing], callback: js.Function0[Unit]): Boolean = js.native
  def apply(stream: WritableStream, x: Double, y: Double): Boolean = js.native
  def apply(stream: WritableStream, x: Double, y: Double, callback: js.Function0[Unit]): Boolean = js.native
}

