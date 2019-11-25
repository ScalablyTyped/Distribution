package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftDashGraph.microsoftDashGraphStrings.disabled
  - typings.microsoftDashGraph.microsoftDashGraphStrings.alwaysEnabled
  - typings.microsoftDashGraph.microsoftDashGraphStrings.scheduled
*/
trait AutomaticRepliesStatus extends js.Object

object AutomaticRepliesStatus {
  @scala.inline
  def alwaysEnabled: typings.microsoftDashGraph.microsoftDashGraphStrings.alwaysEnabled = this.cast("alwaysEnabled")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def disabled: typings.microsoftDashGraph.microsoftDashGraphStrings.disabled = this.cast("disabled")
  @scala.inline
  def scheduled: typings.microsoftDashGraph.microsoftDashGraphStrings.scheduled = this.cast("scheduled")
}

