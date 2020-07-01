package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.PullsRemoveRequestedReviewersEndpoint
import typings.octokitTypes.endpointsMod.PullsRemoveRequestedReviewersRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersPullsRemoveRequestedReviewersEndpoint extends js.Object {
  var parameters: PullsRemoveRequestedReviewersEndpoint
  var request: PullsRemoveRequestedReviewersRequestOptions
  var response: OctokitResponse[_]
}

object ParametersPullsRemoveRequestedReviewersEndpoint {
  @scala.inline
  def apply(
    parameters: PullsRemoveRequestedReviewersEndpoint,
    request: PullsRemoveRequestedReviewersRequestOptions,
    response: OctokitResponse[_]
  ): ParametersPullsRemoveRequestedReviewersEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPullsRemoveRequestedReviewersEndpoint]
  }
}

