package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.notFlagged
  - typings.microsoftGraph.microsoftGraphStrings.complete
  - typings.microsoftGraph.microsoftGraphStrings.flagged
*/
trait FollowupFlagStatus extends js.Object

object FollowupFlagStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def complete: typings.microsoftGraph.microsoftGraphStrings.complete = this.cast("complete")
  @scala.inline
  def flagged: typings.microsoftGraph.microsoftGraphStrings.flagged = this.cast("flagged")
  @scala.inline
  def notFlagged: typings.microsoftGraph.microsoftGraphStrings.notFlagged = this.cast("notFlagged")
}

