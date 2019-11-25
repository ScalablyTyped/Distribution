package typings.microsoftDashGraph.microsoftDashGraphMod

import typings.microsoftDashGraph.microsoftDashGraphStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftDashGraph.microsoftDashGraphStrings.unknown_
  - typings.microsoftDashGraph.microsoftDashGraphStrings.valid
  - typings.microsoftDashGraph.microsoftDashGraphStrings.expired
  - typings.microsoftDashGraph.microsoftDashGraphStrings.invalid
  - typings.microsoftDashGraph.microsoftDashGraphStrings.assignedToExternalMDM
*/
trait VppTokenState extends js.Object

object VppTokenState {
  @scala.inline
  def assignedToExternalMDM: typings.microsoftDashGraph.microsoftDashGraphStrings.assignedToExternalMDM = this.cast("assignedToExternalMDM")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def expired: typings.microsoftDashGraph.microsoftDashGraphStrings.expired = this.cast("expired")
  @scala.inline
  def invalid: typings.microsoftDashGraph.microsoftDashGraphStrings.invalid = this.cast("invalid")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
  @scala.inline
  def valid: typings.microsoftDashGraph.microsoftDashGraphStrings.valid = this.cast("valid")
}

