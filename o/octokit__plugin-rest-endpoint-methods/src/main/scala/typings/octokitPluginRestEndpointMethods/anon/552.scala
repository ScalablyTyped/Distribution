package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ActionsGetOrgPublicKeyEndpoint
import typings.octokitTypes.endpointsMod.ActionsGetOrgPublicKeyResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `552` extends js.Object {
  var parameters: RequestParameters with (Omit[ActionsGetOrgPublicKeyEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[ActionsGetOrgPublicKeyResponseData]
}

object `552` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ActionsGetOrgPublicKeyEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ActionsGetOrgPublicKeyResponseData]
  ): `552` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`552`]
  }
}

