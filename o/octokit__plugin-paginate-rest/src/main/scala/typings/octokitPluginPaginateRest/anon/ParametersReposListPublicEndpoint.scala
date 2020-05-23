package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.ReposListPublicEndpoint
import typings.octokitTypes.endpointsMod.ReposListPublicResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposListPublicEndpoint extends js.Object {
  var parameters: ReposListPublicEndpoint
  var response: OctokitResponse[ReposListPublicResponseData]
}

object ParametersReposListPublicEndpoint {
  @scala.inline
  def apply(parameters: ReposListPublicEndpoint, response: OctokitResponse[ReposListPublicResponseData]): ParametersReposListPublicEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposListPublicEndpoint]
  }
}

