package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.MigrationsUnlockRepoForOrgEndpoint
import typings.octokitTypes.endpointsMod.MigrationsUnlockRepoForOrgRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersMigrationsUnlockRepoForOrgEndpoint extends js.Object {
  var parameters: MigrationsUnlockRepoForOrgEndpoint
  var request: MigrationsUnlockRepoForOrgRequestOptions
  var response: OctokitResponse[_]
}

object ParametersMigrationsUnlockRepoForOrgEndpoint {
  @scala.inline
  def apply(
    parameters: MigrationsUnlockRepoForOrgEndpoint,
    request: MigrationsUnlockRepoForOrgRequestOptions,
    response: OctokitResponse[_]
  ): ParametersMigrationsUnlockRepoForOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersMigrationsUnlockRepoForOrgEndpoint]
  }
}

