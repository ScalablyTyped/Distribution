package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OrgsGetEndpoint
import typings.octokitTypes.endpointsMod.OrgsGetRequestOptions
import typings.octokitTypes.endpointsMod.OrgsGetResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersOrgsGetEndpoint extends js.Object {
  var parameters: OrgsGetEndpoint
  var request: OrgsGetRequestOptions
  var response: OctokitResponse[OrgsGetResponseData]
}

object ParametersOrgsGetEndpoint {
  @scala.inline
  def apply(
    parameters: OrgsGetEndpoint,
    request: OrgsGetRequestOptions,
    response: OctokitResponse[OrgsGetResponseData]
  ): ParametersOrgsGetEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsGetEndpoint]
  }
}

