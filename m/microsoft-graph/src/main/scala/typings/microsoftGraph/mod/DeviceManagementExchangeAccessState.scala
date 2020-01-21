package typings.microsoftGraph.mod

import typings.microsoftGraph.microsoftGraphStrings.none_
import typings.microsoftGraph.microsoftGraphStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.none_
  - typings.microsoftGraph.microsoftGraphStrings.unknown_
  - typings.microsoftGraph.microsoftGraphStrings.allowed
  - typings.microsoftGraph.microsoftGraphStrings.blocked
  - typings.microsoftGraph.microsoftGraphStrings.quarantined
*/
trait DeviceManagementExchangeAccessState extends js.Object

object DeviceManagementExchangeAccessState {
  @scala.inline
  def allowed: typings.microsoftGraph.microsoftGraphStrings.allowed = this.cast("allowed")
  @scala.inline
  def blocked: typings.microsoftGraph.microsoftGraphStrings.blocked = this.cast("blocked")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def none: none_ = this.cast("none")
  @scala.inline
  def quarantined: typings.microsoftGraph.microsoftGraphStrings.quarantined = this.cast("quarantined")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
}

