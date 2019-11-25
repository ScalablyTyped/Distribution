package typings.atPollyjsCore.atPollyjsCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.atPollyjsCore.atPollyjsCoreStrings.beforeReplay
  - typings.atPollyjsCore.atPollyjsCoreStrings.beforePersist
*/
trait RecordingRouteEvent extends js.Object

object RecordingRouteEvent {
  @scala.inline
  def beforePersist: typings.atPollyjsCore.atPollyjsCoreStrings.beforePersist = this.cast("beforePersist")
  @scala.inline
  def beforeReplay: typings.atPollyjsCore.atPollyjsCoreStrings.beforeReplay = this.cast("beforeReplay")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

