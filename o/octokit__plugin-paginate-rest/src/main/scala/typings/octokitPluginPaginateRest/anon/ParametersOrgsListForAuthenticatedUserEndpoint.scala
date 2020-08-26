package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.OrgsListForAuthenticatedUserEndpoint
import typings.octokitTypes.endpointsMod.OrgsListForAuthenticatedUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersOrgsListForAuthenticatedUserEndpoint extends js.Object {
  var parameters: OrgsListForAuthenticatedUserEndpoint = js.native
  var response: OctokitResponse[OrgsListForAuthenticatedUserResponseData] = js.native
}

object ParametersOrgsListForAuthenticatedUserEndpoint {
  @scala.inline
  def apply(
    parameters: OrgsListForAuthenticatedUserEndpoint,
    response: OctokitResponse[OrgsListForAuthenticatedUserResponseData]
  ): ParametersOrgsListForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsListForAuthenticatedUserEndpoint]
  }
  @scala.inline
  implicit class ParametersOrgsListForAuthenticatedUserEndpointOps[Self <: ParametersOrgsListForAuthenticatedUserEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: OrgsListForAuthenticatedUserEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[OrgsListForAuthenticatedUserResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

