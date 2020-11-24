package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposGetReleaseEndpoint
import typings.octokitTypes.endpointsMod.ReposGetReleaseRequestOptions
import typings.octokitTypes.endpointsMod.ReposGetReleaseResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposGetReleaseEndpoint extends js.Object {
  
  var parameters: ReposGetReleaseEndpoint = js.native
  
  var request: ReposGetReleaseRequestOptions = js.native
  
  var response: OctokitResponse[ReposGetReleaseResponseData] = js.native
}
object ParametersReposGetReleaseEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposGetReleaseEndpoint,
    request: ReposGetReleaseRequestOptions,
    response: OctokitResponse[ReposGetReleaseResponseData]
  ): ParametersReposGetReleaseEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetReleaseEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposGetReleaseEndpointOps[Self <: ParametersReposGetReleaseEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: ReposGetReleaseEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposGetReleaseRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposGetReleaseResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
