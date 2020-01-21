package typings.microsoftGraph.mod

import typings.microsoftGraph.microsoftGraphStrings.failed_
import typings.microsoftGraph.microsoftGraphStrings.notStarted_
import typings.microsoftGraph.microsoftGraphStrings.running_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.notStarted_
  - typings.microsoftGraph.microsoftGraphStrings.running_
  - typings.microsoftGraph.microsoftGraphStrings.complete
  - typings.microsoftGraph.microsoftGraphStrings.failed_
  - typings.microsoftGraph.microsoftGraphStrings.unknownFutureValue
*/
trait DataPolicyOperationStatus extends js.Object

object DataPolicyOperationStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def complete: typings.microsoftGraph.microsoftGraphStrings.complete = this.cast("complete")
  @scala.inline
  def failed: failed_ = this.cast("failed")
  @scala.inline
  def notStarted: notStarted_ = this.cast("notStarted")
  @scala.inline
  def running: running_ = this.cast("running")
  @scala.inline
  def unknownFutureValue: typings.microsoftGraph.microsoftGraphStrings.unknownFutureValue = this.cast("unknownFutureValue")
}

