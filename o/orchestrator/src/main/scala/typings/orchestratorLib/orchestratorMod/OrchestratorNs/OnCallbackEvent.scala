package typings
package orchestratorLib.orchestratorMod.OrchestratorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnCallbackEvent extends js.Object {
  var duration: js.UndefOr[scala.Double] = js.undefined
  var err: js.Any
  var message: java.lang.String
  var task: java.lang.String
}

object OnCallbackEvent {
  @scala.inline
  def apply(
    err: js.Any,
    message: java.lang.String,
    task: java.lang.String,
    duration: scala.Int | scala.Double = null
  ): OnCallbackEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("err")(err)
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("task")(task)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnCallbackEvent]
  }
}

