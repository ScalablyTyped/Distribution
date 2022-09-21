package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListGuaranteedOrdersResponse extends StObject {
  
  /** The list of guaranteed orders. This list will be absent if empty. */
  var guaranteedOrders: js.UndefOr[js.Array[GuaranteedOrder]] = js.undefined
  
  /** A token to retrieve the next page of results. Pass this value in the page_token field in the subsequent call to `ListGuaranteedOrders` method to retrieve the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ListGuaranteedOrdersResponse {
  
  inline def apply(): ListGuaranteedOrdersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListGuaranteedOrdersResponse]
  }
  
  extension [Self <: ListGuaranteedOrdersResponse](x: Self) {
    
    inline def setGuaranteedOrders(value: js.Array[GuaranteedOrder]): Self = StObject.set(x, "guaranteedOrders", value.asInstanceOf[js.Any])
    
    inline def setGuaranteedOrdersUndefined: Self = StObject.set(x, "guaranteedOrders", js.undefined)
    
    inline def setGuaranteedOrdersVarargs(value: GuaranteedOrder*): Self = StObject.set(x, "guaranteedOrders", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
