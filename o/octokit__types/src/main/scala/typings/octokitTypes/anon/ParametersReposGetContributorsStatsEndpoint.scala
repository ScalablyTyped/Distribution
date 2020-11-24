package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposGetContributorsStatsEndpoint
import typings.octokitTypes.endpointsMod.ReposGetContributorsStatsRequestOptions
import typings.octokitTypes.endpointsMod.ReposGetContributorsStatsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposGetContributorsStatsEndpoint extends js.Object {
  
  var parameters: ReposGetContributorsStatsEndpoint = js.native
  
  var request: ReposGetContributorsStatsRequestOptions = js.native
  
  var response: OctokitResponse[ReposGetContributorsStatsResponseData] = js.native
}
object ParametersReposGetContributorsStatsEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposGetContributorsStatsEndpoint,
    request: ReposGetContributorsStatsRequestOptions,
    response: OctokitResponse[ReposGetContributorsStatsResponseData]
  ): ParametersReposGetContributorsStatsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetContributorsStatsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposGetContributorsStatsEndpointOps[Self <: ParametersReposGetContributorsStatsEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: ReposGetContributorsStatsEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposGetContributorsStatsRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposGetContributorsStatsResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
