package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.ReposListForOrgEndpoint
import typings.octokitTypes.endpointsMod.ReposListForOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposListForOrgEndpoint extends js.Object {
  var parameters: ReposListForOrgEndpoint
  var response: OctokitResponse[ReposListForOrgResponseData]
}

object ParametersReposListForOrgEndpoint {
  @scala.inline
  def apply(parameters: ReposListForOrgEndpoint, response: OctokitResponse[ReposListForOrgResponseData]): ParametersReposListForOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposListForOrgEndpoint]
  }
}

