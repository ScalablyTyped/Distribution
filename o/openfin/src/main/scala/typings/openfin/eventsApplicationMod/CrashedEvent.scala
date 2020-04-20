package typings.openfin.eventsApplicationMod

import typings.openfin.openfinStrings.`abnormal-termination`
import typings.openfin.openfinStrings.`launch-failed`
import typings.openfin.openfinStrings.`normal-termination`
import typings.openfin.openfinStrings.`out-of-memory`
import typings.openfin.openfinStrings.`still-running`
import typings.openfin.openfinStrings.crashed
import typings.openfin.openfinStrings.killed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CrashedEvent extends js.Object {
  var reason: `normal-termination` | `abnormal-termination` | killed | crashed | `still-running` | `launch-failed` | `out-of-memory`
}

object CrashedEvent {
  @scala.inline
  def apply(
    reason: `normal-termination` | `abnormal-termination` | killed | crashed | `still-running` | `launch-failed` | `out-of-memory`
  ): CrashedEvent = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[CrashedEvent]
  }
}

