package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposAddUserAccessRestrictionsEndpoint
import typings.octokitTypes.endpointsMod.ReposAddUserAccessRestrictionsRequestOptions
import typings.octokitTypes.endpointsMod.ReposAddUserAccessRestrictionsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposAddUserAccessRestrictionsEndpoint extends js.Object {
  var parameters: ReposAddUserAccessRestrictionsEndpoint
  var request: ReposAddUserAccessRestrictionsRequestOptions
  var response: OctokitResponse[ReposAddUserAccessRestrictionsResponseData]
}

object ParametersReposAddUserAccessRestrictionsEndpoint {
  @scala.inline
  def apply(
    parameters: ReposAddUserAccessRestrictionsEndpoint,
    request: ReposAddUserAccessRestrictionsRequestOptions,
    response: OctokitResponse[ReposAddUserAccessRestrictionsResponseData]
  ): ParametersReposAddUserAccessRestrictionsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposAddUserAccessRestrictionsEndpoint]
  }
}

