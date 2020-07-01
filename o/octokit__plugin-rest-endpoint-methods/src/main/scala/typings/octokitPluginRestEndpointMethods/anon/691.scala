package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.GitignoreGetAllTemplatesEndpoint
import typings.octokitTypes.endpointsMod.GitignoreGetAllTemplatesResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `691` extends js.Object {
  var parameters: RequestParameters with (Omit[GitignoreGetAllTemplatesEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[GitignoreGetAllTemplatesResponseData]
}

object `691` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[GitignoreGetAllTemplatesEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[GitignoreGetAllTemplatesResponseData]
  ): `691` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`691`]
  }
}

