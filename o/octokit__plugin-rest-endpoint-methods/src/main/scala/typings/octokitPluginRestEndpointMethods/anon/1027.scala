package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.TeamsCreateEndpoint
import typings.octokitTypes.endpointsMod.TeamsCreateResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `1027` extends js.Object {
  var parameters: RequestParameters with (Omit[TeamsCreateEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[TeamsCreateResponseData]
}

object `1027` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[TeamsCreateEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[TeamsCreateResponseData]
  ): `1027` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1027`]
  }
}

