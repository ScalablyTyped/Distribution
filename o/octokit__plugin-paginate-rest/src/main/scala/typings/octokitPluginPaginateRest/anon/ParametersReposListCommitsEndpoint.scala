package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.ReposListCommitsEndpoint
import typings.octokitTypes.endpointsMod.ReposListCommitsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposListCommitsEndpoint extends js.Object {
  var parameters: ReposListCommitsEndpoint
  var response: OctokitResponse[ReposListCommitsResponseData]
}

object ParametersReposListCommitsEndpoint {
  @scala.inline
  def apply(parameters: ReposListCommitsEndpoint, response: OctokitResponse[ReposListCommitsResponseData]): ParametersReposListCommitsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposListCommitsEndpoint]
  }
}

