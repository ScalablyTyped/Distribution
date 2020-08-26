package typings.orchestrator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnAllCallbackEvent extends OnCallbackEvent {
  var src: String = js.native
}

object OnAllCallbackEvent {
  @scala.inline
  def apply(err: js.Any, message: String, src: String, task: String): OnAllCallbackEvent = {
    val __obj = js.Dynamic.literal(err = err.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], task = task.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnAllCallbackEvent]
  }
  @scala.inline
  implicit class OnAllCallbackEventOps[Self <: OnAllCallbackEvent] (val x: Self) extends AnyVal {
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
    def setSrc(value: String): Self = this.set("src", value.asInstanceOf[js.Any])
  }
  
}

