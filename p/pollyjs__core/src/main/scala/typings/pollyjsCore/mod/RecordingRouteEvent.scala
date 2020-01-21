package typings.pollyjsCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.pollyjsCore.pollyjsCoreStrings.beforeReplay
  - typings.pollyjsCore.pollyjsCoreStrings.beforePersist
*/
trait RecordingRouteEvent extends js.Object

object RecordingRouteEvent {
  @scala.inline
  def beforePersist: typings.pollyjsCore.pollyjsCoreStrings.beforePersist = this.cast("beforePersist")
  @scala.inline
  def beforeReplay: typings.pollyjsCore.pollyjsCoreStrings.beforeReplay = this.cast("beforeReplay")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

