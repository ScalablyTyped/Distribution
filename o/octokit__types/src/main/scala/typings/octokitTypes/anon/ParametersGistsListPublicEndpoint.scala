package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.GistsListPublicEndpoint
import typings.octokitTypes.endpointsMod.GistsListPublicRequestOptions
import typings.octokitTypes.endpointsMod.GistsListPublicResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersGistsListPublicEndpoint extends js.Object {
  var parameters: GistsListPublicEndpoint
  var request: GistsListPublicRequestOptions
  var response: OctokitResponse[GistsListPublicResponseData]
}

object ParametersGistsListPublicEndpoint {
  @scala.inline
  def apply(
    parameters: GistsListPublicEndpoint,
    request: GistsListPublicRequestOptions,
    response: OctokitResponse[GistsListPublicResponseData]
  ): ParametersGistsListPublicEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersGistsListPublicEndpoint]
  }
}

