package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.GistsListForksEndpoint
import typings.octokitTypes.endpointsMod.GistsListForksRequestOptions
import typings.octokitTypes.endpointsMod.GistsListForksResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersGistsListForksEndpoint extends js.Object {
  var parameters: GistsListForksEndpoint
  var request: GistsListForksRequestOptions
  var response: OctokitResponse[GistsListForksResponseData]
}

object ParametersGistsListForksEndpoint {
  @scala.inline
  def apply(
    parameters: GistsListForksEndpoint,
    request: GistsListForksRequestOptions,
    response: OctokitResponse[GistsListForksResponseData]
  ): ParametersGistsListForksEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersGistsListForksEndpoint]
  }
}

