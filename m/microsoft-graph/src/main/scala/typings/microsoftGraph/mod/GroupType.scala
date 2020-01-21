package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.unifiedGroups
  - typings.microsoftGraph.microsoftGraphStrings.azureAD
  - typings.microsoftGraph.microsoftGraphStrings.unknownFutureValue
*/
trait GroupType extends js.Object

object GroupType {
  @scala.inline
  def azureAD: typings.microsoftGraph.microsoftGraphStrings.azureAD = this.cast("azureAD")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def unifiedGroups: typings.microsoftGraph.microsoftGraphStrings.unifiedGroups = this.cast("unifiedGroups")
  @scala.inline
  def unknownFutureValue: typings.microsoftGraph.microsoftGraphStrings.unknownFutureValue = this.cast("unknownFutureValue")
}

