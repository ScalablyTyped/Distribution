package typings.microsoftDashGraph.microsoftDashGraphMod

import typings.microsoftDashGraph.microsoftDashGraphStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftDashGraph.microsoftDashGraphStrings.success
  - typings.microsoftDashGraph.microsoftDashGraphStrings.failure
  - typings.microsoftDashGraph.microsoftDashGraphStrings.notApplied
  - typings.microsoftDashGraph.microsoftDashGraphStrings.notEnabled
  - typings.microsoftDashGraph.microsoftDashGraphStrings.unknown_
  - typings.microsoftDashGraph.microsoftDashGraphStrings.unknownFutureValue
*/
trait AppliedConditionalAccessPolicyResult extends js.Object

object AppliedConditionalAccessPolicyResult {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def failure: typings.microsoftDashGraph.microsoftDashGraphStrings.failure = this.cast("failure")
  @scala.inline
  def notApplied: typings.microsoftDashGraph.microsoftDashGraphStrings.notApplied = this.cast("notApplied")
  @scala.inline
  def notEnabled: typings.microsoftDashGraph.microsoftDashGraphStrings.notEnabled = this.cast("notEnabled")
  @scala.inline
  def success: typings.microsoftDashGraph.microsoftDashGraphStrings.success = this.cast("success")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
  @scala.inline
  def unknownFutureValue: typings.microsoftDashGraph.microsoftDashGraphStrings.unknownFutureValue = this.cast("unknownFutureValue")
}

