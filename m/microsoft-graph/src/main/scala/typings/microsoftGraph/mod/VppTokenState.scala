package typings.microsoftGraph.mod

import typings.microsoftGraph.microsoftGraphStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.unknown_
  - typings.microsoftGraph.microsoftGraphStrings.valid
  - typings.microsoftGraph.microsoftGraphStrings.expired
  - typings.microsoftGraph.microsoftGraphStrings.invalid
  - typings.microsoftGraph.microsoftGraphStrings.assignedToExternalMDM
*/
trait VppTokenState extends js.Object

object VppTokenState {
  @scala.inline
  def assignedToExternalMDM: typings.microsoftGraph.microsoftGraphStrings.assignedToExternalMDM = this.cast("assignedToExternalMDM")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def expired: typings.microsoftGraph.microsoftGraphStrings.expired = this.cast("expired")
  @scala.inline
  def invalid: typings.microsoftGraph.microsoftGraphStrings.invalid = this.cast("invalid")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
  @scala.inline
  def valid: typings.microsoftGraph.microsoftGraphStrings.valid = this.cast("valid")
}

