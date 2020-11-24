package typings.mz.readlineMod

import typings.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mz/readline", "moveCursor")
@js.native
object moveCursor extends js.Object {
  
  /**
    * Moves this WriteStream's cursor relative to its current position.
    */
  def apply(stream: WritableStream, dx: Double, dy: Double): Boolean = js.native
  def apply(stream: WritableStream, dx: Double, dy: Double, callback: js.Function0[Unit]): Boolean = js.native
}
