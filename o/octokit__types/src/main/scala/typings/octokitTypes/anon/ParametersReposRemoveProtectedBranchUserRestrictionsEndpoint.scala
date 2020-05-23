package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposRemoveProtectedBranchUserRestrictionsEndpoint
import typings.octokitTypes.endpointsMod.ReposRemoveProtectedBranchUserRestrictionsRequestOptions
import typings.octokitTypes.endpointsMod.ReposRemoveProtectedBranchUserRestrictionsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposRemoveProtectedBranchUserRestrictionsEndpoint extends js.Object {
  var parameters: ReposRemoveProtectedBranchUserRestrictionsEndpoint
  var request: ReposRemoveProtectedBranchUserRestrictionsRequestOptions
  var response: OctokitResponse[ReposRemoveProtectedBranchUserRestrictionsResponseData]
}

object ParametersReposRemoveProtectedBranchUserRestrictionsEndpoint {
  @scala.inline
  def apply(
    parameters: ReposRemoveProtectedBranchUserRestrictionsEndpoint,
    request: ReposRemoveProtectedBranchUserRestrictionsRequestOptions,
    response: OctokitResponse[ReposRemoveProtectedBranchUserRestrictionsResponseData]
  ): ParametersReposRemoveProtectedBranchUserRestrictionsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposRemoveProtectedBranchUserRestrictionsEndpoint]
  }
}

