package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.pending
  - typings.microsoftGraph.microsoftGraphStrings.active
  - typings.microsoftGraph.microsoftGraphStrings.warning
  - typings.microsoftGraph.microsoftGraphStrings.disabled
  - typings.microsoftGraph.microsoftGraphStrings.deleted
  - typings.microsoftGraph.microsoftGraphStrings.blocked
  - typings.microsoftGraph.microsoftGraphStrings.lockedOut
*/
trait DeviceManagementSubscriptionState extends js.Object

object DeviceManagementSubscriptionState {
  @scala.inline
  def active: typings.microsoftGraph.microsoftGraphStrings.active = this.cast("active")
  @scala.inline
  def blocked: typings.microsoftGraph.microsoftGraphStrings.blocked = this.cast("blocked")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def deleted: typings.microsoftGraph.microsoftGraphStrings.deleted = this.cast("deleted")
  @scala.inline
  def disabled: typings.microsoftGraph.microsoftGraphStrings.disabled = this.cast("disabled")
  @scala.inline
  def lockedOut: typings.microsoftGraph.microsoftGraphStrings.lockedOut = this.cast("lockedOut")
  @scala.inline
  def pending: typings.microsoftGraph.microsoftGraphStrings.pending = this.cast("pending")
  @scala.inline
  def warning: typings.microsoftGraph.microsoftGraphStrings.warning = this.cast("warning")
}

