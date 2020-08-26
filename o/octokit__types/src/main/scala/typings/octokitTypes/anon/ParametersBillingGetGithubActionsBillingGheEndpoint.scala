package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.BillingGetGithubActionsBillingGheEndpoint
import typings.octokitTypes.endpointsMod.BillingGetGithubActionsBillingGheRequestOptions
import typings.octokitTypes.endpointsMod.BillingGetGithubActionsBillingGheResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersBillingGetGithubActionsBillingGheEndpoint extends js.Object {
  var parameters: BillingGetGithubActionsBillingGheEndpoint = js.native
  var request: BillingGetGithubActionsBillingGheRequestOptions = js.native
  var response: OctokitResponse[BillingGetGithubActionsBillingGheResponseData] = js.native
}

object ParametersBillingGetGithubActionsBillingGheEndpoint {
  @scala.inline
  def apply(
    parameters: BillingGetGithubActionsBillingGheEndpoint,
    request: BillingGetGithubActionsBillingGheRequestOptions,
    response: OctokitResponse[BillingGetGithubActionsBillingGheResponseData]
  ): ParametersBillingGetGithubActionsBillingGheEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersBillingGetGithubActionsBillingGheEndpoint]
  }
  @scala.inline
  implicit class ParametersBillingGetGithubActionsBillingGheEndpointOps[Self <: ParametersBillingGetGithubActionsBillingGheEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: BillingGetGithubActionsBillingGheEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: BillingGetGithubActionsBillingGheRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[BillingGetGithubActionsBillingGheResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

