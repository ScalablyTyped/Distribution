package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposGetAppsWithAccessToProtectedBranchEndpoint
import typings.octokitTypes.endpointsMod.ReposGetAppsWithAccessToProtectedBranchRequestOptions
import typings.octokitTypes.endpointsMod.ReposGetAppsWithAccessToProtectedBranchResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposGetAppsWithAccessToProtectedBranchEndpoint extends js.Object {
  var parameters: ReposGetAppsWithAccessToProtectedBranchEndpoint
  var request: ReposGetAppsWithAccessToProtectedBranchRequestOptions
  var response: OctokitResponse[ReposGetAppsWithAccessToProtectedBranchResponseData]
}

object ParametersReposGetAppsWithAccessToProtectedBranchEndpoint {
  @scala.inline
  def apply(
    parameters: ReposGetAppsWithAccessToProtectedBranchEndpoint,
    request: ReposGetAppsWithAccessToProtectedBranchRequestOptions,
    response: OctokitResponse[ReposGetAppsWithAccessToProtectedBranchResponseData]
  ): ParametersReposGetAppsWithAccessToProtectedBranchEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetAppsWithAccessToProtectedBranchEndpoint]
  }
}

