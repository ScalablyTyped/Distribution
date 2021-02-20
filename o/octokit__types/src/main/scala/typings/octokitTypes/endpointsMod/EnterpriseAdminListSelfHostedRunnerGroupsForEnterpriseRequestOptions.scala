package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.GET
import typings.octokitTypes.octokitTypesStrings.`SlashenterprisesSlashColonenterpriseSlashactionsSlashrunner-groups`
import typings.octokitTypes.requestHeadersMod.RequestHeaders
import typings.octokitTypes.requestRequestOptionsMod.RequestRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnterpriseAdminListSelfHostedRunnerGroupsForEnterpriseRequestOptions extends StObject {
  
  var headers: RequestHeaders = js.native
  
  var method: GET = js.native
  
  var request: RequestRequestOptions = js.native
  
  var url: `SlashenterprisesSlashColonenterpriseSlashactionsSlashrunner-groups` = js.native
}
object EnterpriseAdminListSelfHostedRunnerGroupsForEnterpriseRequestOptions {
  
  @scala.inline
  def apply(
    headers: RequestHeaders,
    method: GET,
    request: RequestRequestOptions,
    url: `SlashenterprisesSlashColonenterpriseSlashactionsSlashrunner-groups`
  ): EnterpriseAdminListSelfHostedRunnerGroupsForEnterpriseRequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnterpriseAdminListSelfHostedRunnerGroupsForEnterpriseRequestOptions]
  }
  
  @scala.inline
  implicit class EnterpriseAdminListSelfHostedRunnerGroupsForEnterpriseRequestOptionsMutableBuilder[Self <: EnterpriseAdminListSelfHostedRunnerGroupsForEnterpriseRequestOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaders(value: RequestHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: GET): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: RequestRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: `SlashenterprisesSlashColonenterpriseSlashactionsSlashrunner-groups`): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
