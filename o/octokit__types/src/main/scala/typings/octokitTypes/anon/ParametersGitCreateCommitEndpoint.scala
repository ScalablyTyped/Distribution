package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.GitCreateCommitEndpoint
import typings.octokitTypes.endpointsMod.GitCreateCommitRequestOptions
import typings.octokitTypes.endpointsMod.GitCreateCommitResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersGitCreateCommitEndpoint extends js.Object {
  
  var parameters: GitCreateCommitEndpoint = js.native
  
  var request: GitCreateCommitRequestOptions = js.native
  
  var response: OctokitResponse[GitCreateCommitResponseData] = js.native
}
object ParametersGitCreateCommitEndpoint {
  
  @scala.inline
  def apply(
    parameters: GitCreateCommitEndpoint,
    request: GitCreateCommitRequestOptions,
    response: OctokitResponse[GitCreateCommitResponseData]
  ): ParametersGitCreateCommitEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersGitCreateCommitEndpoint]
  }
  
  @scala.inline
  implicit class ParametersGitCreateCommitEndpointOps[Self <: ParametersGitCreateCommitEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: GitCreateCommitEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: GitCreateCommitRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[GitCreateCommitResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
