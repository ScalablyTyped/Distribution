package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.EmojisGetEndpoint
import typings.octokitTypes.endpointsMod.EmojisGetRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersEmojisGetEndpoint extends js.Object {
  var parameters: EmojisGetEndpoint
  var request: EmojisGetRequestOptions
  var response: OctokitResponse[_]
}

object ParametersEmojisGetEndpoint {
  @scala.inline
  def apply(parameters: EmojisGetEndpoint, request: EmojisGetRequestOptions, response: OctokitResponse[_]): ParametersEmojisGetEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersEmojisGetEndpoint]
  }
}

