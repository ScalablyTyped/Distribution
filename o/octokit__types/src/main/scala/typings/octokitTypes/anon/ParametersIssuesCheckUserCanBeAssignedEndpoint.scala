package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.IssuesCheckUserCanBeAssignedEndpoint
import typings.octokitTypes.endpointsMod.IssuesCheckUserCanBeAssignedRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersIssuesCheckUserCanBeAssignedEndpoint extends StObject {
  
  var parameters: IssuesCheckUserCanBeAssignedEndpoint = js.native
  
  var request: IssuesCheckUserCanBeAssignedRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersIssuesCheckUserCanBeAssignedEndpoint {
  
  @scala.inline
  def apply(
    parameters: IssuesCheckUserCanBeAssignedEndpoint,
    request: IssuesCheckUserCanBeAssignedRequestOptions,
    response: OctokitResponse[_]
  ): ParametersIssuesCheckUserCanBeAssignedEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesCheckUserCanBeAssignedEndpoint]
  }
  
  @scala.inline
  implicit class ParametersIssuesCheckUserCanBeAssignedEndpointMutableBuilder[Self <: ParametersIssuesCheckUserCanBeAssignedEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: IssuesCheckUserCanBeAssignedEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: IssuesCheckUserCanBeAssignedRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
