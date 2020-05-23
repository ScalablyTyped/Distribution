package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposCreateDispatchEventEndpoint
import typings.octokitTypes.endpointsMod.ReposCreateDispatchEventRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposCreateDispatchEventEndpoint extends js.Object {
  var parameters: ReposCreateDispatchEventEndpoint
  var request: ReposCreateDispatchEventRequestOptions
  var response: OctokitResponse[_]
}

object ParametersReposCreateDispatchEventEndpoint {
  @scala.inline
  def apply(
    parameters: ReposCreateDispatchEventEndpoint,
    request: ReposCreateDispatchEventRequestOptions,
    response: OctokitResponse[_]
  ): ParametersReposCreateDispatchEventEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposCreateDispatchEventEndpoint]
  }
}

