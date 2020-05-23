package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposCreateOrUpdateFileEndpoint
import typings.octokitTypes.endpointsMod.ReposCreateOrUpdateFileResponse201Data
import typings.octokitTypes.endpointsMod.ReposCreateOrUpdateFileResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `893` extends js.Object {
  var parameters: RequestParameters with (Omit[ReposCreateOrUpdateFileEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[ReposCreateOrUpdateFileResponseData | ReposCreateOrUpdateFileResponse201Data]
}

object `893` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ReposCreateOrUpdateFileEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposCreateOrUpdateFileResponseData | ReposCreateOrUpdateFileResponse201Data]
  ): `893` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`893`]
  }
}

