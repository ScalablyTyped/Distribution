package typings.node.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inspector", "waitForDebugger")
@js.native
object waitForDebugger extends js.Object {
  /**
    * Blocks until a client (existing or connected later) has sent
    * `Runtime.runIfWaitingForDebugger` command.
    * An exception will be thrown if there is no active inspector.
    */
  def apply(): Unit = js.native
}

