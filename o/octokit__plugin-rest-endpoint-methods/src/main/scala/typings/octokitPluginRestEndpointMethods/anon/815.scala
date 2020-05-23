package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ProjectsListColumnsEndpoint
import typings.octokitTypes.endpointsMod.ProjectsListColumnsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `815` extends js.Object {
  var parameters: RequestParameters with (Omit[ProjectsListColumnsEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[ProjectsListColumnsResponseData]
}

object `815` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ProjectsListColumnsEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ProjectsListColumnsResponseData]
  ): `815` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`815`]
  }
}

