package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.UsersCheckBlockedEndpoint
import typings.octokitTypes.endpointsMod.UsersCheckBlockedRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersUsersCheckBlockedEndpoint extends js.Object {
  var parameters: UsersCheckBlockedEndpoint
  var request: UsersCheckBlockedRequestOptions
  var response: OctokitResponse[_]
}

object ParametersUsersCheckBlockedEndpoint {
  @scala.inline
  def apply(
    parameters: UsersCheckBlockedEndpoint,
    request: UsersCheckBlockedRequestOptions,
    response: OctokitResponse[_]
  ): ParametersUsersCheckBlockedEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersUsersCheckBlockedEndpoint]
  }
}

