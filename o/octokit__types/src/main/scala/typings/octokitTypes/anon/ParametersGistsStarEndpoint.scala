package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.GistsStarEndpoint
import typings.octokitTypes.endpointsMod.GistsStarRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersGistsStarEndpoint extends js.Object {
  var parameters: GistsStarEndpoint
  var request: GistsStarRequestOptions
  var response: OctokitResponse[_]
}

object ParametersGistsStarEndpoint {
  @scala.inline
  def apply(parameters: GistsStarEndpoint, request: GistsStarRequestOptions, response: OctokitResponse[_]): ParametersGistsStarEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersGistsStarEndpoint]
  }
}

