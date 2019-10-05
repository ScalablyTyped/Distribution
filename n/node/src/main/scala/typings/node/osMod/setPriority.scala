package typings.node.osMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("os", "setPriority")
@js.native
object setPriority extends js.Object {
  /**
    * Sets the priority of the process specified process.
    * @param priority Must be in range of -20 to 19
    */
  def apply(pid: Double, priority: Double): Unit = js.native
  /**
    * Sets the priority of the current process.
    * @param priority Must be in range of -20 to 19
    */
  def apply(priority: Double): Unit = js.native
}

