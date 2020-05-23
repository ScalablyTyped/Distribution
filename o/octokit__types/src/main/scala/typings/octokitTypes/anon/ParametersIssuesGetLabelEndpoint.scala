package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.IssuesGetLabelEndpoint
import typings.octokitTypes.endpointsMod.IssuesGetLabelRequestOptions
import typings.octokitTypes.endpointsMod.IssuesGetLabelResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersIssuesGetLabelEndpoint extends js.Object {
  var parameters: IssuesGetLabelEndpoint
  var request: IssuesGetLabelRequestOptions
  var response: OctokitResponse[IssuesGetLabelResponseData]
}

object ParametersIssuesGetLabelEndpoint {
  @scala.inline
  def apply(
    parameters: IssuesGetLabelEndpoint,
    request: IssuesGetLabelRequestOptions,
    response: OctokitResponse[IssuesGetLabelResponseData]
  ): ParametersIssuesGetLabelEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesGetLabelEndpoint]
  }
}

