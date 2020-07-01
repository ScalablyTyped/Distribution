package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ActionsGetRepoSecretEndpoint
import typings.octokitTypes.endpointsMod.ActionsGetRepoSecretResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `556` extends js.Object {
  var parameters: RequestParameters with (Omit[ActionsGetRepoSecretEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[ActionsGetRepoSecretResponseData]
}

object `556` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ActionsGetRepoSecretEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ActionsGetRepoSecretResponseData]
  ): `556` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`556`]
  }
}

