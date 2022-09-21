package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListLineItemsResponse extends StObject {
  
  /** The list of line items. This list will be absent if empty. */
  var lineItems: js.UndefOr[js.Array[LineItem]] = js.undefined
  
  /** A token to retrieve the next page of results. Pass this value in the page_token field in the subsequent call to `ListLineItems` method to retrieve the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ListLineItemsResponse {
  
  inline def apply(): ListLineItemsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListLineItemsResponse]
  }
  
  extension [Self <: ListLineItemsResponse](x: Self) {
    
    inline def setLineItems(value: js.Array[LineItem]): Self = StObject.set(x, "lineItems", value.asInstanceOf[js.Any])
    
    inline def setLineItemsUndefined: Self = StObject.set(x, "lineItems", js.undefined)
    
    inline def setLineItemsVarargs(value: LineItem*): Self = StObject.set(x, "lineItems", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
