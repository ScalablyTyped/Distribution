package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.GistsUnstarEndpoint
import typings.octokitTypes.endpointsMod.GistsUnstarRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersGistsUnstarEndpoint extends js.Object {
  var parameters: GistsUnstarEndpoint
  var request: GistsUnstarRequestOptions
  var response: OctokitResponse[_]
}

object ParametersGistsUnstarEndpoint {
  @scala.inline
  def apply(parameters: GistsUnstarEndpoint, request: GistsUnstarRequestOptions, response: OctokitResponse[_]): ParametersGistsUnstarEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersGistsUnstarEndpoint]
  }
}

