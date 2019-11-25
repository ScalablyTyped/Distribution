package typings.microsoftDashGraph.microsoftDashGraphMod

import typings.microsoftDashGraph.microsoftDashGraphStrings.failed_
import typings.microsoftDashGraph.microsoftDashGraphStrings.notStarted_
import typings.microsoftDashGraph.microsoftDashGraphStrings.running_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftDashGraph.microsoftDashGraphStrings.notStarted_
  - typings.microsoftDashGraph.microsoftDashGraphStrings.running_
  - typings.microsoftDashGraph.microsoftDashGraphStrings.complete
  - typings.microsoftDashGraph.microsoftDashGraphStrings.failed_
  - typings.microsoftDashGraph.microsoftDashGraphStrings.unknownFutureValue
*/
trait DataPolicyOperationStatus extends js.Object

object DataPolicyOperationStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def complete: typings.microsoftDashGraph.microsoftDashGraphStrings.complete = this.cast("complete")
  @scala.inline
  def failed: failed_ = this.cast("failed")
  @scala.inline
  def notStarted: notStarted_ = this.cast("notStarted")
  @scala.inline
  def running: running_ = this.cast("running")
  @scala.inline
  def unknownFutureValue: typings.microsoftDashGraph.microsoftDashGraphStrings.unknownFutureValue = this.cast("unknownFutureValue")
}

