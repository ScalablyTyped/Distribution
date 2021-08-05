package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.GET
import typings.octokitTypes.octokitTypesStrings.Slashmarketplace_listingSlashaccountsSlashColonaccount_id
import typings.octokitTypes.requestHeadersMod.RequestHeaders
import typings.octokitTypes.requestRequestOptionsMod.RequestRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsGetSubscriptionPlanForAccountRequestOptions extends StObject {
  
  var headers: RequestHeaders
  
  var method: GET
  
  var request: RequestRequestOptions
  
  var url: Slashmarketplace_listingSlashaccountsSlashColonaccount_id
}
object AppsGetSubscriptionPlanForAccountRequestOptions {
  
  inline def apply(headers: RequestHeaders, request: RequestRequestOptions): AppsGetSubscriptionPlanForAccountRequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = "GET", request = request.asInstanceOf[js.Any], url = "/marketplace_listing/accounts/:account_id")
    __obj.asInstanceOf[AppsGetSubscriptionPlanForAccountRequestOptions]
  }
  
  extension [Self <: AppsGetSubscriptionPlanForAccountRequestOptions](x: Self) {
    
    inline def setHeaders(value: RequestHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: GET): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: RequestRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: Slashmarketplace_listingSlashaccountsSlashColonaccount_id): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
