package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.IssuesListAssigneesEndpoint
import typings.octokitTypes.endpointsMod.IssuesListAssigneesResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `715` extends js.Object {
  var parameters: RequestParameters with (Omit[IssuesListAssigneesEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[IssuesListAssigneesResponseData]
}

object `715` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[IssuesListAssigneesEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[IssuesListAssigneesResponseData]
  ): `715` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`715`]
  }
}

