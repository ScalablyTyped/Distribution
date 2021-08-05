package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.EnterpriseAdminGetSelfHostedRunnerGroupForEnterpriseEndpoint
import typings.octokitTypes.endpointsMod.EnterpriseAdminGetSelfHostedRunnerGroupForEnterpriseRequestOptions
import typings.octokitTypes.endpointsMod.EnterpriseAdminGetSelfHostedRunnerGroupForEnterpriseResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersEnterpriseAdminGetSelfHostedRunnerGroupForEnterpriseEndpoint extends StObject {
  
  var parameters: EnterpriseAdminGetSelfHostedRunnerGroupForEnterpriseEndpoint
  
  var request: EnterpriseAdminGetSelfHostedRunnerGroupForEnterpriseRequestOptions
  
  var response: OctokitResponse[EnterpriseAdminGetSelfHostedRunnerGroupForEnterpriseResponseData]
}
object ParametersEnterpriseAdminGetSelfHostedRunnerGroupForEnterpriseEndpoint {
  
  inline def apply(
    parameters: EnterpriseAdminGetSelfHostedRunnerGroupForEnterpriseEndpoint,
    request: EnterpriseAdminGetSelfHostedRunnerGroupForEnterpriseRequestOptions,
    response: OctokitResponse[EnterpriseAdminGetSelfHostedRunnerGroupForEnterpriseResponseData]
  ): ParametersEnterpriseAdminGetSelfHostedRunnerGroupForEnterpriseEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersEnterpriseAdminGetSelfHostedRunnerGroupForEnterpriseEndpoint]
  }
  
  extension [Self <: ParametersEnterpriseAdminGetSelfHostedRunnerGroupForEnterpriseEndpoint](x: Self) {
    
    inline def setParameters(value: EnterpriseAdminGetSelfHostedRunnerGroupForEnterpriseEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: EnterpriseAdminGetSelfHostedRunnerGroupForEnterpriseRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[EnterpriseAdminGetSelfHostedRunnerGroupForEnterpriseResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
