package typings.mz.readlineMod

import typings.node.NodeJS.WritableStream
import typings.node.readlineMod.Direction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mz/readline", "clearLine")
@js.native
object clearLine extends js.Object {
  
  /**
    * Clears the current line of this WriteStream in a direction identified by `dir`.
    */
  def apply(stream: WritableStream, dir: Direction): Boolean = js.native
  def apply(stream: WritableStream, dir: Direction, callback: js.Function0[Unit]): Boolean = js.native
}
