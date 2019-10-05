package typings.node.osMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("os", "getPriority")
@js.native
object getPriority extends js.Object {
  /**
    * Gets the priority of a process.
    * Defaults to current process.
    */
  def apply(): Double = js.native
  def apply(pid: Double): Double = js.native
}

