package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.IssuesListForAuthenticatedUserEndpoint
import typings.octokitTypes.endpointsMod.IssuesListForAuthenticatedUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `721` extends js.Object {
  var parameters: RequestParameters with (Omit[IssuesListForAuthenticatedUserEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[IssuesListForAuthenticatedUserResponseData]
}

object `721` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[IssuesListForAuthenticatedUserEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[IssuesListForAuthenticatedUserResponseData]
  ): `721` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`721`]
  }
}

