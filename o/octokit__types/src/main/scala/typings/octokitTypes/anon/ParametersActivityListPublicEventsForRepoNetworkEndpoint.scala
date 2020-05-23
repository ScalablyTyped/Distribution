package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActivityListPublicEventsForRepoNetworkEndpoint
import typings.octokitTypes.endpointsMod.ActivityListPublicEventsForRepoNetworkRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersActivityListPublicEventsForRepoNetworkEndpoint extends js.Object {
  var parameters: ActivityListPublicEventsForRepoNetworkEndpoint
  var request: ActivityListPublicEventsForRepoNetworkRequestOptions
  var response: OctokitResponse[_]
}

object ParametersActivityListPublicEventsForRepoNetworkEndpoint {
  @scala.inline
  def apply(
    parameters: ActivityListPublicEventsForRepoNetworkEndpoint,
    request: ActivityListPublicEventsForRepoNetworkRequestOptions,
    response: OctokitResponse[_]
  ): ParametersActivityListPublicEventsForRepoNetworkEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActivityListPublicEventsForRepoNetworkEndpoint]
  }
}

