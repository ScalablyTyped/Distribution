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
  def apply(err: js.Any, message: String, task: String, duration: js.UndefOr[Double] = js.undefined): OnCallbackEvent = {
    val __obj = js.Dynamic.literal(err = err.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], task = task.asInstanceOf[js.Any])
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnCallbackEvent]
  }
}

