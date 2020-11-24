package typings.nodeZendesk.mod.Tickets.Metrics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListPayload extends js.Object {
  
  val ticket_metrics: js.Array[ResponseModel] = js.native
}
object ListPayload {
  
  @scala.inline
  def apply(ticket_metrics: js.Array[ResponseModel]): ListPayload = {
    val __obj = js.Dynamic.literal(ticket_metrics = ticket_metrics.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPayload]
  }
  
  @scala.inline
  implicit class ListPayloadOps[Self <: ListPayload] (val x: Self) extends AnyVal {
    
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
    def setTicket_metricsVarargs(value: ResponseModel*): Self = this.set("ticket_metrics", js.Array(value :_*))
    
    @scala.inline
    def setTicket_metrics(value: js.Array[ResponseModel]): Self = this.set("ticket_metrics", value.asInstanceOf[js.Any])
  }
}
