package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.EnterpriseAdminGetGithubPackagesBillingGheEndpoint
import typings.octokitTypes.endpointsMod.EnterpriseAdminGetGithubPackagesBillingGheRequestOptions
import typings.octokitTypes.endpointsMod.EnterpriseAdminGetGithubPackagesBillingGheResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersEnterpriseAdminGetGithubPackagesBillingGheEndpoint extends js.Object {
  
  var parameters: EnterpriseAdminGetGithubPackagesBillingGheEndpoint = js.native
  
  var request: EnterpriseAdminGetGithubPackagesBillingGheRequestOptions = js.native
  
  var response: OctokitResponse[EnterpriseAdminGetGithubPackagesBillingGheResponseData] = js.native
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
  implicit class ParametersEnterpriseAdminGetGithubPackagesBillingGheEndpointOps[Self <: ParametersEnterpriseAdminGetGithubPackagesBillingGheEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setParameters(value: EnterpriseAdminGetGithubPackagesBillingGheEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: EnterpriseAdminGetGithubPackagesBillingGheRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[EnterpriseAdminGetGithubPackagesBillingGheResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
