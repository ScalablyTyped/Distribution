package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposGetClonesEndpoint
import typings.octokitTypes.endpointsMod.ReposGetClonesResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `919` extends js.Object {
  var parameters: RequestParameters with (Omit[ReposGetClonesEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[ReposGetClonesResponseData]
}

object `919` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ReposGetClonesEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposGetClonesResponseData]
  ): `919` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`919`]
  }
}

