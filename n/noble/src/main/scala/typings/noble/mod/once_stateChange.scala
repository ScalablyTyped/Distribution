package typings.noble.mod

import typings.noble.nobleStrings.stateChange
import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("noble", "once")
@js.native
object once_stateChange extends js.Object {
  def apply(event: stateChange, listener: js.Function1[/* state */ String, Unit]): EventEmitter = js.native
}

