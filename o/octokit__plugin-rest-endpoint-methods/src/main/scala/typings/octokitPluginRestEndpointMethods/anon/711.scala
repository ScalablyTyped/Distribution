package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.IssuesGetEventEndpoint
import typings.octokitTypes.endpointsMod.IssuesGetEventResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `711` extends js.Object {
  var parameters: RequestParameters with (Omit[IssuesGetEventEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[IssuesGetEventResponseData]
}

object `711` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[IssuesGetEventEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[IssuesGetEventResponseData]
  ): `711` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`711`]
  }
}

