package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActivityGetRepoSubscriptionEndpoint
import typings.octokitTypes.endpointsMod.ActivityGetRepoSubscriptionRequestOptions
import typings.octokitTypes.endpointsMod.ActivityGetRepoSubscriptionResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersActivityGetRepoSubscriptionEndpoint extends js.Object {
  var parameters: ActivityGetRepoSubscriptionEndpoint
  var request: ActivityGetRepoSubscriptionRequestOptions
  var response: OctokitResponse[ActivityGetRepoSubscriptionResponseData]
}

object ParametersActivityGetRepoSubscriptionEndpoint {
  @scala.inline
  def apply(
    parameters: ActivityGetRepoSubscriptionEndpoint,
    request: ActivityGetRepoSubscriptionRequestOptions,
    response: OctokitResponse[ActivityGetRepoSubscriptionResponseData]
  ): ParametersActivityGetRepoSubscriptionEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActivityGetRepoSubscriptionEndpoint]
  }
}

