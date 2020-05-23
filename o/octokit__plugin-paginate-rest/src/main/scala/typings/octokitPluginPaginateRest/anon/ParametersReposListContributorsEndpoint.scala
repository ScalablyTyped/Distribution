package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.ReposListContributorsEndpoint
import typings.octokitTypes.endpointsMod.ReposListContributorsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposListContributorsEndpoint extends js.Object {
  var parameters: ReposListContributorsEndpoint
  var response: OctokitResponse[ReposListContributorsResponseData]
}

object ParametersReposListContributorsEndpoint {
  @scala.inline
  def apply(
    parameters: ReposListContributorsEndpoint,
    response: OctokitResponse[ReposListContributorsResponseData]
  ): ParametersReposListContributorsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposListContributorsEndpoint]
  }
}

