package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.PullsRequestReviewersEndpoint
import typings.octokitTypes.endpointsMod.PullsRequestReviewersRequestOptions
import typings.octokitTypes.endpointsMod.PullsRequestReviewersResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersPullsRequestReviewersEndpoint extends js.Object {
  var parameters: PullsRequestReviewersEndpoint = js.native
  var request: PullsRequestReviewersRequestOptions = js.native
  var response: OctokitResponse[PullsRequestReviewersResponseData] = js.native
}

object ParametersPullsRequestReviewersEndpoint {
  @scala.inline
  def apply(
    parameters: PullsRequestReviewersEndpoint,
    request: PullsRequestReviewersRequestOptions,
    response: OctokitResponse[PullsRequestReviewersResponseData]
  ): ParametersPullsRequestReviewersEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPullsRequestReviewersEndpoint]
  }
  @scala.inline
  implicit class ParametersPullsRequestReviewersEndpointOps[Self <: ParametersPullsRequestReviewersEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: PullsRequestReviewersEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: PullsRequestReviewersRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[PullsRequestReviewersResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

