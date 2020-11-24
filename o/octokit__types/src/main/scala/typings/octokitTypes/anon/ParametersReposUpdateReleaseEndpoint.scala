package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposUpdateReleaseEndpoint
import typings.octokitTypes.endpointsMod.ReposUpdateReleaseRequestOptions
import typings.octokitTypes.endpointsMod.ReposUpdateReleaseResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposUpdateReleaseEndpoint extends js.Object {
  
  var parameters: ReposUpdateReleaseEndpoint = js.native
  
  var request: ReposUpdateReleaseRequestOptions = js.native
  
  var response: OctokitResponse[ReposUpdateReleaseResponseData] = js.native
}
object ParametersReposUpdateReleaseEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposUpdateReleaseEndpoint,
    request: ReposUpdateReleaseRequestOptions,
    response: OctokitResponse[ReposUpdateReleaseResponseData]
  ): ParametersReposUpdateReleaseEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposUpdateReleaseEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposUpdateReleaseEndpointOps[Self <: ParametersReposUpdateReleaseEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: ReposUpdateReleaseEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposUpdateReleaseRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposUpdateReleaseResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
