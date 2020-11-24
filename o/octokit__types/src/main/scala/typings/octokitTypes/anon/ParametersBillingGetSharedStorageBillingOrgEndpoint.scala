package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.BillingGetSharedStorageBillingOrgEndpoint
import typings.octokitTypes.endpointsMod.BillingGetSharedStorageBillingOrgRequestOptions
import typings.octokitTypes.endpointsMod.BillingGetSharedStorageBillingOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersBillingGetSharedStorageBillingOrgEndpoint extends js.Object {
  
  var parameters: BillingGetSharedStorageBillingOrgEndpoint = js.native
  
  var request: BillingGetSharedStorageBillingOrgRequestOptions = js.native
  
  var response: OctokitResponse[BillingGetSharedStorageBillingOrgResponseData] = js.native
}
object ParametersBillingGetSharedStorageBillingOrgEndpoint {
  
  @scala.inline
  def apply(
    parameters: BillingGetSharedStorageBillingOrgEndpoint,
    request: BillingGetSharedStorageBillingOrgRequestOptions,
    response: OctokitResponse[BillingGetSharedStorageBillingOrgResponseData]
  ): ParametersBillingGetSharedStorageBillingOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersBillingGetSharedStorageBillingOrgEndpoint]
  }
  
  @scala.inline
  implicit class ParametersBillingGetSharedStorageBillingOrgEndpointOps[Self <: ParametersBillingGetSharedStorageBillingOrgEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: BillingGetSharedStorageBillingOrgEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: BillingGetSharedStorageBillingOrgRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[BillingGetSharedStorageBillingOrgResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
