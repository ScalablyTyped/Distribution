package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.GET
import typings.octokitTypes.octokitTypesStrings.Slashmarketplace_listingSlashplansSlashColonplan_idSlashaccounts
import typings.octokitTypes.requestHeadersMod.RequestHeaders
import typings.octokitTypes.requestRequestOptionsMod.RequestRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsListAccountsForPlanRequestOptions extends StObject {
  
  var headers: RequestHeaders
  
  var method: GET
  
  var request: RequestRequestOptions
  
  var url: Slashmarketplace_listingSlashplansSlashColonplan_idSlashaccounts
}
object AppsListAccountsForPlanRequestOptions {
  
  inline def apply(headers: RequestHeaders, request: RequestRequestOptions): AppsListAccountsForPlanRequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = "GET", request = request.asInstanceOf[js.Any], url = "/marketplace_listing/plans/:plan_id/accounts")
    __obj.asInstanceOf[AppsListAccountsForPlanRequestOptions]
  }
  
  extension [Self <: AppsListAccountsForPlanRequestOptions](x: Self) {
    
    inline def setHeaders(value: RequestHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: GET): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: RequestRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: Slashmarketplace_listingSlashplansSlashColonplan_idSlashaccounts): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
