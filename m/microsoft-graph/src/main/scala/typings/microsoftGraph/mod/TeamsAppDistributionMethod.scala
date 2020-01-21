package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.store
  - typings.microsoftGraph.microsoftGraphStrings.organization
  - typings.microsoftGraph.microsoftGraphStrings.sideloaded
  - typings.microsoftGraph.microsoftGraphStrings.unknownFutureValue
*/
trait TeamsAppDistributionMethod extends js.Object

object TeamsAppDistributionMethod {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def organization: typings.microsoftGraph.microsoftGraphStrings.organization = this.cast("organization")
  @scala.inline
  def sideloaded: typings.microsoftGraph.microsoftGraphStrings.sideloaded = this.cast("sideloaded")
  @scala.inline
  def store: typings.microsoftGraph.microsoftGraphStrings.store = this.cast("store")
  @scala.inline
  def unknownFutureValue: typings.microsoftGraph.microsoftGraphStrings.unknownFutureValue = this.cast("unknownFutureValue")
}

