package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftDashGraph.microsoftDashGraphStrings.pending
  - typings.microsoftDashGraph.microsoftDashGraphStrings.active
  - typings.microsoftDashGraph.microsoftDashGraphStrings.warning
  - typings.microsoftDashGraph.microsoftDashGraphStrings.disabled
  - typings.microsoftDashGraph.microsoftDashGraphStrings.deleted
  - typings.microsoftDashGraph.microsoftDashGraphStrings.blocked
  - typings.microsoftDashGraph.microsoftDashGraphStrings.lockedOut
*/
trait DeviceManagementSubscriptionState extends js.Object

object DeviceManagementSubscriptionState {
  @scala.inline
  def active: typings.microsoftDashGraph.microsoftDashGraphStrings.active = this.cast("active")
  @scala.inline
  def blocked: typings.microsoftDashGraph.microsoftDashGraphStrings.blocked = this.cast("blocked")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def deleted: typings.microsoftDashGraph.microsoftDashGraphStrings.deleted = this.cast("deleted")
  @scala.inline
  def disabled: typings.microsoftDashGraph.microsoftDashGraphStrings.disabled = this.cast("disabled")
  @scala.inline
  def lockedOut: typings.microsoftDashGraph.microsoftDashGraphStrings.lockedOut = this.cast("lockedOut")
  @scala.inline
  def pending: typings.microsoftDashGraph.microsoftDashGraphStrings.pending = this.cast("pending")
  @scala.inline
  def warning: typings.microsoftDashGraph.microsoftDashGraphStrings.warning = this.cast("warning")
}

