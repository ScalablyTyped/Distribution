package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposGetBranchEndpoint
import typings.octokitTypes.endpointsMod.ReposGetBranchRequestOptions
import typings.octokitTypes.endpointsMod.ReposGetBranchResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposGetBranchEndpoint extends js.Object {
  
  var parameters: ReposGetBranchEndpoint = js.native
  
  var request: ReposGetBranchRequestOptions = js.native
  
  var response: OctokitResponse[ReposGetBranchResponseData] = js.native
}
object ParametersReposGetBranchEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposGetBranchEndpoint,
    request: ReposGetBranchRequestOptions,
    response: OctokitResponse[ReposGetBranchResponseData]
  ): ParametersReposGetBranchEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetBranchEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposGetBranchEndpointOps[Self <: ParametersReposGetBranchEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: ReposGetBranchEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposGetBranchRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposGetBranchResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
