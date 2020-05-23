package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ProjectsCreateCardEndpoint
import typings.octokitTypes.endpointsMod.ProjectsCreateCardResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `802` extends js.Object {
  var parameters: RequestParameters with (Omit[ProjectsCreateCardEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[ProjectsCreateCardResponseData]
}

object `802` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ProjectsCreateCardEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ProjectsCreateCardResponseData]
  ): `802` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`802`]
  }
}

