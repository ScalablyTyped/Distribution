package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.EnterpriseAdminAddSelfHostedRunnerToRunnerGroupForEnterpriseEndpoint
import typings.octokitTypes.endpointsMod.EnterpriseAdminAddSelfHostedRunnerToRunnerGroupForEnterpriseRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersEnterpriseAdminAddSelfHostedRunnerToRunnerGroupForEnterpriseEndpoint extends StObject {
  
  var parameters: EnterpriseAdminAddSelfHostedRunnerToRunnerGroupForEnterpriseEndpoint
  
  var request: EnterpriseAdminAddSelfHostedRunnerToRunnerGroupForEnterpriseRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersEnterpriseAdminAddSelfHostedRunnerToRunnerGroupForEnterpriseEndpoint {
  
  inline def apply(
    parameters: EnterpriseAdminAddSelfHostedRunnerToRunnerGroupForEnterpriseEndpoint,
    request: EnterpriseAdminAddSelfHostedRunnerToRunnerGroupForEnterpriseRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersEnterpriseAdminAddSelfHostedRunnerToRunnerGroupForEnterpriseEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersEnterpriseAdminAddSelfHostedRunnerToRunnerGroupForEnterpriseEndpoint]
  }
  
  extension [Self <: ParametersEnterpriseAdminAddSelfHostedRunnerToRunnerGroupForEnterpriseEndpoint](x: Self) {
    
    inline def setParameters(value: EnterpriseAdminAddSelfHostedRunnerToRunnerGroupForEnterpriseEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: EnterpriseAdminAddSelfHostedRunnerToRunnerGroupForEnterpriseRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
