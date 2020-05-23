package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.ActivityListWatchersForRepoEndpoint
import typings.octokitTypes.endpointsMod.ActivityListWatchersForRepoResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersActivityListWatchersForRepoEndpoint extends js.Object {
  var parameters: ActivityListWatchersForRepoEndpoint
  var response: OctokitResponse[ActivityListWatchersForRepoResponseData]
}

object ParametersActivityListWatchersForRepoEndpoint {
  @scala.inline
  def apply(
    parameters: ActivityListWatchersForRepoEndpoint,
    response: OctokitResponse[ActivityListWatchersForRepoResponseData]
  ): ParametersActivityListWatchersForRepoEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActivityListWatchersForRepoEndpoint]
  }
}

