package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.IssuesDeleteMilestoneEndpoint
import typings.octokitTypes.endpointsMod.IssuesDeleteMilestoneRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersIssuesDeleteMilestoneEndpoint extends StObject {
  
  var parameters: IssuesDeleteMilestoneEndpoint = js.native
  
  var request: IssuesDeleteMilestoneRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersIssuesDeleteMilestoneEndpoint {
  
  @scala.inline
  def apply(
    parameters: IssuesDeleteMilestoneEndpoint,
    request: IssuesDeleteMilestoneRequestOptions,
    response: OctokitResponse[_]
  ): ParametersIssuesDeleteMilestoneEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesDeleteMilestoneEndpoint]
  }
  
  @scala.inline
  implicit class ParametersIssuesDeleteMilestoneEndpointMutableBuilder[Self <: ParametersIssuesDeleteMilestoneEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: IssuesDeleteMilestoneEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: IssuesDeleteMilestoneRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
