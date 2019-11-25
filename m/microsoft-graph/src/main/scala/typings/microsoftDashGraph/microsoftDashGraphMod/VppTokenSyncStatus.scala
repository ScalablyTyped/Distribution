package typings.microsoftDashGraph.microsoftDashGraphMod

import typings.microsoftDashGraph.microsoftDashGraphStrings.completed_
import typings.microsoftDashGraph.microsoftDashGraphStrings.failed_
import typings.microsoftDashGraph.microsoftDashGraphStrings.none_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftDashGraph.microsoftDashGraphStrings.none_
  - typings.microsoftDashGraph.microsoftDashGraphStrings.inProgress
  - typings.microsoftDashGraph.microsoftDashGraphStrings.completed_
  - typings.microsoftDashGraph.microsoftDashGraphStrings.failed_
*/
trait VppTokenSyncStatus extends js.Object

object VppTokenSyncStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def completed: completed_ = this.cast("completed")
  @scala.inline
  def failed: failed_ = this.cast("failed")
  @scala.inline
  def inProgress: typings.microsoftDashGraph.microsoftDashGraphStrings.inProgress = this.cast("inProgress")
  @scala.inline
  def none: none_ = this.cast("none")
}

