package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActivitySetRepoSubscriptionEndpoint
import typings.octokitTypes.endpointsMod.ActivitySetRepoSubscriptionRequestOptions
import typings.octokitTypes.endpointsMod.ActivitySetRepoSubscriptionResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersActivitySetRepoSubscriptionEndpoint extends js.Object {
  
  var parameters: ActivitySetRepoSubscriptionEndpoint = js.native
  
  var request: ActivitySetRepoSubscriptionRequestOptions = js.native
  
  var response: OctokitResponse[ActivitySetRepoSubscriptionResponseData] = js.native
}
object ParametersActivitySetRepoSubscriptionEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActivitySetRepoSubscriptionEndpoint,
    request: ActivitySetRepoSubscriptionRequestOptions,
    response: OctokitResponse[ActivitySetRepoSubscriptionResponseData]
  ): ParametersActivitySetRepoSubscriptionEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActivitySetRepoSubscriptionEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActivitySetRepoSubscriptionEndpointOps[Self <: ParametersActivitySetRepoSubscriptionEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: ActivitySetRepoSubscriptionEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ActivitySetRepoSubscriptionRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ActivitySetRepoSubscriptionResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
