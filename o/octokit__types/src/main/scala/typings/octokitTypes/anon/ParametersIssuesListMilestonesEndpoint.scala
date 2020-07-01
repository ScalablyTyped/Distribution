package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.IssuesListMilestonesEndpoint
import typings.octokitTypes.endpointsMod.IssuesListMilestonesRequestOptions
import typings.octokitTypes.endpointsMod.IssuesListMilestonesResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersIssuesListMilestonesEndpoint extends js.Object {
  var parameters: IssuesListMilestonesEndpoint
  var request: IssuesListMilestonesRequestOptions
  var response: OctokitResponse[IssuesListMilestonesResponseData]
}

object ParametersIssuesListMilestonesEndpoint {
  @scala.inline
  def apply(
    parameters: IssuesListMilestonesEndpoint,
    request: IssuesListMilestonesRequestOptions,
    response: OctokitResponse[IssuesListMilestonesResponseData]
  ): ParametersIssuesListMilestonesEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesListMilestonesEndpoint]
  }
}

