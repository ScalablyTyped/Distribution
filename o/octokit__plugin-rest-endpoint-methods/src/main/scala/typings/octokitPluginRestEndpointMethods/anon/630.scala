package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.AppsListInstallationsForAuthenticatedUserEndpoint
import typings.octokitTypes.endpointsMod.AppsListInstallationsForAuthenticatedUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `630` extends js.Object {
  var parameters: RequestParameters with (Omit[AppsListInstallationsForAuthenticatedUserEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[AppsListInstallationsForAuthenticatedUserResponseData]
}

object `630` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[AppsListInstallationsForAuthenticatedUserEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[AppsListInstallationsForAuthenticatedUserResponseData]
  ): `630` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`630`]
  }
}

