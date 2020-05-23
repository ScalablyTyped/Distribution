package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.MigrationsStartForAuthenticatedUserEndpoint
import typings.octokitTypes.endpointsMod.MigrationsStartForAuthenticatedUserRequestOptions
import typings.octokitTypes.endpointsMod.MigrationsStartForAuthenticatedUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersMigrationsStartForAuthenticatedUserEndpoint extends js.Object {
  var parameters: MigrationsStartForAuthenticatedUserEndpoint
  var request: MigrationsStartForAuthenticatedUserRequestOptions
  var response: OctokitResponse[MigrationsStartForAuthenticatedUserResponseData]
}

object ParametersMigrationsStartForAuthenticatedUserEndpoint {
  @scala.inline
  def apply(
    parameters: MigrationsStartForAuthenticatedUserEndpoint,
    request: MigrationsStartForAuthenticatedUserRequestOptions,
    response: OctokitResponse[MigrationsStartForAuthenticatedUserResponseData]
  ): ParametersMigrationsStartForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersMigrationsStartForAuthenticatedUserEndpoint]
  }
}

