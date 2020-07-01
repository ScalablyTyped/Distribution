package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposSetUserAccessRestrictionsEndpoint
import typings.octokitTypes.endpointsMod.ReposSetUserAccessRestrictionsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `1000` extends js.Object {
  var parameters: RequestParameters with (Omit[ReposSetUserAccessRestrictionsEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[ReposSetUserAccessRestrictionsResponseData]
}

object `1000` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ReposSetUserAccessRestrictionsEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposSetUserAccessRestrictionsResponseData]
  ): `1000` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1000`]
  }
}

