package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposDeleteAccessRestrictionsEndpoint
import typings.octokitTypes.endpointsMod.ReposDeleteAccessRestrictionsRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposDeleteAccessRestrictionsEndpoint extends js.Object {
  var parameters: ReposDeleteAccessRestrictionsEndpoint
  var request: ReposDeleteAccessRestrictionsRequestOptions
  var response: OctokitResponse[_]
}

object ParametersReposDeleteAccessRestrictionsEndpoint {
  @scala.inline
  def apply(
    parameters: ReposDeleteAccessRestrictionsEndpoint,
    request: ReposDeleteAccessRestrictionsRequestOptions,
    response: OctokitResponse[_]
  ): ParametersReposDeleteAccessRestrictionsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposDeleteAccessRestrictionsEndpoint]
  }
}

