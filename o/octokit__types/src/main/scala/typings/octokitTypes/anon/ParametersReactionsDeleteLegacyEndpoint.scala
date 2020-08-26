package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReactionsDeleteLegacyEndpoint
import typings.octokitTypes.endpointsMod.ReactionsDeleteLegacyRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersReactionsDeleteLegacyEndpoint extends js.Object {
  var parameters: ReactionsDeleteLegacyEndpoint = js.native
  var request: ReactionsDeleteLegacyRequestOptions = js.native
  var response: OctokitResponse[_] = js.native
}

object ParametersReactionsDeleteLegacyEndpoint {
  @scala.inline
  def apply(
    parameters: ReactionsDeleteLegacyEndpoint,
    request: ReactionsDeleteLegacyRequestOptions,
    response: OctokitResponse[_]
  ): ParametersReactionsDeleteLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReactionsDeleteLegacyEndpoint]
  }
  @scala.inline
  implicit class ParametersReactionsDeleteLegacyEndpointOps[Self <: ParametersReactionsDeleteLegacyEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: ReactionsDeleteLegacyEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: ReactionsDeleteLegacyRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

