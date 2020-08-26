package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposGetCommunityProfileMetricsEndpoint
import typings.octokitTypes.endpointsMod.ReposGetCommunityProfileMetricsRequestOptions
import typings.octokitTypes.endpointsMod.ReposGetCommunityProfileMetricsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersReposGetCommunityProfileMetricsEndpoint extends js.Object {
  var parameters: ReposGetCommunityProfileMetricsEndpoint = js.native
  var request: ReposGetCommunityProfileMetricsRequestOptions = js.native
  var response: OctokitResponse[ReposGetCommunityProfileMetricsResponseData] = js.native
}

object ParametersReposGetCommunityProfileMetricsEndpoint {
  @scala.inline
  def apply(
    parameters: ReposGetCommunityProfileMetricsEndpoint,
    request: ReposGetCommunityProfileMetricsRequestOptions,
    response: OctokitResponse[ReposGetCommunityProfileMetricsResponseData]
  ): ParametersReposGetCommunityProfileMetricsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetCommunityProfileMetricsEndpoint]
  }
  @scala.inline
  implicit class ParametersReposGetCommunityProfileMetricsEndpointOps[Self <: ParametersReposGetCommunityProfileMetricsEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: ReposGetCommunityProfileMetricsEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: ReposGetCommunityProfileMetricsRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[ReposGetCommunityProfileMetricsResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

