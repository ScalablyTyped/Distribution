package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.EnterpriseAdminGetSelfHostedRunnerForEnterpriseEndpoint
import typings.octokitTypes.endpointsMod.EnterpriseAdminGetSelfHostedRunnerForEnterpriseRequestOptions
import typings.octokitTypes.endpointsMod.EnterpriseAdminGetSelfHostedRunnerForEnterpriseResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersEnterpriseAdminGetSelfHostedRunnerForEnterpriseEndpoint extends StObject {
  
  var parameters: EnterpriseAdminGetSelfHostedRunnerForEnterpriseEndpoint
  
  var request: EnterpriseAdminGetSelfHostedRunnerForEnterpriseRequestOptions
  
  var response: OctokitResponse[EnterpriseAdminGetSelfHostedRunnerForEnterpriseResponseData]
}
object ParametersEnterpriseAdminGetSelfHostedRunnerForEnterpriseEndpoint {
  
  inline def apply(
    parameters: EnterpriseAdminGetSelfHostedRunnerForEnterpriseEndpoint,
    request: EnterpriseAdminGetSelfHostedRunnerForEnterpriseRequestOptions,
    response: OctokitResponse[EnterpriseAdminGetSelfHostedRunnerForEnterpriseResponseData]
  ): ParametersEnterpriseAdminGetSelfHostedRunnerForEnterpriseEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersEnterpriseAdminGetSelfHostedRunnerForEnterpriseEndpoint]
  }
  
  extension [Self <: ParametersEnterpriseAdminGetSelfHostedRunnerForEnterpriseEndpoint](x: Self) {
    
    inline def setParameters(value: EnterpriseAdminGetSelfHostedRunnerForEnterpriseEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: EnterpriseAdminGetSelfHostedRunnerForEnterpriseRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[EnterpriseAdminGetSelfHostedRunnerForEnterpriseResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
