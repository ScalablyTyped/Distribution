package typings.pollyjsCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.pollyjsCore.pollyjsCoreStrings.record
  - typings.pollyjsCore.pollyjsCoreStrings.replay
  - typings.pollyjsCore.pollyjsCoreStrings.intercept
  - typings.pollyjsCore.pollyjsCoreStrings.passthrough
*/
trait ACTION extends js.Object

object ACTION {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def intercept: typings.pollyjsCore.pollyjsCoreStrings.intercept = this.cast("intercept")
  @scala.inline
  def passthrough: typings.pollyjsCore.pollyjsCoreStrings.passthrough = this.cast("passthrough")
  @scala.inline
  def record: typings.pollyjsCore.pollyjsCoreStrings.record = this.cast("record")
  @scala.inline
  def replay: typings.pollyjsCore.pollyjsCoreStrings.replay = this.cast("replay")
}

