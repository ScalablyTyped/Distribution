package typings.orchestrator.orchestratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnAllCallbackEvent extends OnCallbackEvent {
  var src: String
}

object OnAllCallbackEvent {
  @scala.inline
  def apply(err: js.Any, message: String, src: String, task: String, duration: Int | Double = null): OnAllCallbackEvent = {
    val __obj = js.Dynamic.literal(err = err, message = message, src = src, task = task)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnAllCallbackEvent]
  }
}

