package typings.atPollyjsCore.atPollyjsCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.atPollyjsCore.atPollyjsCoreStrings.record
  - typings.atPollyjsCore.atPollyjsCoreStrings.replay
  - typings.atPollyjsCore.atPollyjsCoreStrings.intercept
  - typings.atPollyjsCore.atPollyjsCoreStrings.passthrough
*/
trait ACTION extends js.Object

object ACTION {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def intercept: typings.atPollyjsCore.atPollyjsCoreStrings.intercept = this.cast("intercept")
  @scala.inline
  def passthrough: typings.atPollyjsCore.atPollyjsCoreStrings.passthrough = this.cast("passthrough")
  @scala.inline
  def record: typings.atPollyjsCore.atPollyjsCoreStrings.record = this.cast("record")
  @scala.inline
  def replay: typings.atPollyjsCore.atPollyjsCoreStrings.replay = this.cast("replay")
}

