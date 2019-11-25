package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftDashGraph.microsoftDashGraphStrings.userDefined
  - typings.microsoftDashGraph.microsoftDashGraphStrings.strict
  - typings.microsoftDashGraph.microsoftDashGraphStrings.moderate
*/
trait SafeSearchFilterType extends js.Object

object SafeSearchFilterType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def moderate: typings.microsoftDashGraph.microsoftDashGraphStrings.moderate = this.cast("moderate")
  @scala.inline
  def strict: typings.microsoftDashGraph.microsoftDashGraphStrings.strict = this.cast("strict")
  @scala.inline
  def userDefined: typings.microsoftDashGraph.microsoftDashGraphStrings.userDefined = this.cast("userDefined")
}

