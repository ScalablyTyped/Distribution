package typings.orchestrator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnAllCallbackEvent extends OnCallbackEvent {
  var src: String
}

object OnAllCallbackEvent {
  @scala.inline
  def apply(
    err: js.Any,
    message: String,
    src: String,
    task: String,
    duration: js.UndefOr[Double] = js.undefined
  ): OnAllCallbackEvent = {
    val __obj = js.Dynamic.literal(err = err.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], task = task.asInstanceOf[js.Any])
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnAllCallbackEvent]
  }
}

