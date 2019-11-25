package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftDashGraph.microsoftDashGraphStrings.success
  - typings.microsoftDashGraph.microsoftDashGraphStrings.failure
  - typings.microsoftDashGraph.microsoftDashGraphStrings.notApplied
  - typings.microsoftDashGraph.microsoftDashGraphStrings.unknownFutureValue
*/
trait ConditionalAccessStatus extends js.Object

object ConditionalAccessStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def failure: typings.microsoftDashGraph.microsoftDashGraphStrings.failure = this.cast("failure")
  @scala.inline
  def notApplied: typings.microsoftDashGraph.microsoftDashGraphStrings.notApplied = this.cast("notApplied")
  @scala.inline
  def success: typings.microsoftDashGraph.microsoftDashGraphStrings.success = this.cast("success")
  @scala.inline
  def unknownFutureValue: typings.microsoftDashGraph.microsoftDashGraphStrings.unknownFutureValue = this.cast("unknownFutureValue")
}

