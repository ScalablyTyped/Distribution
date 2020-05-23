package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.MigrationsListForOrgEndpoint
import typings.octokitTypes.endpointsMod.MigrationsListForOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersMigrationsListForOrgEndpoint extends js.Object {
  var parameters: MigrationsListForOrgEndpoint
  var response: OctokitResponse[MigrationsListForOrgResponseData]
}

object ParametersMigrationsListForOrgEndpoint {
  @scala.inline
  def apply(
    parameters: MigrationsListForOrgEndpoint,
    response: OctokitResponse[MigrationsListForOrgResponseData]
  ): ParametersMigrationsListForOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersMigrationsListForOrgEndpoint]
  }
}

