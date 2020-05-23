package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.IssuesListCommentsEndpoint
import typings.octokitTypes.endpointsMod.IssuesListCommentsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `716` extends js.Object {
  var parameters: RequestParameters with (Omit[IssuesListCommentsEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[IssuesListCommentsResponseData]
}

object `716` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[IssuesListCommentsEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[IssuesListCommentsResponseData]
  ): `716` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`716`]
  }
}

