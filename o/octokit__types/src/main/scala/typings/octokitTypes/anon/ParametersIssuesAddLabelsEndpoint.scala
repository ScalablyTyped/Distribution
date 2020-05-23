package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.IssuesAddLabelsEndpoint
import typings.octokitTypes.endpointsMod.IssuesAddLabelsRequestOptions
import typings.octokitTypes.endpointsMod.IssuesAddLabelsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersIssuesAddLabelsEndpoint extends js.Object {
  var parameters: IssuesAddLabelsEndpoint
  var request: IssuesAddLabelsRequestOptions
  var response: OctokitResponse[IssuesAddLabelsResponseData]
}

object ParametersIssuesAddLabelsEndpoint {
  @scala.inline
  def apply(
    parameters: IssuesAddLabelsEndpoint,
    request: IssuesAddLabelsRequestOptions,
    response: OctokitResponse[IssuesAddLabelsResponseData]
  ): ParametersIssuesAddLabelsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesAddLabelsEndpoint]
  }
}

