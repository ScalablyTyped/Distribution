package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ProjectsGetEndpoint
import typings.octokitTypes.endpointsMod.ProjectsGetResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `810` extends js.Object {
  var parameters: RequestParameters with (Omit[ProjectsGetEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[ProjectsGetResponseData]
}

object `810` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ProjectsGetEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ProjectsGetResponseData]
  ): `810` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`810`]
  }
}

