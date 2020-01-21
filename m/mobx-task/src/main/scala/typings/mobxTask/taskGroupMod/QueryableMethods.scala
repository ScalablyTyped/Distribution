package typings.mobxTask.taskGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.mobxTask.mobxTaskStrings.state
  - typings.mobxTask.mobxTaskStrings.pending
  - typings.mobxTask.mobxTaskStrings.resolved
  - typings.mobxTask.mobxTaskStrings.rejected
  - typings.mobxTask.mobxTaskStrings.result
  - typings.mobxTask.mobxTaskStrings.error
  - typings.mobxTask.mobxTaskStrings.`match`
*/
trait QueryableMethods extends js.Object

object QueryableMethods {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def error: typings.mobxTask.mobxTaskStrings.error = this.cast("error")
  @scala.inline
  def `match`: typings.mobxTask.mobxTaskStrings.`match` = this.cast("match")
  @scala.inline
  def pending: typings.mobxTask.mobxTaskStrings.pending = this.cast("pending")
  @scala.inline
  def rejected: typings.mobxTask.mobxTaskStrings.rejected = this.cast("rejected")
  @scala.inline
  def resolved: typings.mobxTask.mobxTaskStrings.resolved = this.cast("resolved")
  @scala.inline
  def result: typings.mobxTask.mobxTaskStrings.result = this.cast("result")
  @scala.inline
  def state: typings.mobxTask.mobxTaskStrings.state = this.cast("state")
}

