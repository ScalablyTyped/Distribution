package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposRemoveProtectedBranchAppRestrictionsEndpoint
import typings.octokitTypes.endpointsMod.ReposRemoveProtectedBranchAppRestrictionsRequestOptions
import typings.octokitTypes.endpointsMod.ReposRemoveProtectedBranchAppRestrictionsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposRemoveProtectedBranchAppRestrictionsEndpoint extends js.Object {
  var parameters: ReposRemoveProtectedBranchAppRestrictionsEndpoint
  var request: ReposRemoveProtectedBranchAppRestrictionsRequestOptions
  var response: OctokitResponse[ReposRemoveProtectedBranchAppRestrictionsResponseData]
}

object ParametersReposRemoveProtectedBranchAppRestrictionsEndpoint {
  @scala.inline
  def apply(
    parameters: ReposRemoveProtectedBranchAppRestrictionsEndpoint,
    request: ReposRemoveProtectedBranchAppRestrictionsRequestOptions,
    response: OctokitResponse[ReposRemoveProtectedBranchAppRestrictionsResponseData]
  ): ParametersReposRemoveProtectedBranchAppRestrictionsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposRemoveProtectedBranchAppRestrictionsEndpoint]
  }
}

