package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.MigrationsDeleteArchiveForAuthenticatedUserEndpoint
import typings.octokitTypes.endpointsMod.MigrationsDeleteArchiveForAuthenticatedUserRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersMigrationsDeleteArchiveForAuthenticatedUserEndpoint extends js.Object {
  var parameters: MigrationsDeleteArchiveForAuthenticatedUserEndpoint
  var request: MigrationsDeleteArchiveForAuthenticatedUserRequestOptions
  var response: OctokitResponse[_]
}

object ParametersMigrationsDeleteArchiveForAuthenticatedUserEndpoint {
  @scala.inline
  def apply(
    parameters: MigrationsDeleteArchiveForAuthenticatedUserEndpoint,
    request: MigrationsDeleteArchiveForAuthenticatedUserRequestOptions,
    response: OctokitResponse[_]
  ): ParametersMigrationsDeleteArchiveForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersMigrationsDeleteArchiveForAuthenticatedUserEndpoint]
  }
}

