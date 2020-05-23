package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActivityStarRepoForAuthenticatedUserEndpoint
import typings.octokitTypes.endpointsMod.ActivityStarRepoForAuthenticatedUserRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersActivityStarRepoForAuthenticatedUserEndpoint extends js.Object {
  var parameters: ActivityStarRepoForAuthenticatedUserEndpoint
  var request: ActivityStarRepoForAuthenticatedUserRequestOptions
  var response: OctokitResponse[_]
}

object ParametersActivityStarRepoForAuthenticatedUserEndpoint {
  @scala.inline
  def apply(
    parameters: ActivityStarRepoForAuthenticatedUserEndpoint,
    request: ActivityStarRepoForAuthenticatedUserRequestOptions,
    response: OctokitResponse[_]
  ): ParametersActivityStarRepoForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActivityStarRepoForAuthenticatedUserEndpoint]
  }
}

