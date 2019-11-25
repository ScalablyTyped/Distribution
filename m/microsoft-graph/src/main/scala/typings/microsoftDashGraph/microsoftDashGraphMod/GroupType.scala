package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftDashGraph.microsoftDashGraphStrings.unifiedGroups
  - typings.microsoftDashGraph.microsoftDashGraphStrings.azureAD
  - typings.microsoftDashGraph.microsoftDashGraphStrings.unknownFutureValue
*/
trait GroupType extends js.Object

object GroupType {
  @scala.inline
  def azureAD: typings.microsoftDashGraph.microsoftDashGraphStrings.azureAD = this.cast("azureAD")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def unifiedGroups: typings.microsoftDashGraph.microsoftDashGraphStrings.unifiedGroups = this.cast("unifiedGroups")
  @scala.inline
  def unknownFutureValue: typings.microsoftDashGraph.microsoftDashGraphStrings.unknownFutureValue = this.cast("unknownFutureValue")
}

