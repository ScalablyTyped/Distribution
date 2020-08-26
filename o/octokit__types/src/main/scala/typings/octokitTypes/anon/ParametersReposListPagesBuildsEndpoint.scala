package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposListPagesBuildsEndpoint
import typings.octokitTypes.endpointsMod.ReposListPagesBuildsRequestOptions
import typings.octokitTypes.endpointsMod.ReposListPagesBuildsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersReposListPagesBuildsEndpoint extends js.Object {
  var parameters: ReposListPagesBuildsEndpoint = js.native
  var request: ReposListPagesBuildsRequestOptions = js.native
  var response: OctokitResponse[ReposListPagesBuildsResponseData] = js.native
}

object ParametersReposListPagesBuildsEndpoint {
  @scala.inline
  def apply(
    parameters: ReposListPagesBuildsEndpoint,
    request: ReposListPagesBuildsRequestOptions,
    response: OctokitResponse[ReposListPagesBuildsResponseData]
  ): ParametersReposListPagesBuildsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposListPagesBuildsEndpoint]
  }
  @scala.inline
  implicit class ParametersReposListPagesBuildsEndpointOps[Self <: ParametersReposListPagesBuildsEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: ReposListPagesBuildsEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: ReposListPagesBuildsRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[ReposListPagesBuildsResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

