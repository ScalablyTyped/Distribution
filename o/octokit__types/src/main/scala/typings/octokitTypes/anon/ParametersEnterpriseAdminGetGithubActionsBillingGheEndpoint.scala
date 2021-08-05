package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.EnterpriseAdminGetGithubActionsBillingGheEndpoint
import typings.octokitTypes.endpointsMod.EnterpriseAdminGetGithubActionsBillingGheRequestOptions
import typings.octokitTypes.endpointsMod.EnterpriseAdminGetGithubActionsBillingGheResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersEnterpriseAdminGetGithubActionsBillingGheEndpoint extends StObject {
  
  var parameters: EnterpriseAdminGetGithubActionsBillingGheEndpoint
  
  var request: EnterpriseAdminGetGithubActionsBillingGheRequestOptions
  
  var response: OctokitResponse[EnterpriseAdminGetGithubActionsBillingGheResponseData]
}
object ParametersEnterpriseAdminGetGithubActionsBillingGheEndpoint {
  
  inline def apply(
    parameters: EnterpriseAdminGetGithubActionsBillingGheEndpoint,
    request: EnterpriseAdminGetGithubActionsBillingGheRequestOptions,
    response: OctokitResponse[EnterpriseAdminGetGithubActionsBillingGheResponseData]
  ): ParametersEnterpriseAdminGetGithubActionsBillingGheEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersEnterpriseAdminGetGithubActionsBillingGheEndpoint]
  }
  
  extension [Self <: ParametersEnterpriseAdminGetGithubActionsBillingGheEndpoint](x: Self) {
    
    inline def setParameters(value: EnterpriseAdminGetGithubActionsBillingGheEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: EnterpriseAdminGetGithubActionsBillingGheRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[EnterpriseAdminGetGithubActionsBillingGheResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
