package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposCreateForkEndpoint
import typings.octokitTypes.endpointsMod.ReposCreateForkRequestOptions
import typings.octokitTypes.endpointsMod.ReposCreateForkResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposCreateForkEndpoint extends js.Object {
  var parameters: ReposCreateForkEndpoint
  var request: ReposCreateForkRequestOptions
  var response: OctokitResponse[ReposCreateForkResponseData]
}

object ParametersReposCreateForkEndpoint {
  @scala.inline
  def apply(
    parameters: ReposCreateForkEndpoint,
    request: ReposCreateForkRequestOptions,
    response: OctokitResponse[ReposCreateForkResponseData]
  ): ParametersReposCreateForkEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposCreateForkEndpoint]
  }
}

