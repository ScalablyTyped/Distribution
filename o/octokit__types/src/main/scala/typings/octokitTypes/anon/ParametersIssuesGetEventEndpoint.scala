package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.IssuesGetEventEndpoint
import typings.octokitTypes.endpointsMod.IssuesGetEventRequestOptions
import typings.octokitTypes.endpointsMod.IssuesGetEventResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersIssuesGetEventEndpoint extends StObject {
  
  var parameters: IssuesGetEventEndpoint
  
  var request: IssuesGetEventRequestOptions
  
  var response: OctokitResponse[IssuesGetEventResponseData]
}
object ParametersIssuesGetEventEndpoint {
  
  inline def apply(
    parameters: IssuesGetEventEndpoint,
    request: IssuesGetEventRequestOptions,
    response: OctokitResponse[IssuesGetEventResponseData]
  ): ParametersIssuesGetEventEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesGetEventEndpoint]
  }
  
  extension [Self <: ParametersIssuesGetEventEndpoint](x: Self) {
    
    inline def setParameters(value: IssuesGetEventEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: IssuesGetEventRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[IssuesGetEventResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
