package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.IssuesAddAssigneesEndpoint
import typings.octokitTypes.endpointsMod.IssuesAddAssigneesRequestOptions
import typings.octokitTypes.endpointsMod.IssuesAddAssigneesResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersIssuesAddAssigneesEndpoint extends StObject {
  
  var parameters: IssuesAddAssigneesEndpoint
  
  var request: IssuesAddAssigneesRequestOptions
  
  var response: OctokitResponse[IssuesAddAssigneesResponseData]
}
object ParametersIssuesAddAssigneesEndpoint {
  
  @scala.inline
  def apply(
    parameters: IssuesAddAssigneesEndpoint,
    request: IssuesAddAssigneesRequestOptions,
    response: OctokitResponse[IssuesAddAssigneesResponseData]
  ): ParametersIssuesAddAssigneesEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesAddAssigneesEndpoint]
  }
  
  @scala.inline
  implicit class ParametersIssuesAddAssigneesEndpointMutableBuilder[Self <: ParametersIssuesAddAssigneesEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: IssuesAddAssigneesEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: IssuesAddAssigneesRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[IssuesAddAssigneesResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
