package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.SearchUsersEndpoint
import typings.octokitTypes.endpointsMod.SearchUsersRequestOptions
import typings.octokitTypes.endpointsMod.SearchUsersResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersSearchUsersEndpoint extends js.Object {
  var parameters: SearchUsersEndpoint
  var request: SearchUsersRequestOptions
  var response: OctokitResponse[SearchUsersResponseData]
}

object ParametersSearchUsersEndpoint {
  @scala.inline
  def apply(
    parameters: SearchUsersEndpoint,
    request: SearchUsersRequestOptions,
    response: OctokitResponse[SearchUsersResponseData]
  ): ParametersSearchUsersEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersSearchUsersEndpoint]
  }
}

