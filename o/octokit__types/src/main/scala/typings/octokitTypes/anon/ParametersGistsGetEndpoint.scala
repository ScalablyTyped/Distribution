package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.GistsGetEndpoint
import typings.octokitTypes.endpointsMod.GistsGetRequestOptions
import typings.octokitTypes.endpointsMod.GistsGetResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersGistsGetEndpoint extends js.Object {
  var parameters: GistsGetEndpoint
  var request: GistsGetRequestOptions
  var response: OctokitResponse[GistsGetResponseData]
}

object ParametersGistsGetEndpoint {
  @scala.inline
  def apply(
    parameters: GistsGetEndpoint,
    request: GistsGetRequestOptions,
    response: OctokitResponse[GistsGetResponseData]
  ): ParametersGistsGetEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersGistsGetEndpoint]
  }
}

