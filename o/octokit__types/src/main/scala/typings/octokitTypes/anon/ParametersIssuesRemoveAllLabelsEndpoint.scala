package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.IssuesRemoveAllLabelsEndpoint
import typings.octokitTypes.endpointsMod.IssuesRemoveAllLabelsRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersIssuesRemoveAllLabelsEndpoint extends js.Object {
  var parameters: IssuesRemoveAllLabelsEndpoint
  var request: IssuesRemoveAllLabelsRequestOptions
  var response: OctokitResponse[_]
}

object ParametersIssuesRemoveAllLabelsEndpoint {
  @scala.inline
  def apply(
    parameters: IssuesRemoveAllLabelsEndpoint,
    request: IssuesRemoveAllLabelsRequestOptions,
    response: OctokitResponse[_]
  ): ParametersIssuesRemoveAllLabelsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesRemoveAllLabelsEndpoint]
  }
}

