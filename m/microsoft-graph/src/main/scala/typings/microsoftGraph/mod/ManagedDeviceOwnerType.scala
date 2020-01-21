package typings.microsoftGraph.mod

import typings.microsoftGraph.microsoftGraphStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.unknown_
  - typings.microsoftGraph.microsoftGraphStrings.company
  - typings.microsoftGraph.microsoftGraphStrings.personal
*/
trait ManagedDeviceOwnerType extends js.Object

object ManagedDeviceOwnerType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def company: typings.microsoftGraph.microsoftGraphStrings.company = this.cast("company")
  @scala.inline
  def personal: typings.microsoftGraph.microsoftGraphStrings.personal = this.cast("personal")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
}

