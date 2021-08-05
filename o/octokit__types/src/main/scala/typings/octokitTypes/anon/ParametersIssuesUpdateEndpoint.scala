package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.IssuesUpdateEndpoint
import typings.octokitTypes.endpointsMod.IssuesUpdateRequestOptions
import typings.octokitTypes.endpointsMod.IssuesUpdateResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersIssuesUpdateEndpoint extends StObject {
  
  var parameters: IssuesUpdateEndpoint
  
  var request: IssuesUpdateRequestOptions
  
  var response: OctokitResponse[IssuesUpdateResponseData]
}
object ParametersIssuesUpdateEndpoint {
  
  inline def apply(
    parameters: IssuesUpdateEndpoint,
    request: IssuesUpdateRequestOptions,
    response: OctokitResponse[IssuesUpdateResponseData]
  ): ParametersIssuesUpdateEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesUpdateEndpoint]
  }
  
  extension [Self <: ParametersIssuesUpdateEndpoint](x: Self) {
    
    inline def setParameters(value: IssuesUpdateEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: IssuesUpdateRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[IssuesUpdateResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
