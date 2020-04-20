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
  def pending: typings.mobxTask.mobxTaskStrings.pending = "pending".asInstanceOf[typings.mobxTask.mobxTaskStrings.pending]
  @scala.inline
  def rejected: typings.mobxTask.mobxTaskStrings.rejected = "rejected".asInstanceOf[typings.mobxTask.mobxTaskStrings.rejected]
  @scala.inline
  def resolved: typings.mobxTask.mobxTaskStrings.resolved = "resolved".asInstanceOf[typings.mobxTask.mobxTaskStrings.resolved]
}

