package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.IssuesRemoveAssigneesEndpoint
import typings.octokitTypes.endpointsMod.IssuesRemoveAssigneesResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `730` extends js.Object {
  var parameters: RequestParameters with (Omit[IssuesRemoveAssigneesEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[IssuesRemoveAssigneesResponseData]
}

object `730` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[IssuesRemoveAssigneesEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[IssuesRemoveAssigneesResponseData]
  ): `730` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`730`]
  }
}

