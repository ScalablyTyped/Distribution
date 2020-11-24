package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.EnterpriseAdminAddSelfHostedRunnerToRunnerGroupForEnterpriseEndpoint
import typings.octokitTypes.endpointsMod.EnterpriseAdminAddSelfHostedRunnerToRunnerGroupForEnterpriseRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersEnterpriseAdminAddSelfHostedRunnerToRunnerGroupForEnterpriseEndpoint extends js.Object {
  
  var parameters: EnterpriseAdminAddSelfHostedRunnerToRunnerGroupForEnterpriseEndpoint = js.native
  
  var request: EnterpriseAdminAddSelfHostedRunnerToRunnerGroupForEnterpriseRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersEnterpriseAdminAddSelfHostedRunnerToRunnerGroupForEnterpriseEndpoint {
  
  @scala.inline
  def apply(
    parameters: EnterpriseAdminAddSelfHostedRunnerToRunnerGroupForEnterpriseEndpoint,
    request: EnterpriseAdminAddSelfHostedRunnerToRunnerGroupForEnterpriseRequestOptions,
    response: OctokitResponse[_]
  ): ParametersEnterpriseAdminAddSelfHostedRunnerToRunnerGroupForEnterpriseEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersEnterpriseAdminAddSelfHostedRunnerToRunnerGroupForEnterpriseEndpoint]
  }
  
  @scala.inline
  implicit class ParametersEnterpriseAdminAddSelfHostedRunnerToRunnerGroupForEnterpriseEndpointOps[Self <: ParametersEnterpriseAdminAddSelfHostedRunnerToRunnerGroupForEnterpriseEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: EnterpriseAdminAddSelfHostedRunnerToRunnerGroupForEnterpriseEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: EnterpriseAdminAddSelfHostedRunnerToRunnerGroupForEnterpriseRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
