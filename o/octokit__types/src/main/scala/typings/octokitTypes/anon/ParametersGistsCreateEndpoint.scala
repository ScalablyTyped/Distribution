package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.GistsCreateEndpoint
import typings.octokitTypes.endpointsMod.GistsCreateRequestOptions
import typings.octokitTypes.endpointsMod.GistsCreateResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersGistsCreateEndpoint extends js.Object {
  var parameters: GistsCreateEndpoint
  var request: GistsCreateRequestOptions
  var response: OctokitResponse[GistsCreateResponseData]
}

object ParametersGistsCreateEndpoint {
  @scala.inline
  def apply(
    parameters: GistsCreateEndpoint,
    request: GistsCreateRequestOptions,
    response: OctokitResponse[GistsCreateResponseData]
  ): ParametersGistsCreateEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersGistsCreateEndpoint]
  }
}

