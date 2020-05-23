package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActivityUnstarRepoForAuthenticatedUserEndpoint
import typings.octokitTypes.endpointsMod.ActivityUnstarRepoForAuthenticatedUserRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersActivityUnstarRepoForAuthenticatedUserEndpoint extends js.Object {
  var parameters: ActivityUnstarRepoForAuthenticatedUserEndpoint
  var request: ActivityUnstarRepoForAuthenticatedUserRequestOptions
  var response: OctokitResponse[_]
}

object ParametersActivityUnstarRepoForAuthenticatedUserEndpoint {
  @scala.inline
  def apply(
    parameters: ActivityUnstarRepoForAuthenticatedUserEndpoint,
    request: ActivityUnstarRepoForAuthenticatedUserRequestOptions,
    response: OctokitResponse[_]
  ): ParametersActivityUnstarRepoForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActivityUnstarRepoForAuthenticatedUserEndpoint]
  }
}

