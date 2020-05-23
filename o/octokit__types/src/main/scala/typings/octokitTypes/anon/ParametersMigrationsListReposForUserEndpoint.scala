package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.MigrationsListReposForUserEndpoint
import typings.octokitTypes.endpointsMod.MigrationsListReposForUserRequestOptions
import typings.octokitTypes.endpointsMod.MigrationsListReposForUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersMigrationsListReposForUserEndpoint extends js.Object {
  var parameters: MigrationsListReposForUserEndpoint
  var request: MigrationsListReposForUserRequestOptions
  var response: OctokitResponse[MigrationsListReposForUserResponseData]
}

object ParametersMigrationsListReposForUserEndpoint {
  @scala.inline
  def apply(
    parameters: MigrationsListReposForUserEndpoint,
    request: MigrationsListReposForUserRequestOptions,
    response: OctokitResponse[MigrationsListReposForUserResponseData]
  ): ParametersMigrationsListReposForUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersMigrationsListReposForUserEndpoint]
  }
}

