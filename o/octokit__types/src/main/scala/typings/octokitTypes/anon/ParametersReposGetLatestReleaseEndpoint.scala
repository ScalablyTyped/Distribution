package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposGetLatestReleaseEndpoint
import typings.octokitTypes.endpointsMod.ReposGetLatestReleaseRequestOptions
import typings.octokitTypes.endpointsMod.ReposGetLatestReleaseResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposGetLatestReleaseEndpoint extends js.Object {
  
  var parameters: ReposGetLatestReleaseEndpoint = js.native
  
  var request: ReposGetLatestReleaseRequestOptions = js.native
  
  var response: OctokitResponse[ReposGetLatestReleaseResponseData] = js.native
}
object ParametersReposGetLatestReleaseEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposGetLatestReleaseEndpoint,
    request: ReposGetLatestReleaseRequestOptions,
    response: OctokitResponse[ReposGetLatestReleaseResponseData]
  ): ParametersReposGetLatestReleaseEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetLatestReleaseEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposGetLatestReleaseEndpointOps[Self <: ParametersReposGetLatestReleaseEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: ReposGetLatestReleaseEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposGetLatestReleaseRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposGetLatestReleaseResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
