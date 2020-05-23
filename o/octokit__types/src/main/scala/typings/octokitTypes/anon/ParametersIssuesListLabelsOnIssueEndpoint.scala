package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.IssuesListLabelsOnIssueEndpoint
import typings.octokitTypes.endpointsMod.IssuesListLabelsOnIssueRequestOptions
import typings.octokitTypes.endpointsMod.IssuesListLabelsOnIssueResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersIssuesListLabelsOnIssueEndpoint extends js.Object {
  var parameters: IssuesListLabelsOnIssueEndpoint
  var request: IssuesListLabelsOnIssueRequestOptions
  var response: OctokitResponse[IssuesListLabelsOnIssueResponseData]
}

object ParametersIssuesListLabelsOnIssueEndpoint {
  @scala.inline
  def apply(
    parameters: IssuesListLabelsOnIssueEndpoint,
    request: IssuesListLabelsOnIssueRequestOptions,
    response: OctokitResponse[IssuesListLabelsOnIssueResponseData]
  ): ParametersIssuesListLabelsOnIssueEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesListLabelsOnIssueEndpoint]
  }
}

