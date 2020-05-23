package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.MigrationsListForAuthenticatedUserEndpoint
import typings.octokitTypes.endpointsMod.MigrationsListForAuthenticatedUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersMigrationsListForAuthenticatedUserEndpoint extends js.Object {
  var parameters: MigrationsListForAuthenticatedUserEndpoint
  var response: OctokitResponse[MigrationsListForAuthenticatedUserResponseData]
}

object ParametersMigrationsListForAuthenticatedUserEndpoint {
  @scala.inline
  def apply(
    parameters: MigrationsListForAuthenticatedUserEndpoint,
    response: OctokitResponse[MigrationsListForAuthenticatedUserResponseData]
  ): ParametersMigrationsListForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersMigrationsListForAuthenticatedUserEndpoint]
  }
}

