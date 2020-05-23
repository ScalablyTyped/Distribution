package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.IssuesListEndpoint
import typings.octokitTypes.endpointsMod.IssuesListResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersIssuesListEndpoint extends js.Object {
  var parameters: IssuesListEndpoint
  var response: OctokitResponse[IssuesListResponseData]
}

object ParametersIssuesListEndpoint {
  @scala.inline
  def apply(parameters: IssuesListEndpoint, response: OctokitResponse[IssuesListResponseData]): ParametersIssuesListEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesListEndpoint]
  }
}

