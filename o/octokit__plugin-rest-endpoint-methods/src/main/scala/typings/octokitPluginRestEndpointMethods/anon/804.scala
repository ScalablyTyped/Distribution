package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ProjectsCreateForAuthenticatedUserEndpoint
import typings.octokitTypes.endpointsMod.ProjectsCreateForAuthenticatedUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `804` extends js.Object {
  var parameters: RequestParameters with (Omit[ProjectsCreateForAuthenticatedUserEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[ProjectsCreateForAuthenticatedUserResponseData]
}

object `804` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ProjectsCreateForAuthenticatedUserEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ProjectsCreateForAuthenticatedUserResponseData]
  ): `804` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`804`]
  }
}

