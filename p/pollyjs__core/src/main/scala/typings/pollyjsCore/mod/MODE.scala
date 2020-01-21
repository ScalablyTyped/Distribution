package typings.pollyjsCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.pollyjsCore.pollyjsCoreStrings.record
  - typings.pollyjsCore.pollyjsCoreStrings.replay
  - typings.pollyjsCore.pollyjsCoreStrings.passthrough
  - typings.pollyjsCore.pollyjsCoreStrings.stopped
*/
trait MODE extends js.Object

object MODE {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def passthrough: typings.pollyjsCore.pollyjsCoreStrings.passthrough = this.cast("passthrough")
  @scala.inline
  def record: typings.pollyjsCore.pollyjsCoreStrings.record = this.cast("record")
  @scala.inline
  def replay: typings.pollyjsCore.pollyjsCoreStrings.replay = this.cast("replay")
  @scala.inline
  def stopped: typings.pollyjsCore.pollyjsCoreStrings.stopped = this.cast("stopped")
}

