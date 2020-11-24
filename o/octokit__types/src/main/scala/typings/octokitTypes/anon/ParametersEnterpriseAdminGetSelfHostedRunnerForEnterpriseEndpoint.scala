package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.EnterpriseAdminGetSelfHostedRunnerForEnterpriseEndpoint
import typings.octokitTypes.endpointsMod.EnterpriseAdminGetSelfHostedRunnerForEnterpriseRequestOptions
import typings.octokitTypes.endpointsMod.EnterpriseAdminGetSelfHostedRunnerForEnterpriseResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersEnterpriseAdminGetSelfHostedRunnerForEnterpriseEndpoint extends js.Object {
  
  var parameters: EnterpriseAdminGetSelfHostedRunnerForEnterpriseEndpoint = js.native
  
  var request: EnterpriseAdminGetSelfHostedRunnerForEnterpriseRequestOptions = js.native
  
  var response: OctokitResponse[EnterpriseAdminGetSelfHostedRunnerForEnterpriseResponseData] = js.native
}
object ParametersEnterpriseAdminGetSelfHostedRunnerForEnterpriseEndpoint {
  
  @scala.inline
  def apply(
    parameters: EnterpriseAdminGetSelfHostedRunnerForEnterpriseEndpoint,
    request: EnterpriseAdminGetSelfHostedRunnerForEnterpriseRequestOptions,
    response: OctokitResponse[EnterpriseAdminGetSelfHostedRunnerForEnterpriseResponseData]
  ): ParametersEnterpriseAdminGetSelfHostedRunnerForEnterpriseEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersEnterpriseAdminGetSelfHostedRunnerForEnterpriseEndpoint]
  }
  
  @scala.inline
  implicit class ParametersEnterpriseAdminGetSelfHostedRunnerForEnterpriseEndpointOps[Self <: ParametersEnterpriseAdminGetSelfHostedRunnerForEnterpriseEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: EnterpriseAdminGetSelfHostedRunnerForEnterpriseEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: EnterpriseAdminGetSelfHostedRunnerForEnterpriseRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[EnterpriseAdminGetSelfHostedRunnerForEnterpriseResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
