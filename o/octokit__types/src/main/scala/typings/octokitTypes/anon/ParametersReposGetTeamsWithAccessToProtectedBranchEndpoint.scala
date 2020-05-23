package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposGetTeamsWithAccessToProtectedBranchEndpoint
import typings.octokitTypes.endpointsMod.ReposGetTeamsWithAccessToProtectedBranchRequestOptions
import typings.octokitTypes.endpointsMod.ReposGetTeamsWithAccessToProtectedBranchResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposGetTeamsWithAccessToProtectedBranchEndpoint extends js.Object {
  var parameters: ReposGetTeamsWithAccessToProtectedBranchEndpoint
  var request: ReposGetTeamsWithAccessToProtectedBranchRequestOptions
  var response: OctokitResponse[ReposGetTeamsWithAccessToProtectedBranchResponseData]
}

object ParametersReposGetTeamsWithAccessToProtectedBranchEndpoint {
  @scala.inline
  def apply(
    parameters: ReposGetTeamsWithAccessToProtectedBranchEndpoint,
    request: ReposGetTeamsWithAccessToProtectedBranchRequestOptions,
    response: OctokitResponse[ReposGetTeamsWithAccessToProtectedBranchResponseData]
  ): ParametersReposGetTeamsWithAccessToProtectedBranchEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetTeamsWithAccessToProtectedBranchEndpoint]
  }
}

