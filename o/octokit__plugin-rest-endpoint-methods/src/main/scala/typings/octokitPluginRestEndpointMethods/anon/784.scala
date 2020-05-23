package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.OrgsListHooksEndpoint
import typings.octokitTypes.endpointsMod.OrgsListHooksResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `784` extends js.Object {
  var parameters: RequestParameters with (Omit[OrgsListHooksEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[OrgsListHooksResponseData]
}

object `784` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[OrgsListHooksEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[OrgsListHooksResponseData]
  ): `784` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`784`]
  }
}

