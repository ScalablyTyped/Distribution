package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftDashGraph.microsoftDashGraphStrings.available
  - typings.microsoftDashGraph.microsoftDashGraphStrings.required
  - typings.microsoftDashGraph.microsoftDashGraphStrings.uninstall
  - typings.microsoftDashGraph.microsoftDashGraphStrings.availableWithoutEnrollment
*/
trait InstallIntent extends js.Object

object InstallIntent {
  @scala.inline
  def available: typings.microsoftDashGraph.microsoftDashGraphStrings.available = this.cast("available")
  @scala.inline
  def availableWithoutEnrollment: typings.microsoftDashGraph.microsoftDashGraphStrings.availableWithoutEnrollment = this.cast("availableWithoutEnrollment")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def required: typings.microsoftDashGraph.microsoftDashGraphStrings.required = this.cast("required")
  @scala.inline
  def uninstall: typings.microsoftDashGraph.microsoftDashGraphStrings.uninstall = this.cast("uninstall")
}

