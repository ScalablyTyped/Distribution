package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.GitUpdateRefEndpoint
import typings.octokitTypes.endpointsMod.GitUpdateRefRequestOptions
import typings.octokitTypes.endpointsMod.GitUpdateRefResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersGitUpdateRefEndpoint extends js.Object {
  
  var parameters: GitUpdateRefEndpoint = js.native
  
  var request: GitUpdateRefRequestOptions = js.native
  
  var response: OctokitResponse[GitUpdateRefResponseData] = js.native
}
object ParametersGitUpdateRefEndpoint {
  
  @scala.inline
  def apply(
    parameters: GitUpdateRefEndpoint,
    request: GitUpdateRefRequestOptions,
    response: OctokitResponse[GitUpdateRefResponseData]
  ): ParametersGitUpdateRefEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersGitUpdateRefEndpoint]
  }
  
  @scala.inline
  implicit class ParametersGitUpdateRefEndpointOps[Self <: ParametersGitUpdateRefEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: GitUpdateRefEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: GitUpdateRefRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[GitUpdateRefResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
