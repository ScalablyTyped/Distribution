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
  
  @scala.inline
  def apply(): ListLineItemsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListLineItemsResponse]
  }
  
  @scala.inline
  implicit class ListLineItemsResponseMutableBuilder[Self <: ListLineItemsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLineItems(value: js.Array[LineItem]): Self = StObject.set(x, "lineItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineItemsUndefined: Self = StObject.set(x, "lineItems", js.undefined)
    
    @scala.inline
    def setLineItemsVarargs(value: LineItem*): Self = StObject.set(x, "lineItems", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
