package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.POST
import typings.octokitTypes.octokitTypesStrings.`SlashenterprisesSlashColonenterpriseSlashactionsSlashrunnersSlashremove-token`
import typings.octokitTypes.requestHeadersMod.RequestHeaders
import typings.octokitTypes.requestRequestOptionsMod.RequestRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnterpriseAdminCreateRemoveTokenForEnterpriseRequestOptions extends StObject {
  
  var headers: RequestHeaders
  
  var method: POST
  
  var request: RequestRequestOptions
  
  var url: `SlashenterprisesSlashColonenterpriseSlashactionsSlashrunnersSlashremove-token`
}
object EnterpriseAdminCreateRemoveTokenForEnterpriseRequestOptions {
  
  inline def apply(headers: RequestHeaders, request: RequestRequestOptions): EnterpriseAdminCreateRemoveTokenForEnterpriseRequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = "POST", request = request.asInstanceOf[js.Any], url = "/enterprises/:enterprise/actions/runners/remove-token")
    __obj.asInstanceOf[EnterpriseAdminCreateRemoveTokenForEnterpriseRequestOptions]
  }
  
  extension [Self <: EnterpriseAdminCreateRemoveTokenForEnterpriseRequestOptions](x: Self) {
    
    inline def setHeaders(value: RequestHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: POST): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: RequestRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: `SlashenterprisesSlashColonenterpriseSlashactionsSlashrunnersSlashremove-token`): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
