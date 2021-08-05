package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.EnterpriseAdminGetGithubPackagesBillingGheDeprecatedEnterpriseIdEndpoint
import typings.octokitTypes.endpointsMod.EnterpriseAdminGetGithubPackagesBillingGheRequestOptions
import typings.octokitTypes.endpointsMod.EnterpriseAdminGetGithubPackagesBillingGheResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersEnterpriseAdminGetGithubPackagesBillingGheDeprecatedEnterpriseIdEndpoint extends StObject {
  
  var parameters: EnterpriseAdminGetGithubPackagesBillingGheDeprecatedEnterpriseIdEndpoint
  
  var request: EnterpriseAdminGetGithubPackagesBillingGheRequestOptions
  
  var response: OctokitResponse[EnterpriseAdminGetGithubPackagesBillingGheResponseData]
}
object ParametersEnterpriseAdminGetGithubPackagesBillingGheDeprecatedEnterpriseIdEndpoint {
  
  inline def apply(
    parameters: EnterpriseAdminGetGithubPackagesBillingGheDeprecatedEnterpriseIdEndpoint,
    request: EnterpriseAdminGetGithubPackagesBillingGheRequestOptions,
    response: OctokitResponse[EnterpriseAdminGetGithubPackagesBillingGheResponseData]
  ): ParametersEnterpriseAdminGetGithubPackagesBillingGheDeprecatedEnterpriseIdEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersEnterpriseAdminGetGithubPackagesBillingGheDeprecatedEnterpriseIdEndpoint]
  }
  
  extension [Self <: ParametersEnterpriseAdminGetGithubPackagesBillingGheDeprecatedEnterpriseIdEndpoint](x: Self) {
    
    inline def setParameters(value: EnterpriseAdminGetGithubPackagesBillingGheDeprecatedEnterpriseIdEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: EnterpriseAdminGetGithubPackagesBillingGheRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[EnterpriseAdminGetGithubPackagesBillingGheResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
