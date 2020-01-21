package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.userDefined
  - typings.microsoftGraph.microsoftGraphStrings.disabled
  - typings.microsoftGraph.microsoftGraphStrings.quick
  - typings.microsoftGraph.microsoftGraphStrings.full
*/
trait DefenderScanType extends js.Object

object DefenderScanType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def disabled: typings.microsoftGraph.microsoftGraphStrings.disabled = this.cast("disabled")
  @scala.inline
  def full: typings.microsoftGraph.microsoftGraphStrings.full = this.cast("full")
  @scala.inline
  def quick: typings.microsoftGraph.microsoftGraphStrings.quick = this.cast("quick")
  @scala.inline
  def userDefined: typings.microsoftGraph.microsoftGraphStrings.userDefined = this.cast("userDefined")
}

