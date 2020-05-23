package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.GistsForkEndpoint
import typings.octokitTypes.endpointsMod.GistsForkRequestOptions
import typings.octokitTypes.endpointsMod.GistsForkResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersGistsForkEndpoint extends js.Object {
  var parameters: GistsForkEndpoint
  var request: GistsForkRequestOptions
  var response: OctokitResponse[GistsForkResponseData]
}

object ParametersGistsForkEndpoint {
  @scala.inline
  def apply(
    parameters: GistsForkEndpoint,
    request: GistsForkRequestOptions,
    response: OctokitResponse[GistsForkResponseData]
  ): ParametersGistsForkEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersGistsForkEndpoint]
  }
}

