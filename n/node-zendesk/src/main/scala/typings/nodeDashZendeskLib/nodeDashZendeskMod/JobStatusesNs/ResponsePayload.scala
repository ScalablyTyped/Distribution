package typings
package nodeDashZendeskLib.nodeDashZendeskMod.JobStatusesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponsePayload extends js.Object {
  val job_status: ResponseModel
}

object ResponsePayload {
  @scala.inline
  def apply(job_status: ResponseModel): ResponsePayload = {
    val __obj = js.Dynamic.literal(job_status = job_status)
  
    __obj.asInstanceOf[ResponsePayload]
  }
}

