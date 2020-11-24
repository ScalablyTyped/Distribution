package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposCreateDeployKeyEndpoint
import typings.octokitTypes.endpointsMod.ReposCreateDeployKeyRequestOptions
import typings.octokitTypes.endpointsMod.ReposCreateDeployKeyResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposCreateDeployKeyEndpoint extends js.Object {
  
  var parameters: ReposCreateDeployKeyEndpoint = js.native
  
  var request: ReposCreateDeployKeyRequestOptions = js.native
  
  var response: OctokitResponse[ReposCreateDeployKeyResponseData] = js.native
}
object ParametersReposCreateDeployKeyEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposCreateDeployKeyEndpoint,
    request: ReposCreateDeployKeyRequestOptions,
    response: OctokitResponse[ReposCreateDeployKeyResponseData]
  ): ParametersReposCreateDeployKeyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposCreateDeployKeyEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposCreateDeployKeyEndpointOps[Self <: ParametersReposCreateDeployKeyEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: ReposCreateDeployKeyEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposCreateDeployKeyRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposCreateDeployKeyResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
