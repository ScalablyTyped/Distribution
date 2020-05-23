package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.IssuesUpdateEndpoint
import typings.octokitTypes.endpointsMod.IssuesUpdateRequestOptions
import typings.octokitTypes.endpointsMod.IssuesUpdateResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersIssuesUpdateEndpoint extends js.Object {
  var parameters: IssuesUpdateEndpoint
  var request: IssuesUpdateRequestOptions
  var response: OctokitResponse[IssuesUpdateResponseData]
}

object ParametersIssuesUpdateEndpoint {
  @scala.inline
  def apply(
    parameters: IssuesUpdateEndpoint,
    request: IssuesUpdateRequestOptions,
    response: OctokitResponse[IssuesUpdateResponseData]
  ): ParametersIssuesUpdateEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesUpdateEndpoint]
  }
}

