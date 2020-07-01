package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.UsersSetPrimaryEmailVisibilityForAuthenticatedEndpoint
import typings.octokitTypes.endpointsMod.UsersSetPrimaryEmailVisibilityForAuthenticatedRequestOptions
import typings.octokitTypes.endpointsMod.UsersSetPrimaryEmailVisibilityForAuthenticatedResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersUsersSetPrimaryEmailVisibilityForAuthenticatedEndpoint extends js.Object {
  var parameters: UsersSetPrimaryEmailVisibilityForAuthenticatedEndpoint
  var request: UsersSetPrimaryEmailVisibilityForAuthenticatedRequestOptions
  var response: OctokitResponse[UsersSetPrimaryEmailVisibilityForAuthenticatedResponseData]
}

object ParametersUsersSetPrimaryEmailVisibilityForAuthenticatedEndpoint {
  @scala.inline
  def apply(
    parameters: UsersSetPrimaryEmailVisibilityForAuthenticatedEndpoint,
    request: UsersSetPrimaryEmailVisibilityForAuthenticatedRequestOptions,
    response: OctokitResponse[UsersSetPrimaryEmailVisibilityForAuthenticatedResponseData]
  ): ParametersUsersSetPrimaryEmailVisibilityForAuthenticatedEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersUsersSetPrimaryEmailVisibilityForAuthenticatedEndpoint]
  }
}

