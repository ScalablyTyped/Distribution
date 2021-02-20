package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.IssuesUpdateMilestoneEndpoint
import typings.octokitTypes.endpointsMod.IssuesUpdateMilestoneRequestOptions
import typings.octokitTypes.endpointsMod.IssuesUpdateMilestoneResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersIssuesUpdateMilestoneEndpoint extends StObject {
  
  var parameters: IssuesUpdateMilestoneEndpoint = js.native
  
  var request: IssuesUpdateMilestoneRequestOptions = js.native
  
  var response: OctokitResponse[IssuesUpdateMilestoneResponseData] = js.native
}
object ParametersIssuesUpdateMilestoneEndpoint {
  
  @scala.inline
  def apply(
    parameters: IssuesUpdateMilestoneEndpoint,
    request: IssuesUpdateMilestoneRequestOptions,
    response: OctokitResponse[IssuesUpdateMilestoneResponseData]
  ): ParametersIssuesUpdateMilestoneEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesUpdateMilestoneEndpoint]
  }
  
  @scala.inline
  implicit class ParametersIssuesUpdateMilestoneEndpointMutableBuilder[Self <: ParametersIssuesUpdateMilestoneEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: IssuesUpdateMilestoneEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: IssuesUpdateMilestoneRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[IssuesUpdateMilestoneResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
