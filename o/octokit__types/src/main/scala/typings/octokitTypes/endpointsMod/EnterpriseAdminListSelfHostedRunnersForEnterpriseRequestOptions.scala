package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.GET
import typings.octokitTypes.octokitTypesStrings.SlashenterprisesSlashColonenterpriseSlashactionsSlashrunners
import typings.octokitTypes.requestHeadersMod.RequestHeaders
import typings.octokitTypes.requestRequestOptionsMod.RequestRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnterpriseAdminListSelfHostedRunnersForEnterpriseRequestOptions extends StObject {
  
  var headers: RequestHeaders
  
  var method: GET
  
  var request: RequestRequestOptions
  
  var url: SlashenterprisesSlashColonenterpriseSlashactionsSlashrunners
}
object EnterpriseAdminListSelfHostedRunnersForEnterpriseRequestOptions {
  
  @scala.inline
  def apply(headers: RequestHeaders, request: RequestRequestOptions): EnterpriseAdminListSelfHostedRunnersForEnterpriseRequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = "GET", request = request.asInstanceOf[js.Any], url = "/enterprises/:enterprise/actions/runners")
    __obj.asInstanceOf[EnterpriseAdminListSelfHostedRunnersForEnterpriseRequestOptions]
  }
  
  @scala.inline
  implicit class EnterpriseAdminListSelfHostedRunnersForEnterpriseRequestOptionsMutableBuilder[Self <: EnterpriseAdminListSelfHostedRunnersForEnterpriseRequestOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaders(value: RequestHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: GET): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: RequestRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: SlashenterprisesSlashColonenterpriseSlashactionsSlashrunners): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
