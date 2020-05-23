package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposAddProtectedBranchUserRestrictionsEndpoint
import typings.octokitTypes.endpointsMod.ReposAddProtectedBranchUserRestrictionsRequestOptions
import typings.octokitTypes.endpointsMod.ReposAddProtectedBranchUserRestrictionsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposAddProtectedBranchUserRestrictionsEndpoint extends js.Object {
  var parameters: ReposAddProtectedBranchUserRestrictionsEndpoint
  var request: ReposAddProtectedBranchUserRestrictionsRequestOptions
  var response: OctokitResponse[ReposAddProtectedBranchUserRestrictionsResponseData]
}

object ParametersReposAddProtectedBranchUserRestrictionsEndpoint {
  @scala.inline
  def apply(
    parameters: ReposAddProtectedBranchUserRestrictionsEndpoint,
    request: ReposAddProtectedBranchUserRestrictionsRequestOptions,
    response: OctokitResponse[ReposAddProtectedBranchUserRestrictionsResponseData]
  ): ParametersReposAddProtectedBranchUserRestrictionsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposAddProtectedBranchUserRestrictionsEndpoint]
  }
}

