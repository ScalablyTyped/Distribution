package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActivityGetThreadSubscriptionForAuthenticatedUserEndpoint
import typings.octokitTypes.endpointsMod.ActivityGetThreadSubscriptionForAuthenticatedUserRequestOptions
import typings.octokitTypes.endpointsMod.ActivityGetThreadSubscriptionForAuthenticatedUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersActivityGetThreadSubscriptionForAuthenticatedUserEndpoint extends js.Object {
  var parameters: ActivityGetThreadSubscriptionForAuthenticatedUserEndpoint
  var request: ActivityGetThreadSubscriptionForAuthenticatedUserRequestOptions
  var response: OctokitResponse[ActivityGetThreadSubscriptionForAuthenticatedUserResponseData]
}

object ParametersActivityGetThreadSubscriptionForAuthenticatedUserEndpoint {
  @scala.inline
  def apply(
    parameters: ActivityGetThreadSubscriptionForAuthenticatedUserEndpoint,
    request: ActivityGetThreadSubscriptionForAuthenticatedUserRequestOptions,
    response: OctokitResponse[ActivityGetThreadSubscriptionForAuthenticatedUserResponseData]
  ): ParametersActivityGetThreadSubscriptionForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActivityGetThreadSubscriptionForAuthenticatedUserEndpoint]
  }
}

