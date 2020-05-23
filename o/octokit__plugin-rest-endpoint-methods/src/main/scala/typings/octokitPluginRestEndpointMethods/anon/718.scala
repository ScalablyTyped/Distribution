package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.IssuesListEventsEndpoint
import typings.octokitTypes.endpointsMod.IssuesListEventsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `718` extends js.Object {
  var parameters: RequestParameters with (Omit[IssuesListEventsEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[IssuesListEventsResponseData]
}

object `718` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[IssuesListEventsEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[IssuesListEventsResponseData]
  ): `718` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`718`]
  }
}

