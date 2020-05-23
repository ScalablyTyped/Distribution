package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.GistsGetRevisionEndpoint
import typings.octokitTypes.endpointsMod.GistsGetRevisionRequestOptions
import typings.octokitTypes.endpointsMod.GistsGetRevisionResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersGistsGetRevisionEndpoint extends js.Object {
  var parameters: GistsGetRevisionEndpoint
  var request: GistsGetRevisionRequestOptions
  var response: OctokitResponse[GistsGetRevisionResponseData]
}

object ParametersGistsGetRevisionEndpoint {
  @scala.inline
  def apply(
    parameters: GistsGetRevisionEndpoint,
    request: GistsGetRevisionRequestOptions,
    response: OctokitResponse[GistsGetRevisionResponseData]
  ): ParametersGistsGetRevisionEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersGistsGetRevisionEndpoint]
  }
}

