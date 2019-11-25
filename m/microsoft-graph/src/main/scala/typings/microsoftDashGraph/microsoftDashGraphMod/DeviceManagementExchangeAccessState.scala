package typings.microsoftDashGraph.microsoftDashGraphMod

import typings.microsoftDashGraph.microsoftDashGraphStrings.none_
import typings.microsoftDashGraph.microsoftDashGraphStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftDashGraph.microsoftDashGraphStrings.none_
  - typings.microsoftDashGraph.microsoftDashGraphStrings.unknown_
  - typings.microsoftDashGraph.microsoftDashGraphStrings.allowed
  - typings.microsoftDashGraph.microsoftDashGraphStrings.blocked
  - typings.microsoftDashGraph.microsoftDashGraphStrings.quarantined
*/
trait DeviceManagementExchangeAccessState extends js.Object

object DeviceManagementExchangeAccessState {
  @scala.inline
  def allowed: typings.microsoftDashGraph.microsoftDashGraphStrings.allowed = this.cast("allowed")
  @scala.inline
  def blocked: typings.microsoftDashGraph.microsoftDashGraphStrings.blocked = this.cast("blocked")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def none: none_ = this.cast("none")
  @scala.inline
  def quarantined: typings.microsoftDashGraph.microsoftDashGraphStrings.quarantined = this.cast("quarantined")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
}

