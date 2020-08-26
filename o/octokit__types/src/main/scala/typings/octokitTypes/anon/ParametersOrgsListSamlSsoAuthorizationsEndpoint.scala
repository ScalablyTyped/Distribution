package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OrgsListSamlSsoAuthorizationsEndpoint
import typings.octokitTypes.endpointsMod.OrgsListSamlSsoAuthorizationsRequestOptions
import typings.octokitTypes.endpointsMod.OrgsListSamlSsoAuthorizationsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersOrgsListSamlSsoAuthorizationsEndpoint extends js.Object {
  var parameters: OrgsListSamlSsoAuthorizationsEndpoint = js.native
  var request: OrgsListSamlSsoAuthorizationsRequestOptions = js.native
  var response: OctokitResponse[OrgsListSamlSsoAuthorizationsResponseData] = js.native
}

object ParametersOrgsListSamlSsoAuthorizationsEndpoint {
  @scala.inline
  def apply(
    parameters: OrgsListSamlSsoAuthorizationsEndpoint,
    request: OrgsListSamlSsoAuthorizationsRequestOptions,
    response: OctokitResponse[OrgsListSamlSsoAuthorizationsResponseData]
  ): ParametersOrgsListSamlSsoAuthorizationsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsListSamlSsoAuthorizationsEndpoint]
  }
  @scala.inline
  implicit class ParametersOrgsListSamlSsoAuthorizationsEndpointOps[Self <: ParametersOrgsListSamlSsoAuthorizationsEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: OrgsListSamlSsoAuthorizationsEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: OrgsListSamlSsoAuthorizationsRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[OrgsListSamlSsoAuthorizationsResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

