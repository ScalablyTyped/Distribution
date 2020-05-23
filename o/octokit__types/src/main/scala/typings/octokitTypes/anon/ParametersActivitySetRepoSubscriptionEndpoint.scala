package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActivitySetRepoSubscriptionEndpoint
import typings.octokitTypes.endpointsMod.ActivitySetRepoSubscriptionRequestOptions
import typings.octokitTypes.endpointsMod.ActivitySetRepoSubscriptionResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersActivitySetRepoSubscriptionEndpoint extends js.Object {
  var parameters: ActivitySetRepoSubscriptionEndpoint
  var request: ActivitySetRepoSubscriptionRequestOptions
  var response: OctokitResponse[ActivitySetRepoSubscriptionResponseData]
}

object ParametersActivitySetRepoSubscriptionEndpoint {
  @scala.inline
  def apply(
    parameters: ActivitySetRepoSubscriptionEndpoint,
    request: ActivitySetRepoSubscriptionRequestOptions,
    response: OctokitResponse[ActivitySetRepoSubscriptionResponseData]
  ): ParametersActivitySetRepoSubscriptionEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActivitySetRepoSubscriptionEndpoint]
  }
}

