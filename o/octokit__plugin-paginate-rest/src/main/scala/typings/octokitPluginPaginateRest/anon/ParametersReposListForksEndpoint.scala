package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.ReposListForksEndpoint
import typings.octokitTypes.endpointsMod.ReposListForksResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposListForksEndpoint extends js.Object {
  var parameters: ReposListForksEndpoint
  var response: OctokitResponse[ReposListForksResponseData]
}

object ParametersReposListForksEndpoint {
  @scala.inline
  def apply(parameters: ReposListForksEndpoint, response: OctokitResponse[ReposListForksResponseData]): ParametersReposListForksEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposListForksEndpoint]
  }
}

