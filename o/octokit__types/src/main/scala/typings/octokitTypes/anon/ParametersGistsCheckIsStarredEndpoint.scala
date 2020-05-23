package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.GistsCheckIsStarredEndpoint
import typings.octokitTypes.endpointsMod.GistsCheckIsStarredRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersGistsCheckIsStarredEndpoint extends js.Object {
  var parameters: GistsCheckIsStarredEndpoint
  var request: GistsCheckIsStarredRequestOptions
  var response: OctokitResponse[_]
}

object ParametersGistsCheckIsStarredEndpoint {
  @scala.inline
  def apply(
    parameters: GistsCheckIsStarredEndpoint,
    request: GistsCheckIsStarredRequestOptions,
    response: OctokitResponse[_]
  ): ParametersGistsCheckIsStarredEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersGistsCheckIsStarredEndpoint]
  }
}

