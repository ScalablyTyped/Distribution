package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.AppsGetAuthenticatedEndpoint
import typings.octokitTypes.endpointsMod.AppsGetAuthenticatedResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `620` extends js.Object {
  var parameters: RequestParameters with (Omit[AppsGetAuthenticatedEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[AppsGetAuthenticatedResponseData]
}

object `620` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[AppsGetAuthenticatedEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[AppsGetAuthenticatedResponseData]
  ): `620` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`620`]
  }
}

