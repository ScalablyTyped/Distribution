package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.IssuesUnlockEndpoint
import typings.octokitTypes.endpointsMod.IssuesUnlockRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersIssuesUnlockEndpoint extends StObject {
  
  var parameters: IssuesUnlockEndpoint
  
  var request: IssuesUnlockRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersIssuesUnlockEndpoint {
  
  @scala.inline
  def apply(
    parameters: IssuesUnlockEndpoint,
    request: IssuesUnlockRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersIssuesUnlockEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesUnlockEndpoint]
  }
  
  @scala.inline
  implicit class ParametersIssuesUnlockEndpointMutableBuilder[Self <: ParametersIssuesUnlockEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: IssuesUnlockEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: IssuesUnlockRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
