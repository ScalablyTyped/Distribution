package typings.microsoftDashGraph.microsoftDashGraphMod

import typings.microsoftDashGraph.microsoftDashGraphStrings.none_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftDashGraph.microsoftDashGraphStrings.none_
  - typings.microsoftDashGraph.microsoftDashGraphStrings.busy
  - typings.microsoftDashGraph.microsoftDashGraphStrings.forbidden
  - typings.microsoftDashGraph.microsoftDashGraphStrings.unknownFutureValue
*/
trait RejectReason extends js.Object

object RejectReason {
  @scala.inline
  def busy: typings.microsoftDashGraph.microsoftDashGraphStrings.busy = this.cast("busy")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def forbidden: typings.microsoftDashGraph.microsoftDashGraphStrings.forbidden = this.cast("forbidden")
  @scala.inline
  def none: none_ = this.cast("none")
  @scala.inline
  def unknownFutureValue: typings.microsoftDashGraph.microsoftDashGraphStrings.unknownFutureValue = this.cast("unknownFutureValue")
}

