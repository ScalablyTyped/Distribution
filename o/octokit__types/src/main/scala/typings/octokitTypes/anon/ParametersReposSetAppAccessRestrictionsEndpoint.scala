package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposSetAppAccessRestrictionsEndpoint
import typings.octokitTypes.endpointsMod.ReposSetAppAccessRestrictionsRequestOptions
import typings.octokitTypes.endpointsMod.ReposSetAppAccessRestrictionsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposSetAppAccessRestrictionsEndpoint extends js.Object {
  var parameters: ReposSetAppAccessRestrictionsEndpoint
  var request: ReposSetAppAccessRestrictionsRequestOptions
  var response: OctokitResponse[ReposSetAppAccessRestrictionsResponseData]
}

object ParametersReposSetAppAccessRestrictionsEndpoint {
  @scala.inline
  def apply(
    parameters: ReposSetAppAccessRestrictionsEndpoint,
    request: ReposSetAppAccessRestrictionsRequestOptions,
    response: OctokitResponse[ReposSetAppAccessRestrictionsResponseData]
  ): ParametersReposSetAppAccessRestrictionsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposSetAppAccessRestrictionsEndpoint]
  }
}

