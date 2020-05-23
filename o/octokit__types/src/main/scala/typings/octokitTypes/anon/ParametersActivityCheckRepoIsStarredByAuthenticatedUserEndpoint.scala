package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActivityCheckRepoIsStarredByAuthenticatedUserEndpoint
import typings.octokitTypes.endpointsMod.ActivityCheckRepoIsStarredByAuthenticatedUserRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersActivityCheckRepoIsStarredByAuthenticatedUserEndpoint extends js.Object {
  var parameters: ActivityCheckRepoIsStarredByAuthenticatedUserEndpoint
  var request: ActivityCheckRepoIsStarredByAuthenticatedUserRequestOptions
  var response: OctokitResponse[_]
}

object ParametersActivityCheckRepoIsStarredByAuthenticatedUserEndpoint {
  @scala.inline
  def apply(
    parameters: ActivityCheckRepoIsStarredByAuthenticatedUserEndpoint,
    request: ActivityCheckRepoIsStarredByAuthenticatedUserRequestOptions,
    response: OctokitResponse[_]
  ): ParametersActivityCheckRepoIsStarredByAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActivityCheckRepoIsStarredByAuthenticatedUserEndpoint]
  }
}

