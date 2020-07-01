package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposAddAppAccessRestrictionsEndpoint
import typings.octokitTypes.endpointsMod.ReposAddAppAccessRestrictionsRequestOptions
import typings.octokitTypes.endpointsMod.ReposAddAppAccessRestrictionsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposAddAppAccessRestrictionsEndpoint extends js.Object {
  var parameters: ReposAddAppAccessRestrictionsEndpoint
  var request: ReposAddAppAccessRestrictionsRequestOptions
  var response: OctokitResponse[ReposAddAppAccessRestrictionsResponseData]
}

object ParametersReposAddAppAccessRestrictionsEndpoint {
  @scala.inline
  def apply(
    parameters: ReposAddAppAccessRestrictionsEndpoint,
    request: ReposAddAppAccessRestrictionsRequestOptions,
    response: OctokitResponse[ReposAddAppAccessRestrictionsResponseData]
  ): ParametersReposAddAppAccessRestrictionsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposAddAppAccessRestrictionsEndpoint]
  }
}

