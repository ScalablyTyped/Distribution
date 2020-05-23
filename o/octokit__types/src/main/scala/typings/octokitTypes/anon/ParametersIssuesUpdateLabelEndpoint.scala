package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.IssuesUpdateLabelEndpoint
import typings.octokitTypes.endpointsMod.IssuesUpdateLabelRequestOptions
import typings.octokitTypes.endpointsMod.IssuesUpdateLabelResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersIssuesUpdateLabelEndpoint extends js.Object {
  var parameters: IssuesUpdateLabelEndpoint
  var request: IssuesUpdateLabelRequestOptions
  var response: OctokitResponse[IssuesUpdateLabelResponseData]
}

object ParametersIssuesUpdateLabelEndpoint {
  @scala.inline
  def apply(
    parameters: IssuesUpdateLabelEndpoint,
    request: IssuesUpdateLabelRequestOptions,
    response: OctokitResponse[IssuesUpdateLabelResponseData]
  ): ParametersIssuesUpdateLabelEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesUpdateLabelEndpoint]
  }
}

