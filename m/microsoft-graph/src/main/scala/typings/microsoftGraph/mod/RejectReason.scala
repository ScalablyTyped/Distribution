package typings.microsoftGraph.mod

import typings.microsoftGraph.microsoftGraphStrings.none_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.none_
  - typings.microsoftGraph.microsoftGraphStrings.busy
  - typings.microsoftGraph.microsoftGraphStrings.forbidden
  - typings.microsoftGraph.microsoftGraphStrings.unknownFutureValue
*/
trait RejectReason extends js.Object

object RejectReason {
  @scala.inline
  def busy: typings.microsoftGraph.microsoftGraphStrings.busy = this.cast("busy")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def forbidden: typings.microsoftGraph.microsoftGraphStrings.forbidden = this.cast("forbidden")
  @scala.inline
  def none: none_ = this.cast("none")
  @scala.inline
  def unknownFutureValue: typings.microsoftGraph.microsoftGraphStrings.unknownFutureValue = this.cast("unknownFutureValue")
}

