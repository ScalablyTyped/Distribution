package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.BillingGetSharedStorageBillingGheEndpoint
import typings.octokitTypes.endpointsMod.BillingGetSharedStorageBillingGheRequestOptions
import typings.octokitTypes.endpointsMod.BillingGetSharedStorageBillingGheResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersBillingGetSharedStorageBillingGheEndpoint extends js.Object {
  var parameters: BillingGetSharedStorageBillingGheEndpoint = js.native
  var request: BillingGetSharedStorageBillingGheRequestOptions = js.native
  var response: OctokitResponse[BillingGetSharedStorageBillingGheResponseData] = js.native
}

object ParametersBillingGetSharedStorageBillingGheEndpoint {
  @scala.inline
  def apply(
    parameters: BillingGetSharedStorageBillingGheEndpoint,
    request: BillingGetSharedStorageBillingGheRequestOptions,
    response: OctokitResponse[BillingGetSharedStorageBillingGheResponseData]
  ): ParametersBillingGetSharedStorageBillingGheEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersBillingGetSharedStorageBillingGheEndpoint]
  }
  @scala.inline
  implicit class ParametersBillingGetSharedStorageBillingGheEndpointOps[Self <: ParametersBillingGetSharedStorageBillingGheEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: BillingGetSharedStorageBillingGheEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: BillingGetSharedStorageBillingGheRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[BillingGetSharedStorageBillingGheResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

