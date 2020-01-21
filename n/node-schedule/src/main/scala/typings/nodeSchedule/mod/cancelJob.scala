package typings.nodeSchedule.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-schedule", "cancelJob")
@js.native
object cancelJob extends js.Object {
  def apply(job: String): Boolean = js.native
  def apply(job: Job): Boolean = js.native
}

