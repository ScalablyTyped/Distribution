package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.EnterpriseAdminListSelfHostedRunnersForEnterpriseEndpoint
import typings.octokitTypes.endpointsMod.EnterpriseAdminListSelfHostedRunnersForEnterpriseRequestOptions
import typings.octokitTypes.endpointsMod.EnterpriseAdminListSelfHostedRunnersForEnterpriseResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersEnterpriseAdminListSelfHostedRunnersForEnterpriseEndpoint extends StObject {
  
  var parameters: EnterpriseAdminListSelfHostedRunnersForEnterpriseEndpoint
  
  var request: EnterpriseAdminListSelfHostedRunnersForEnterpriseRequestOptions
  
  var response: OctokitResponse[EnterpriseAdminListSelfHostedRunnersForEnterpriseResponseData]
}
object ParametersEnterpriseAdminListSelfHostedRunnersForEnterpriseEndpoint {
  
  inline def apply(
    parameters: EnterpriseAdminListSelfHostedRunnersForEnterpriseEndpoint,
    request: EnterpriseAdminListSelfHostedRunnersForEnterpriseRequestOptions,
    response: OctokitResponse[EnterpriseAdminListSelfHostedRunnersForEnterpriseResponseData]
  ): ParametersEnterpriseAdminListSelfHostedRunnersForEnterpriseEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersEnterpriseAdminListSelfHostedRunnersForEnterpriseEndpoint]
  }
  
  extension [Self <: ParametersEnterpriseAdminListSelfHostedRunnersForEnterpriseEndpoint](x: Self) {
    
    inline def setParameters(value: EnterpriseAdminListSelfHostedRunnersForEnterpriseEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: EnterpriseAdminListSelfHostedRunnersForEnterpriseRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[EnterpriseAdminListSelfHostedRunnersForEnterpriseResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
