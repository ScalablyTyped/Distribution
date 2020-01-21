package typings.microsoftGraph.mod

import typings.microsoftGraph.microsoftGraphStrings.failed_
import typings.microsoftGraph.microsoftGraphStrings.notStarted_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.invalid
  - typings.microsoftGraph.microsoftGraphStrings.notStarted_
  - typings.microsoftGraph.microsoftGraphStrings.inProgress
  - typings.microsoftGraph.microsoftGraphStrings.succeeded
  - typings.microsoftGraph.microsoftGraphStrings.failed_
  - typings.microsoftGraph.microsoftGraphStrings.unknownFutureValue
*/
trait TeamsAsyncOperationStatus extends js.Object

object TeamsAsyncOperationStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def failed: failed_ = this.cast("failed")
  @scala.inline
  def inProgress: typings.microsoftGraph.microsoftGraphStrings.inProgress = this.cast("inProgress")
  @scala.inline
  def invalid: typings.microsoftGraph.microsoftGraphStrings.invalid = this.cast("invalid")
  @scala.inline
  def notStarted: notStarted_ = this.cast("notStarted")
  @scala.inline
  def succeeded: typings.microsoftGraph.microsoftGraphStrings.succeeded = this.cast("succeeded")
  @scala.inline
  def unknownFutureValue: typings.microsoftGraph.microsoftGraphStrings.unknownFutureValue = this.cast("unknownFutureValue")
}

