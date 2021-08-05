package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.PUT
import typings.octokitTypes.octokitTypesStrings.`SlashenterprisesSlashColonenterpriseSlashactionsSlashrunner-groupsSlashColonrunner_group_idSlashorganizationsSlashColonorg_id`
import typings.octokitTypes.requestHeadersMod.RequestHeaders
import typings.octokitTypes.requestRequestOptionsMod.RequestRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnterpriseAdminAddOrgAccessToSelfHostedRunnerGroupInEnterpriseRequestOptions extends StObject {
  
  var headers: RequestHeaders
  
  var method: PUT
  
  var request: RequestRequestOptions
  
  var url: `SlashenterprisesSlashColonenterpriseSlashactionsSlashrunner-groupsSlashColonrunner_group_idSlashorganizationsSlashColonorg_id`
}
object EnterpriseAdminAddOrgAccessToSelfHostedRunnerGroupInEnterpriseRequestOptions {
  
  inline def apply(headers: RequestHeaders, request: RequestRequestOptions): EnterpriseAdminAddOrgAccessToSelfHostedRunnerGroupInEnterpriseRequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = "PUT", request = request.asInstanceOf[js.Any], url = "/enterprises/:enterprise/actions/runner-groups/:runner_group_id/organizations/:org_id")
    __obj.asInstanceOf[EnterpriseAdminAddOrgAccessToSelfHostedRunnerGroupInEnterpriseRequestOptions]
  }
  
  extension [Self <: EnterpriseAdminAddOrgAccessToSelfHostedRunnerGroupInEnterpriseRequestOptions](x: Self) {
    
    inline def setHeaders(value: RequestHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: PUT): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: RequestRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setUrl(
      value: `SlashenterprisesSlashColonenterpriseSlashactionsSlashrunner-groupsSlashColonrunner_group_idSlashorganizationsSlashColonorg_id`
    ): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
