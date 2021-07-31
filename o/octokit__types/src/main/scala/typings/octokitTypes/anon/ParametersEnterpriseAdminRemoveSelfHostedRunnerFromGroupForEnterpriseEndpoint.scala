package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.EnterpriseAdminRemoveSelfHostedRunnerFromGroupForEnterpriseEndpoint
import typings.octokitTypes.endpointsMod.EnterpriseAdminRemoveSelfHostedRunnerFromGroupForEnterpriseRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersEnterpriseAdminRemoveSelfHostedRunnerFromGroupForEnterpriseEndpoint extends StObject {
  
  var parameters: EnterpriseAdminRemoveSelfHostedRunnerFromGroupForEnterpriseEndpoint
  
  var request: EnterpriseAdminRemoveSelfHostedRunnerFromGroupForEnterpriseRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersEnterpriseAdminRemoveSelfHostedRunnerFromGroupForEnterpriseEndpoint {
  
  @scala.inline
  def apply(
    parameters: EnterpriseAdminRemoveSelfHostedRunnerFromGroupForEnterpriseEndpoint,
    request: EnterpriseAdminRemoveSelfHostedRunnerFromGroupForEnterpriseRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersEnterpriseAdminRemoveSelfHostedRunnerFromGroupForEnterpriseEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersEnterpriseAdminRemoveSelfHostedRunnerFromGroupForEnterpriseEndpoint]
  }
  
  @scala.inline
  implicit class ParametersEnterpriseAdminRemoveSelfHostedRunnerFromGroupForEnterpriseEndpointMutableBuilder[Self <: ParametersEnterpriseAdminRemoveSelfHostedRunnerFromGroupForEnterpriseEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: EnterpriseAdminRemoveSelfHostedRunnerFromGroupForEnterpriseEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: EnterpriseAdminRemoveSelfHostedRunnerFromGroupForEnterpriseRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
