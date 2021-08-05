package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.IssuesRemoveLabelEndpoint
import typings.octokitTypes.endpointsMod.IssuesRemoveLabelRequestOptions
import typings.octokitTypes.endpointsMod.IssuesRemoveLabelResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersIssuesRemoveLabelEndpoint extends StObject {
  
  var parameters: IssuesRemoveLabelEndpoint
  
  var request: IssuesRemoveLabelRequestOptions
  
  var response: OctokitResponse[IssuesRemoveLabelResponseData]
}
object ParametersIssuesRemoveLabelEndpoint {
  
  inline def apply(
    parameters: IssuesRemoveLabelEndpoint,
    request: IssuesRemoveLabelRequestOptions,
    response: OctokitResponse[IssuesRemoveLabelResponseData]
  ): ParametersIssuesRemoveLabelEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesRemoveLabelEndpoint]
  }
  
  extension [Self <: ParametersIssuesRemoveLabelEndpoint](x: Self) {
    
    inline def setParameters(value: IssuesRemoveLabelEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: IssuesRemoveLabelRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[IssuesRemoveLabelResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
