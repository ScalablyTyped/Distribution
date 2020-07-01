package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposCreateForAuthenticatedUserEndpoint
import typings.octokitTypes.endpointsMod.ReposCreateForAuthenticatedUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `890` extends js.Object {
  var parameters: RequestParameters with (Omit[ReposCreateForAuthenticatedUserEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[ReposCreateForAuthenticatedUserResponseData]
}

object `890` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ReposCreateForAuthenticatedUserEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposCreateForAuthenticatedUserResponseData]
  ): `890` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`890`]
  }
}

