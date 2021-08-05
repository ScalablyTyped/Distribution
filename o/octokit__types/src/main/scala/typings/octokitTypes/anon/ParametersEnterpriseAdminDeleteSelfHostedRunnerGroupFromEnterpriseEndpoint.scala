package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.EnterpriseAdminDeleteSelfHostedRunnerGroupFromEnterpriseEndpoint
import typings.octokitTypes.endpointsMod.EnterpriseAdminDeleteSelfHostedRunnerGroupFromEnterpriseRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersEnterpriseAdminDeleteSelfHostedRunnerGroupFromEnterpriseEndpoint extends StObject {
  
  var parameters: EnterpriseAdminDeleteSelfHostedRunnerGroupFromEnterpriseEndpoint
  
  var request: EnterpriseAdminDeleteSelfHostedRunnerGroupFromEnterpriseRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersEnterpriseAdminDeleteSelfHostedRunnerGroupFromEnterpriseEndpoint {
  
  inline def apply(
    parameters: EnterpriseAdminDeleteSelfHostedRunnerGroupFromEnterpriseEndpoint,
    request: EnterpriseAdminDeleteSelfHostedRunnerGroupFromEnterpriseRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersEnterpriseAdminDeleteSelfHostedRunnerGroupFromEnterpriseEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersEnterpriseAdminDeleteSelfHostedRunnerGroupFromEnterpriseEndpoint]
  }
  
  extension [Self <: ParametersEnterpriseAdminDeleteSelfHostedRunnerGroupFromEnterpriseEndpoint](x: Self) {
    
    inline def setParameters(value: EnterpriseAdminDeleteSelfHostedRunnerGroupFromEnterpriseEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: EnterpriseAdminDeleteSelfHostedRunnerGroupFromEnterpriseRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
