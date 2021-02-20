package typings.paypalRestSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryParameters extends StObject {
  
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
  implicit class QueryParametersMutableBuilder[Self <: QueryParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnchor_type(value: String): Self = StObject.set(x, "anchor_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchor_typeUndefined: Self = StObject.set(x, "anchor_type", js.undefined)
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    @scala.inline
    def setEnd_time(value: String): Self = StObject.set(x, "end_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnd_timeUndefined: Self = StObject.set(x, "end_time", js.undefined)
    
    @scala.inline
    def setEvent_type(value: String): Self = StObject.set(x, "event_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvent_typeUndefined: Self = StObject.set(x, "event_type", js.undefined)
    
    @scala.inline
    def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    @scala.inline
    def setPage_size(value: Double): Self = StObject.set(x, "page_size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPage_sizeUndefined: Self = StObject.set(x, "page_size", js.undefined)
    
    @scala.inline
    def setPayee_id(value: String): Self = StObject.set(x, "payee_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayee_idUndefined: Self = StObject.set(x, "payee_id", js.undefined)
    
    @scala.inline
    def setSort_by(value: String): Self = StObject.set(x, "sort_by", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSort_byUndefined: Self = StObject.set(x, "sort_by", js.undefined)
    
    @scala.inline
    def setSort_order(value: String): Self = StObject.set(x, "sort_order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSort_orderUndefined: Self = StObject.set(x, "sort_order", js.undefined)
    
    @scala.inline
    def setStart_id(value: String): Self = StObject.set(x, "start_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart_idUndefined: Self = StObject.set(x, "start_id", js.undefined)
    
    @scala.inline
    def setStart_index(value: Double): Self = StObject.set(x, "start_index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart_indexUndefined: Self = StObject.set(x, "start_index", js.undefined)
    
    @scala.inline
    def setStart_time(value: String): Self = StObject.set(x, "start_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart_timeUndefined: Self = StObject.set(x, "start_time", js.undefined)
    
    @scala.inline
    def setStatus(value: js.Array[String]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setStatusVarargs(value: String*): Self = StObject.set(x, "status", js.Array(value :_*))
    
    @scala.inline
    def setTotal_count_required(value: Boolean): Self = StObject.set(x, "total_count_required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal_count_requiredUndefined: Self = StObject.set(x, "total_count_required", js.undefined)
    
    @scala.inline
    def setTransaction_id(value: String): Self = StObject.set(x, "transaction_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransaction_idUndefined: Self = StObject.set(x, "transaction_id", js.undefined)
    
    @scala.inline
    def setWebhook_id(value: String): Self = StObject.set(x, "webhook_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebhook_idUndefined: Self = StObject.set(x, "webhook_id", js.undefined)
  }
}
