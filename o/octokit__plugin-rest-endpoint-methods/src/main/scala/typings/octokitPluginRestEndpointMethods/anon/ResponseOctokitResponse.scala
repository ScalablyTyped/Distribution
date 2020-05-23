package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ActionsCreateOrUpdateRepoSecretEndpoint
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseOctokitResponse extends js.Object {
  var parameters: RequestParameters with (Omit[ActionsCreateOrUpdateRepoSecretEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[_]
}

object ResponseOctokitResponse {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ActionsCreateOrUpdateRepoSecretEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[_]
  ): ResponseOctokitResponse = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseOctokitResponse]
  }
}

