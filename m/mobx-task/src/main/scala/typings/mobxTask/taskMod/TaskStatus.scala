package typings.mobxTask.taskMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.mobxTask.mobxTaskStrings.pending
  - typings.mobxTask.mobxTaskStrings.resolved
  - typings.mobxTask.mobxTaskStrings.rejected
*/
trait TaskStatus extends js.Object

object TaskStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def pending: typings.mobxTask.mobxTaskStrings.pending = this.cast("pending")
  @scala.inline
  def rejected: typings.mobxTask.mobxTaskStrings.rejected = this.cast("rejected")
  @scala.inline
  def resolved: typings.mobxTask.mobxTaskStrings.resolved = this.cast("resolved")
}

