package typings.paypalPayoutsSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetBatchPayoutResponse extends StObject {
  
  var batch_header: js.UndefOr[PayoutBatchHeader] = js.native
  
  var errors: js.UndefOr[js.Any] = js.native
  
  var items: js.UndefOr[js.Array[PayoutBatchItems]] = js.native
  
  var links: js.UndefOr[js.Array[LinkDescription]] = js.native
  
  var total_items: js.UndefOr[Double] = js.native
  
  var total_pages: js.UndefOr[Double] = js.native
}
object GetBatchPayoutResponse {
  
  @scala.inline
  def apply(): GetBatchPayoutResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBatchPayoutResponse]
  }
  
  @scala.inline
  implicit class GetBatchPayoutResponseMutableBuilder[Self <: GetBatchPayoutResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBatch_header(value: PayoutBatchHeader): Self = StObject.set(x, "batch_header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatch_headerUndefined: Self = StObject.set(x, "batch_header", js.undefined)
    
    @scala.inline
    def setErrors(value: js.Any): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    @scala.inline
    def setItems(value: js.Array[PayoutBatchItems]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: PayoutBatchItems*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setLinks(value: js.Array[LinkDescription]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinksUndefined: Self = StObject.set(x, "links", js.undefined)
    
    @scala.inline
    def setLinksVarargs(value: LinkDescription*): Self = StObject.set(x, "links", js.Array(value :_*))
    
    @scala.inline
    def setTotal_items(value: Double): Self = StObject.set(x, "total_items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal_itemsUndefined: Self = StObject.set(x, "total_items", js.undefined)
    
    @scala.inline
    def setTotal_pages(value: Double): Self = StObject.set(x, "total_pages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal_pagesUndefined: Self = StObject.set(x, "total_pages", js.undefined)
  }
}
