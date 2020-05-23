package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.MigrationsListReposForOrgEndpoint
import typings.octokitTypes.endpointsMod.MigrationsListReposForOrgRequestOptions
import typings.octokitTypes.endpointsMod.MigrationsListReposForOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersMigrationsListReposForOrgEndpoint extends js.Object {
  var parameters: MigrationsListReposForOrgEndpoint
  var request: MigrationsListReposForOrgRequestOptions
  var response: OctokitResponse[MigrationsListReposForOrgResponseData]
}

object ParametersMigrationsListReposForOrgEndpoint {
  @scala.inline
  def apply(
    parameters: MigrationsListReposForOrgEndpoint,
    request: MigrationsListReposForOrgRequestOptions,
    response: OctokitResponse[MigrationsListReposForOrgResponseData]
  ): ParametersMigrationsListReposForOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersMigrationsListReposForOrgEndpoint]
  }
}

