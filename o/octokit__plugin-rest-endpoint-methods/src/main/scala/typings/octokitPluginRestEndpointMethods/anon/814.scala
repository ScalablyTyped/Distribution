package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ProjectsListCardsEndpoint
import typings.octokitTypes.endpointsMod.ProjectsListCardsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `814` extends js.Object {
  var parameters: RequestParameters with (Omit[ProjectsListCardsEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[ProjectsListCardsResponseData]
}

object `814` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ProjectsListCardsEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ProjectsListCardsResponseData]
  ): `814` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`814`]
  }
}

