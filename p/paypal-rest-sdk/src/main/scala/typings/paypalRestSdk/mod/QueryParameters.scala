package typings.paypalRestSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryParameters extends StObject {
  
  var anchor_type: js.UndefOr[String] = js.undefined
  
  var count: js.UndefOr[Double] = js.undefined
  
  var end_time: js.UndefOr[String] = js.undefined
  
  var event_type: js.UndefOr[String] = js.undefined
  
  var page: js.UndefOr[Double] = js.undefined
  
  var page_size: js.UndefOr[Double] = js.undefined
  
  var payee_id: js.UndefOr[String] = js.undefined
  
  var sort_by: js.UndefOr[String] = js.undefined
  
  var sort_order: js.UndefOr[String] = js.undefined
  
  var start_id: js.UndefOr[String] = js.undefined
  
  var start_index: js.UndefOr[Double] = js.undefined
  
  var start_time: js.UndefOr[String] = js.undefined
  
  var status: js.UndefOr[js.Array[String]] = js.undefined
  
  var total_count_required: js.UndefOr[Boolean] = js.undefined
  
  var transaction_id: js.UndefOr[String] = js.undefined
  
  var webhook_id: js.UndefOr[String] = js.undefined
}
object QueryParameters {
  
  inline def apply(): QueryParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryParameters] (val x: Self) extends AnyVal {
    
    inline def setAnchor_type(value: String): Self = StObject.set(x, "anchor_type", value.asInstanceOf[js.Any])
    
    inline def setAnchor_typeUndefined: Self = StObject.set(x, "anchor_type", js.undefined)
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setEnd_time(value: String): Self = StObject.set(x, "end_time", value.asInstanceOf[js.Any])
    
    inline def setEnd_timeUndefined: Self = StObject.set(x, "end_time", js.undefined)
    
    inline def setEvent_type(value: String): Self = StObject.set(x, "event_type", value.asInstanceOf[js.Any])
    
    inline def setEvent_typeUndefined: Self = StObject.set(x, "event_type", js.undefined)
    
    inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    inline def setPage_size(value: Double): Self = StObject.set(x, "page_size", value.asInstanceOf[js.Any])
    
    inline def setPage_sizeUndefined: Self = StObject.set(x, "page_size", js.undefined)
    
    inline def setPayee_id(value: String): Self = StObject.set(x, "payee_id", value.asInstanceOf[js.Any])
    
    inline def setPayee_idUndefined: Self = StObject.set(x, "payee_id", js.undefined)
    
    inline def setSort_by(value: String): Self = StObject.set(x, "sort_by", value.asInstanceOf[js.Any])
    
    inline def setSort_byUndefined: Self = StObject.set(x, "sort_by", js.undefined)
    
    inline def setSort_order(value: String): Self = StObject.set(x, "sort_order", value.asInstanceOf[js.Any])
    
    inline def setSort_orderUndefined: Self = StObject.set(x, "sort_order", js.undefined)
    
    inline def setStart_id(value: String): Self = StObject.set(x, "start_id", value.asInstanceOf[js.Any])
    
    inline def setStart_idUndefined: Self = StObject.set(x, "start_id", js.undefined)
    
    inline def setStart_index(value: Double): Self = StObject.set(x, "start_index", value.asInstanceOf[js.Any])
    
    inline def setStart_indexUndefined: Self = StObject.set(x, "start_index", js.undefined)
    
    inline def setStart_time(value: String): Self = StObject.set(x, "start_time", value.asInstanceOf[js.Any])
    
    inline def setStart_timeUndefined: Self = StObject.set(x, "start_time", js.undefined)
    
    inline def setStatus(value: js.Array[String]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setStatusVarargs(value: String*): Self = StObject.set(x, "status", js.Array(value*))
    
    inline def setTotal_count_required(value: Boolean): Self = StObject.set(x, "total_count_required", value.asInstanceOf[js.Any])
    
    inline def setTotal_count_requiredUndefined: Self = StObject.set(x, "total_count_required", js.undefined)
    
    inline def setTransaction_id(value: String): Self = StObject.set(x, "transaction_id", value.asInstanceOf[js.Any])
    
    inline def setTransaction_idUndefined: Self = StObject.set(x, "transaction_id", js.undefined)
    
    inline def setWebhook_id(value: String): Self = StObject.set(x, "webhook_id", value.asInstanceOf[js.Any])
    
    inline def setWebhook_idUndefined: Self = StObject.set(x, "webhook_id", js.undefined)
  }
}
