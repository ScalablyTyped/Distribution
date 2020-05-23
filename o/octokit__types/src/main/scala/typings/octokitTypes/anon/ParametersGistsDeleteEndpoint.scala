package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.GistsDeleteEndpoint
import typings.octokitTypes.endpointsMod.GistsDeleteRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersGistsDeleteEndpoint extends js.Object {
  var parameters: GistsDeleteEndpoint
  var request: GistsDeleteRequestOptions
  var response: OctokitResponse[_]
}

object ParametersGistsDeleteEndpoint {
  @scala.inline
  def apply(parameters: GistsDeleteEndpoint, request: GistsDeleteRequestOptions, response: OctokitResponse[_]): ParametersGistsDeleteEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersGistsDeleteEndpoint]
  }
}

