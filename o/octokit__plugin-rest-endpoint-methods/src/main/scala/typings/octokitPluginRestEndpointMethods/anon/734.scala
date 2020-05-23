package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.IssuesUpdateEndpoint
import typings.octokitTypes.endpointsMod.IssuesUpdateResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `734` extends js.Object {
  var parameters: RequestParameters with (Omit[IssuesUpdateEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[IssuesUpdateResponseData]
}

object `734` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[IssuesUpdateEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[IssuesUpdateResponseData]
  ): `734` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`734`]
  }
}

