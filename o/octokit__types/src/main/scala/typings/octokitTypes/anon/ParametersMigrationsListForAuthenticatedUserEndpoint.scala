package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.MigrationsListForAuthenticatedUserEndpoint
import typings.octokitTypes.endpointsMod.MigrationsListForAuthenticatedUserRequestOptions
import typings.octokitTypes.endpointsMod.MigrationsListForAuthenticatedUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersMigrationsListForAuthenticatedUserEndpoint extends js.Object {
  var parameters: MigrationsListForAuthenticatedUserEndpoint
  var request: MigrationsListForAuthenticatedUserRequestOptions
  var response: OctokitResponse[MigrationsListForAuthenticatedUserResponseData]
}

object ParametersMigrationsListForAuthenticatedUserEndpoint {
  @scala.inline
  def apply(
    parameters: MigrationsListForAuthenticatedUserEndpoint,
    request: MigrationsListForAuthenticatedUserRequestOptions,
    response: OctokitResponse[MigrationsListForAuthenticatedUserResponseData]
  ): ParametersMigrationsListForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersMigrationsListForAuthenticatedUserEndpoint]
  }
}

