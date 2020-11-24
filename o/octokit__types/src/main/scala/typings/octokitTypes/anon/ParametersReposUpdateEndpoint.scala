package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposUpdateEndpoint
import typings.octokitTypes.endpointsMod.ReposUpdateRequestOptions
import typings.octokitTypes.endpointsMod.ReposUpdateResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposUpdateEndpoint extends js.Object {
  
  var parameters: ReposUpdateEndpoint = js.native
  
  var request: ReposUpdateRequestOptions = js.native
  
  var response: OctokitResponse[ReposUpdateResponseData] = js.native
}
object ParametersReposUpdateEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposUpdateEndpoint,
    request: ReposUpdateRequestOptions,
    response: OctokitResponse[ReposUpdateResponseData]
  ): ParametersReposUpdateEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposUpdateEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposUpdateEndpointOps[Self <: ParametersReposUpdateEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: ReposUpdateEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposUpdateRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposUpdateResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
