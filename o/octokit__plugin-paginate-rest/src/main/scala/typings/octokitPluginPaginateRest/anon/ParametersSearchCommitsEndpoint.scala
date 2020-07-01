package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.SearchCommitsEndpoint
import typings.octokitTypes.endpointsMod.SearchCommitsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersSearchCommitsEndpoint extends js.Object {
  var parameters: SearchCommitsEndpoint
  var response: OctokitResponse[SearchCommitsResponseData] with `14`
}

object ParametersSearchCommitsEndpoint {
  @scala.inline
  def apply(parameters: SearchCommitsEndpoint, response: OctokitResponse[SearchCommitsResponseData] with `14`): ParametersSearchCommitsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersSearchCommitsEndpoint]
  }
}

