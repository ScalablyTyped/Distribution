package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.EnterpriseAdminGetGithubActionsBillingGheDeprecatedEnterpriseIdEndpoint
import typings.octokitTypes.endpointsMod.EnterpriseAdminGetGithubActionsBillingGheRequestOptions
import typings.octokitTypes.endpointsMod.EnterpriseAdminGetGithubActionsBillingGheResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersEnterpriseAdminGetGithubActionsBillingGheDeprecatedEnterpriseIdEndpoint extends StObject {
  
  var parameters: EnterpriseAdminGetGithubActionsBillingGheDeprecatedEnterpriseIdEndpoint
  
  var request: EnterpriseAdminGetGithubActionsBillingGheRequestOptions
  
  var response: OctokitResponse[EnterpriseAdminGetGithubActionsBillingGheResponseData]
}
object ParametersEnterpriseAdminGetGithubActionsBillingGheDeprecatedEnterpriseIdEndpoint {
  
  inline def apply(
    parameters: EnterpriseAdminGetGithubActionsBillingGheDeprecatedEnterpriseIdEndpoint,
    request: EnterpriseAdminGetGithubActionsBillingGheRequestOptions,
    response: OctokitResponse[EnterpriseAdminGetGithubActionsBillingGheResponseData]
  ): ParametersEnterpriseAdminGetGithubActionsBillingGheDeprecatedEnterpriseIdEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersEnterpriseAdminGetGithubActionsBillingGheDeprecatedEnterpriseIdEndpoint]
  }
  
  extension [Self <: ParametersEnterpriseAdminGetGithubActionsBillingGheDeprecatedEnterpriseIdEndpoint](x: Self) {
    
    inline def setParameters(value: EnterpriseAdminGetGithubActionsBillingGheDeprecatedEnterpriseIdEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: EnterpriseAdminGetGithubActionsBillingGheRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[EnterpriseAdminGetGithubActionsBillingGheResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
