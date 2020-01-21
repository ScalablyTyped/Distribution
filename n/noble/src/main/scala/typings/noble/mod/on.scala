package typings.noble.mod

import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("noble", "on")
@js.native
object on extends js.Object {
  def apply(event: String, listener: js.Function): EventEmitter = js.native
}

