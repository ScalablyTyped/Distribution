package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposGetCodeFrequencyStatsEndpoint
import typings.octokitTypes.endpointsMod.ReposGetCodeFrequencyStatsRequestOptions
import typings.octokitTypes.endpointsMod.ReposGetCodeFrequencyStatsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersReposGetCodeFrequencyStatsEndpoint extends js.Object {
  var parameters: ReposGetCodeFrequencyStatsEndpoint = js.native
  var request: ReposGetCodeFrequencyStatsRequestOptions = js.native
  var response: OctokitResponse[ReposGetCodeFrequencyStatsResponseData] = js.native
}

object ParametersReposGetCodeFrequencyStatsEndpoint {
  @scala.inline
  def apply(
    parameters: ReposGetCodeFrequencyStatsEndpoint,
    request: ReposGetCodeFrequencyStatsRequestOptions,
    response: OctokitResponse[ReposGetCodeFrequencyStatsResponseData]
  ): ParametersReposGetCodeFrequencyStatsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetCodeFrequencyStatsEndpoint]
  }
  @scala.inline
  implicit class ParametersReposGetCodeFrequencyStatsEndpointOps[Self <: ParametersReposGetCodeFrequencyStatsEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: ReposGetCodeFrequencyStatsEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: ReposGetCodeFrequencyStatsRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[ReposGetCodeFrequencyStatsResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

