package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.IssuesReplaceAllLabelsEndpoint
import typings.octokitTypes.endpointsMod.IssuesReplaceAllLabelsRequestOptions
import typings.octokitTypes.endpointsMod.IssuesReplaceAllLabelsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersIssuesReplaceAllLabelsEndpoint extends js.Object {
  var parameters: IssuesReplaceAllLabelsEndpoint
  var request: IssuesReplaceAllLabelsRequestOptions
  var response: OctokitResponse[IssuesReplaceAllLabelsResponseData]
}

object ParametersIssuesReplaceAllLabelsEndpoint {
  @scala.inline
  def apply(
    parameters: IssuesReplaceAllLabelsEndpoint,
    request: IssuesReplaceAllLabelsRequestOptions,
    response: OctokitResponse[IssuesReplaceAllLabelsResponseData]
  ): ParametersIssuesReplaceAllLabelsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesReplaceAllLabelsEndpoint]
  }
}

