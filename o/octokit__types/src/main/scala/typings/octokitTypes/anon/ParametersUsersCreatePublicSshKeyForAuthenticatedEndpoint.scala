package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.UsersCreatePublicSshKeyForAuthenticatedEndpoint
import typings.octokitTypes.endpointsMod.UsersCreatePublicSshKeyForAuthenticatedRequestOptions
import typings.octokitTypes.endpointsMod.UsersCreatePublicSshKeyForAuthenticatedResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersUsersCreatePublicSshKeyForAuthenticatedEndpoint extends js.Object {
  var parameters: UsersCreatePublicSshKeyForAuthenticatedEndpoint
  var request: UsersCreatePublicSshKeyForAuthenticatedRequestOptions
  var response: OctokitResponse[UsersCreatePublicSshKeyForAuthenticatedResponseData]
}

object ParametersUsersCreatePublicSshKeyForAuthenticatedEndpoint {
  @scala.inline
  def apply(
    parameters: UsersCreatePublicSshKeyForAuthenticatedEndpoint,
    request: UsersCreatePublicSshKeyForAuthenticatedRequestOptions,
    response: OctokitResponse[UsersCreatePublicSshKeyForAuthenticatedResponseData]
  ): ParametersUsersCreatePublicSshKeyForAuthenticatedEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersUsersCreatePublicSshKeyForAuthenticatedEndpoint]
  }
}

