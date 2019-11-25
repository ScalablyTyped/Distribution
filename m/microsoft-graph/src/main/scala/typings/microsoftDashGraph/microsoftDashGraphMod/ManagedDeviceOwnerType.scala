package typings.microsoftDashGraph.microsoftDashGraphMod

import typings.microsoftDashGraph.microsoftDashGraphStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftDashGraph.microsoftDashGraphStrings.unknown_
  - typings.microsoftDashGraph.microsoftDashGraphStrings.company
  - typings.microsoftDashGraph.microsoftDashGraphStrings.personal
*/
trait ManagedDeviceOwnerType extends js.Object

object ManagedDeviceOwnerType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def company: typings.microsoftDashGraph.microsoftDashGraphStrings.company = this.cast("company")
  @scala.inline
  def personal: typings.microsoftDashGraph.microsoftDashGraphStrings.personal = this.cast("personal")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
}

