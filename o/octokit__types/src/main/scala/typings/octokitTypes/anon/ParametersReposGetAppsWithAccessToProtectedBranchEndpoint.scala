package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposGetAppsWithAccessToProtectedBranchEndpoint
import typings.octokitTypes.endpointsMod.ReposGetAppsWithAccessToProtectedBranchRequestOptions
import typings.octokitTypes.endpointsMod.ReposGetAppsWithAccessToProtectedBranchResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposGetAppsWithAccessToProtectedBranchEndpoint extends js.Object {
  
  var parameters: ReposGetAppsWithAccessToProtectedBranchEndpoint = js.native
  
  var request: ReposGetAppsWithAccessToProtectedBranchRequestOptions = js.native
  
  var response: OctokitResponse[ReposGetAppsWithAccessToProtectedBranchResponseData] = js.native
}
object ParametersReposGetAppsWithAccessToProtectedBranchEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposGetAppsWithAccessToProtectedBranchEndpoint,
    request: ReposGetAppsWithAccessToProtectedBranchRequestOptions,
    response: OctokitResponse[ReposGetAppsWithAccessToProtectedBranchResponseData]
  ): ParametersReposGetAppsWithAccessToProtectedBranchEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetAppsWithAccessToProtectedBranchEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposGetAppsWithAccessToProtectedBranchEndpointOps[Self <: ParametersReposGetAppsWithAccessToProtectedBranchEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: ReposGetAppsWithAccessToProtectedBranchEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposGetAppsWithAccessToProtectedBranchRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposGetAppsWithAccessToProtectedBranchResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
