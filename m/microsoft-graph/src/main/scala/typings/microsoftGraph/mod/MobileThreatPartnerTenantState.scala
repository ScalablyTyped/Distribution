package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.unavailable
  - typings.microsoftGraph.microsoftGraphStrings.available
  - typings.microsoftGraph.microsoftGraphStrings.enabled
  - typings.microsoftGraph.microsoftGraphStrings.unresponsive
*/
trait MobileThreatPartnerTenantState extends js.Object

object MobileThreatPartnerTenantState {
  @scala.inline
  def available: typings.microsoftGraph.microsoftGraphStrings.available = this.cast("available")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def enabled: typings.microsoftGraph.microsoftGraphStrings.enabled = this.cast("enabled")
  @scala.inline
  def unavailable: typings.microsoftGraph.microsoftGraphStrings.unavailable = this.cast("unavailable")
  @scala.inline
  def unresponsive: typings.microsoftGraph.microsoftGraphStrings.unresponsive = this.cast("unresponsive")
}

