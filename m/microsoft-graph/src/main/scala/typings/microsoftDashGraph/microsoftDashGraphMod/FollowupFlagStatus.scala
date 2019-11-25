package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftDashGraph.microsoftDashGraphStrings.notFlagged
  - typings.microsoftDashGraph.microsoftDashGraphStrings.complete
  - typings.microsoftDashGraph.microsoftDashGraphStrings.flagged
*/
trait FollowupFlagStatus extends js.Object

object FollowupFlagStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def complete: typings.microsoftDashGraph.microsoftDashGraphStrings.complete = this.cast("complete")
  @scala.inline
  def flagged: typings.microsoftDashGraph.microsoftDashGraphStrings.flagged = this.cast("flagged")
  @scala.inline
  def notFlagged: typings.microsoftDashGraph.microsoftDashGraphStrings.notFlagged = this.cast("notFlagged")
}

