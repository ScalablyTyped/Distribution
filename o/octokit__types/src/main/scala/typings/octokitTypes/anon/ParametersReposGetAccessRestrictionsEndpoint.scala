package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposGetAccessRestrictionsEndpoint
import typings.octokitTypes.endpointsMod.ReposGetAccessRestrictionsRequestOptions
import typings.octokitTypes.endpointsMod.ReposGetAccessRestrictionsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposGetAccessRestrictionsEndpoint extends js.Object {
  var parameters: ReposGetAccessRestrictionsEndpoint
  var request: ReposGetAccessRestrictionsRequestOptions
  var response: OctokitResponse[ReposGetAccessRestrictionsResponseData]
}

object ParametersReposGetAccessRestrictionsEndpoint {
  @scala.inline
  def apply(
    parameters: ReposGetAccessRestrictionsEndpoint,
    request: ReposGetAccessRestrictionsRequestOptions,
    response: OctokitResponse[ReposGetAccessRestrictionsResponseData]
  ): ParametersReposGetAccessRestrictionsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetAccessRestrictionsEndpoint]
  }
}

