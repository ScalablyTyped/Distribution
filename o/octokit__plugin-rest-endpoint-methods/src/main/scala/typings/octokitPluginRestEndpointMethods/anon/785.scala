package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.OrgsListInstallationsEndpoint
import typings.octokitTypes.endpointsMod.OrgsListInstallationsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `785` extends js.Object {
  var parameters: RequestParameters with (Omit[OrgsListInstallationsEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[OrgsListInstallationsResponseData]
}

object `785` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[OrgsListInstallationsEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[OrgsListInstallationsResponseData]
  ): `785` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`785`]
  }
}

