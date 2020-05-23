package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposListTeamsEndpoint
import typings.octokitTypes.endpointsMod.ReposListTeamsRequestOptions
import typings.octokitTypes.endpointsMod.ReposListTeamsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposListTeamsEndpoint extends js.Object {
  var parameters: ReposListTeamsEndpoint
  var request: ReposListTeamsRequestOptions
  var response: OctokitResponse[ReposListTeamsResponseData]
}

object ParametersReposListTeamsEndpoint {
  @scala.inline
  def apply(
    parameters: ReposListTeamsEndpoint,
    request: ReposListTeamsRequestOptions,
    response: OctokitResponse[ReposListTeamsResponseData]
  ): ParametersReposListTeamsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposListTeamsEndpoint]
  }
}

