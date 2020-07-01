package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.SearchUsersEndpoint
import typings.octokitTypes.endpointsMod.SearchUsersResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersSearchUsersEndpoint extends js.Object {
  var parameters: SearchUsersEndpoint
  var response: OctokitResponse[SearchUsersResponseData] with `19`
}

object ParametersSearchUsersEndpoint {
  @scala.inline
  def apply(parameters: SearchUsersEndpoint, response: OctokitResponse[SearchUsersResponseData] with `19`): ParametersSearchUsersEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersSearchUsersEndpoint]
  }
}

