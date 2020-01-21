package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.success
  - typings.microsoftGraph.microsoftGraphStrings.failure
  - typings.microsoftGraph.microsoftGraphStrings.timeout
  - typings.microsoftGraph.microsoftGraphStrings.unknownFutureValue
*/
trait OperationResult extends js.Object

object OperationResult {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def failure: typings.microsoftGraph.microsoftGraphStrings.failure = this.cast("failure")
  @scala.inline
  def success: typings.microsoftGraph.microsoftGraphStrings.success = this.cast("success")
  @scala.inline
  def timeout: typings.microsoftGraph.microsoftGraphStrings.timeout = this.cast("timeout")
  @scala.inline
  def unknownFutureValue: typings.microsoftGraph.microsoftGraphStrings.unknownFutureValue = this.cast("unknownFutureValue")
}

