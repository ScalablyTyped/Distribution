package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ActionsListRepoSecretsEndpoint
import typings.octokitTypes.endpointsMod.ActionsListRepoSecretsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `567` extends js.Object {
  var parameters: RequestParameters with (Omit[ActionsListRepoSecretsEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[ActionsListRepoSecretsResponseData]
}

object `567` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ActionsListRepoSecretsEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ActionsListRepoSecretsResponseData]
  ): `567` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`567`]
  }
}

