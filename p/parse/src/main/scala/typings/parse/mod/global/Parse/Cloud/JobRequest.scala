package typings.parse.mod.global.Parse.Cloud

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobRequest extends js.Object {
  var params: js.Any = js.native
  def message(response: js.Any): Unit = js.native
}

object JobRequest {
  @scala.inline
  def apply(message: js.Any => Unit, params: js.Any): JobRequest = {
    val __obj = js.Dynamic.literal(message = js.Any.fromFunction1(message), params = params.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobRequest]
  }
  @scala.inline
  implicit class JobRequestOps[Self <: JobRequest] (val x: Self) extends AnyVal {
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
    def setMessage(value: js.Any => Unit): Self = this.set("message", js.Any.fromFunction1(value))
    @scala.inline
    def setParams(value: js.Any): Self = this.set("params", value.asInstanceOf[js.Any])
  }
  
}

