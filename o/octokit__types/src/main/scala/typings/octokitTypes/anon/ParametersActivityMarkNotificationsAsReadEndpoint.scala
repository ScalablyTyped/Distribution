package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActivityMarkNotificationsAsReadEndpoint
import typings.octokitTypes.endpointsMod.ActivityMarkNotificationsAsReadRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersActivityMarkNotificationsAsReadEndpoint extends js.Object {
  var parameters: ActivityMarkNotificationsAsReadEndpoint
  var request: ActivityMarkNotificationsAsReadRequestOptions
  var response: OctokitResponse[_]
}

object ParametersActivityMarkNotificationsAsReadEndpoint {
  @scala.inline
  def apply(
    parameters: ActivityMarkNotificationsAsReadEndpoint,
    request: ActivityMarkNotificationsAsReadRequestOptions,
    response: OctokitResponse[_]
  ): ParametersActivityMarkNotificationsAsReadEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActivityMarkNotificationsAsReadEndpoint]
  }
}

