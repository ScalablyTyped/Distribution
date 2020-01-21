package typings.microsoftGraph.mod

import typings.microsoftGraph.microsoftGraphStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.unknown_
  - typings.microsoftGraph.microsoftGraphStrings.unavailable
  - typings.microsoftGraph.microsoftGraphStrings.enabled
  - typings.microsoftGraph.microsoftGraphStrings.terminated
  - typings.microsoftGraph.microsoftGraphStrings.rejected
  - typings.microsoftGraph.microsoftGraphStrings.unresponsive
*/
trait DeviceManagementPartnerTenantState extends js.Object

object DeviceManagementPartnerTenantState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def enabled: typings.microsoftGraph.microsoftGraphStrings.enabled = this.cast("enabled")
  @scala.inline
  def rejected: typings.microsoftGraph.microsoftGraphStrings.rejected = this.cast("rejected")
  @scala.inline
  def terminated: typings.microsoftGraph.microsoftGraphStrings.terminated = this.cast("terminated")
  @scala.inline
  def unavailable: typings.microsoftGraph.microsoftGraphStrings.unavailable = this.cast("unavailable")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
  @scala.inline
  def unresponsive: typings.microsoftGraph.microsoftGraphStrings.unresponsive = this.cast("unresponsive")
}

