package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.IssuesGetEventEndpoint
import typings.octokitTypes.endpointsMod.IssuesGetEventRequestOptions
import typings.octokitTypes.endpointsMod.IssuesGetEventResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersIssuesGetEventEndpoint extends js.Object {
  var parameters: IssuesGetEventEndpoint
  var request: IssuesGetEventRequestOptions
  var response: OctokitResponse[IssuesGetEventResponseData]
}

object ParametersIssuesGetEventEndpoint {
  @scala.inline
  def apply(
    parameters: IssuesGetEventEndpoint,
    request: IssuesGetEventRequestOptions,
    response: OctokitResponse[IssuesGetEventResponseData]
  ): ParametersIssuesGetEventEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesGetEventEndpoint]
  }
}

