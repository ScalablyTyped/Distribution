package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActivityMarkRepoNotificationsAsReadEndpoint
import typings.octokitTypes.endpointsMod.ActivityMarkRepoNotificationsAsReadRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersActivityMarkRepoNotificationsAsReadEndpoint extends js.Object {
  var parameters: ActivityMarkRepoNotificationsAsReadEndpoint
  var request: ActivityMarkRepoNotificationsAsReadRequestOptions
  var response: OctokitResponse[_]
}

object ParametersActivityMarkRepoNotificationsAsReadEndpoint {
  @scala.inline
  def apply(
    parameters: ActivityMarkRepoNotificationsAsReadEndpoint,
    request: ActivityMarkRepoNotificationsAsReadRequestOptions,
    response: OctokitResponse[_]
  ): ParametersActivityMarkRepoNotificationsAsReadEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActivityMarkRepoNotificationsAsReadEndpoint]
  }
}

