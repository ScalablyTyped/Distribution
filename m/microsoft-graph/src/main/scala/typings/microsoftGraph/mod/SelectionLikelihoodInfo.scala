package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.notSpecified
  - typings.microsoftGraph.microsoftGraphStrings.high
*/
trait SelectionLikelihoodInfo extends js.Object

object SelectionLikelihoodInfo {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def high: typings.microsoftGraph.microsoftGraphStrings.high = this.cast("high")
  @scala.inline
  def notSpecified: typings.microsoftGraph.microsoftGraphStrings.notSpecified = this.cast("notSpecified")
}

