package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.PullsDeletePendingReviewEndpoint
import typings.octokitTypes.endpointsMod.PullsDeletePendingReviewRequestOptions
import typings.octokitTypes.endpointsMod.PullsDeletePendingReviewResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersPullsDeletePendingReviewEndpoint extends js.Object {
  var parameters: PullsDeletePendingReviewEndpoint = js.native
  var request: PullsDeletePendingReviewRequestOptions = js.native
  var response: OctokitResponse[PullsDeletePendingReviewResponseData] = js.native
}

object ParametersPullsDeletePendingReviewEndpoint {
  @scala.inline
  def apply(
    parameters: PullsDeletePendingReviewEndpoint,
    request: PullsDeletePendingReviewRequestOptions,
    response: OctokitResponse[PullsDeletePendingReviewResponseData]
  ): ParametersPullsDeletePendingReviewEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPullsDeletePendingReviewEndpoint]
  }
  @scala.inline
  implicit class ParametersPullsDeletePendingReviewEndpointOps[Self <: ParametersPullsDeletePendingReviewEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: PullsDeletePendingReviewEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: PullsDeletePendingReviewRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[PullsDeletePendingReviewResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

