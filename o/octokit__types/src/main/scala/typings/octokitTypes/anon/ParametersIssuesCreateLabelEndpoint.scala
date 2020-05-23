package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.IssuesCreateLabelEndpoint
import typings.octokitTypes.endpointsMod.IssuesCreateLabelRequestOptions
import typings.octokitTypes.endpointsMod.IssuesCreateLabelResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersIssuesCreateLabelEndpoint extends js.Object {
  var parameters: IssuesCreateLabelEndpoint
  var request: IssuesCreateLabelRequestOptions
  var response: OctokitResponse[IssuesCreateLabelResponseData]
}

object ParametersIssuesCreateLabelEndpoint {
  @scala.inline
  def apply(
    parameters: IssuesCreateLabelEndpoint,
    request: IssuesCreateLabelRequestOptions,
    response: OctokitResponse[IssuesCreateLabelResponseData]
  ): ParametersIssuesCreateLabelEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesCreateLabelEndpoint]
  }
}

