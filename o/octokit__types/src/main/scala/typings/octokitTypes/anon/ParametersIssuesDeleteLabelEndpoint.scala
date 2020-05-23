package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.IssuesDeleteLabelEndpoint
import typings.octokitTypes.endpointsMod.IssuesDeleteLabelRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersIssuesDeleteLabelEndpoint extends js.Object {
  var parameters: IssuesDeleteLabelEndpoint
  var request: IssuesDeleteLabelRequestOptions
  var response: OctokitResponse[_]
}

object ParametersIssuesDeleteLabelEndpoint {
  @scala.inline
  def apply(
    parameters: IssuesDeleteLabelEndpoint,
    request: IssuesDeleteLabelRequestOptions,
    response: OctokitResponse[_]
  ): ParametersIssuesDeleteLabelEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesDeleteLabelEndpoint]
  }
}

