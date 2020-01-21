package typings.microsoftGraph.mod

import typings.microsoftGraph.microsoftGraphStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.success
  - typings.microsoftGraph.microsoftGraphStrings.failure
  - typings.microsoftGraph.microsoftGraphStrings.notApplied
  - typings.microsoftGraph.microsoftGraphStrings.notEnabled
  - typings.microsoftGraph.microsoftGraphStrings.unknown_
  - typings.microsoftGraph.microsoftGraphStrings.unknownFutureValue
*/
trait AppliedConditionalAccessPolicyResult extends js.Object

object AppliedConditionalAccessPolicyResult {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def failure: typings.microsoftGraph.microsoftGraphStrings.failure = this.cast("failure")
  @scala.inline
  def notApplied: typings.microsoftGraph.microsoftGraphStrings.notApplied = this.cast("notApplied")
  @scala.inline
  def notEnabled: typings.microsoftGraph.microsoftGraphStrings.notEnabled = this.cast("notEnabled")
  @scala.inline
  def success: typings.microsoftGraph.microsoftGraphStrings.success = this.cast("success")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
  @scala.inline
  def unknownFutureValue: typings.microsoftGraph.microsoftGraphStrings.unknownFutureValue = this.cast("unknownFutureValue")
}

