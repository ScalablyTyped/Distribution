package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposGetPunchCardStatsEndpoint
import typings.octokitTypes.endpointsMod.ReposGetPunchCardStatsRequestOptions
import typings.octokitTypes.endpointsMod.ReposGetPunchCardStatsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposGetPunchCardStatsEndpoint extends js.Object {
  
  var parameters: ReposGetPunchCardStatsEndpoint = js.native
  
  var request: ReposGetPunchCardStatsRequestOptions = js.native
  
  var response: OctokitResponse[ReposGetPunchCardStatsResponseData] = js.native
}
object ParametersReposGetPunchCardStatsEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposGetPunchCardStatsEndpoint,
    request: ReposGetPunchCardStatsRequestOptions,
    response: OctokitResponse[ReposGetPunchCardStatsResponseData]
  ): ParametersReposGetPunchCardStatsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetPunchCardStatsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposGetPunchCardStatsEndpointOps[Self <: ParametersReposGetPunchCardStatsEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: ReposGetPunchCardStatsEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposGetPunchCardStatsRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposGetPunchCardStatsResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
