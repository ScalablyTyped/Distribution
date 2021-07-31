package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.PUT
import typings.octokitTypes.octokitTypesStrings.`SlashenterprisesSlashColonenterpriseSlashactionsSlashrunner-groupsSlashColonrunner_group_idSlashorganizations`
import typings.octokitTypes.requestHeadersMod.RequestHeaders
import typings.octokitTypes.requestRequestOptionsMod.RequestRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnterpriseAdminSetOrgAccessToSelfHostedRunnerGroupInEnterpriseRequestOptions extends StObject {
  
  var headers: RequestHeaders
  
  var method: PUT
  
  var request: RequestRequestOptions
  
  var url: `SlashenterprisesSlashColonenterpriseSlashactionsSlashrunner-groupsSlashColonrunner_group_idSlashorganizations`
}
object EnterpriseAdminSetOrgAccessToSelfHostedRunnerGroupInEnterpriseRequestOptions {
  
  @scala.inline
  def apply(headers: RequestHeaders, request: RequestRequestOptions): EnterpriseAdminSetOrgAccessToSelfHostedRunnerGroupInEnterpriseRequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = "PUT", request = request.asInstanceOf[js.Any], url = "/enterprises/:enterprise/actions/runner-groups/:runner_group_id/organizations")
    __obj.asInstanceOf[EnterpriseAdminSetOrgAccessToSelfHostedRunnerGroupInEnterpriseRequestOptions]
  }
  
  @scala.inline
  implicit class EnterpriseAdminSetOrgAccessToSelfHostedRunnerGroupInEnterpriseRequestOptionsMutableBuilder[Self <: EnterpriseAdminSetOrgAccessToSelfHostedRunnerGroupInEnterpriseRequestOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaders(value: RequestHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: PUT): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: RequestRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(
      value: `SlashenterprisesSlashColonenterpriseSlashactionsSlashrunner-groupsSlashColonrunner_group_idSlashorganizations`
    ): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
