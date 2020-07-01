package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.UsersCheckPersonIsFollowedByAuthenticatedEndpoint
import typings.octokitTypes.endpointsMod.UsersCheckPersonIsFollowedByAuthenticatedRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersUsersCheckPersonIsFollowedByAuthenticatedEndpoint extends js.Object {
  var parameters: UsersCheckPersonIsFollowedByAuthenticatedEndpoint
  var request: UsersCheckPersonIsFollowedByAuthenticatedRequestOptions
  var response: OctokitResponse[_]
}

object ParametersUsersCheckPersonIsFollowedByAuthenticatedEndpoint {
  @scala.inline
  def apply(
    parameters: UsersCheckPersonIsFollowedByAuthenticatedEndpoint,
    request: UsersCheckPersonIsFollowedByAuthenticatedRequestOptions,
    response: OctokitResponse[_]
  ): ParametersUsersCheckPersonIsFollowedByAuthenticatedEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersUsersCheckPersonIsFollowedByAuthenticatedEndpoint]
  }
}

