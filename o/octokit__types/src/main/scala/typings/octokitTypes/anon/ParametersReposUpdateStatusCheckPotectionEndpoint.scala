package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposUpdateStatusCheckPotectionEndpoint
import typings.octokitTypes.endpointsMod.ReposUpdateStatusCheckPotectionRequestOptions
import typings.octokitTypes.endpointsMod.ReposUpdateStatusCheckPotectionResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposUpdateStatusCheckPotectionEndpoint extends js.Object {
  var parameters: ReposUpdateStatusCheckPotectionEndpoint
  var request: ReposUpdateStatusCheckPotectionRequestOptions
  var response: OctokitResponse[ReposUpdateStatusCheckPotectionResponseData]
}

object ParametersReposUpdateStatusCheckPotectionEndpoint {
  @scala.inline
  def apply(
    parameters: ReposUpdateStatusCheckPotectionEndpoint,
    request: ReposUpdateStatusCheckPotectionRequestOptions,
    response: OctokitResponse[ReposUpdateStatusCheckPotectionResponseData]
  ): ParametersReposUpdateStatusCheckPotectionEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposUpdateStatusCheckPotectionEndpoint]
  }
}

