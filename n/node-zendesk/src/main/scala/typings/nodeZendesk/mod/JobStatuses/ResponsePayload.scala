package typings.nodeZendesk.mod.JobStatuses

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResponsePayload extends js.Object {
  val job_status: ResponseModel = js.native
}

object ResponsePayload {
  @scala.inline
  def apply(job_status: ResponseModel): ResponsePayload = {
    val __obj = js.Dynamic.literal(job_status = job_status.asInstanceOf[js.Any])
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
    def setJob_status(value: ResponseModel): Self = this.set("job_status", value.asInstanceOf[js.Any])
  }
  
}

