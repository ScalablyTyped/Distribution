package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftDashGraph.microsoftDashGraphStrings.userDefined
  - typings.microsoftDashGraph.microsoftDashGraphStrings.disabled
  - typings.microsoftDashGraph.microsoftDashGraphStrings.quick
  - typings.microsoftDashGraph.microsoftDashGraphStrings.full
*/
trait DefenderScanType extends js.Object

object DefenderScanType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def disabled: typings.microsoftDashGraph.microsoftDashGraphStrings.disabled = this.cast("disabled")
  @scala.inline
  def full: typings.microsoftDashGraph.microsoftDashGraphStrings.full = this.cast("full")
  @scala.inline
  def quick: typings.microsoftDashGraph.microsoftDashGraphStrings.quick = this.cast("quick")
  @scala.inline
  def userDefined: typings.microsoftDashGraph.microsoftDashGraphStrings.userDefined = this.cast("userDefined")
}

