package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ProjectsGetColumnEndpoint
import typings.octokitTypes.endpointsMod.ProjectsGetColumnResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `812` extends js.Object {
  var parameters: RequestParameters with (Omit[ProjectsGetColumnEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[ProjectsGetColumnResponseData]
}

object `812` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ProjectsGetColumnEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ProjectsGetColumnResponseData]
  ): `812` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`812`]
  }
}

