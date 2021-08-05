package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.IssuesGetLabelEndpoint
import typings.octokitTypes.endpointsMod.IssuesGetLabelRequestOptions
import typings.octokitTypes.endpointsMod.IssuesGetLabelResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersIssuesGetLabelEndpoint extends StObject {
  
  var parameters: IssuesGetLabelEndpoint
  
  var request: IssuesGetLabelRequestOptions
  
  var response: OctokitResponse[IssuesGetLabelResponseData]
}
object ParametersIssuesGetLabelEndpoint {
  
  inline def apply(
    parameters: IssuesGetLabelEndpoint,
    request: IssuesGetLabelRequestOptions,
    response: OctokitResponse[IssuesGetLabelResponseData]
  ): ParametersIssuesGetLabelEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesGetLabelEndpoint]
  }
  
  extension [Self <: ParametersIssuesGetLabelEndpoint](x: Self) {
    
    inline def setParameters(value: IssuesGetLabelEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: IssuesGetLabelRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[IssuesGetLabelResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
