package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.CodesOfConductGetConductCodeEndpoint
import typings.octokitTypes.endpointsMod.CodesOfConductGetConductCodeResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `655` extends js.Object {
  var parameters: RequestParameters with (Omit[CodesOfConductGetConductCodeEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[CodesOfConductGetConductCodeResponseData]
}

object `655` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[CodesOfConductGetConductCodeEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[CodesOfConductGetConductCodeResponseData]
  ): `655` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`655`]
  }
}

