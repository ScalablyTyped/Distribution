package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.IssuesRemoveAllLabelsEndpoint
import typings.octokitTypes.endpointsMod.IssuesRemoveAllLabelsRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersIssuesRemoveAllLabelsEndpoint extends StObject {
  
  var parameters: IssuesRemoveAllLabelsEndpoint
  
  var request: IssuesRemoveAllLabelsRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersIssuesRemoveAllLabelsEndpoint {
  
  inline def apply(
    parameters: IssuesRemoveAllLabelsEndpoint,
    request: IssuesRemoveAllLabelsRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersIssuesRemoveAllLabelsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesRemoveAllLabelsEndpoint]
  }
  
  extension [Self <: ParametersIssuesRemoveAllLabelsEndpoint](x: Self) {
    
    inline def setParameters(value: IssuesRemoveAllLabelsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: IssuesRemoveAllLabelsRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
