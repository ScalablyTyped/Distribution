package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ActionsGetOrgSecretEndpoint
import typings.octokitTypes.endpointsMod.ActionsGetOrgSecretResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `561` extends js.Object {
  var parameters: RequestParameters with (Omit[ActionsGetOrgSecretEndpoint, baseUrl | headers | mediaType]) = js.native
  var response: OctokitResponse[ActionsGetOrgSecretResponseData] = js.native
}

object `561` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ActionsGetOrgSecretEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ActionsGetOrgSecretResponseData]
  ): `561` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`561`]
  }
  @scala.inline
  implicit class `561Ops`[Self <: `561`] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setParameters(value: RequestParameters with (Omit[ActionsGetOrgSecretEndpoint, baseUrl | headers | mediaType])): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[ActionsGetOrgSecretResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

