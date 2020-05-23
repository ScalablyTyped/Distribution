package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposAddProtectedBranchAppRestrictionsEndpoint
import typings.octokitTypes.endpointsMod.ReposAddProtectedBranchAppRestrictionsRequestOptions
import typings.octokitTypes.endpointsMod.ReposAddProtectedBranchAppRestrictionsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposAddProtectedBranchAppRestrictionsEndpoint extends js.Object {
  var parameters: ReposAddProtectedBranchAppRestrictionsEndpoint
  var request: ReposAddProtectedBranchAppRestrictionsRequestOptions
  var response: OctokitResponse[ReposAddProtectedBranchAppRestrictionsResponseData]
}

object ParametersReposAddProtectedBranchAppRestrictionsEndpoint {
  @scala.inline
  def apply(
    parameters: ReposAddProtectedBranchAppRestrictionsEndpoint,
    request: ReposAddProtectedBranchAppRestrictionsRequestOptions,
    response: OctokitResponse[ReposAddProtectedBranchAppRestrictionsResponseData]
  ): ParametersReposAddProtectedBranchAppRestrictionsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposAddProtectedBranchAppRestrictionsEndpoint]
  }
}

