package typings.microsoftGraph.mod

import typings.microsoftGraph.microsoftGraphStrings.failed_
import typings.microsoftGraph.microsoftGraphStrings.none_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.none_
  - typings.microsoftGraph.microsoftGraphStrings.pending
  - typings.microsoftGraph.microsoftGraphStrings.canceled
  - typings.microsoftGraph.microsoftGraphStrings.active
  - typings.microsoftGraph.microsoftGraphStrings.done
  - typings.microsoftGraph.microsoftGraphStrings.failed_
  - typings.microsoftGraph.microsoftGraphStrings.notSupported
*/
trait ActionState extends js.Object

object ActionState {
  @scala.inline
  def active: typings.microsoftGraph.microsoftGraphStrings.active = this.cast("active")
  @scala.inline
  def canceled: typings.microsoftGraph.microsoftGraphStrings.canceled = this.cast("canceled")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def done: typings.microsoftGraph.microsoftGraphStrings.done = this.cast("done")
  @scala.inline
  def failed: failed_ = this.cast("failed")
  @scala.inline
  def none: none_ = this.cast("none")
  @scala.inline
  def notSupported: typings.microsoftGraph.microsoftGraphStrings.notSupported = this.cast("notSupported")
  @scala.inline
  def pending: typings.microsoftGraph.microsoftGraphStrings.pending = this.cast("pending")
}

