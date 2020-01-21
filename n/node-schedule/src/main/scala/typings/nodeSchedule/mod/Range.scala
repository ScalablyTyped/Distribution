package typings.nodeSchedule.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-schedule", "Range")
@js.native
class Range () extends js.Object {
  def this(start: Double) = this()
  def this(start: Double, end: Double) = this()
  def this(start: Double, end: Double, step: Double) = this()
  /** Whether the class contains the specified value. */
  def contains(value: Double): Boolean = js.native
}

