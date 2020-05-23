package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OrgsBlockUserEndpoint
import typings.octokitTypes.endpointsMod.OrgsBlockUserRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersOrgsBlockUserEndpoint extends js.Object {
  var parameters: OrgsBlockUserEndpoint
  var request: OrgsBlockUserRequestOptions
  var response: OctokitResponse[_]
}

object ParametersOrgsBlockUserEndpoint {
  @scala.inline
  def apply(
    parameters: OrgsBlockUserEndpoint,
    request: OrgsBlockUserRequestOptions,
    response: OctokitResponse[_]
  ): ParametersOrgsBlockUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsBlockUserEndpoint]
  }
}

