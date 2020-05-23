package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.UsersTogglePrimaryEmailVisibilityEndpoint
import typings.octokitTypes.endpointsMod.UsersTogglePrimaryEmailVisibilityRequestOptions
import typings.octokitTypes.endpointsMod.UsersTogglePrimaryEmailVisibilityResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersUsersTogglePrimaryEmailVisibilityEndpoint extends js.Object {
  var parameters: UsersTogglePrimaryEmailVisibilityEndpoint
  var request: UsersTogglePrimaryEmailVisibilityRequestOptions
  var response: OctokitResponse[UsersTogglePrimaryEmailVisibilityResponseData]
}

object ParametersUsersTogglePrimaryEmailVisibilityEndpoint {
  @scala.inline
  def apply(
    parameters: UsersTogglePrimaryEmailVisibilityEndpoint,
    request: UsersTogglePrimaryEmailVisibilityRequestOptions,
    response: OctokitResponse[UsersTogglePrimaryEmailVisibilityResponseData]
  ): ParametersUsersTogglePrimaryEmailVisibilityEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersUsersTogglePrimaryEmailVisibilityEndpoint]
  }
}

