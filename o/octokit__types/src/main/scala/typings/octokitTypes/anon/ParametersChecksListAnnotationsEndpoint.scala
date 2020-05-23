package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ChecksListAnnotationsEndpoint
import typings.octokitTypes.endpointsMod.ChecksListAnnotationsRequestOptions
import typings.octokitTypes.endpointsMod.ChecksListAnnotationsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersChecksListAnnotationsEndpoint extends js.Object {
  var parameters: ChecksListAnnotationsEndpoint
  var request: ChecksListAnnotationsRequestOptions
  var response: OctokitResponse[ChecksListAnnotationsResponseData]
}

object ParametersChecksListAnnotationsEndpoint {
  @scala.inline
  def apply(
    parameters: ChecksListAnnotationsEndpoint,
    request: ChecksListAnnotationsRequestOptions,
    response: OctokitResponse[ChecksListAnnotationsResponseData]
  ): ParametersChecksListAnnotationsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersChecksListAnnotationsEndpoint]
  }
}

