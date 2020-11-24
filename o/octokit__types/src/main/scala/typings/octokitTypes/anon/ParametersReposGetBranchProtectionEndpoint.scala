package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposGetBranchProtectionEndpoint
import typings.octokitTypes.endpointsMod.ReposGetBranchProtectionRequestOptions
import typings.octokitTypes.endpointsMod.ReposGetBranchProtectionResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposGetBranchProtectionEndpoint extends js.Object {
  
  var parameters: ReposGetBranchProtectionEndpoint = js.native
  
  var request: ReposGetBranchProtectionRequestOptions = js.native
  
  var response: OctokitResponse[ReposGetBranchProtectionResponseData] = js.native
}
object ParametersReposGetBranchProtectionEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposGetBranchProtectionEndpoint,
    request: ReposGetBranchProtectionRequestOptions,
    response: OctokitResponse[ReposGetBranchProtectionResponseData]
  ): ParametersReposGetBranchProtectionEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetBranchProtectionEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposGetBranchProtectionEndpointOps[Self <: ParametersReposGetBranchProtectionEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: ReposGetBranchProtectionEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposGetBranchProtectionRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposGetBranchProtectionResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
