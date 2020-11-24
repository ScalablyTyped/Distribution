package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.GitCreateBlobEndpoint
import typings.octokitTypes.endpointsMod.GitCreateBlobRequestOptions
import typings.octokitTypes.endpointsMod.GitCreateBlobResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersGitCreateBlobEndpoint extends js.Object {
  
  var parameters: GitCreateBlobEndpoint = js.native
  
  var request: GitCreateBlobRequestOptions = js.native
  
  var response: OctokitResponse[GitCreateBlobResponseData] = js.native
}
object ParametersGitCreateBlobEndpoint {
  
  @scala.inline
  def apply(
    parameters: GitCreateBlobEndpoint,
    request: GitCreateBlobRequestOptions,
    response: OctokitResponse[GitCreateBlobResponseData]
  ): ParametersGitCreateBlobEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersGitCreateBlobEndpoint]
  }
  
  @scala.inline
  implicit class ParametersGitCreateBlobEndpointOps[Self <: ParametersGitCreateBlobEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: GitCreateBlobEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: GitCreateBlobRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[GitCreateBlobResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
