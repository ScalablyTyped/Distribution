package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActivitySetRepoSubscriptionEndpoint
import typings.octokitTypes.endpointsMod.ActivitySetRepoSubscriptionRequestOptions
import typings.octokitTypes.endpointsMod.ActivitySetRepoSubscriptionResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersActivitySetRepoSubscriptionEndpoint extends StObject {
  
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
  implicit class ParametersActivitySetRepoSubscriptionEndpointMutableBuilder[Self <: ParametersActivitySetRepoSubscriptionEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ActivitySetRepoSubscriptionEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ActivitySetRepoSubscriptionRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ActivitySetRepoSubscriptionResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
