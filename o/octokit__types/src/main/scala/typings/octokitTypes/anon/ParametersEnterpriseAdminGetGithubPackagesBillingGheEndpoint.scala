package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.EnterpriseAdminGetGithubPackagesBillingGheEndpoint
import typings.octokitTypes.endpointsMod.EnterpriseAdminGetGithubPackagesBillingGheRequestOptions
import typings.octokitTypes.endpointsMod.EnterpriseAdminGetGithubPackagesBillingGheResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersEnterpriseAdminGetGithubPackagesBillingGheEndpoint extends StObject {
  
  var parameters: EnterpriseAdminGetGithubPackagesBillingGheEndpoint
  
  var request: EnterpriseAdminGetGithubPackagesBillingGheRequestOptions
  
  var response: OctokitResponse[EnterpriseAdminGetGithubPackagesBillingGheResponseData]
}
object ParametersEnterpriseAdminGetGithubPackagesBillingGheEndpoint {
  
  @scala.inline
  def apply(
    parameters: EnterpriseAdminGetGithubPackagesBillingGheEndpoint,
    request: EnterpriseAdminGetGithubPackagesBillingGheRequestOptions,
    response: OctokitResponse[EnterpriseAdminGetGithubPackagesBillingGheResponseData]
  ): ParametersEnterpriseAdminGetGithubPackagesBillingGheEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersEnterpriseAdminGetGithubPackagesBillingGheEndpoint]
  }
  
  @scala.inline
  implicit class ParametersEnterpriseAdminGetGithubPackagesBillingGheEndpointMutableBuilder[Self <: ParametersEnterpriseAdminGetGithubPackagesBillingGheEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: EnterpriseAdminGetGithubPackagesBillingGheEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: EnterpriseAdminGetGithubPackagesBillingGheRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[EnterpriseAdminGetGithubPackagesBillingGheResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
