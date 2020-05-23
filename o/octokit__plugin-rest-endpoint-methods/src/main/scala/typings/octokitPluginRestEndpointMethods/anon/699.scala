package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.IssuesAddAssigneesEndpoint
import typings.octokitTypes.endpointsMod.IssuesAddAssigneesResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `699` extends js.Object {
  var parameters: RequestParameters with (Omit[IssuesAddAssigneesEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[IssuesAddAssigneesResponseData]
}

object `699` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[IssuesAddAssigneesEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[IssuesAddAssigneesResponseData]
  ): `699` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`699`]
  }
}

