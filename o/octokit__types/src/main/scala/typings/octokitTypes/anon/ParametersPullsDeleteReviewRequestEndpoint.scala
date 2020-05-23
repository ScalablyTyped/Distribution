package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.PullsDeleteReviewRequestEndpoint
import typings.octokitTypes.endpointsMod.PullsDeleteReviewRequestRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersPullsDeleteReviewRequestEndpoint extends js.Object {
  var parameters: PullsDeleteReviewRequestEndpoint
  var request: PullsDeleteReviewRequestRequestOptions
  var response: OctokitResponse[_]
}

object ParametersPullsDeleteReviewRequestEndpoint {
  @scala.inline
  def apply(
    parameters: PullsDeleteReviewRequestEndpoint,
    request: PullsDeleteReviewRequestRequestOptions,
    response: OctokitResponse[_]
  ): ParametersPullsDeleteReviewRequestEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPullsDeleteReviewRequestEndpoint]
  }
}

