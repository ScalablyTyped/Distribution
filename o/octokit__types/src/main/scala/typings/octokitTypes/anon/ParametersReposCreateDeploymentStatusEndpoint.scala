package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposCreateDeploymentStatusEndpoint
import typings.octokitTypes.endpointsMod.ReposCreateDeploymentStatusRequestOptions
import typings.octokitTypes.endpointsMod.ReposCreateDeploymentStatusResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposCreateDeploymentStatusEndpoint extends js.Object {
  
  var parameters: ReposCreateDeploymentStatusEndpoint = js.native
  
  var request: ReposCreateDeploymentStatusRequestOptions = js.native
  
  var response: OctokitResponse[ReposCreateDeploymentStatusResponseData] = js.native
}
object ParametersReposCreateDeploymentStatusEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposCreateDeploymentStatusEndpoint,
    request: ReposCreateDeploymentStatusRequestOptions,
    response: OctokitResponse[ReposCreateDeploymentStatusResponseData]
  ): ParametersReposCreateDeploymentStatusEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposCreateDeploymentStatusEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposCreateDeploymentStatusEndpointOps[Self <: ParametersReposCreateDeploymentStatusEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: ReposCreateDeploymentStatusEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposCreateDeploymentStatusRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposCreateDeploymentStatusResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
