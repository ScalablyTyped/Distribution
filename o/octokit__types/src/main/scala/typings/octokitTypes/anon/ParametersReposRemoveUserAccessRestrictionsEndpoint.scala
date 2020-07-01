package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposRemoveUserAccessRestrictionsEndpoint
import typings.octokitTypes.endpointsMod.ReposRemoveUserAccessRestrictionsRequestOptions
import typings.octokitTypes.endpointsMod.ReposRemoveUserAccessRestrictionsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposRemoveUserAccessRestrictionsEndpoint extends js.Object {
  var parameters: ReposRemoveUserAccessRestrictionsEndpoint
  var request: ReposRemoveUserAccessRestrictionsRequestOptions
  var response: OctokitResponse[ReposRemoveUserAccessRestrictionsResponseData]
}

object ParametersReposRemoveUserAccessRestrictionsEndpoint {
  @scala.inline
  def apply(
    parameters: ReposRemoveUserAccessRestrictionsEndpoint,
    request: ReposRemoveUserAccessRestrictionsRequestOptions,
    response: OctokitResponse[ReposRemoveUserAccessRestrictionsResponseData]
  ): ParametersReposRemoveUserAccessRestrictionsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposRemoveUserAccessRestrictionsEndpoint]
  }
}

