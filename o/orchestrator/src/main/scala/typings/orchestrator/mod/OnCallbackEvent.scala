package typings.orchestrator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnCallbackEvent extends js.Object {
  var duration: js.UndefOr[Double] = js.native
  var err: js.Any = js.native
  var message: String = js.native
  var task: String = js.native
}

object OnCallbackEvent {
  @scala.inline
  def apply(err: js.Any, message: String, task: String): OnCallbackEvent = {
    val __obj = js.Dynamic.literal(err = err.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], task = task.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnCallbackEvent]
  }
  @scala.inline
  implicit class OnCallbackEventOps[Self <: OnCallbackEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setErr(value: js.Any): Self = this.set("err", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setTask(value: String): Self = this.set("task", value.asInstanceOf[js.Any])
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
  }
  
}

