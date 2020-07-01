package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.IssuesSetLabelsEndpoint
import typings.octokitTypes.endpointsMod.IssuesSetLabelsRequestOptions
import typings.octokitTypes.endpointsMod.IssuesSetLabelsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersIssuesSetLabelsEndpoint extends js.Object {
  var parameters: IssuesSetLabelsEndpoint
  var request: IssuesSetLabelsRequestOptions
  var response: OctokitResponse[IssuesSetLabelsResponseData]
}

object ParametersIssuesSetLabelsEndpoint {
  @scala.inline
  def apply(
    parameters: IssuesSetLabelsEndpoint,
    request: IssuesSetLabelsRequestOptions,
    response: OctokitResponse[IssuesSetLabelsResponseData]
  ): ParametersIssuesSetLabelsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesSetLabelsEndpoint]
  }
}

