package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.ReposListTagsEndpoint
import typings.octokitTypes.endpointsMod.ReposListTagsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposListTagsEndpoint extends js.Object {
  var parameters: ReposListTagsEndpoint
  var response: OctokitResponse[ReposListTagsResponseData]
}

object ParametersReposListTagsEndpoint {
  @scala.inline
  def apply(parameters: ReposListTagsEndpoint, response: OctokitResponse[ReposListTagsResponseData]): ParametersReposListTagsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposListTagsEndpoint]
  }
}

