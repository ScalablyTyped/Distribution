package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.success
  - typings.microsoftGraph.microsoftGraphStrings.failure
  - typings.microsoftGraph.microsoftGraphStrings.notApplied
  - typings.microsoftGraph.microsoftGraphStrings.unknownFutureValue
*/
trait ConditionalAccessStatus extends js.Object

object ConditionalAccessStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def failure: typings.microsoftGraph.microsoftGraphStrings.failure = this.cast("failure")
  @scala.inline
  def notApplied: typings.microsoftGraph.microsoftGraphStrings.notApplied = this.cast("notApplied")
  @scala.inline
  def success: typings.microsoftGraph.microsoftGraphStrings.success = this.cast("success")
  @scala.inline
  def unknownFutureValue: typings.microsoftGraph.microsoftGraphStrings.unknownFutureValue = this.cast("unknownFutureValue")
}

