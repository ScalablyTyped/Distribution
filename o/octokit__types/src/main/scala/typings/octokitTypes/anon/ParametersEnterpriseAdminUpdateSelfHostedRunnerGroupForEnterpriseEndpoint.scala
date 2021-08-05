package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.EnterpriseAdminUpdateSelfHostedRunnerGroupForEnterpriseEndpoint
import typings.octokitTypes.endpointsMod.EnterpriseAdminUpdateSelfHostedRunnerGroupForEnterpriseRequestOptions
import typings.octokitTypes.endpointsMod.EnterpriseAdminUpdateSelfHostedRunnerGroupForEnterpriseResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersEnterpriseAdminUpdateSelfHostedRunnerGroupForEnterpriseEndpoint extends StObject {
  
  var parameters: EnterpriseAdminUpdateSelfHostedRunnerGroupForEnterpriseEndpoint
  
  var request: EnterpriseAdminUpdateSelfHostedRunnerGroupForEnterpriseRequestOptions
  
  var response: OctokitResponse[EnterpriseAdminUpdateSelfHostedRunnerGroupForEnterpriseResponseData]
}
object ParametersEnterpriseAdminUpdateSelfHostedRunnerGroupForEnterpriseEndpoint {
  
  inline def apply(
    parameters: EnterpriseAdminUpdateSelfHostedRunnerGroupForEnterpriseEndpoint,
    request: EnterpriseAdminUpdateSelfHostedRunnerGroupForEnterpriseRequestOptions,
    response: OctokitResponse[EnterpriseAdminUpdateSelfHostedRunnerGroupForEnterpriseResponseData]
  ): ParametersEnterpriseAdminUpdateSelfHostedRunnerGroupForEnterpriseEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersEnterpriseAdminUpdateSelfHostedRunnerGroupForEnterpriseEndpoint]
  }
  
  extension [Self <: ParametersEnterpriseAdminUpdateSelfHostedRunnerGroupForEnterpriseEndpoint](x: Self) {
    
    inline def setParameters(value: EnterpriseAdminUpdateSelfHostedRunnerGroupForEnterpriseEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: EnterpriseAdminUpdateSelfHostedRunnerGroupForEnterpriseRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[EnterpriseAdminUpdateSelfHostedRunnerGroupForEnterpriseResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
