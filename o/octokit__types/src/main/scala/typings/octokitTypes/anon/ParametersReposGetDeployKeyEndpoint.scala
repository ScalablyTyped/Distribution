package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposGetDeployKeyEndpoint
import typings.octokitTypes.endpointsMod.ReposGetDeployKeyRequestOptions
import typings.octokitTypes.endpointsMod.ReposGetDeployKeyResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposGetDeployKeyEndpoint extends js.Object {
  
  var parameters: ReposGetDeployKeyEndpoint = js.native
  
  var request: ReposGetDeployKeyRequestOptions = js.native
  
  var response: OctokitResponse[ReposGetDeployKeyResponseData] = js.native
}
object ParametersReposGetDeployKeyEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposGetDeployKeyEndpoint,
    request: ReposGetDeployKeyRequestOptions,
    response: OctokitResponse[ReposGetDeployKeyResponseData]
  ): ParametersReposGetDeployKeyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetDeployKeyEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposGetDeployKeyEndpointOps[Self <: ParametersReposGetDeployKeyEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: ReposGetDeployKeyEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposGetDeployKeyRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposGetDeployKeyResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
