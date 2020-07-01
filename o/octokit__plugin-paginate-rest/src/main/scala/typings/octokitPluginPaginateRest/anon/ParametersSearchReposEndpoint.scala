package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.SearchReposEndpoint
import typings.octokitTypes.endpointsMod.SearchReposResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersSearchReposEndpoint extends js.Object {
  var parameters: SearchReposEndpoint
  var response: OctokitResponse[SearchReposResponseData] with `17`
}

object ParametersSearchReposEndpoint {
  @scala.inline
  def apply(parameters: SearchReposEndpoint, response: OctokitResponse[SearchReposResponseData] with `17`): ParametersSearchReposEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersSearchReposEndpoint]
  }
}

