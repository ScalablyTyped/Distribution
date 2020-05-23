package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.MigrationsUnlockRepoForAuthenticatedUserEndpoint
import typings.octokitTypes.endpointsMod.MigrationsUnlockRepoForAuthenticatedUserRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersMigrationsUnlockRepoForAuthenticatedUserEndpoint extends js.Object {
  var parameters: MigrationsUnlockRepoForAuthenticatedUserEndpoint
  var request: MigrationsUnlockRepoForAuthenticatedUserRequestOptions
  var response: OctokitResponse[_]
}

object ParametersMigrationsUnlockRepoForAuthenticatedUserEndpoint {
  @scala.inline
  def apply(
    parameters: MigrationsUnlockRepoForAuthenticatedUserEndpoint,
    request: MigrationsUnlockRepoForAuthenticatedUserRequestOptions,
    response: OctokitResponse[_]
  ): ParametersMigrationsUnlockRepoForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersMigrationsUnlockRepoForAuthenticatedUserEndpoint]
  }
}

