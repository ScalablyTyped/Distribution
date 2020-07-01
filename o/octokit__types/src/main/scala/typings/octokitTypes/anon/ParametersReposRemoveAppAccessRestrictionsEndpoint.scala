package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposRemoveAppAccessRestrictionsEndpoint
import typings.octokitTypes.endpointsMod.ReposRemoveAppAccessRestrictionsRequestOptions
import typings.octokitTypes.endpointsMod.ReposRemoveAppAccessRestrictionsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposRemoveAppAccessRestrictionsEndpoint extends js.Object {
  var parameters: ReposRemoveAppAccessRestrictionsEndpoint
  var request: ReposRemoveAppAccessRestrictionsRequestOptions
  var response: OctokitResponse[ReposRemoveAppAccessRestrictionsResponseData]
}

object ParametersReposRemoveAppAccessRestrictionsEndpoint {
  @scala.inline
  def apply(
    parameters: ReposRemoveAppAccessRestrictionsEndpoint,
    request: ReposRemoveAppAccessRestrictionsRequestOptions,
    response: OctokitResponse[ReposRemoveAppAccessRestrictionsResponseData]
  ): ParametersReposRemoveAppAccessRestrictionsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposRemoveAppAccessRestrictionsEndpoint]
  }
}

