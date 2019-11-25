package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftDashGraph.microsoftDashGraphStrings.success
  - typings.microsoftDashGraph.microsoftDashGraphStrings.failure
  - typings.microsoftDashGraph.microsoftDashGraphStrings.timeout
  - typings.microsoftDashGraph.microsoftDashGraphStrings.unknownFutureValue
*/
trait OperationResult extends js.Object

object OperationResult {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def failure: typings.microsoftDashGraph.microsoftDashGraphStrings.failure = this.cast("failure")
  @scala.inline
  def success: typings.microsoftDashGraph.microsoftDashGraphStrings.success = this.cast("success")
  @scala.inline
  def timeout: typings.microsoftDashGraph.microsoftDashGraphStrings.timeout = this.cast("timeout")
  @scala.inline
  def unknownFutureValue: typings.microsoftDashGraph.microsoftDashGraphStrings.unknownFutureValue = this.cast("unknownFutureValue")
}

