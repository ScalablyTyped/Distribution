package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.EnterpriseAdminGetGithubActionsBillingGheEndpoint
import typings.octokitTypes.endpointsMod.EnterpriseAdminGetGithubActionsBillingGheRequestOptions
import typings.octokitTypes.endpointsMod.EnterpriseAdminGetGithubActionsBillingGheResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersEnterpriseAdminGetGithubActionsBillingGheEndpoint extends js.Object {
  
  var parameters: EnterpriseAdminGetGithubActionsBillingGheEndpoint = js.native
  
  var request: EnterpriseAdminGetGithubActionsBillingGheRequestOptions = js.native
  
  var response: OctokitResponse[EnterpriseAdminGetGithubActionsBillingGheResponseData] = js.native
}
object ParametersEnterpriseAdminGetGithubActionsBillingGheEndpoint {
  
  @scala.inline
  def apply(
    parameters: EnterpriseAdminGetGithubActionsBillingGheEndpoint,
    request: EnterpriseAdminGetGithubActionsBillingGheRequestOptions,
    response: OctokitResponse[EnterpriseAdminGetGithubActionsBillingGheResponseData]
  ): ParametersEnterpriseAdminGetGithubActionsBillingGheEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersEnterpriseAdminGetGithubActionsBillingGheEndpoint]
  }
  
  @scala.inline
  implicit class ParametersEnterpriseAdminGetGithubActionsBillingGheEndpointOps[Self <: ParametersEnterpriseAdminGetGithubActionsBillingGheEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: EnterpriseAdminGetGithubActionsBillingGheEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: EnterpriseAdminGetGithubActionsBillingGheRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[EnterpriseAdminGetGithubActionsBillingGheResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
