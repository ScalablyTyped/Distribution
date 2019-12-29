package typings.node.eventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("events", "once")
@js.native
object once extends js.Object {
  def apply(emitter: DOMEventTarget, event: String): js.Promise[js.Array[_]] = js.native
  def apply(emitter: NodeEventTarget, event: String): js.Promise[js.Array[_]] = js.native
  def apply(emitter: NodeEventTarget, event: js.Symbol): js.Promise[js.Array[_]] = js.native
}

