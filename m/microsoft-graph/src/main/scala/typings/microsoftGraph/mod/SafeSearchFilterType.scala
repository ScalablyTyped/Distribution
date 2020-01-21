package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.userDefined
  - typings.microsoftGraph.microsoftGraphStrings.strict
  - typings.microsoftGraph.microsoftGraphStrings.moderate
*/
trait SafeSearchFilterType extends js.Object

object SafeSearchFilterType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def moderate: typings.microsoftGraph.microsoftGraphStrings.moderate = this.cast("moderate")
  @scala.inline
  def strict: typings.microsoftGraph.microsoftGraphStrings.strict = this.cast("strict")
  @scala.inline
  def userDefined: typings.microsoftGraph.microsoftGraphStrings.userDefined = this.cast("userDefined")
}

