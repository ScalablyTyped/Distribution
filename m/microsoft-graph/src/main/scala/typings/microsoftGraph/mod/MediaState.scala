package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.active
  - typings.microsoftGraph.microsoftGraphStrings.inactive
  - typings.microsoftGraph.microsoftGraphStrings.unknownFutureValue
*/
trait MediaState extends js.Object

object MediaState {
  @scala.inline
  def active: typings.microsoftGraph.microsoftGraphStrings.active = this.cast("active")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def inactive: typings.microsoftGraph.microsoftGraphStrings.inactive = this.cast("inactive")
  @scala.inline
  def unknownFutureValue: typings.microsoftGraph.microsoftGraphStrings.unknownFutureValue = this.cast("unknownFutureValue")
}

