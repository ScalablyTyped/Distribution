package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.EnterpriseAdminRemoveOrgAccessToSelfHostedRunnerGroupInEnterpriseEndpoint
import typings.octokitTypes.endpointsMod.EnterpriseAdminRemoveOrgAccessToSelfHostedRunnerGroupInEnterpriseRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersEnterpriseAdminRemoveOrgAccessToSelfHostedRunnerGroupInEnterpriseEndpoint extends StObject {
  
  var parameters: EnterpriseAdminRemoveOrgAccessToSelfHostedRunnerGroupInEnterpriseEndpoint
  
  var request: EnterpriseAdminRemoveOrgAccessToSelfHostedRunnerGroupInEnterpriseRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersEnterpriseAdminRemoveOrgAccessToSelfHostedRunnerGroupInEnterpriseEndpoint {
  
  @scala.inline
  def apply(
    parameters: EnterpriseAdminRemoveOrgAccessToSelfHostedRunnerGroupInEnterpriseEndpoint,
    request: EnterpriseAdminRemoveOrgAccessToSelfHostedRunnerGroupInEnterpriseRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersEnterpriseAdminRemoveOrgAccessToSelfHostedRunnerGroupInEnterpriseEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersEnterpriseAdminRemoveOrgAccessToSelfHostedRunnerGroupInEnterpriseEndpoint]
  }
  
  @scala.inline
  implicit class ParametersEnterpriseAdminRemoveOrgAccessToSelfHostedRunnerGroupInEnterpriseEndpointMutableBuilder[Self <: ParametersEnterpriseAdminRemoveOrgAccessToSelfHostedRunnerGroupInEnterpriseEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: EnterpriseAdminRemoveOrgAccessToSelfHostedRunnerGroupInEnterpriseEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: EnterpriseAdminRemoveOrgAccessToSelfHostedRunnerGroupInEnterpriseRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
