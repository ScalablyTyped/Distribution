package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.OrgsListEndpoint
import typings.octokitTypes.endpointsMod.OrgsListResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `780` extends js.Object {
  var parameters: RequestParameters with (Omit[OrgsListEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[OrgsListResponseData]
}

object `780` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[OrgsListEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[OrgsListResponseData]
  ): `780` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`780`]
  }
}

