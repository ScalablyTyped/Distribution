package typings.nodeZendesk.mod.Requests

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreatePayload extends js.Object {
  val request: CreateModel = js.native
}

object CreatePayload {
  @scala.inline
  def apply(request: CreateModel): CreatePayload = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePayload]
  }
  @scala.inline
  implicit class CreatePayloadOps[Self <: CreatePayload] (val x: Self) extends AnyVal {
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
    def setRequest(value: CreateModel): Self = this.set("request", value.asInstanceOf[js.Any])
  }
  
}

