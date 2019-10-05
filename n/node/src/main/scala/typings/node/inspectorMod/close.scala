package typings.node.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inspector", "close")
@js.native
object close extends js.Object {
  /**
    * Deactivate the inspector. Blocks until there are no active connections.
    */
  def apply(): Unit = js.native
}

