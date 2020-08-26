package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.BillingGetSharedStorageBillingUserEndpoint
import typings.octokitTypes.endpointsMod.BillingGetSharedStorageBillingUserRequestOptions
import typings.octokitTypes.endpointsMod.BillingGetSharedStorageBillingUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersBillingGetSharedStorageBillingUserEndpoint extends js.Object {
  var parameters: BillingGetSharedStorageBillingUserEndpoint = js.native
  var request: BillingGetSharedStorageBillingUserRequestOptions = js.native
  var response: OctokitResponse[BillingGetSharedStorageBillingUserResponseData] = js.native
}

object ParametersBillingGetSharedStorageBillingUserEndpoint {
  @scala.inline
  def apply(
    parameters: BillingGetSharedStorageBillingUserEndpoint,
    request: BillingGetSharedStorageBillingUserRequestOptions,
    response: OctokitResponse[BillingGetSharedStorageBillingUserResponseData]
  ): ParametersBillingGetSharedStorageBillingUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersBillingGetSharedStorageBillingUserEndpoint]
  }
  @scala.inline
  implicit class ParametersBillingGetSharedStorageBillingUserEndpointOps[Self <: ParametersBillingGetSharedStorageBillingUserEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: BillingGetSharedStorageBillingUserEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: BillingGetSharedStorageBillingUserRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[BillingGetSharedStorageBillingUserResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

