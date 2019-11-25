package typings.mobxDashTask.libTaskDashGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.mobxDashTask.mobxDashTaskStrings.state
  - typings.mobxDashTask.mobxDashTaskStrings.pending
  - typings.mobxDashTask.mobxDashTaskStrings.resolved
  - typings.mobxDashTask.mobxDashTaskStrings.rejected
  - typings.mobxDashTask.mobxDashTaskStrings.result
  - typings.mobxDashTask.mobxDashTaskStrings.error
  - typings.mobxDashTask.mobxDashTaskStrings.`match`
*/
trait QueryableMethods extends js.Object

object QueryableMethods {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def error: typings.mobxDashTask.mobxDashTaskStrings.error = this.cast("error")
  @scala.inline
  def `match`: typings.mobxDashTask.mobxDashTaskStrings.`match` = this.cast("match")
  @scala.inline
  def pending: typings.mobxDashTask.mobxDashTaskStrings.pending = this.cast("pending")
  @scala.inline
  def rejected: typings.mobxDashTask.mobxDashTaskStrings.rejected = this.cast("rejected")
  @scala.inline
  def resolved: typings.mobxDashTask.mobxDashTaskStrings.resolved = this.cast("resolved")
  @scala.inline
  def result: typings.mobxDashTask.mobxDashTaskStrings.result = this.cast("result")
  @scala.inline
  def state: typings.mobxDashTask.mobxDashTaskStrings.state = this.cast("state")
}

