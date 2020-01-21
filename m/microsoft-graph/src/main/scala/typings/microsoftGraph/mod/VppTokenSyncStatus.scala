package typings.microsoftGraph.mod

import typings.microsoftGraph.microsoftGraphStrings.completed_
import typings.microsoftGraph.microsoftGraphStrings.failed_
import typings.microsoftGraph.microsoftGraphStrings.none_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.none_
  - typings.microsoftGraph.microsoftGraphStrings.inProgress
  - typings.microsoftGraph.microsoftGraphStrings.completed_
  - typings.microsoftGraph.microsoftGraphStrings.failed_
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
  def inProgress: typings.microsoftGraph.microsoftGraphStrings.inProgress = this.cast("inProgress")
  @scala.inline
  def none: none_ = this.cast("none")
}

