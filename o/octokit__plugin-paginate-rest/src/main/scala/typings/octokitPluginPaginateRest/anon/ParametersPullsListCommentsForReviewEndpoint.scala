package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.PullsListCommentsForReviewEndpoint
import typings.octokitTypes.endpointsMod.PullsListCommentsForReviewResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersPullsListCommentsForReviewEndpoint extends js.Object {
  var parameters: PullsListCommentsForReviewEndpoint = js.native
  var response: OctokitResponse[PullsListCommentsForReviewResponseData] = js.native
}

object ParametersPullsListCommentsForReviewEndpoint {
  @scala.inline
  def apply(
    parameters: PullsListCommentsForReviewEndpoint,
    response: OctokitResponse[PullsListCommentsForReviewResponseData]
  ): ParametersPullsListCommentsForReviewEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPullsListCommentsForReviewEndpoint]
  }
  @scala.inline
  implicit class ParametersPullsListCommentsForReviewEndpointOps[Self <: ParametersPullsListCommentsForReviewEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: PullsListCommentsForReviewEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[PullsListCommentsForReviewResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

