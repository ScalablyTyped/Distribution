package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.GitGetTagEndpoint
import typings.octokitTypes.endpointsMod.GitGetTagRequestOptions
import typings.octokitTypes.endpointsMod.GitGetTagResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersGitGetTagEndpoint extends js.Object {
  
  var parameters: GitGetTagEndpoint = js.native
  
  var request: GitGetTagRequestOptions = js.native
  
  var response: OctokitResponse[GitGetTagResponseData] = js.native
}
object ParametersGitGetTagEndpoint {
  
  @scala.inline
  def apply(
    parameters: GitGetTagEndpoint,
    request: GitGetTagRequestOptions,
    response: OctokitResponse[GitGetTagResponseData]
  ): ParametersGitGetTagEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersGitGetTagEndpoint]
  }
  
  @scala.inline
  implicit class ParametersGitGetTagEndpointOps[Self <: ParametersGitGetTagEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: GitGetTagEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: GitGetTagRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[GitGetTagResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
