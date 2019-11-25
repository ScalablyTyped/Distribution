package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftDashGraph.microsoftDashGraphStrings.notConfigured
  - typings.microsoftDashGraph.microsoftDashGraphStrings.blocked
  - typings.microsoftDashGraph.microsoftDashGraphStrings.allowed
*/
trait StateManagementSetting extends js.Object

object StateManagementSetting {
  @scala.inline
  def allowed: typings.microsoftDashGraph.microsoftDashGraphStrings.allowed = this.cast("allowed")
  @scala.inline
  def blocked: typings.microsoftDashGraph.microsoftDashGraphStrings.blocked = this.cast("blocked")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def notConfigured: typings.microsoftDashGraph.microsoftDashGraphStrings.notConfigured = this.cast("notConfigured")
}

