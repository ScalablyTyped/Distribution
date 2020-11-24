package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.BillingGetGithubActionsBillingUserEndpoint
import typings.octokitTypes.endpointsMod.BillingGetGithubActionsBillingUserRequestOptions
import typings.octokitTypes.endpointsMod.BillingGetGithubActionsBillingUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersBillingGetGithubActionsBillingUserEndpoint extends js.Object {
  
  var parameters: BillingGetGithubActionsBillingUserEndpoint = js.native
  
  var request: BillingGetGithubActionsBillingUserRequestOptions = js.native
  
  var response: OctokitResponse[BillingGetGithubActionsBillingUserResponseData] = js.native
}
object ParametersBillingGetGithubActionsBillingUserEndpoint {
  
  @scala.inline
  def apply(
    parameters: BillingGetGithubActionsBillingUserEndpoint,
    request: BillingGetGithubActionsBillingUserRequestOptions,
    response: OctokitResponse[BillingGetGithubActionsBillingUserResponseData]
  ): ParametersBillingGetGithubActionsBillingUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersBillingGetGithubActionsBillingUserEndpoint]
  }
  
  @scala.inline
  implicit class ParametersBillingGetGithubActionsBillingUserEndpointOps[Self <: ParametersBillingGetGithubActionsBillingUserEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: BillingGetGithubActionsBillingUserEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: BillingGetGithubActionsBillingUserRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[BillingGetGithubActionsBillingUserResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
