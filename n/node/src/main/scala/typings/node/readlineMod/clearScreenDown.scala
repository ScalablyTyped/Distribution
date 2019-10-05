package typings.node.readlineMod

import typings.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("readline", "clearScreenDown")
@js.native
object clearScreenDown extends js.Object {
  /**
    * Clears this `WriteStream` from the current cursor down.
    */
  def apply(stream: WritableStream): Boolean = js.native
  def apply(stream: WritableStream, callback: js.Function0[Unit]): Boolean = js.native
}

