package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.IssuesListForOrgEndpoint
import typings.octokitTypes.endpointsMod.IssuesListForOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersIssuesListForOrgEndpoint extends js.Object {
  var parameters: IssuesListForOrgEndpoint
  var response: OctokitResponse[IssuesListForOrgResponseData]
}

object ParametersIssuesListForOrgEndpoint {
  @scala.inline
  def apply(parameters: IssuesListForOrgEndpoint, response: OctokitResponse[IssuesListForOrgResponseData]): ParametersIssuesListForOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesListForOrgEndpoint]
  }
}

