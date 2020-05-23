package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposGetUsersWithAccessToProtectedBranchEndpoint
import typings.octokitTypes.endpointsMod.ReposGetUsersWithAccessToProtectedBranchRequestOptions
import typings.octokitTypes.endpointsMod.ReposGetUsersWithAccessToProtectedBranchResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposGetUsersWithAccessToProtectedBranchEndpoint extends js.Object {
  var parameters: ReposGetUsersWithAccessToProtectedBranchEndpoint
  var request: ReposGetUsersWithAccessToProtectedBranchRequestOptions
  var response: OctokitResponse[ReposGetUsersWithAccessToProtectedBranchResponseData]
}

object ParametersReposGetUsersWithAccessToProtectedBranchEndpoint {
  @scala.inline
  def apply(
    parameters: ReposGetUsersWithAccessToProtectedBranchEndpoint,
    request: ReposGetUsersWithAccessToProtectedBranchRequestOptions,
    response: OctokitResponse[ReposGetUsersWithAccessToProtectedBranchResponseData]
  ): ParametersReposGetUsersWithAccessToProtectedBranchEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetUsersWithAccessToProtectedBranchEndpoint]
  }
}

