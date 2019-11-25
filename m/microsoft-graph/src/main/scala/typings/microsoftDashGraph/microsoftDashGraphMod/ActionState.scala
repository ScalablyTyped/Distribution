package typings.microsoftDashGraph.microsoftDashGraphMod

import typings.microsoftDashGraph.microsoftDashGraphStrings.failed_
import typings.microsoftDashGraph.microsoftDashGraphStrings.none_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftDashGraph.microsoftDashGraphStrings.none_
  - typings.microsoftDashGraph.microsoftDashGraphStrings.pending
  - typings.microsoftDashGraph.microsoftDashGraphStrings.canceled
  - typings.microsoftDashGraph.microsoftDashGraphStrings.active
  - typings.microsoftDashGraph.microsoftDashGraphStrings.done
  - typings.microsoftDashGraph.microsoftDashGraphStrings.failed_
  - typings.microsoftDashGraph.microsoftDashGraphStrings.notSupported
*/
trait ActionState extends js.Object

object ActionState {
  @scala.inline
  def active: typings.microsoftDashGraph.microsoftDashGraphStrings.active = this.cast("active")
  @scala.inline
  def canceled: typings.microsoftDashGraph.microsoftDashGraphStrings.canceled = this.cast("canceled")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def done: typings.microsoftDashGraph.microsoftDashGraphStrings.done = this.cast("done")
  @scala.inline
  def failed: failed_ = this.cast("failed")
  @scala.inline
  def none: none_ = this.cast("none")
  @scala.inline
  def notSupported: typings.microsoftDashGraph.microsoftDashGraphStrings.notSupported = this.cast("notSupported")
  @scala.inline
  def pending: typings.microsoftDashGraph.microsoftDashGraphStrings.pending = this.cast("pending")
}

