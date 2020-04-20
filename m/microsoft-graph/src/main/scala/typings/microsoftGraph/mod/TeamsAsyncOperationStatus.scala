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
  def failed: failed_ = "failed".asInstanceOf[failed_]
  @scala.inline
  def inProgress: typings.microsoftGraph.microsoftGraphStrings.inProgress = "inProgress".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.inProgress]
  @scala.inline
  def invalid: typings.microsoftGraph.microsoftGraphStrings.invalid = "invalid".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.invalid]
  @scala.inline
  def notStarted: notStarted_ = "notStarted".asInstanceOf[notStarted_]
  @scala.inline
  def succeeded: typings.microsoftGraph.microsoftGraphStrings.succeeded = "succeeded".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.succeeded]
  @scala.inline
  def unknownFutureValue: typings.microsoftGraph.microsoftGraphStrings.unknownFutureValue = "unknownFutureValue".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.unknownFutureValue]
}

