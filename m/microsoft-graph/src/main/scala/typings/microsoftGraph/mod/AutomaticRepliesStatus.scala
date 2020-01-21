package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.disabled
  - typings.microsoftGraph.microsoftGraphStrings.alwaysEnabled
  - typings.microsoftGraph.microsoftGraphStrings.scheduled
*/
trait AutomaticRepliesStatus extends js.Object

object AutomaticRepliesStatus {
  @scala.inline
  def alwaysEnabled: typings.microsoftGraph.microsoftGraphStrings.alwaysEnabled = this.cast("alwaysEnabled")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def disabled: typings.microsoftGraph.microsoftGraphStrings.disabled = this.cast("disabled")
  @scala.inline
  def scheduled: typings.microsoftGraph.microsoftGraphStrings.scheduled = this.cast("scheduled")
}

