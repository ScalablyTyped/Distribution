package typings.atPollyjsCore.atPollyjsCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.atPollyjsCore.atPollyjsCoreStrings.record
  - typings.atPollyjsCore.atPollyjsCoreStrings.warn
  - typings.atPollyjsCore.atPollyjsCoreStrings.error
*/
trait EXPIRY_STRATEGY extends js.Object

object EXPIRY_STRATEGY {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def error: typings.atPollyjsCore.atPollyjsCoreStrings.error = this.cast("error")
  @scala.inline
  def record: typings.atPollyjsCore.atPollyjsCoreStrings.record = this.cast("record")
  @scala.inline
  def warn: typings.atPollyjsCore.atPollyjsCoreStrings.warn = this.cast("warn")
}

