package typings
package orchestratorLib.orchestratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnAllCallbackEvent extends OnCallbackEvent {
  var src: java.lang.String
}

object OnAllCallbackEvent {
  @scala.inline
  def apply(
    err: js.Any,
    message: java.lang.String,
    src: java.lang.String,
    task: java.lang.String,
    duration: scala.Int | scala.Double = null
  ): OnAllCallbackEvent = {
    val __obj = js.Dynamic.literal(err = err, message = message, src = src, task = task)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnAllCallbackEvent]
  }
}

