package typings.paypalPayoutsSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBatchPayoutResponse extends StObject {
  
  var batch_header: js.UndefOr[PayoutBatchHeader] = js.undefined
  
  var errors: js.UndefOr[Any] = js.undefined
  
  var items: js.UndefOr[js.Array[PayoutBatchItems]] = js.undefined
  
  var links: js.UndefOr[js.Array[LinkDescription]] = js.undefined
  
  var total_items: js.UndefOr[Double] = js.undefined
  
  var total_pages: js.UndefOr[Double] = js.undefined
}
object GetBatchPayoutResponse {
  
  inline def apply(): GetBatchPayoutResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBatchPayoutResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetBatchPayoutResponse] (val x: Self) extends AnyVal {
    
    inline def setBatch_header(value: PayoutBatchHeader): Self = StObject.set(x, "batch_header", value.asInstanceOf[js.Any])
    
    inline def setBatch_headerUndefined: Self = StObject.set(x, "batch_header", js.undefined)
    
    inline def setErrors(value: Any): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setItems(value: js.Array[PayoutBatchItems]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: PayoutBatchItems*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setLinks(value: js.Array[LinkDescription]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setLinksUndefined: Self = StObject.set(x, "links", js.undefined)
    
    inline def setLinksVarargs(value: LinkDescription*): Self = StObject.set(x, "links", js.Array(value*))
    
    inline def setTotal_items(value: Double): Self = StObject.set(x, "total_items", value.asInstanceOf[js.Any])
    
    inline def setTotal_itemsUndefined: Self = StObject.set(x, "total_items", js.undefined)
    
    inline def setTotal_pages(value: Double): Self = StObject.set(x, "total_pages", value.asInstanceOf[js.Any])
    
    inline def setTotal_pagesUndefined: Self = StObject.set(x, "total_pages", js.undefined)
  }
}
