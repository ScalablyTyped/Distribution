package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.IssuesRemoveLabelEndpoint
import typings.octokitTypes.endpointsMod.IssuesRemoveLabelRequestOptions
import typings.octokitTypes.endpointsMod.IssuesRemoveLabelResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersIssuesRemoveLabelEndpoint extends js.Object {
  var parameters: IssuesRemoveLabelEndpoint
  var request: IssuesRemoveLabelRequestOptions
  var response: OctokitResponse[IssuesRemoveLabelResponseData]
}

object ParametersIssuesRemoveLabelEndpoint {
  @scala.inline
  def apply(
    parameters: IssuesRemoveLabelEndpoint,
    request: IssuesRemoveLabelRequestOptions,
    response: OctokitResponse[IssuesRemoveLabelResponseData]
  ): ParametersIssuesRemoveLabelEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesRemoveLabelEndpoint]
  }
}

