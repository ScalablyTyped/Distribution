package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.MigrationsGetArchiveForAuthenticatedUserEndpoint
import typings.octokitTypes.endpointsMod.MigrationsGetArchiveForAuthenticatedUserRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersMigrationsGetArchiveForAuthenticatedUserEndpoint extends js.Object {
  var parameters: MigrationsGetArchiveForAuthenticatedUserEndpoint
  var request: MigrationsGetArchiveForAuthenticatedUserRequestOptions
  var response: OctokitResponse[_]
}

object ParametersMigrationsGetArchiveForAuthenticatedUserEndpoint {
  @scala.inline
  def apply(
    parameters: MigrationsGetArchiveForAuthenticatedUserEndpoint,
    request: MigrationsGetArchiveForAuthenticatedUserRequestOptions,
    response: OctokitResponse[_]
  ): ParametersMigrationsGetArchiveForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersMigrationsGetArchiveForAuthenticatedUserEndpoint]
  }
}

