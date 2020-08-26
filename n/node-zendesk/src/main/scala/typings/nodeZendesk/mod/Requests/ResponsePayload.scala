package typings.nodeZendesk.mod.Requests

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResponsePayload extends js.Object {
  val request: ResponseModel = js.native
}

object ResponsePayload {
  @scala.inline
  def apply(request: ResponseModel): ResponsePayload = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponsePayload]
  }
  @scala.inline
  implicit class ResponsePayloadOps[Self <: ResponsePayload] (val x: Self) extends AnyVal {
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
    def setRequest(value: ResponseModel): Self = this.set("request", value.asInstanceOf[js.Any])
  }
  
}

