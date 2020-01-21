package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.available
  - typings.microsoftGraph.microsoftGraphStrings.required
  - typings.microsoftGraph.microsoftGraphStrings.uninstall
  - typings.microsoftGraph.microsoftGraphStrings.availableWithoutEnrollment
*/
trait InstallIntent extends js.Object

object InstallIntent {
  @scala.inline
  def available: typings.microsoftGraph.microsoftGraphStrings.available = this.cast("available")
  @scala.inline
  def availableWithoutEnrollment: typings.microsoftGraph.microsoftGraphStrings.availableWithoutEnrollment = this.cast("availableWithoutEnrollment")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def required: typings.microsoftGraph.microsoftGraphStrings.required = this.cast("required")
  @scala.inline
  def uninstall: typings.microsoftGraph.microsoftGraphStrings.uninstall = this.cast("uninstall")
}

