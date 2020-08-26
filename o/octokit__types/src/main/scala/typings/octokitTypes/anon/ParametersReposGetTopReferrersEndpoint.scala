package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposGetTopReferrersEndpoint
import typings.octokitTypes.endpointsMod.ReposGetTopReferrersRequestOptions
import typings.octokitTypes.endpointsMod.ReposGetTopReferrersResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersReposGetTopReferrersEndpoint extends js.Object {
  var parameters: ReposGetTopReferrersEndpoint = js.native
  var request: ReposGetTopReferrersRequestOptions = js.native
  var response: OctokitResponse[ReposGetTopReferrersResponseData] = js.native
}

object ParametersReposGetTopReferrersEndpoint {
  @scala.inline
  def apply(
    parameters: ReposGetTopReferrersEndpoint,
    request: ReposGetTopReferrersRequestOptions,
    response: OctokitResponse[ReposGetTopReferrersResponseData]
  ): ParametersReposGetTopReferrersEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetTopReferrersEndpoint]
  }
  @scala.inline
  implicit class ParametersReposGetTopReferrersEndpointOps[Self <: ParametersReposGetTopReferrersEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: ReposGetTopReferrersEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: ReposGetTopReferrersRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[ReposGetTopReferrersResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

