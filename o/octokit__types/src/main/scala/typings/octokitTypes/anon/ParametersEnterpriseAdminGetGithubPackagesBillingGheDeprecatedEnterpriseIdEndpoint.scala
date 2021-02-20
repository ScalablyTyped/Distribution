package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.EnterpriseAdminGetGithubPackagesBillingGheDeprecatedEnterpriseIdEndpoint
import typings.octokitTypes.endpointsMod.EnterpriseAdminGetGithubPackagesBillingGheRequestOptions
import typings.octokitTypes.endpointsMod.EnterpriseAdminGetGithubPackagesBillingGheResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersEnterpriseAdminGetGithubPackagesBillingGheDeprecatedEnterpriseIdEndpoint extends StObject {
  
  var parameters: EnterpriseAdminGetGithubPackagesBillingGheDeprecatedEnterpriseIdEndpoint = js.native
  
  var request: EnterpriseAdminGetGithubPackagesBillingGheRequestOptions = js.native
  
  var response: OctokitResponse[EnterpriseAdminGetGithubPackagesBillingGheResponseData] = js.native
}
object ParametersEnterpriseAdminGetGithubPackagesBillingGheDeprecatedEnterpriseIdEndpoint {
  
  @scala.inline
  def apply(
    parameters: EnterpriseAdminGetGithubPackagesBillingGheDeprecatedEnterpriseIdEndpoint,
    request: EnterpriseAdminGetGithubPackagesBillingGheRequestOptions,
    response: OctokitResponse[EnterpriseAdminGetGithubPackagesBillingGheResponseData]
  ): ParametersEnterpriseAdminGetGithubPackagesBillingGheDeprecatedEnterpriseIdEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersEnterpriseAdminGetGithubPackagesBillingGheDeprecatedEnterpriseIdEndpoint]
  }
  
  @scala.inline
  implicit class ParametersEnterpriseAdminGetGithubPackagesBillingGheDeprecatedEnterpriseIdEndpointMutableBuilder[Self <: ParametersEnterpriseAdminGetGithubPackagesBillingGheDeprecatedEnterpriseIdEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: EnterpriseAdminGetGithubPackagesBillingGheDeprecatedEnterpriseIdEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: EnterpriseAdminGetGithubPackagesBillingGheRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[EnterpriseAdminGetGithubPackagesBillingGheResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
