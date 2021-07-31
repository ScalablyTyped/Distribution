package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.DELETE
import typings.octokitTypes.octokitTypesStrings.`SlashenterprisesSlashColonenterpriseSlashactionsSlashrunner-groupsSlashColonrunner_group_idSlashorganizationsSlashColonorg_id`
import typings.octokitTypes.requestHeadersMod.RequestHeaders
import typings.octokitTypes.requestRequestOptionsMod.RequestRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnterpriseAdminRemoveOrgAccessToSelfHostedRunnerGroupInEnterpriseRequestOptions extends StObject {
  
  var headers: RequestHeaders
  
  var method: DELETE
  
  var request: RequestRequestOptions
  
  var url: `SlashenterprisesSlashColonenterpriseSlashactionsSlashrunner-groupsSlashColonrunner_group_idSlashorganizationsSlashColonorg_id`
}
object EnterpriseAdminRemoveOrgAccessToSelfHostedRunnerGroupInEnterpriseRequestOptions {
  
  @scala.inline
  def apply(headers: RequestHeaders, request: RequestRequestOptions): EnterpriseAdminRemoveOrgAccessToSelfHostedRunnerGroupInEnterpriseRequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = "DELETE", request = request.asInstanceOf[js.Any], url = "/enterprises/:enterprise/actions/runner-groups/:runner_group_id/organizations/:org_id")
    __obj.asInstanceOf[EnterpriseAdminRemoveOrgAccessToSelfHostedRunnerGroupInEnterpriseRequestOptions]
  }
  
  @scala.inline
  implicit class EnterpriseAdminRemoveOrgAccessToSelfHostedRunnerGroupInEnterpriseRequestOptionsMutableBuilder[Self <: EnterpriseAdminRemoveOrgAccessToSelfHostedRunnerGroupInEnterpriseRequestOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaders(value: RequestHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: DELETE): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: RequestRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(
      value: `SlashenterprisesSlashColonenterpriseSlashactionsSlashrunner-groupsSlashColonrunner_group_idSlashorganizationsSlashColonorg_id`
    ): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
