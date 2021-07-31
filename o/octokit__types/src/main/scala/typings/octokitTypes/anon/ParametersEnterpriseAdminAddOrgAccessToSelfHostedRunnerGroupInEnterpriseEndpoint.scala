package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.EnterpriseAdminAddOrgAccessToSelfHostedRunnerGroupInEnterpriseEndpoint
import typings.octokitTypes.endpointsMod.EnterpriseAdminAddOrgAccessToSelfHostedRunnerGroupInEnterpriseRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersEnterpriseAdminAddOrgAccessToSelfHostedRunnerGroupInEnterpriseEndpoint extends StObject {
  
  var parameters: EnterpriseAdminAddOrgAccessToSelfHostedRunnerGroupInEnterpriseEndpoint
  
  var request: EnterpriseAdminAddOrgAccessToSelfHostedRunnerGroupInEnterpriseRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersEnterpriseAdminAddOrgAccessToSelfHostedRunnerGroupInEnterpriseEndpoint {
  
  @scala.inline
  def apply(
    parameters: EnterpriseAdminAddOrgAccessToSelfHostedRunnerGroupInEnterpriseEndpoint,
    request: EnterpriseAdminAddOrgAccessToSelfHostedRunnerGroupInEnterpriseRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersEnterpriseAdminAddOrgAccessToSelfHostedRunnerGroupInEnterpriseEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersEnterpriseAdminAddOrgAccessToSelfHostedRunnerGroupInEnterpriseEndpoint]
  }
  
  @scala.inline
  implicit class ParametersEnterpriseAdminAddOrgAccessToSelfHostedRunnerGroupInEnterpriseEndpointMutableBuilder[Self <: ParametersEnterpriseAdminAddOrgAccessToSelfHostedRunnerGroupInEnterpriseEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: EnterpriseAdminAddOrgAccessToSelfHostedRunnerGroupInEnterpriseEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: EnterpriseAdminAddOrgAccessToSelfHostedRunnerGroupInEnterpriseRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
