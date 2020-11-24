package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.GitGetBlobEndpoint
import typings.octokitTypes.endpointsMod.GitGetBlobRequestOptions
import typings.octokitTypes.endpointsMod.GitGetBlobResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersGitGetBlobEndpoint extends js.Object {
  
  var parameters: GitGetBlobEndpoint = js.native
  
  var request: GitGetBlobRequestOptions = js.native
  
  var response: OctokitResponse[GitGetBlobResponseData] = js.native
}
object ParametersGitGetBlobEndpoint {
  
  @scala.inline
  def apply(
    parameters: GitGetBlobEndpoint,
    request: GitGetBlobRequestOptions,
    response: OctokitResponse[GitGetBlobResponseData]
  ): ParametersGitGetBlobEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersGitGetBlobEndpoint]
  }
  
  @scala.inline
  implicit class ParametersGitGetBlobEndpointOps[Self <: ParametersGitGetBlobEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: GitGetBlobEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: GitGetBlobRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[GitGetBlobResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
