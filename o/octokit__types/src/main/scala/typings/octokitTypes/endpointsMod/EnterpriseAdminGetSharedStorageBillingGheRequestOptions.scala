package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.GET
import typings.octokitTypes.octokitTypesStrings.`SlashenterprisesSlashColonenterpriseSlashsettingsSlashbillingSlashshared-storage`
import typings.octokitTypes.requestHeadersMod.RequestHeaders
import typings.octokitTypes.requestRequestOptionsMod.RequestRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnterpriseAdminGetSharedStorageBillingGheRequestOptions extends StObject {
  
  var headers: RequestHeaders
  
  var method: GET
  
  var request: RequestRequestOptions
  
  var url: `SlashenterprisesSlashColonenterpriseSlashsettingsSlashbillingSlashshared-storage`
}
object EnterpriseAdminGetSharedStorageBillingGheRequestOptions {
  
  inline def apply(headers: RequestHeaders, request: RequestRequestOptions): EnterpriseAdminGetSharedStorageBillingGheRequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = "GET", request = request.asInstanceOf[js.Any], url = "/enterprises/:enterprise/settings/billing/shared-storage")
    __obj.asInstanceOf[EnterpriseAdminGetSharedStorageBillingGheRequestOptions]
  }
  
  extension [Self <: EnterpriseAdminGetSharedStorageBillingGheRequestOptions](x: Self) {
    
    inline def setHeaders(value: RequestHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: GET): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: RequestRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: `SlashenterprisesSlashColonenterpriseSlashsettingsSlashbillingSlashshared-storage`): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
