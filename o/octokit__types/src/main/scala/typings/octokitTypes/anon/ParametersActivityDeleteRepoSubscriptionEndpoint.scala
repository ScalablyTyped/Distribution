package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActivityDeleteRepoSubscriptionEndpoint
import typings.octokitTypes.endpointsMod.ActivityDeleteRepoSubscriptionRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersActivityDeleteRepoSubscriptionEndpoint extends js.Object {
  var parameters: ActivityDeleteRepoSubscriptionEndpoint
  var request: ActivityDeleteRepoSubscriptionRequestOptions
  var response: OctokitResponse[_]
}

object ParametersActivityDeleteRepoSubscriptionEndpoint {
  @scala.inline
  def apply(
    parameters: ActivityDeleteRepoSubscriptionEndpoint,
    request: ActivityDeleteRepoSubscriptionRequestOptions,
    response: OctokitResponse[_]
  ): ParametersActivityDeleteRepoSubscriptionEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActivityDeleteRepoSubscriptionEndpoint]
  }
}

