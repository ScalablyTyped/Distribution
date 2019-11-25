package typings.microsoftDashGraph.microsoftDashGraphMod

import typings.microsoftDashGraph.microsoftDashGraphStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftDashGraph.microsoftDashGraphStrings.unknown_
  - typings.microsoftDashGraph.microsoftDashGraphStrings.unavailable
  - typings.microsoftDashGraph.microsoftDashGraphStrings.enabled
  - typings.microsoftDashGraph.microsoftDashGraphStrings.terminated
  - typings.microsoftDashGraph.microsoftDashGraphStrings.rejected
  - typings.microsoftDashGraph.microsoftDashGraphStrings.unresponsive
*/
trait DeviceManagementPartnerTenantState extends js.Object

object DeviceManagementPartnerTenantState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def enabled: typings.microsoftDashGraph.microsoftDashGraphStrings.enabled = this.cast("enabled")
  @scala.inline
  def rejected: typings.microsoftDashGraph.microsoftDashGraphStrings.rejected = this.cast("rejected")
  @scala.inline
  def terminated: typings.microsoftDashGraph.microsoftDashGraphStrings.terminated = this.cast("terminated")
  @scala.inline
  def unavailable: typings.microsoftDashGraph.microsoftDashGraphStrings.unavailable = this.cast("unavailable")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
  @scala.inline
  def unresponsive: typings.microsoftDashGraph.microsoftDashGraphStrings.unresponsive = this.cast("unresponsive")
}

