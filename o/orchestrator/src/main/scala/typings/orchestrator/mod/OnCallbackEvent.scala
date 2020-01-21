package typings.orchestrator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnCallbackEvent extends js.Object {
  var duration: js.UndefOr[Double] = js.undefined
  var err: js.Any
  var message: String
  var task: String
}

object OnCallbackEvent {
  @scala.inline
  def apply(err: js.Any, message: String, task: String, duration: Int | Double = null): OnCallbackEvent = {
    val __obj = js.Dynamic.literal(err = err.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], task = task.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnCallbackEvent]
  }
}

