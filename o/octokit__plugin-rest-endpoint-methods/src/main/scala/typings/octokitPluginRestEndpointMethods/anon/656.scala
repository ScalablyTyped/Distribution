package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.CodesOfConductGetForRepoEndpoint
import typings.octokitTypes.endpointsMod.CodesOfConductGetForRepoResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `656` extends js.Object {
  var parameters: RequestParameters with (Omit[CodesOfConductGetForRepoEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[CodesOfConductGetForRepoResponseData]
}

object `656` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[CodesOfConductGetForRepoEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[CodesOfConductGetForRepoResponseData]
  ): `656` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`656`]
  }
}

