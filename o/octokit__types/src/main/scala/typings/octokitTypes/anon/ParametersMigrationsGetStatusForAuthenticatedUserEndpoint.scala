package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.MigrationsGetStatusForAuthenticatedUserEndpoint
import typings.octokitTypes.endpointsMod.MigrationsGetStatusForAuthenticatedUserRequestOptions
import typings.octokitTypes.endpointsMod.MigrationsGetStatusForAuthenticatedUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersMigrationsGetStatusForAuthenticatedUserEndpoint extends js.Object {
  var parameters: MigrationsGetStatusForAuthenticatedUserEndpoint
  var request: MigrationsGetStatusForAuthenticatedUserRequestOptions
  var response: OctokitResponse[MigrationsGetStatusForAuthenticatedUserResponseData]
}

object ParametersMigrationsGetStatusForAuthenticatedUserEndpoint {
  @scala.inline
  def apply(
    parameters: MigrationsGetStatusForAuthenticatedUserEndpoint,
    request: MigrationsGetStatusForAuthenticatedUserRequestOptions,
    response: OctokitResponse[MigrationsGetStatusForAuthenticatedUserResponseData]
  ): ParametersMigrationsGetStatusForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersMigrationsGetStatusForAuthenticatedUserEndpoint]
  }
}

