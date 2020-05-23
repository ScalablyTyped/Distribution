package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.ActivityListReposWatchedByUserEndpoint
import typings.octokitTypes.endpointsMod.ActivityListReposWatchedByUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersActivityListReposWatchedByUserEndpoint extends js.Object {
  var parameters: ActivityListReposWatchedByUserEndpoint
  var response: OctokitResponse[ActivityListReposWatchedByUserResponseData]
}

object ParametersActivityListReposWatchedByUserEndpoint {
  @scala.inline
  def apply(
    parameters: ActivityListReposWatchedByUserEndpoint,
    response: OctokitResponse[ActivityListReposWatchedByUserResponseData]
  ): ParametersActivityListReposWatchedByUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActivityListReposWatchedByUserEndpoint]
  }
}

