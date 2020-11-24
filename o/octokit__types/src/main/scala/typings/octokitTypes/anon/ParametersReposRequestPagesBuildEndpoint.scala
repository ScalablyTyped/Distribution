package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposRequestPagesBuildEndpoint
import typings.octokitTypes.endpointsMod.ReposRequestPagesBuildRequestOptions
import typings.octokitTypes.endpointsMod.ReposRequestPagesBuildResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposRequestPagesBuildEndpoint extends js.Object {
  
  var parameters: ReposRequestPagesBuildEndpoint = js.native
  
  var request: ReposRequestPagesBuildRequestOptions = js.native
  
  var response: OctokitResponse[ReposRequestPagesBuildResponseData] = js.native
}
object ParametersReposRequestPagesBuildEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposRequestPagesBuildEndpoint,
    request: ReposRequestPagesBuildRequestOptions,
    response: OctokitResponse[ReposRequestPagesBuildResponseData]
  ): ParametersReposRequestPagesBuildEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposRequestPagesBuildEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposRequestPagesBuildEndpointOps[Self <: ParametersReposRequestPagesBuildEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: ReposRequestPagesBuildEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposRequestPagesBuildRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposRequestPagesBuildResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
