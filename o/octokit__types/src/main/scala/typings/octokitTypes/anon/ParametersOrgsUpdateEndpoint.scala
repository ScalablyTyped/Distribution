package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OrgsUpdateEndpoint
import typings.octokitTypes.endpointsMod.OrgsUpdateRequestOptions
import typings.octokitTypes.endpointsMod.OrgsUpdateResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersOrgsUpdateEndpoint extends js.Object {
  var parameters: OrgsUpdateEndpoint
  var request: OrgsUpdateRequestOptions
  var response: OctokitResponse[OrgsUpdateResponseData]
}

object ParametersOrgsUpdateEndpoint {
  @scala.inline
  def apply(
    parameters: OrgsUpdateEndpoint,
    request: OrgsUpdateRequestOptions,
    response: OctokitResponse[OrgsUpdateResponseData]
  ): ParametersOrgsUpdateEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsUpdateEndpoint]
  }
}

