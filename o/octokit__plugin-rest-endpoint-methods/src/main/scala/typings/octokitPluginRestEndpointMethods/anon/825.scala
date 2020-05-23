package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ProjectsUpdateColumnEndpoint
import typings.octokitTypes.endpointsMod.ProjectsUpdateColumnResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `825` extends js.Object {
  var parameters: RequestParameters with (Omit[ProjectsUpdateColumnEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[ProjectsUpdateColumnResponseData]
}

object `825` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ProjectsUpdateColumnEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ProjectsUpdateColumnResponseData]
  ): `825` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`825`]
  }
}

