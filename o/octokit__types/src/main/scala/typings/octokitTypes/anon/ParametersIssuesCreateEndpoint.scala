package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.IssuesCreateEndpoint
import typings.octokitTypes.endpointsMod.IssuesCreateRequestOptions
import typings.octokitTypes.endpointsMod.IssuesCreateResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersIssuesCreateEndpoint extends js.Object {
  var parameters: IssuesCreateEndpoint
  var request: IssuesCreateRequestOptions
  var response: OctokitResponse[IssuesCreateResponseData]
}

object ParametersIssuesCreateEndpoint {
  @scala.inline
  def apply(
    parameters: IssuesCreateEndpoint,
    request: IssuesCreateRequestOptions,
    response: OctokitResponse[IssuesCreateResponseData]
  ): ParametersIssuesCreateEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesCreateEndpoint]
  }
}

