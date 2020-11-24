package typings.paypalRestSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryParameters extends js.Object {
  
  var anchor_type: js.UndefOr[String] = js.native
  
  var count: js.UndefOr[Double] = js.native
  
  var end_time: js.UndefOr[String] = js.native
  
  var event_type: js.UndefOr[String] = js.native
  
  var page: js.UndefOr[Double] = js.native
  
  var page_size: js.UndefOr[Double] = js.native
  
  var payee_id: js.UndefOr[String] = js.native
  
  var sort_by: js.UndefOr[String] = js.native
  
  var sort_order: js.UndefOr[String] = js.native
  
  var start_id: js.UndefOr[String] = js.native
  
  var start_index: js.UndefOr[Double] = js.native
  
  var start_time: js.UndefOr[String] = js.native
  
  var status: js.UndefOr[js.Array[String]] = js.native
  
  var total_count_required: js.UndefOr[Boolean] = js.native
  
  var transaction_id: js.UndefOr[String] = js.native
  
  var webhook_id: js.UndefOr[String] = js.native
}
object QueryParameters {
  
  @scala.inline
  def apply(): QueryParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryParameters]
  }
  
  @scala.inline
  implicit class QueryParametersOps[Self <: QueryParameters] (val x: Self) extends AnyVal {
    
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
    def setAnchor_type(value: String): Self = this.set("anchor_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnchor_type: Self = this.set("anchor_type", js.undefined)
    
    @scala.inline
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    
    @scala.inline
    def setEnd_time(value: String): Self = this.set("end_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnd_time: Self = this.set("end_time", js.undefined)
    
    @scala.inline
    def setEvent_type(value: String): Self = this.set("event_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvent_type: Self = this.set("event_type", js.undefined)
    
    @scala.inline
    def setPage(value: Double): Self = this.set("page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePage: Self = this.set("page", js.undefined)
    
    @scala.inline
    def setPage_size(value: Double): Self = this.set("page_size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePage_size: Self = this.set("page_size", js.undefined)
    
    @scala.inline
    def setPayee_id(value: String): Self = this.set("payee_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePayee_id: Self = this.set("payee_id", js.undefined)
    
    @scala.inline
    def setSort_by(value: String): Self = this.set("sort_by", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSort_by: Self = this.set("sort_by", js.undefined)
    
    @scala.inline
    def setSort_order(value: String): Self = this.set("sort_order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSort_order: Self = this.set("sort_order", js.undefined)
    
    @scala.inline
    def setStart_id(value: String): Self = this.set("start_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStart_id: Self = this.set("start_id", js.undefined)
    
    @scala.inline
    def setStart_index(value: Double): Self = this.set("start_index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStart_index: Self = this.set("start_index", js.undefined)
    
    @scala.inline
    def setStart_time(value: String): Self = this.set("start_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStart_time: Self = this.set("start_time", js.undefined)
    
    @scala.inline
    def setStatusVarargs(value: String*): Self = this.set("status", js.Array(value :_*))
    
    @scala.inline
    def setStatus(value: js.Array[String]): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setTotal_count_required(value: Boolean): Self = this.set("total_count_required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotal_count_required: Self = this.set("total_count_required", js.undefined)
    
    @scala.inline
    def setTransaction_id(value: String): Self = this.set("transaction_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransaction_id: Self = this.set("transaction_id", js.undefined)
    
    @scala.inline
    def setWebhook_id(value: String): Self = this.set("webhook_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebhook_id: Self = this.set("webhook_id", js.undefined)
  }
}
