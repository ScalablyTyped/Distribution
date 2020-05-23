package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.GistsUpdateEndpoint
import typings.octokitTypes.endpointsMod.GistsUpdateRequestOptions
import typings.octokitTypes.endpointsMod.GistsUpdateResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersGistsUpdateEndpoint extends js.Object {
  var parameters: GistsUpdateEndpoint
  var request: GistsUpdateRequestOptions
  var response: OctokitResponse[GistsUpdateResponseData]
}

object ParametersGistsUpdateEndpoint {
  @scala.inline
  def apply(
    parameters: GistsUpdateEndpoint,
    request: GistsUpdateRequestOptions,
    response: OctokitResponse[GistsUpdateResponseData]
  ): ParametersGistsUpdateEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersGistsUpdateEndpoint]
  }
}

