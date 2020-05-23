package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.MigrationsListReposForUserEndpoint
import typings.octokitTypes.endpointsMod.MigrationsListReposForUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersMigrationsListReposForUserEndpoint extends js.Object {
  var parameters: MigrationsListReposForUserEndpoint
  var response: OctokitResponse[MigrationsListReposForUserResponseData]
}

object ParametersMigrationsListReposForUserEndpoint {
  @scala.inline
  def apply(
    parameters: MigrationsListReposForUserEndpoint,
    response: OctokitResponse[MigrationsListReposForUserResponseData]
  ): ParametersMigrationsListReposForUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersMigrationsListReposForUserEndpoint]
  }
}

