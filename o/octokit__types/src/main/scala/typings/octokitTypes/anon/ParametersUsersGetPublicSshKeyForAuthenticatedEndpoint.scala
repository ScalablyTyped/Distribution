package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.UsersGetPublicSshKeyForAuthenticatedEndpoint
import typings.octokitTypes.endpointsMod.UsersGetPublicSshKeyForAuthenticatedRequestOptions
import typings.octokitTypes.endpointsMod.UsersGetPublicSshKeyForAuthenticatedResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersUsersGetPublicSshKeyForAuthenticatedEndpoint extends js.Object {
  var parameters: UsersGetPublicSshKeyForAuthenticatedEndpoint
  var request: UsersGetPublicSshKeyForAuthenticatedRequestOptions
  var response: OctokitResponse[UsersGetPublicSshKeyForAuthenticatedResponseData]
}

object ParametersUsersGetPublicSshKeyForAuthenticatedEndpoint {
  @scala.inline
  def apply(
    parameters: UsersGetPublicSshKeyForAuthenticatedEndpoint,
    request: UsersGetPublicSshKeyForAuthenticatedRequestOptions,
    response: OctokitResponse[UsersGetPublicSshKeyForAuthenticatedResponseData]
  ): ParametersUsersGetPublicSshKeyForAuthenticatedEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersUsersGetPublicSshKeyForAuthenticatedEndpoint]
  }
}

