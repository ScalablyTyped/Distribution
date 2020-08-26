package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ChecksListForRefEndpoint
import typings.octokitTypes.endpointsMod.ChecksListForRefResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `659` extends js.Object {
  var parameters: RequestParameters with (Omit[ChecksListForRefEndpoint, baseUrl | headers | mediaType]) = js.native
  var response: OctokitResponse[ChecksListForRefResponseData] = js.native
}

object `659` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ChecksListForRefEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ChecksListForRefResponseData]
  ): `659` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`659`]
  }
  @scala.inline
  implicit class `659Ops`[Self <: `659`] (val x: Self) extends AnyVal {
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
    def setParameters(value: RequestParameters with (Omit[ChecksListForRefEndpoint, baseUrl | headers | mediaType])): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[ChecksListForRefResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

